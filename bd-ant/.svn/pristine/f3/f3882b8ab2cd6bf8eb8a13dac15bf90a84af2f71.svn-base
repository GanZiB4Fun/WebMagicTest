package net.niuniubao.ant.simuwang.model;


import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/4/13.
 *
 * 基金详细信息
 */
public class Fund implements Serializable{

    private static final long serialVersionUID = -831979078158585067L;

    private int id;
    private String dataVersion;

    @ExtractByUrl("[A-Z]+[0-9]+[0-9\\|A-Z]*")
    private String fundId;

    @ExtractBy("//h1[@class=fl AND @class=f16 AND @class=f024590]/text()")
    private String fundName;//基金产品名称

    @ExtractBy("//div[@class=tabli AND @class=f14 AND @class=fr]/span[1]/text()")
    private String recordCode;//备案编码

    @ExtractBy("//div[@class=tabli AND @class=f14 AND @class=fr]/span[2]/text()")
    private String stutas;//运行状态

    @ExtractBy("//div[@class=tabli AND @class=f14 AND @class=fr]/span[3]/text()")
    private String showLogo;//披露标识

    @ExtractBy("//ul[@class=box8]/li[1]/p/span/text()")
    private String currentProfit;//今年收益

    @ExtractBy("//ul[@class=box8]//li[2]/p/span/text()")
    private String totalProfit;//累计收益

    @ExtractBy("//ul[@class=box8]//li[3]/p/text()")
    private String lastestPerValue;//最新净值

    @ExtractBy("//ul[@class=box8]//li[4]/p/text()")
    private String totalPerValue;//累计净值

    @ExtractBy("//ul[@class=tabli5]")// FIXME: 16/4/15 基金经理是列表,单个基金经理和多个基金经理样式不同
    private String fundManager;//基金经理

    @ExtractBy("//div[@id=mtarget3]//div[@class=fr]//p[2]/text()")
    private String company;//私募公司

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[1]/td[2]/text()")
    private String lockUpPeriod;//封闭期

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[2]/td[2]/a/text() | //div[@class=w340 and @class=fl]//div[5]//div[2]//tr[2]/td[2]/text()")
    private String openDay;//开放日

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[3]/td[2]/text()")
    private String subscriptionStartPoint;//认购起点

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[4]/td[2]/text()")
    private String plusStartPoint;//追加起点

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[5]/td[2]/span/text() | //div[@class=w340 and @class=fl]//div[5]//div[2]//tr[5]/td[2]/text()")
    private String subscriptionRate;//认购费率

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[6]/td[2]/span/text() | //div[@class=w340 and @class=fl]//div[5]//div[2]//tr[6]/td[2]/text()")
    private String redemptionRate;//赎回费率

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[7]/td[2]/text()")
    private String precautiousLine;//预警线

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[8]/td[2]/text()")
    private String stopLine;//止损线

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[1]/td[2]/a/text()")
    private String investmentAdviser;//投资顾问

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[2]/td[2]/span/text()")
    private String performanceFee;//业绩报酬

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[3]/td[2]/text()")
    private String fundManagement;//基金管理人

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[4]/td[2]/span/text()")
    private String managementFeeRate;//管理费率

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[5]/td[2]/text()")
    private String custodian;//基金托管人

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[6]/td[2]/text()")
    private String brokerageHouse;//证券经纪商

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[7]/td[2]/text()")
    private String futuresBroker;//期货经纪商

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[1]/td[2]/text()")
    private String createDate;//成立日期

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[3]/td[2]/text()")
    private String initialSize;//初始规模

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[4]/td[2]/text()")
    private String durationOfInverse;//续存期限

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[5]/td[2]/text()")
    private String isgraded;//是否分级

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[6]/td[2]/text()")
    private String ifUmbellateFund;//是否伞型

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[7]/td[2]/text()")
    private String productType;//产品类型

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[8]/td[2]/text()")
    private String investmentStrategy;//投资策略

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[9]/td[2]/text()")
    private String subInvestment;//子投资

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[1]/td[2]/a/@href")
    private String comPanyUrl;//基金公司页面



//    //TODO 动态列表的字段: 区间收益 年度回报 月度回报 回撤分析、风险分析、投资风格。


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public String getFundId() {
        return fundId;
    }

