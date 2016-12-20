package net.niuniubao.ant.simuwang.mapper;

import net.niuniubao.ant.simuwang.model.*;

import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/18.
 */
public interface SimuWangMapper {

    /**
     * 插入私募排排网基金列表数据
     *
     * @param entity
     * @return
     */
    int insertFundListData(JsonFundData entity);

    /**
     * 插入基金详情信息
     * @param entity
     * @return
     */
    int insertFund(Fund entity);

    /**
     * 更新私募列表状态数据
     * @param entity
     * @return
     */
    int updateFundListStatus(JsonFundData entity);

    /**
     * 分页返回未处理的基金数据
     * 每次返回10条
     * @return
     */
    List<JsonFundData> selectFundIdNotProc(Integer procStatus);

    /**
     * 插入私募排排网基金经理列表数据
     * @param entity
     * @return
     */
    int insertManagerListData(JsonManagerData entity);

    /**
     * 插入私募排排网基金公司列表数据
     * @param entity
     * @return
     */
    int insertCompanyListData(JsonCompanyData entity);

    /**
     * 更新基金经理列表状态数据
     * @param entity
     * @return
     */
    int updateManagerListStatus(JsonManagerData entity);

    /**
     * 分页返回未处理的基金经理数据
     * @param procStatus
     * @return
     */
    List<JsonManagerData> selectManagerIdNotProc(Integer procStatus);

    /**
     * 插入私募基金经理详细信息
     * @param entity
     * @return
     */
    int insertManager(Manager entity);


    /**
     * 更新基金公司列表状态数据
     * @param entity
     * @return
     */
    int updateCompanyListStatus(JsonCompanyData entity);

    /**
     * 分页返回未处理的基金公司数据
     * @param procStatus
     * @return
     */
    List<JsonCompanyData> selectCompanyIdNotProc(Integer procStatus);

    /**
     * 插入私募基金公司详细信息
     * @param entity
     * @return
     */
    int insertCompany(Company entity);


}
