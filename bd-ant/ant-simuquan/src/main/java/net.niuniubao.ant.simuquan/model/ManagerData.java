package net.niuniubao.ant.simuquan.model;

import java.util.List;

/**
 * Created by GanJianWei on 2016/4/28.
 */
public class ManagerData {
    private ManagerInfo manager_info;
    private List<NewsList> news_list;
    private List<FundList> fund_list;

    public ManagerInfo getManager_info() {
        return manager_info;
    }

    public void setManager_info(ManagerInfo manager_info) {
        this.manager_info = manager_info;
    }

    public List<NewsList> getNews_list() {
        return news_list;
    }

    public void setNews_list(List<NewsList> news_list) {
        this.news_list = news_list;
    }

    public List<FundList> getFund_list() {
        return fund_list;
    }

    public void setFund_list(List<FundList> fund_list) {
        this.fund_list = fund_list;
    }
}
