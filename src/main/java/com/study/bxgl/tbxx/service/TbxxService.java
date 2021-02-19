/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.service
 * @className com.study.bxgl.tbxx.service.TbxxService
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.service;

import com.study.bxgl.tbxx.excel.TbxxExcelmport;
import com.study.bxgl.tbxx.mapper.TTbxxMapper;
import com.study.bxgl.tbxx.pojo.TTbxx;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TbxxService
 * @description TODO
 * @author liujunxian
 * @date 2021年02月18日 14:03
 * @version 3.0.0
 */
@Service
public class TbxxService{

    @Resource
    private TTbxxMapper ttbxxMapper;

    /**
     * 新增数据
     *返回一个新增状态
     * @param ttbxx 实例对象
     */
    public  Map<String, Object> xinzeng(TTbxx ttbxx) {
        ttbxxMapper.xinzeng(ttbxx);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "投保成功");
        return map;

    }
    /**
     * 查询满足条件的个数数据
     *返回int
     * @param
     */
    public Map<String, Object> chaxun(String beiBaoRenXingMing, String touBaoRenXingMing, String touBaoShiJian, String zhengJianHaoMa, String zhengJianLeiXing, int page) {
         int  index=(page-1)*10;
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "查询投保信息成功");
        map.put("count", chaXunCount(beiBaoRenXingMing,touBaoRenXingMing,touBaoShiJian,zhengJianHaoMa,zhengJianLeiXing,index));
        map.put("data", ttbxxMapper.chaxun(beiBaoRenXingMing,touBaoRenXingMing,touBaoShiJian,zhengJianHaoMa,zhengJianLeiXing,index));

        return map;
    }
    /**
     * 查询满足条件的个数数据
     *返回int
     * @param
     */
    public  int  chaXunCount(String beiBaoRenXingMing, String touBaoRenXingMing, String touBaoShiJian, String zhengJianHaoMa, String zhengJianLeiXing,int index) {
        return ttbxxMapper.chaXunCount(beiBaoRenXingMing,touBaoRenXingMing,touBaoShiJian,zhengJianHaoMa,zhengJianLeiXing,index);
    }

    public Map<String, Object> tuibao(int id) {
        ttbxxMapper.tuibao(id);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "退保成功");
        return map;
    }

    public Map<String, Object> importData(InputStream inputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        List<TTbxx> tbxxes = TbxxExcelmport.readListTbxxFromExcel(inputStream);
        ttbxxMapper.xinzengAll(tbxxes);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "退保成功");
        return map;
    }
}
