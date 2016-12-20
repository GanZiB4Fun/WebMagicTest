package net.niuniubao.ant.simuquan.mapper;

import net.niuniubao.ant.simuquan.model.*;

import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public interface SimuquanMapper {
    /**
     * 插入公司列表数据
     * @param entity
     * @return
     */
    int insertCompanyList(CompanyList entity);

    /**
     * 更新公司列表数据中已处理的数据状态
     * @param entity
     * @return
     */
    int updateCompanyListStatus(CompanyList entity);

    /**
     * 分页返回未处理的基金公司数据
     * 每次返回10条
     * @return
     */
    List<CompanyList> selectCompanyIdNotProc(Integer procStatus);
    /**
     * 分页返回未处理的基金数据
     * 每次返回10条
     * @return
     */
    List<FundList> selectFundIdNotProc(Integer procStatus);

    /**
     * 插入基金档案列表信息
     * @param entity
     * @return
     */
    int insertCompanyFilingList(FilingList entity);

    /**
     * 插入基金列表
     * @param fundList
     * @return
     */
    int insertFundList(FundList fundList);

    /**
     * 更新指定版本的公司处理状态
     * @param i 0 未处理 1 已处理 -1 处理中
     * @param company_id
     * @param dataVersion
     * @return
     */
    int updateCompanyListStatus(int i, String company_id, String dataVersion);

    /**
     * 插入基金公司详情
     * @param entity
     * @return
     */
    int insertCompanyInfo(CompanyInfo entity);

    /**
     * 插入相关新闻信息
     * @param entity
     * @return
     */
    int insertNewsList(NewsList entity);


    /**
     * 插入基金经理人列表信息
     * @param entity
     * @return
     */
    int insertCompanyManagerList(CompanyManagerList entity);

    /**
     * 返回未处理的filinglist
     * @param procStatus
     * @return
     */
    List<FilingList> selectFilingListIdNotProc(Integer procStatus);

    /**
     * 更新指定版本的公司处理状态
     * @param i 0 未处理 1 已处理 -1 处理中
     * @param fund_id
     * @param dataVersion
     * @return
     */
    int updateFundListStatus(int i, Integer fund_id, String dataVersion);

    /**
     * 插入基金详情
     * @param fundInfo
     * @return
     */
    int insertFundInfo(FundInfo fundInfo);

    /**
     * 插入基金产品概要
     * @param jzSummary
     * @return
     */
    int insertJzSummary(JzSummary jzSummary);
    /**
     * 插入基金产品
     * @param jzWithdraw
     * @return
     */
    int insertJzWithdraw(JzWithdraw jzWithdraw);

    /**
     * 插入基金产品
     * @param jzChart
     * @return
     */
    int insertJzChart(JzChart jzChart);

    /**
     * 插入基金产品
     * @param jzList
     * @return
     */
    int insertJzList(JzList jzList);

    /**
     * 插入基金产品
     * @param fenhongInfo
     * @return
     */
    int insertFenhongInfo(FenhongInfo fenhongInfo);

    /**
     * 插入基金产品
     * @param fenhongInfo
     * @return
     */
    int insertFenhongList(FenhongInfo fenhongInfo);


    /**
     * 插入基金公司档案信息
     * @param entity
     * @return
     */
    int insertFiling(CompanyFiling entity);

    /**
     * 更新已处理的FilingList状态
     * @param i
     * @param id
     * @param dataVersion
     * @return
     */
    int updateFilingListStatus(int i, String id, String dataVersion);

    /**
     * 插入基金经理列表信息
     * @param entiy
     * @return
     */
    int insertManagerList(ManagerList entiy);

    /**
     * 插入基金经理详细信息
     * @param entity
     * @return
     */
    int insertManagerInfo(ManagerInfo entity);

    /**
     * 返回未处理的ManagerList
     * @param procStatus
     * @return
     */
    List<ManagerList> selectManagerIdNotProc(Integer procStatus);

    /**
     * 更新已处理的ManagerList状态
     * @param i
     * @param id
     * @return
     */
    int updateManagerListStatus(int i,int id);
}
