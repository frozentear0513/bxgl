/*
 * @projectName bxgl
 * @package com.study.bxgl.tbxx.dao
 * @className com.study.bxgl.tbxx.dao.TbxxDao
 * @copyright Copyright 2021 Thuisoft, Inc. All rights reserved.
 */
package com.study.bxgl.tbxx.dao;

import org.apache.ibatis.annotations.Mapper;

/**
 * TbxxDao
 * @description TODO
 * @author liujuanxian
 * @date 2021年02月18日 14:04
 * @version 3.0.0
 */
@Mapper
public interface TbxxDao {

    String getTbxx();
}
