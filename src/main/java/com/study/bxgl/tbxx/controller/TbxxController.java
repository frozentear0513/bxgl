/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.controller
 * @className com.study.bxgl.tbxx.controller.TbxxController
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.controller;

import com.study.bxgl.tbxx.pojo.TTbxx;
import com.study.bxgl.tbxx.service.TbxxService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.Map;

/**
 * TbxxController
 * @description 投保信息controller
 * @author liujunxian
 * @date 2021年02月18日 14:01
 * @version 3.0.0
 */
@RestController
@RequestMapping("/toubao")
@Api(value = "投保接口", tags = "投保数据接口API")
@ApiResponses({
        @ApiResponse(code = 400, message = "请求参数不完整或者错误"),
        @ApiResponse(code = 404, message = "找不到页面"),
        @ApiResponse(code = 405, message = "请求方式不正确，比如后台接收是post，但前端请求的是get"),
        @ApiResponse(code = 406, message = "页面地址和接口名冲突"),
        @ApiResponse(code = 415, message = "请求格式不正确，前端可能没有把请求头修改为json，也可能前端请求的json对象没有转换为字符串"),
        @ApiResponse(code = 500, message = "后台服务逻辑错误")
})
public class TbxxController {
    @Resource
    private TbxxService tbxxService;
    /**
     * 新增数据
     *返回一个新增状态
     * @param ttbxx 实例对象
     */
    @PostMapping("/xinzeng")
    @ApiOperation(value = "投保新增接口",notes = "投保新增",httpMethod = "POST", response = String.class)
    public Map<String, Object> xinzeng(@RequestBody @ApiParam(name = "ttbxx",value = "TTbxx pojo对象",required = true)  TTbxx ttbxx ){
        return tbxxService.xinzeng(ttbxx);
    }
    /**
     * 查询数据
     *返回查询数据
     * @param
     */
    @GetMapping("/chaxun")
    @ApiOperation(value = "投保查询接口",notes = "投保查询",httpMethod = "GET", response = String.class)
    @ApiImplicitParams({@ApiImplicitParam(name = "beiBaoRenXingMing",value = "被保人姓名",paramType = "query",dataType = "String",required = false),
                        @ApiImplicitParam(name = "touBaoRenXingMing",value = "投保人姓名",paramType = "query",dataType = "String",required = false),
                        @ApiImplicitParam(name = "touBaoShiJian",value = "投保时间",paramType = "query",dataType = "String",required = false),
                        @ApiImplicitParam(name = "zhengJianHaoMa",value = "证件号码",paramType = "query",dataType = "String",required = false),
                        @ApiImplicitParam(name = "zhengJianLeiXing",value = "证件类型",paramType = "query",dataType = "String",required = false),
                        @ApiImplicitParam(name = "page",value = "页码",paramType = "query",dataType = "String",required = true),
    })

    public Map<String, Object> chaxun(@RequestParam(name = "beiBaoRenXingMing",required = false) String beiBaoRenXingMing,
                                      @RequestParam(name = "touBaoRenXingMing",required = false) String touBaoRenXingMing,
                                      @RequestParam(name = "touBaoShiJian",required = false) String touBaoShiJian,
                                      @RequestParam(name = "zhengJianHaoMa",required = false) String zhengJianHaoMa,
                                      @RequestParam(name = "zhengJianLeiXing",required = false) String zhengJianLeiXing,
                                      @RequestParam(name = "page",required = true) int page){
        return tbxxService.chaxun(beiBaoRenXingMing,touBaoRenXingMing,touBaoShiJian,zhengJianHaoMa,zhengJianLeiXing,page);
    }
    @PostMapping("/tuibao")
    @ApiOperation(value = "退保接口",notes = "退保",httpMethod = "POST", response = String.class)
    @ApiImplicitParam(name = "id",value = "id",paramType = "query",dataType = "String",required = true)
    public Map<String, Object> tuibao( @RequestParam(name = "id") int id ){
        return tbxxService.tuibao(id);
    }
    @PostMapping("/xiugai")
    @ApiOperation(value = "投保修改接口",notes = "投保信息修改",httpMethod = "POST", response = String.class)
    public Map<String, Object> xiugai(@RequestBody @ApiParam(name = "ttbxx",value = "TTbxx pojo对象",required = true)  TTbxx ttbxx ){
        return tbxxService.xinzeng(ttbxx);
    }
    @RequestMapping(value = "/excel", method = RequestMethod.POST)
    public String dataImport(@RequestParam("file") MultipartFile file) {

        try {

            tbxxService.importData(file.getInputStream());

            return "ok";

        } catch (Exception e) {
            return "err";
        }

    }
}
