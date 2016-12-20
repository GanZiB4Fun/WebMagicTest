package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.model.annotation.ExtractBy;

import java.io.Serializable;

/**
 * Created by GanJianWei on 2016/4/29.
 */
public class FundJbgkObj implements Serializable{
    private Integer fundJbgkId;
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[1]/td[1]/text()")
    private String fundName;//基金全称
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[1]/td[2]/text()")
    private String fundShortName;//基金简称
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[2]/td[1]/text()")
    private String fundCode;//基金代码
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[2]/td[2]/text()")
    private String fundType;//基金类型
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[3]/td[1]/text()")
    private String issueDate;//发行日期
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[3]/td[2]/text()")
    private String foundDateAndSize;//成立日期/规模
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[4]/td[1]/text()")
    private String propertyScale;//资产规模
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[4]/td[2]/text()")
    private String shareSize;//份额规模
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[5]/td[1]/a/text()")
    private String company;//基金管理人
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[5]/td[1]/a/@href")
    private String companyUrlId;
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[5]/td[2]/a/text()")
    private String bank;//基金托管人
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[6]/td[1]/a/text()")
    private String fundManager;//基金经理
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[6]/td[1]/a/@href")
    private String fundManagerUrlId;//基金经理人URLID
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[6]/td[2]/a/text()")
    private String sinceFoundFh;//成立以来分红
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[7]/td[1]/text()")
    private String mangermentRate;//管理费率
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[7]/td[2]/text()")
    private String managedRate;//托管费率
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[8]/td[1]/text()")
    private String salesServiceRate;//销售服务率
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[8]/td[2]/text()")
    private String subscriptionRate;//最高认购率
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[9]/td[1]/text()")
    private String purchaseRate;//最高申购费率
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[9]/td[2]/text()")
    private String redemptionRate;//最高赎回费率
    @ExtractBy("//div[@class=txt_in]/div[7]/div/p/text()")
    private String compref;//业绩比较基准
    @ExtractBy("//div[@class=txt_in]/div/table/tbody/tr[10]/td[2]/text()")
    private String trackTarget;//跟踪标的
    @ExtractBy("//div[@class=txt_in]/div[2]/div/p/text()")
    private String goal;//投资目标
    @ExtractBy("//div[@class=txt_in]/div[3]/div/p/text()")
    private String ideal;//投资理念
    @ExtractBy("//div[@class=txt_in]/div[4]/div/p/text()")
    private String scope;//投资范围
    @ExtractBy("//div[@class=txt_in]/div[5]/div/p/text()")
    private String strategy;//投资策略
    @ExtractBy("//div[@class=txt_in]/div[6]/div/p/text()")
    private String dividedPolicy;//分红政策
    @ExtractBy("//div[@class=txt_in]/div[8]/div/p/text()")
    private String riskReturnCharacteristic;//风险收益特征

    private String fundUrlId;

    public String getFundUrlId() {
        return fundUrlId;
    }

    public void setFundUrlId(String fundUrlId) {
        this.fundUrlId = fundUrlId;
    }

    public String getCompanyUrlId() {
        return companyUrlId;
    }

    public void setCompanyUrlId(String companyUrlId) {
        this.companyUrlId = companyUrlId;
    }

    public String getFundManagerUrlId() {
        return fundManagerUrlId;
    }

    public void setFundManagerUrlId(String fundManagerUrlId) {
        this.fundManagerUrlId = fundManagerUrlId;
    }

    public Integer getFundJbgkId() {
        return fundJbgkId;
    }

