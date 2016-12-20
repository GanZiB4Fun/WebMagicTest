package net.niuniubao.ant.amac.mapper;

import net.niuniubao.ant.amac.model.*;

import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/14.
 */
public interface AmacMapper {

    int insertCompany(Company entity);

    /**
     * 数据源自抓取的Json数据
     * 插入基金公司列表数据
     * @param entity
     * @return
     */
    int insertCompanyJson(JsonCompanyData entity);

    List<Long> selectManagerHtmlId();

    /**
     * 分页获取指定状态的公司列表
     * @return
     */
    List<JsonCompanyData> selectCompanyNotProc(Integer procStatus);

    /**
     * 插入高管信息
     * @param entity
     * @return
     */
    int insertExecutives(Executive entity);

    /**
     * 插入法人履历
     * @param entity
     * @return
     */
    int insertOwnerResume(OwnerResume entity);

    int insertFundList(FundList entity);

    /**
     * 插入任务处理记录
     * @param entity
     * @return
     */
    int insertAntTask(AmacAntTask entity);

    List<FundList> selectFundNotProcess(Integer status);

    int updateFundList(Long id);

    /**
     * 插入基金详情数据
     * @param fund
     * @return
     */
    int insertAmacFund(Fund fund);

    int updateCompanyList(Long companyId);

    /**
     * 插入查询基金经理信息的公司列表
     * @param entity
     * @return
     */
    int insertFundManagerList(AmacFundManagerList entity);

    /**
     * 查询未处理的基金公司数据
     * @param procStatus
     * @return
     */
    List<AmacFundManagerList> selectFundManagerNotProcess(Integer procStatus);

    /**
     * 更新已处理的基金公司列表数据状态
     * @param amacListId
     * @return
     */
    int updateFundManagerListStatus(Integer amacListId);

    /**
     * 插入基金从业人员信息
     * @param entity
     * @return
     */
    int insertFundManager(AmacFundManager entity);
}
