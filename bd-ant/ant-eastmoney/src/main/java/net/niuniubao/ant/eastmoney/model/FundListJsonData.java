package net.niuniubao.ant.eastmoney.model;

/**
 * Created by design on 2016/5/3.
 */
public class FundListJsonData {
    private Integer fundListId;
    private String fundUrlId;
    private String fundName;
    private String dataVersion;
    private Integer procStatus;

    public Integer getFundListId() {
        return fundListId;
    }

    public void setFundListId(Integer fundListId) {
        this.fundListId = fundListId;
    }

    public String getFundUrlId() {
        return fundUrlId;
    }

    public void setFundUrlId(String fundUrlId) {
        this.fundUrlId = fundUrlId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Integer getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(Integer procStatus) {
        this.procStatus = procStatus;
    }

    @Override
    public String toString() {
        return "FundListJsonDate{" +
                "fundlistId=" + fundListId +
                ", fundUrlId='" + fundUrlId + '\'' +
                ", fundName='" + fundName + '\'' +
                ", dataVersion='" + dataVersion + '\'' +
                ", procStatus='" + procStatus + '\'' +
                '}';
    }
}