    public void setFundId(String fundId) {
        this.fundId = fundId;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getRecordCode() {
        return recordCode;
    }

    public void setRecordCode(String recordCode) {
        this.recordCode = recordCode;
    }

    public String getStutas() {
        return stutas;
    }

    public void setStutas(String stutas) {
        this.stutas = stutas;
    }

    public String getShowLogo() {
        return showLogo;
    }

    public void setShowLogo(String showLogo) {
        this.showLogo = showLogo;
    }

    public String getCurrentProfit() {
        return currentProfit;
    }

    public void setCurrentProfit(String currentProfit) {
        this.currentProfit = currentProfit;
    }

    public String getTotalProfit() {
        return totalProfit;
    }

    public void setTotalProfit(String totalProfit) {
        this.totalProfit = totalProfit;
    }

    public String getLastestPerValue() {
        return lastestPerValue;
    }

    public void setLastestPerValue(String lastestPerValue) {
        this.lastestPerValue = lastestPerValue;
    }

    public String getTotalPerValue() {
        return totalPerValue;
    }

    public void setTotalPerValue(String totalPerValue) {
        this.totalPerValue = totalPerValue;
    }

    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLockUpPeriod() {
        return lockUpPeriod;
    }

    public void setLockUpPeriod(String lockUpPeriod) {
        this.lockUpPeriod = lockUpPeriod;
    }

    public String getOpenDay() {
        return openDay;
    }

    public void setOpenDay(String openDay) {
        this.openDay = openDay;
    }

    public String getSubscriptionStartPoint() {
        return subscriptionStartPoint;
    }

    public void setSubscriptionStartPoint(String subscriptionStartPoint) {
        this.subscriptionStartPoint = subscriptionStartPoint;
    }

    public String getPlusStartPoint() {
        return plusStartPoint;
    }

    public void setPlusStartPoint(String plusStartPoint) {
        this.plusStartPoint = plusStartPoint;
    }

    public String getSubscriptionRate() {
        return subscriptionRate;
    }

    public void setSubscriptionRate(String subscriptionRate) {
        this.subscriptionRate = subscriptionRate;
    }

    public String getRedemptionRate() {
        return redemptionRate;
    }

    public void setRedemptionRate(String redemptionRate) {
        this.redemptionRate = redemptionRate;
    }

    public String getPrecautiousLine() {
        return precautiousLine;
    }

    public void setPrecautiousLine(String precautiousLine) {
        this.precautiousLine = precautiousLine;
    }

    public String getStopLine() {
        return stopLine;
    }

    public void setStopLine(String stopLine) {
        this.stopLine = stopLine;
    }

    public String getInvestmentAdviser() {
        return investmentAdviser;
    }

    public void setInvestmentAdviser(String investmentAdviser) {
        this.investmentAdviser = investmentAdviser;
    }

    public String getPerformanceFee() {
        return performanceFee;
    }

    public void setPerformanceFee(String performanceFee) {
        this.performanceFee = performanceFee;
    }

    public String getFundManagement() {
        return fundManagement;
    }

    public void setFundManagement(String fundManagement) {
        this.fundManagement = fundManagement;
    }

    public String getManagementFeeRate() {
        return managementFeeRate;
    }

    public void setManagementFeeRate(String managementFeeRate) {
        this.managementFeeRate = managementFeeRate;
    }

    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian;
    }

    public String getBrokerageHouse() {
        return brokerageHouse;
    }

    public void setBrokerageHouse(String brokerageHouse) {
        this.brokerageHouse = brokerageHouse;
    }

    public String getFuturesBroker() {
        return futuresBroker;
    }

    public void setFuturesBroker(String futuresBroker) {
        this.futuresBroker = futuresBroker;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }

    public String getDurationOfInverse() {
        return durationOfInverse;
    }

    public void setDurationOfInverse(String durationOfInverse) {
        this.durationOfInverse = durationOfInverse;
    }

    public String getIsgraded() {
        return isgraded;
    }

    public void setIsgraded(String isgraded) {
        this.isgraded = isgraded;
    }

    public String getIfUmbellateFund() {
        return ifUmbellateFund;
    }

    public void setIfUmbellateFund(String ifUmbellateFund) {
        this.ifUmbellateFund = ifUmbellateFund;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getInvestmentStrategy() {
        return investmentStrategy;
    }

    public void setInvestmentStrategy(String investmentStrategy) {
        this.investmentStrategy = investmentStrategy;
    }

    public String getSubInvestment() {
        return subInvestment;
    }

    public void setSubInvestment(String subInvestment) {
        this.subInvestment = subInvestment;
    }

    public String getComPanyUrl() {
        return comPanyUrl;
    }

    public void setComPanyUrl(String comPanyUrl) {
        this.comPanyUrl = comPanyUrl;
    }

    @Override
    public String toString() {
        return "{" +
                "基金产品名称:" + fundName + "," +
                "备案编码:"+recordCode+","+
                "运行状态:"+stutas+","+
                "披露标识:"+showLogo+","+
                "今年收益:"+currentProfit+","+
                "累计收益:"+totalProfit+","+
                "最新净值:"+lastestPerValue+","+
                "累计净值:"+totalPerValue+ ","+
                "私募公司:"+company+ ",\n"+
                "封闭期:"+lockUpPeriod+ ",\n"+
                "开放日:"+ openDay + ",\n"+
                "认购起点:"+subscriptionStartPoint+ ",\n"+
                "追加起点:"+plusStartPoint+ ",\n"+
                "认购费率:"+subscriptionRate+ ",\n"+
                "赎回费率:"+redemptionRate+ ",\n"+
                "预警线:"+precautiousLine+ ",\n"+
                "止损线:"+stopLine+ ",\n"+
                "投资顾问:"+investmentAdviser+ ",\n"+
                "基金管理人:"+fundManagement+ ",\n"+
                "管理费率:"+managementFeeRate+ ",\n"+
                "基金托管人:"+custodian+ ",\n"+
                "证券经纪商:"+brokerageHouse+ ",\n"+
                "期货经纪商:"+futuresBroker+ ",\n"+
                "成立日期:"+createDate+ ",\n"+
                "初始规模:"+initialSize+ ",\n"+
                "续存期限:"+durationOfInverse+ ",\n"+
                "是否分级:"+isgraded+ ",\n"+
                "是否伞形:"+ifUmbellateFund+ ",\n"+
                "产品类型:"+productType+ ",\n"+
                "投资策略:"+investmentStrategy+ ",\n"+
                "子投资:"+subInvestment+ "\n"+

                "}";
    }

}
