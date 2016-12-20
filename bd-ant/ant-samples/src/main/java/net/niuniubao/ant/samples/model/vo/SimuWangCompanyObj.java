package net.niuniubao.ant.samples.model.vo;

import net.niuniubao.ant.model.annotation.ExtractBy;

/**
 * Created by Administrator on 2016/4/14.
 */
public class SimuWangCompanyObj {

    private int simuCompanyId;

    private String htmlId;

    @ExtractBy("//table[@class=lineh30 AND @class=f14]//tr[1]/td[2]/text()")
    private String companyName;//基金公司名称

    @ExtractBy("//table[@class=lineh30 AND @class=f14]//tr[2]/td[2]/a/text()")
    private String coreLeader;//核心人物

    @ExtractBy("//table[@class=lineh30 AND @class=f14]//tr[3]/td[2]/text()")
    private String date;//成立日期

    @ExtractBy("//table[@class=lineh30 AND @class=f14]//tr[4]/td[2]/text()")
    private String registeredNumber;//备案号

    @ExtractBy("//table[@class=lineh30 AND @class=f14]//tr[5]/td[2]/text()")
    private String fundNumber;//旗下基金数

    @ExtractBy("//table[@class=lineh30 AND @class=f14]//tr[6]/td[2]/text()")
    private String address;//公司所在地

    @ExtractBy("//div[@class=padding20 AND @class=bor-blue]/div[@id=mtarget1]/div[3]/p[2]/text()")
    private String presentation;//公司介绍

    @ExtractBy("//div[@class=padding20 AND @class=bor-blue]/div[@id=mtarget1]/div[2]/div/p[2]/text()")
    private String strategy;//投资理念及策略

    @ExtractBy("//div[@id=\"mtarget1\"]/div[1]/div/div[2]")
    private String fundManager;//基金经理 TODO 整个基金经理资料块

    @ExtractBy("//div[@class=mt15]/div[@class=fr AND @class=f14 AND @class=lineh30]/p[2]/span/text()")
    private String totalAverageProfit;//累计平均收益

    @ExtractBy("//div[@class=mt15]/div[@class=fr AND @class=f14 AND @class=lineh30]/p[4]/span/text()")
    private String currentAverageProfit;//今年平均收益
    //TODO 业绩统计 （时间年份，当年发布产品的收益统）相关资讯  公司代表产品：近几年以及成立以来的收益变化根据产品名称得到  	公司旗下基金

    @ExtractBy("//div[@id=pdiv_yy_btn]/div[@class=fyh AND @class=f14]/p/span/a/@data")
    private String repProduct;

    public String getRepProduct() {
        return repProduct;
    }

    public void setRepProduct(String repProduct) {
        this.repProduct = repProduct;
    }

    public int getSimuCompanyId() {
        return simuCompanyId;
    }

    public void setSimuCompanyId(int simuCompanyId) {
        this.simuCompanyId = simuCompanyId;
    }

    public String getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(String htmlId) {
        this.htmlId = htmlId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCoreLeader() {
        return coreLeader;
    }

    public void setCoreLeader(String coreLeader) {
        this.coreLeader = coreLeader;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRegisteredNumber() {
        return registeredNumber;
    }

    public void setRegisteredNumber(String registeredNumber) {
        this.registeredNumber = registeredNumber;
    }

    public String getFundNumber() {
        return fundNumber;
    }

    public void setFundNumber(String fundNumber) {
        this.fundNumber = fundNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager;
    }

    public String getTotalAverageProfit() {
        return totalAverageProfit;
    }

    public void setTotalAverageProfit(String totalAverageProfit) {
        this.totalAverageProfit = totalAverageProfit;
    }

    public String getCurrentAverageProfit() {
        return currentAverageProfit;
    }

    public void setCurrentAverageProfit(String currentAverageProfit) {
        this.currentAverageProfit = currentAverageProfit;
    }

    @Override
    public String toString() {
        return "\n{"+"基金公司名称:"+companyName+","+
                    "核心人物:"+coreLeader+","+
                    "成立日期:"+date+","+
                    "备案号:"+registeredNumber+","+
                    "旗下基金数:"+fundNumber+","+
                    "公司所在地:"+address+","+
                    "累计平均收益:"+totalAverageProfit+","+
                    "今年平均收益:"+currentAverageProfit+","+
                    "公司介绍:"+presentation+","+
                    "投资理念及策略:"+strategy+
                    "基金经理:"+fundManager+","+
                    "代表产品:"+repProduct+","+
                "}";
    }

}
