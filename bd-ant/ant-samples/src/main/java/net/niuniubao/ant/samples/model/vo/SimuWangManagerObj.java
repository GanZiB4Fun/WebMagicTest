package net.niuniubao.ant.samples.model.vo;

import net.niuniubao.ant.model.annotation.ExtractBy;

/**
 * Created by Administrator on 2016/4/15.
 */
public class SimuWangManagerObj {

    private int managerId;

    private String htmlId;

    @ExtractBy("//div[@class=w1200 AND @class=pt20 AND @class=posR]/h1/text()")
    private String managerName;//经理人姓名

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[1]/td[2]/a/text()")
    private String company;//所在公司

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[2]/td[2]/text()")
    private String duty;//公司职位

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[4]/td[2]/text()")
    private String workYears;//从业年限

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[5]/td[2]/text()")
    private String productQuantity;//发布产品数量

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[3]/td[2]/text()")
    private String education;//最高学历

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[6]/td[2]/text()")
    private String careerBackground;//职业背景

    @ExtractBy("//div[@id=mtarget2]/div[@class=displayNone]/div/p[2]/text()")
    private String strategy;//投资理念及策略

    @ExtractBy("//div[@class=w1200 AND @class=pt20 AND @class=posR]//div[@class=fr AND @class=f14 AND @class=lineh30]/p[2]/span/text()")
    private String totalAverageProfit;//累计平均收益

    @ExtractBy("//div[@class=w1200 AND @class=pt20 AND @class=posR]//div[@class=fr AND @class=f14 AND @class=lineh30]/p[4]/span/text()")
    private String currentAverageProfit;//今年平均收益

    @ExtractBy("//div[@id=mtarget2]/div[3]/p[@class=mt15 AND @class=lineh24]/text()")
    private String intro;//人物介绍

    @ExtractBy("//div[@id=mtarget2]/div[2]/p[@class=MsoNormal]/span/text()")
    private String presentation;//公司介绍

    //TODO
    private String infomation;//相关资讯（有关投资人的报道或文章）

    //TODO 基金经理： 基金公司：代表产品、旗下基金

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getWorkYears() {
        return workYears;
    }

    public void setWorkYears(String workYears) {
        this.workYears = workYears;
    }

    public String getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(String productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCareerBackground() {
        return careerBackground;
    }

    public void setCareerBackground(String careerBackground) {
        this.careerBackground = careerBackground;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(String htmlId) {
        this.htmlId = htmlId;
    }

    public String getInfomation() {
        return infomation;
    }

    public void setInfomation(String infomation) {
        this.infomation = infomation;
    }

    @Override
    public String toString() {
        return "SimuWangManagerObj{" +
                "managerId=" + managerId +
                ", managerName='" + managerName + '\'' +
                ", company='" + company + '\'' +
                ", duty='" + duty + '\'' +
                ", workYears='" + workYears + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", education='" + education + '\'' +
                ", careerBackground='" + careerBackground + '\'' +
                ", strategy='" + strategy + '\'' +
                ", totalAverageProfit='" + totalAverageProfit + '\'' +
                ", currentAverageProfit='" + currentAverageProfit + '\'' +
                ", intro='" + intro + '\'' +
                ", presentation='" + presentation + '\'' +
                '}';
    }
}
