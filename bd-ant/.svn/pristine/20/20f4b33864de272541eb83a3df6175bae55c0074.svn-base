package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;

/**
 * Created by Administrator on 2016/4/15.
 */
public class Fund {


    private Long id;
    private Integer procStatus;
    private String dataVersion;

    @ExtractByUrl("[0-9]+[0-9]+[0-9\\|A-Z]*")
    private Long fundId;

    @ExtractBy("//table/tbody/tr[1]/td[2]/allText()")
    private String fundName;//基金名称

    @ExtractBy("//table/tbody/tr[2]/td[2]/allText()")
    private String fundCode;//基金编号

    @ExtractBy("//table/tbody/tr[3]/td[2]/allText()")
    private String date;//成立时间

    @ExtractBy("//table/tbody/tr[4]/td[2]/allText()")
    private String filingTime;//备案时间

    @ExtractBy("//table/tbody/tr[5]/td[2]/allText()")
    private String fundMoment;//基金备案阶段

    @ExtractBy("//table/tbody/tr[6]/td[2]/allText()")
    private String fundType;//基金类型

    @ExtractBy("//table/tbody/tr[7]/td[2]/allText()")
    private String currency;//币种

    @ExtractBy("//table/tbody/tr[8]/td[2]/allText()")
    private String fundManagerName;//基金管理人名称

    @ExtractBy("//table/tbody/tr[8]/td[2]/a/@href")
    private String fundManagerUrl;//基金管理人地址

    @ExtractBy("//table/tbody/tr[9]/td[2]/allText()")
    private String manageType;//管理类型

    @ExtractBy("//table/tbody/tr[10]/td[2]/allText()")
    private String trusteeShip;//是否托管

    @ExtractBy("//table/tbody/tr[11]/td[2]/allText()")
    private String trustee;//托管人名称

    @ExtractBy("//table/tbody/tr[12]/td[2]/allText()")
    private String investmentField;//主要投资领域

    @ExtractBy("//table/tbody/tr[13]/td[2]/allText()")
    private String status;//运作状态

    @ExtractBy("//table/tbody/tr[14]/td[2]/allText()")
    private String lastReportTime;//基金信息最后报告时间

    @ExtractBy("//table/tbody/tr[15]/td[2]/allText()")
    private String specialMessage;//基金协会特别提示（针对基金）

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFilingTime() {
        return filingTime;
    }

    public void setFilingTime(String filingTime) {
        this.filingTime = filingTime;
    }

    public String getFundMoment() {
        return fundMoment;
    }

    public void setFundMoment(String fundMoment) {
        this.fundMoment = fundMoment;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getFundManagerName() {
        return fundManagerName;
    }

    public void setFundManagerName(String fundManagerName) {
        this.fundManagerName = fundManagerName;
    }

    public String getManageType() {
        return manageType;
    }

    public void setManageType(String manageType) {
        this.manageType = manageType;
    }

    public String getTrusteeShip() {
        return trusteeShip;
    }

    public void setTrusteeShip(String trusteeShip) {
        this.trusteeShip = trusteeShip;
    }

    public String getTrustee() {
        return trustee;
    }

    public void setTrustee(String trustee) {
        this.trustee = trustee;
    }

    public String getInvestmentField() {
        return investmentField;
    }

    public void setInvestmentField(String investmentField) {
        this.investmentField = investmentField;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLastReportTime() {
        return lastReportTime;
    }

    public void setLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public String getSpecialMessage() {
        return specialMessage;
    }

    public void setSpecialMessage(String specialMessage) {
        this.specialMessage = specialMessage;
    }

    public Long getFundId() {
        return fundId;
    }

    public void setFundId(Long fundId) {
        this.fundId = fundId;
    }

    public String getFundManagerUrl() {
        return fundManagerUrl;
    }

    public void setFundManagerUrl(String fundManagerUrl) {
        this.fundManagerUrl = fundManagerUrl;
    }

    @Override
    public String toString() {
        return "AmacFund{" +
                "id=" + id +
                "\n, fundId='" + fundId + '\'' +
                "\n, fundName='" + fundName + '\'' +
                "\n, fundCode='" + fundCode + '\'' +
                "\n, date='" + date + '\'' +
                "\n, filingTime='" + filingTime + '\'' +
                "\n, fundMoment='" + fundMoment + '\'' +
                "\n, fundType='" + fundType + '\'' +
                "\n, currency='" + currency + '\'' +
                "\n, fundManagerName='" + fundManagerName + '\'' +
                "\n, fundManagerUrl='" + fundManagerUrl + '\'' +
                "\n, manageType='" + manageType + '\'' +
                "\n, trusteeShip='" + trusteeShip + '\'' +
                "\n, trustee='" + trustee + '\'' +
                "\n, investmentField='" + investmentField + '\'' +
                "\n, status='" + status + '\'' +
                "\n, lastReportTime='" + lastReportTime + '\'' +
                "\n, specialMessage='" + specialMessage + '\'' +
                '}';
    }
}
