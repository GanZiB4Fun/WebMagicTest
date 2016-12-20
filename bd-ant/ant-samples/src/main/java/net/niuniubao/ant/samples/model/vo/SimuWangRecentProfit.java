package net.niuniubao.ant.samples.model.vo;

/**
 * Created by Administrator on 2016/4/16.
 */
public class SimuWangRecentProfit {
    private int recentProfitId;

    private String htmlId;

    private String period;//收益区间

    private String profit;//区间收益

    private String average;//同类平均

    public int getId() {
        return recentProfitId;
    }

    public void setId(int recentProfitId) {
        this.recentProfitId = recentProfitId;
    }

    public String getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(String htmlId) {
        this.htmlId = htmlId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getProfit() {
        return profit;
    }

    public void setProfit(String profit) {
        this.profit = profit;
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "SimuWangRecentProfit{" +
                "recentProfitId=" + recentProfitId +
                ", htmlId='" + htmlId + '\'' +
                ", period='" + period + '\'' +
                ", profit='" + profit + '\'' +
                ", average='" + average + '\'' +
                '}';
    }
}
