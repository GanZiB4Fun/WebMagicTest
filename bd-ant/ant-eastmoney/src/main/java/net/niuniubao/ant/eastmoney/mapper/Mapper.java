package net.niuniubao.ant.eastmoney.mapper;


import net.niuniubao.ant.eastmoney.model.*;

import java.util.List;

;

/**
 * Created by GanJianWei on 2016/4/21.
 */
public interface Mapper {
    /**
     * 插入公司列表信息
     * @param entity
     * @return
     */
    int insertCompanyList(CompanyJsonData entity);

    /**
     * 插入基金经理信息
     * @param entity
     * @return
     */
    int insertManagerList(ManagerJsonData entity);

    /**
     * 插入基金列表信息
     * @param entity
     * @return
     */
    int insertFundList(FundListJsonData entity);

    /**
     * 分页返回未处理的基金公司数据
     * 每次返回10条
     * @return
     */
    List<CompanyJsonData> selectCompanyIdNotProc(Integer procStatus);

    /**
     * 更新公司列表数据中已处理的数据状态
     * @param procStatus
     * @param companyListId
     * @return
     */
    int updateCompanyListStatus(Integer procStatus,String companyListId);

    /**
     * 插入公司基本概况信息
     * @param entity
     * @return
     */
    int insertCompanyJbgk(CompanyJbgkObj entity);

    /**
     * 分页返回未处理的基金列表数据
     * 每次返回10条
     * @return
     */
    List<FundListJsonData> selectFundIdNotProc(Integer procStatus);

    /**
     * 更新基金列表数据中已处理的数据状态
     * @param procStatus
     * @param fundListId
     * @return
     */
    int updateFundListStatus(Integer procStatus,Integer fundListId);

    /**
     * 插入基金基本概况信息
     * @param entity
     * @return
     */
    int insertFundJbgk(FundJbgkObj entity);
    /**
     * 分页返回未处理的基金经理人数据
     * 每次返回10条
     * @return
     */
    List<ManagerJsonData> selectManagerIdNotProc(Integer procStatus);

    /**
     * 更新基金经理人列表数据中已处理的数据状态
     * @param procStatus
     * @param managerListId
     * @return
     */
    int updateManagerListStatus(Integer procStatus,String  managerListId);

    /**
     * 插入基金经理基本概况信息
     * @param entity
     * @return
     */
    int insertManager(ManagerObj entity);

    /**
     * 插入基金净值信息
     * @param entity
     * @return
     */
    int insertFundJz(FundJzObj entity);

    /**
     * 根据Id获得基金基本概括FundJbgkObj
     * @param fundJbgkObjId
     * @return
     */
    FundJbgkObj getFundJbgkById(Integer fundJbgkObjId);

    /**
     * 更新基金基本概括信息FundJbgkObj
     * @param entity
     * @return
     */
    int updateFundJbgk(FundJbgkObj entity);

    /**
     * 基金经理旗下基金数据插入
     * @param entity
     * @return
     */
    int insertManagerFund(ManagerFund entity);

}
