package com.hdw.upms.controller;


import com.hdw.common.base.controller.BaseController;
import com.hdw.common.result.PageParams;
import com.hdw.common.result.ResultMap;
import com.hdw.upms.service.ISysLogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


/**
 * @author TuMinglong
 * @description 日志管理
 * @date 2018年3月6日 上午9:42:00
 */

@RestController
@RequestMapping("/sys/log")
public class SysLogController extends BaseController {

    @Reference
    private ISysLogService sysLogService;

    @RequestMapping("/list")
    public ResultMap dataGrid(@RequestParam Map<String, Object> params) {

        PageParams page = sysLogService.selectDataGrid(params);
        return ResultMap.ok().put("page", page);
    }
}
