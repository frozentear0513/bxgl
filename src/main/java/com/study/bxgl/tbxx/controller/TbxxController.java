/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.controller
 * @className com.study.bxgl.tbxx.controller.TbxxController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.controller;

import com.study.bxgl.tbxx.service.TbxxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TbxxController
 * @description 投保信息controller
 * @author liujunxian
 * @date 2021年02月18日 14:01
 * @version 3.0.0
 */
@RestController
public class TbxxController {
    @Autowired
    private TbxxService tbxxService;

    @GetMapping("/tbxx")
    public String getTbxx(){
        return tbxxService.getTbxx();
    }
}
