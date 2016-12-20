package net.niuniubao.ant.amac.model;

/**
 * Created by cuiyingjia on 16/4/16.
 */
public class FundList {

    public enum FundType{
        BEFORE_MEASURES,//暂行办法实施前成立的基金
        AFTER_MEASURES,//暂行办法实施后成立的基金
        IMPROPER_LIQUIDATION//非正常清盘基金
    }

    private String fundName;//基金名称

    private String fundUrl;//基金公示主页

    private Enum fundType;//基金类型

    private Long companyId;

    private Long id;

    private String dataVersion;

    private Integer procStatus;

    private Long fundId;

    public Integer getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(Integer procStatus) {
        this.procStatus = procStatus;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundUrl() {
        return fundUrl;
    }

    public void setFundUrl(String fundUrl) {
        this.fundUrl = fundUrl;
    }

    public Enum getFundType() {
        return fundType;
    }

    public void setFundType(Enum fundType) {
        this.fundType = fundType;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    @Override
    public String toString() {
        return "AmacFundInfo{" +
                "fundName='" + fundName + '\'' +
                ", fundUrl='" + fundUrl + '\'' +
                ", fundType=" + fundType +
                ", companyId='" + companyId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
