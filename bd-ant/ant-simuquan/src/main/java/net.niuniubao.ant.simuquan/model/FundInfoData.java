package net.niuniubao.ant.simuquan.model;

import java.util.List;

/**
 * Created by cuiyingjia on 16/4/26.
 */
public class FundInfoData {

    private FundInfo fund_info;

    private List<JzSummary> jz_summary;

    private List<JzWithdraw> jz_withdraw;

    private List<JzChart> jz_chart;

    private List<JzList> jz_list;

    private FenhongInfo fenhong_info;

    private Integer message_count;

    private Integer followed;

    public List<JzWithdraw> getJz_withdraw() {
        return jz_withdraw;
    }

    public void setJz_withdraw(List<JzWithdraw> jz_withdraw) {
        this.jz_withdraw = jz_withdraw;
    }

    public FundInfo getFund_info() {
        return fund_info;
    }

    public void setFund_info(FundInfo fund_info) {
        this.fund_info = fund_info;
    }

    public List<JzSummary> getJz_summary() {
        return jz_summary;
    }

    public void setJz_summary(List<JzSummary> jz_summary) {
        this.jz_summary = jz_summary;
    }

    public List<JzChart> getJz_chart() {
        return jz_chart;
    }

    public void setJz_chart(List<JzChart> jz_chart) {
        this.jz_chart = jz_chart;
    }

    public List<JzList> getJz_list() {
        return jz_list;
    }

    public void setJz_list(List<JzList> jz_list) {
        this.jz_list = jz_list;
    }

    public FenhongInfo getFenhong_info() {
        return fenhong_info;
    }

    public void setFenhong_info(FenhongInfo fenhong_info) {
        this.fenhong_info = fenhong_info;
    }

    public Integer getMessage_count() {
        return message_count;
    }

    public void setMessage_count(Integer message_count) {
        this.message_count = message_count;
    }

    public Integer getFollowed() {
        return followed;
    }

    public void setFollowed(Integer followed) {
        this.followed = followed;
    }
}
