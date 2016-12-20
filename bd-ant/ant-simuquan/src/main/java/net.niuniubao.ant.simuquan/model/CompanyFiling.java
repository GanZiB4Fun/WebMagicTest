package net.niuniubao.ant.simuquan.model;

import net.niuniubao.ant.model.annotation.ExtractBy;

/**
 * Created by GanJianWei on 2016/4/25.
 */
public class CompanyFiling {

    private Integer id;

    private Integer procStatus;

    private String dataVersion;

    @ExtractBy("//div[@class=col-xs-12]/h1/text()")
    private String nameZh;//公司中文名
    @ExtractBy("//div[@class=col-xs-12]/h1/small/text()")
    private String nameEn;//公司英文名
    @ExtractBy("/html/body/div/div[1]/div/div/div[1]/span/text()")
    private String regCode;//登记编号
    @ExtractBy("/html/body/div/div[1]/div/div/div[2]/text()")
    private String regDate;//登记日期

    @ExtractBy("//table[@class=table]/tbody/tr[1]/td/text()")
    private String orgCode;//组织机构代码
    @ExtractBy("//table[@class=table]/tbody/tr[2]/td/text()")
    private String createDate;//成立时间
    @ExtractBy("//table[@class=table]/tbody/tr[3]/td/text()")
    private String regAdress;//注册地址
    @ExtractBy("//table[@class=table]/tbody/tr[4]/td/text()")
    private String bizAdress;//办公地址
    @ExtractBy("//table[@class=table]/tbody/tr[5]/td/text()")
    private String registeredCapital;//注册资本(万元)
    @ExtractBy("//table[@class=table]/tbody/tr[6]/td/text()")
    private String contributedCapital;//实缴资本(万元)
    @ExtractBy("//table[@class=table]/tbody/tr[7]/td/text()")
    private String registeredCapitalRatio;//注册资本实缴比例
    @ExtractBy("//table[@class=table]/tbody/tr[8]/td/text()")
    private String companyType;//公司性质
    @ExtractBy("//table[@class=table]/tbody/tr[9]/td/text()")
    private String type;//管理基金主要类别
    @ExtractBy("//table[@class=table]/tbody/tr[10]/td/text()")
    private String fundScale;//旗下基金规模
    @ExtractBy("//table[@class=table]/tbody/tr[11]/td/text()")
    private String scale;//员工人数
    @ExtractBy("//table[@class=table]/tbody/tr[12]/td/text()")
    private String webSite;//机构网址


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

    public String getNameZh() {
        return nameZh;
    }

    public void setNameZh(String nameZh) {
        this.nameZh = nameZh;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getRegCode() {
        return regCode;
    }

    public void setRegCode(String regCode) {
        this.regCode = regCode;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRegAdress() {
        return regAdress;
    }

    public void setRegAdress(String regAdress) {
        this.regAdress = regAdress;
    }

    public String getBizAdress() {
        return bizAdress;
    }

    public void setBizAdress(String bizAdress) {
        this.bizAdress = bizAdress;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getContributedCapital() {
        return contributedCapital;
    }

    public void setContributedCapital(String contributedCapital) {
        this.contributedCapital = contributedCapital;
    }

    public String getRegisteredCapitalRatio() {
        return registeredCapitalRatio;
    }

    public void setRegisteredCapitalRatio(String registeredCapitalRatio) {
        this.registeredCapitalRatio = registeredCapitalRatio;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFundScale() {
        return fundScale;
    }

    public void setFundScale(String fundScale) {
        this.fundScale = fundScale;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CompanyFiling{" +
                ", procStatus=" + procStatus +
                ", dataVersion='" + dataVersion + '\'' +
                ", nameZh='" + nameZh + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", regCode='" + regCode + '\'' +
                ", regDate='" + regDate + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", createDate='" + createDate + '\'' +
                ", regAdress='" + regAdress + '\'' +
                ", bizAdress='" + bizAdress + '\'' +
                ", registeredCapital='" + registeredCapital + '\'' +
                ", contributedCapital='" + contributedCapital + '\'' +
                ", registeredCapitalRatio='" + registeredCapitalRatio + '\'' +
                ", companyType='" + companyType + '\'' +
                ", type='" + type + '\'' +
                ", fundScale='" + fundScale + '\'' +
                ", scale='" + scale + '\'' +
                ", webSite='" + webSite + '\'' +
                '}';
    }
}
