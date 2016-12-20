package net.niuniubao.ant.simuwang.model;

import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;

/**
 * Created by Administrator on 2016/4/15.
 */
public class Manager {

    private int fundManagerId;


    private String dataVersion;

    @ExtractByUrl("[A-Z]+[0-9]+[0-9\\|A-Z]*")
    private String managerId;

    @ExtractBy("//div[@class=w1200 AND @class=pt20 AND @class=posR]/h1/text()")
    private String managerName;//经理人姓名

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[1]/td[2]/a/text()")
    private String company;//所在公司

    @ExtractBy("//table[@class=lineh30 AND @class=f14]/tbody/tr[1]/td[2]/a/@href")
    private String companyUrl;//公司url

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

    @ExtractBy("//div[@id=mtarget2]/div[@class=displayNone]/div/allText()")
    private String strategy;//投资理念及策略

    @ExtractBy("//div[@class=w1200 AND @class=pt20 AND @class=posR]//div[@class=fr AND @class=f14 AND @class=lineh30]/p[2]/span/text()")
    private String totalAverageProfit;//累计平均收益

    @ExtractBy("//div[@class=w1200 AND @class=pt20 AND @class=posR]//div[@class=fr AND @class=f14 AND @class=lineh30]/p[4]/span/text()")
    private String currentAverageProfit;//今年平均收益

    @ExtractBy("//div[@id=mtarget2]/div[3]/allText()")
    private String intro;//人物介绍

    @ExtractBy("//div[@id=mtarget2]/div[2]/allText()")
    private String presentation;//公司介绍

    @ExtractBy("//div[@id=mtarget2]/div[1]/div/")
    private String teamIntro;//投研团队介绍

    public String getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    public int getFundManagerId() {
        return fundManagerId;
    }

    public void setFundManagerId(int fundManagerId) {
        this.fundManagerId = fundManagerId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
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

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
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

    public String getTeamIntro() {
        return teamIntro;
    }

    public void setTeamIntro(String teamIntro) {
        this.teamIntro = teamIntro;
    }

    @Override
    public String toString() {
        return "SimuWangManagerObj{" +
                "fundManagerId=" + fundManagerId +
                ", managerId='" + managerId + '\'' +
                ", managerName='" + managerName + '\'' +
                ", company='" + company + '\'' +
                ", companyUrl='" + companyUrl + '\'' +
                ", duty='" + duty + '\'' +
                ", workYears='" + workYears + '\'' +
                ", productQuantity='" + productQuantity + '\'' +
                ", education='" + education + '\'' +
                ", careerBackground='" + careerBackground + '\'' +"\n\n\n\n"+
                ", strategy='" + strategy + '\'' +"\n\n\n\n"+
                ", totalAverageProfit='" + totalAverageProfit + '\'' +
                ", currentAverageProfit='" + currentAverageProfit + '\'' +
                ", intro='" + intro + '\'' +
                ", presentation='" + presentation + '\'' +
                ", teamIntro='" + teamIntro + '\'' +
                '}';
    }

}
