package com.study.bxgl.tbxx.mapper;

import com.study.bxgl.tbxx.pojo.TTbxx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 投保信息表(TTbxx)表数据库访问层
 *
 * @author liujunxian
 * @since 2021-02-18 16:00:42
 * @version 1.0
 */

public interface TTbxxMapper {
//
//    /**
//     * 查询所有数据
//     * @return  返回所有数据
//     */
//    List<TTbxx> chaXunAll();
//
//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    TTbxx chaXunById(@Param("id") String id);
//
//    /**
//     * 根据模糊条件查询总个数
//     *
//     * @return 返回查询到的总个数
//     */
//    int chaXunCount(String mingCheng);
//
//    /**
//     * 通过实体作为筛选条件查询
//     *
//     * @param xiaBiao    当前查询开始页中的第一个下标值
//     * @param mingCheng  需要模糊查询的内容
//     * @return 对象列表
//     */
//    List<TTbxx> chaXunFenYe(@Param("xiaBiao") int xiaBiao, @Param("mingCheng")String mingCheng);

    /**
     * 新增数据
     *
     * @param ttbxx 实例对象
     */
    void xinzeng(@Param("ttbxx") TTbxx ttbxx);

    /**
     * 查询满足条件的个数数据
     *返回int
     * @param
     */
     List<TTbxx> chaxun(@Param("beiBaoRenXingMing") String beiBaoRenXingMing,
                        @Param("touBaoRenXingMing") String touBaoRenXingMing,
                        @Param("touBaoShiJian") String touBaoShiJian,
                        @Param("zhengJianHaoMa") String zhengJianHaoMa,
                        @Param("zhengJianLeiXing") String zhengJianLeiXing,
                        @Param("index")int index);
    /**
     * 查询满足条件的个数数据
     *返回int
     * @param
     */
    int chaXunCount(@Param("beiBaoRenXingMing")String beiBaoRenXingMing,
                    @Param("touBaoRenXingMing")String touBaoRenXingMing,
                    @Param("touBaoShiJian")String touBaoShiJian,
                    @Param("zhengJianHaoMa")String zhengJianHaoMa,
                    @Param("zhengJianLeiXing")String zhengJianLeiXing,
                    @Param("index")int index);

    void tuibao( @Param("id")int id);

    /**
     * 新增批量数据
     *
     * @param tbxxes 实例对象
     */
    void xinzengAll(List<TTbxx> tbxxes);

    //    /**
// * 修改数据
// *
// * @param ttbxx 实例对象
// * @return 影响行数
// */
//int gengXinById(TTbxx tTbxx);
//
//    /**
//     * 通过主键删除数据
//     *
//     * @param id 主键
//     * @return 影响行数
//     */
//    int shanChuById(@Param("id") String id);

}