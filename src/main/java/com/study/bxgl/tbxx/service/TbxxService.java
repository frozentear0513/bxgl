/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.service
 * @className com.study.bxgl.tbxx.service.TbxxService
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.service;

import com.study.bxgl.tbxx.dao.TbxxDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TbxxService
 * @description TODO
 * @author liujunxian
 * @date 2021年02月18日 14:03
 * @version 3.0.0
 */
@Service
public class TbxxService {

    @Autowired
    private TbxxDao tbxxDao;

    public String getTbxx(){
        return tbxxDao.getTbxx();
    }
}