    public void setFundJbgkId(Integer fundJbgkId) {
        this.fundJbgkId = fundJbgkId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundShortName() {
        return fundShortName;
    }

    public void setFundShortName(String fundShortName) {
        this.fundShortName = fundShortName;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getFoundDateAndSize() {
        return foundDateAndSize;
    }

    public void setFoundDateAndSize(String foundDateAndSize) {
        this.foundDateAndSize = foundDateAndSize;
    }

    public String getPropertyScale() {
        return propertyScale;
    }

    public void setPropertyScale(String propertyScale) {
        this.propertyScale = propertyScale;
    }

    public String getShareSize() {
        return shareSize;
    }

    public void setShareSize(String shareSize) {
        this.shareSize = shareSize;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager;
    }

    public String getSinceFoundFh() {
        return sinceFoundFh;
    }

    public void setSinceFoundFh(String sinceFoundFh) {
        this.sinceFoundFh = sinceFoundFh;
    }

    public String getMangermentRate() {
        return mangermentRate;
    }

    public void setMangermentRate(String mangermentRate) {
        this.mangermentRate = mangermentRate;
    }

    public String getManagedRate() {
        return managedRate;
    }

    public void setManagedRate(String managedRate) {
        this.managedRate = managedRate;
    }

    public String getSalesServiceRate() {
        return salesServiceRate;
    }

    public void setSalesServiceRate(String salesServiceRate) {
        this.salesServiceRate = salesServiceRate;
    }

    public String getSubscriptionRate() {
        return subscriptionRate;
    }

    public void setSubscriptionRate(String subscriptionRate) {
        this.subscriptionRate = subscriptionRate;
    }

    public String getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(String purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public String getRedemptionRate() {
        return redemptionRate;
    }

    public void setRedemptionRate(String redemptionRate) {
        this.redemptionRate = redemptionRate;
    }

    public String getCompref() {
        return compref;
    }

    public void setCompref(String compref) {
        this.compref = compref;
    }

    public String getTrackTarget() {
        return trackTarget;
    }

    public void setTrackTarget(String trackTarget) {
        this.trackTarget = trackTarget;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getIdeal() {
        return ideal;
    }

    public void setIdeal(String ideal) {
        this.ideal = ideal;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getDividedPolicy() {
        return dividedPolicy;
    }

    public void setDividedPolicy(String dividedPolicy) {
        this.dividedPolicy = dividedPolicy;
    }

    public String getRiskReturnCharacteristic() {
        return riskReturnCharacteristic;
    }

    public void setRiskReturnCharacteristic(String riskReturnCharacteristic) {
        this.riskReturnCharacteristic = riskReturnCharacteristic;
    }

    @Override
    public String toString() {
        return "FundJbgkObj{" +
                "fundJbgkId=" + fundJbgkId +
                ", fundName='" + fundName + '\'' +
                ", fundShortName='" + fundShortName + '\'' +
                ", fundCode='" + fundCode + '\'' +
                ", fundType='" + fundType + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", foundDateAndSize='" + foundDateAndSize + '\'' +
                ", propertyScale='" + propertyScale + '\'' +
                ", shareSize='" + shareSize + '\'' +
                ", company='" + company + '\'' +
                ", companyUrlId='" + companyUrlId + '\'' +
                ", bank='" + bank + '\'' +
                ", fundManager='" + fundManager + '\'' +
                ", fundManagerUrlId='" + fundManagerUrlId + '\'' +
                ", sinceFoundFh='" + sinceFoundFh + '\'' +
                ", mangermentRate='" + mangermentRate + '\'' +
                ", managedRate='" + managedRate + '\'' +
                ", salesServiceRate='" + salesServiceRate + '\'' +
                ", subscriptionRate='" + subscriptionRate + '\'' +
                ", purchaseRate='" + purchaseRate + '\'' +
                ", redemptionRate='" + redemptionRate + '\'' +
                ", compref='" + compref + '\'' +
                ", trackTarget='" + trackTarget + '\'' +
                ", goal='" + goal + '\'' +
                ", ideal='" + ideal + '\'' +
                ", scope='" + scope + '\'' +
                ", strategy='" + strategy + '\'' +
                ", dividedPolicy='" + dividedPolicy + '\'' +
                ", riskReturnCharacteristic='" + riskReturnCharacteristic + '\'' +
                '}';
    }
}
