package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;


/**
 * Created by cuiyingjia on 16/4/8.
 */
public class ManagerObj {

    private Integer managerId;

    @ExtractBy("//h3[@id=name_1]/text()")
    private String managerName;//姓名

    @ExtractBy("//div[@class=right AND @class=jd]/text()")// FIXME: 16/4/13
    private String workDays;//从业时间

    @ExtractBy("//div[@class=right AND @class=jd]/text()")// FIXME: 16/4/13
    private String workBegin;//任职开始时间

    @ExtractBy("//div[@class=right AND @class=jd]/a/text()")
    private String company;//现任基金公司

    @ExtractBy("//div[@class=gmleft AND @class=gmlefts]/span[@class=numtext]/span[1]/text()")
    private String currentScale;//现任基金资产总规模(亿元)

    @ExtractBy("//div[@class=gmContainer]/div[2]//span[@class=redText]/text()")
    private String bestProfit;//从业期间最佳基金回报(%)

    @ExtractBy("//div[@class=right AND @class=ms]/p/text()")
    private String introduction;//简介

    @ExtractByUrl("(\\d+)")
    private String managerUrlId;

    @ExtractBy("//div[@class=right AND @class=jd]/a/@href")
    private String companyUrlId;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerUrlId() {
        return managerUrlId;
    }

    public void setManagerUrlId(String managerUrlId) {
        this.managerUrlId = managerUrlId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getWorkDays() {
        return workDays;
    }

    public void setWorkDays(String workDays) {
        this.workDays = workDays;
    }

    public String getWorkBegin() {
        return workBegin;
    }

    public void setWorkBegin(String workBegin) {
        this.workBegin = workBegin;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCurrentScale() {
        return currentScale;
    }

    public void setCurrentScale(String currentScale) {
        this.currentScale = currentScale;
    }

    public String getBestProfit() {
        return bestProfit;
    }

    public void setBestProfit(String bestProfit) {
        this.bestProfit = bestProfit;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getCompanyUrlId() {
        return companyUrlId;
    }

    public void setCompanyUrlId(String companyUrlId) {
        this.companyUrlId = companyUrlId;
    }

    @Override
    public String toString() {
        return "ManagerObj{" +
                "managerId=" + managerId +
                ", managerUrlId=" + managerUrlId +
                ", managerName='" + managerName + '\'' +
                ", workDays='" + workDays + '\'' +
                ", workBegin='" + workBegin + '\'' +
                ", company='" + company + '\'' +
                ", currentScale='" + currentScale + '\'' +
                ", bestProfit='" + bestProfit + '\'' +
                ", introduction='" + introduction + '\'' +
                ", companyUrlId='" + companyUrlId + '\'' +
                '}';
    }
}


