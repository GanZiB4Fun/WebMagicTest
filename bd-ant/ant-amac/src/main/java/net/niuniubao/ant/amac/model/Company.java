package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;

import java.io.Serializable;

public class Company implements Serializable{

    private static final long serialVersionUID = 1259695054380764970L;



    private Long id;

    private String dataVersion;

    private Integer procStatus;



    @ExtractByUrl("[0-9]+[0-9]+[0-9\\|A-Z]*")
    private Long companyId;

    //基金管理人全称(中文)
    @ExtractBy("//table[1]/tbody/tr[3]/td[2]/div[1]/allText()")
    private String nameZh;

    //基金管理人全称(英文)
    @ExtractBy("//table[1]/tbody/tr[4]/td[2]/allText()")
    private String nameEn;

    @ExtractBy("//table[1]/tbody/tr[5]/td[2]/allText()")
    private  String registrationCode;//登记编码

    @ExtractBy("//table[1]/tbody/tr[6]/td[2]/allText()")
    private String organizationCode;//组织机构代码

    @ExtractBy("//table[1]/tbody/tr[7]/td[2]/allText()")
    private String bookinTime;//登记时间

    @ExtractBy("//table[1]/tbody/tr[7]/td[4]/allText()")
    private String regtime;//成立时间

    @ExtractBy("//table[1]/tbody/tr[8]/td[2]/allText()")
    private String registeredAddress;//注册地址

    @ExtractBy("//table[1]/tbody/tr[9]/td[2]/allText()")
    private String bizAddress;//办公地址

    @ExtractBy("//table[1]/tbody/tr[10]/td[2]/allText()")
    private String registeredCapital;//注册资本(万元)

    @ExtractBy("//table[1]/tbody/tr[10]/td[4]/allText()")
    private String contributedCapital;//实缴资本(万元)

    @ExtractBy("//table[1]/tbody/tr[11]/td[2]/allText()")
    private String enterpriseProperty;//企业性质

    @ExtractBy("//table[1]/tbody/tr[11]/td[4]/allText()")
    private String registeredCapitalRatio;//注册资本实缴比例

    @ExtractBy("//table[1]/tbody/tr[12]/td[2]/allText()")
    private String type;//管理基金主要类别

    @ExtractBy("//table[1]/tbody/tr[12]/td[4]/allText()")
    private String otherBizType;//申请的其他业务类型

    @ExtractBy("//table[1]/tbody/tr[13]/td[2]/allText()")
    private String employeeNo;//员工人数

    @ExtractBy("//table[1]/tbody/tr[13]/td[4]/allText()")
    private String webSite;//机构网址

    @ExtractBy("//table[1]/tbody/tr[15]/td[2]/allText()")
    private String legalOpinion;//法律意见书状态

    @ExtractBy("//table[1]/tbody/tr[17]/td[2]/allText()")
    private String legalRepresentative;//法定代表人

    @ExtractBy("//table[1]/tbody/tr[18]/td[2]/allText()")
    private String qualified ;//是否有从业资格

    @ExtractBy("//table[1]/tbody/tr[18]/td[4]/allText()")
    private String entitledToWay;//资格取得方式

    @ExtractBy("//table[1]/tbody/tr[26]/td[2]/allText()")
    private String lastReportTime;//机构信息最后报告时间

    @ExtractBy("//table[1]/tbody/tr[27]/td[2]/allText()")
    private String specialInfo;//特别提示信息

    //冗余处理 法律意见书有多余信息时用下面的选择器
    @ExtractBy("//table[1]/tbody/tr[19]/td[2]/allText()")
    private String legalRepresentative1;//法定代表人

    @ExtractBy("//table[1]/tbody/tr[20]/td[2]/allText()")
    private String qualified1 ;//是否有从业资格

    @ExtractBy("//table[1]/tbody/tr[20]/td[4]/allText()")
    private String entitledToWay1;//资格取得方式

    @ExtractBy("//table[1]/tbody/tr[28]/td[2]/allText()")
    private String lastReportTime1;//机构信息最后报告时间

    @ExtractBy("//table[1]/tbody/tr[29]/td[2]/allText()")
    private String specialInfo1;//特别提示信息

    /**
     * list列表
     */
    // 法定代表人/执行事务合伙人(委派代表)工作履历
    @ExtractBy("//table[1]/tbody/tr[19]/td[2]/table[1]/tbody")
    private String representativesHtml;
    // 高管情况
    @ExtractBy("//table[1]/tbody/tr[20]/td[2]/table[1]/tbody")
    private String executivesHtml;
    // 暂行办法实施前成立的基金
    @ExtractBy("//table[1]/tbody/tr[22]/td[2]")
    private String productsBeforeMeasuresHtml;
    // 暂行办法实施后成立的基金
    @ExtractBy("//table[1]/tbody/tr[23]/td[2]")
    private String productsAfterMeasuresHtml;
    // 非正常清盘基金
    @ExtractBy("//table[1]/tbody/tr[24]/td[2]")
    private String improperLiquidationsHtml;

    //冗余处理
    // 法定代表人/执行事务合伙人(委派代表)工作履历
    @ExtractBy("//table[1]/tbody/tr[21]/td[2]/table[1]/tbody")
    private String representativesHtml1;
    // 高管情况
    @ExtractBy("//table[1]/tbody/tr[22]/td[2]/table[1]/tbody")
    private String executivesHtml1;
    // 暂行办法实施前成立的基金
    @ExtractBy("//table[1]/tbody/tr[24]/td[2]")
    private String productsBeforeMeasuresHtml1;
    // 暂行办法实施后成立的基金
    @ExtractBy("//table[1]/tbody/tr[25]/td[2]")
    private String productsAfterMeasuresHtml1;
    // 非正常清盘基金
    @ExtractBy("//table[1]/tbody/tr[26]/td[2]")
    private String improperLiquidationsHtml1;

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

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getLegalRepresentative1() {
        return legalRepresentative1;
    }

    public void setLegalRepresentative1(String legalRepresentative1) {
        this.legalRepresentative1 = legalRepresentative1;
    }

    public String getQualified1() {
        return qualified1;
    }

    public void setQualified1(String qualified1) {
        this.qualified1 = qualified1;
    }

    public String getEntitledToWay1() {
        return entitledToWay1;
    }

    public void setEntitledToWay1(String entitledToWay1) {
        this.entitledToWay1 = entitledToWay1;
    }

    public String getLastReportTime1() {
        return lastReportTime1;
    }

    public void setLastReportTime1(String lastReportTime1) {
        this.lastReportTime1 = lastReportTime1;
    }

    public String getSpecialInfo1() {
        return specialInfo1;
    }

    public void setSpecialInfo1(String specialInfo1) {
        this.specialInfo1 = specialInfo1;
    }

    public String getRepresentativesHtml1() {
        return representativesHtml1;
    }

    public void setRepresentativesHtml1(String representativesHtml1) {
        this.representativesHtml1 = representativesHtml1;
    }

    public String getExecutivesHtml1() {
        return executivesHtml1;
    }

    public void setExecutivesHtml1(String executivesHtml1) {
        this.executivesHtml1 = executivesHtml1;
    }

    public String getProductsBeforeMeasuresHtml1() {
        return productsBeforeMeasuresHtml1;
    }

    public void setProductsBeforeMeasuresHtml1(String productsBeforeMeasuresHtml1) {
        this.productsBeforeMeasuresHtml1 = productsBeforeMeasuresHtml1;
    }

    public String getProductsAfterMeasuresHtml1() {
        return productsAfterMeasuresHtml1;
    }

    public void setProductsAfterMeasuresHtml1(String productsAfterMeasuresHtml1) {
        this.productsAfterMeasuresHtml1 = productsAfterMeasuresHtml1;
    }

    public String getImproperLiquidationsHtml1() {
        return improperLiquidationsHtml1;
    }

    public void setImproperLiquidationsHtml1(String improperLiquidationsHtml1) {
        this.improperLiquidationsHtml1 = improperLiquidationsHtml1;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getRegistrationCode() {
        return registrationCode;
    }

    public void setRegistrationCode(String registrationCode) {
        this.registrationCode = registrationCode;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getBookinTime() {
        return bookinTime;
    }

    public void setBookinTime(String bookinTime) {
        this.bookinTime = bookinTime;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getBizAddress() {
        return bizAddress;
    }

    public void setBizAddress(String bizAddress) {
        this.bizAddress = bizAddress;
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

    public String getEnterpriseProperty() {
        return enterpriseProperty;
    }

    public void setEnterpriseProperty(String enterpriseProperty) {
        this.enterpriseProperty = enterpriseProperty;
    }

    public String getRegisteredCapitalRatio() {
        return registeredCapitalRatio;
    }

    public void setRegisteredCapitalRatio(String registeredCapitalRatio) {
        this.registeredCapitalRatio = registeredCapitalRatio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOtherBizType() {
        return otherBizType;
    }

    public void setOtherBizType(String otherBizType) {
        this.otherBizType = otherBizType;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getLegalOpinion() {
        return legalOpinion;
    }

    public void setLegalOpinion(String legalOpinion) {
        this.legalOpinion = legalOpinion;
    }

    public String getLegalRepresentative() {
        if (representativesHtml==null || representativesHtml.length()==0)
        return legalRepresentative1;
        else
            return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative;
    }

    public String getQualified() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return qualified1;
        else
            return qualified;
    }

    public void setQualified(String qualified) {
        this.qualified = qualified;
    }

    public String getEntitledToWay() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return entitledToWay1;
        else
            return entitledToWay;
    }

    public void setEntitledToWay(String entitledToWay) {
        this.entitledToWay = entitledToWay;
    }

    public String getLastReportTime() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return lastReportTime1;
        else
            return lastReportTime;
    }

    public void setLastReportTime(String lastReportTime) {
        this.lastReportTime = lastReportTime;
    }

    public String getSpecialInfo() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return specialInfo1;
        else
            return specialInfo;
    }

    public void setSpecialInfo(String specialInfo) {
        this.specialInfo = specialInfo;
    }

    public String getRepresentativesHtml() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return representativesHtml1;
        else
            return representativesHtml;
    }

    public void setRepresentativesHtml(String representativesHtml) {
        this.representativesHtml = representativesHtml;

    }

    public String getExecutivesHtml() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return executivesHtml1;
        else
            return executivesHtml;
    }

    public void setExecutivesHtml(String executivesHtml) {
        this.executivesHtml = executivesHtml;
    }

    public String getProductsBeforeMeasuresHtml() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return productsBeforeMeasuresHtml1;
        else
            return productsBeforeMeasuresHtml;
    }

    public void setProductsBeforeMeasuresHtml(String productsBeforeMeasuresHtml) {
        this.productsBeforeMeasuresHtml = productsBeforeMeasuresHtml;
    }

    public String getProductsAfterMeasuresHtml() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return productsAfterMeasuresHtml1;
        else
            return productsAfterMeasuresHtml;
    }

    public void setProductsAfterMeasuresHtml(String productsAfterMeasuresHtml) {
        this.productsAfterMeasuresHtml = productsAfterMeasuresHtml;
    }

    public String getImproperLiquidationsHtml() {
        if (representativesHtml==null || representativesHtml.length()==0)
            return improperLiquidationsHtml1;
        else
            return improperLiquidationsHtml;
    }

    public void setImproperLiquidationsHtml(String improperLiquidationsHtml) {
        this.improperLiquidationsHtml = improperLiquidationsHtml;
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

    @Override
    public String toString() {
        return "AmacManager{" +
                "htmlId=" + companyId +
                ", id=" + id +
                ", nameZh='" + nameZh + '\'' +
                ", nameEn='" + nameEn + '\'' +
                ", registrationCode='" + registrationCode + '\'' +
                ", organizationCode='" + organizationCode + '\'' +
                ", bookinTime='" + bookinTime + '\'' +
                ", regtime='" + regtime + '\'' +
                ", registeredAddress='" + registeredAddress + '\'' +
                ", bizAddress='" + bizAddress + '\'' +
                ", registeredCapital='" + registeredCapital + '\'' +
                ", contributedCapital='" + contributedCapital + '\'' +
                ", enterpriseProperty='" + enterpriseProperty + '\'' +
                ", registeredCapitalRatio='" + registeredCapitalRatio + '\'' +
                ", type='" + type + '\'' +
                ", otherBizType='" + otherBizType + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", webSite='" + webSite + '\'' +
                ", legalOpinion='" + legalOpinion + '\'' +
                ", legalRepresentative='" + legalRepresentative + '\'' +
                ", qualified='" + qualified + '\'' +
                ", entitledToWay='" + entitledToWay + '\'' +
                ", lastReportTime='" + lastReportTime + '\'' +
                ", specialInfo='" + specialInfo + '\'' +
                ", representativesHtml='" + representativesHtml + '\'' +
                ", executivesHtml='" + executivesHtml + '\'' +
                ", productsBeforeMeasuresHtml='" + productsBeforeMeasuresHtml + '\'' +
                ", productsAfterMeasuresHtml='" + productsAfterMeasuresHtml + '\'' +
                ", improperLiquidationsHtml='" + improperLiquidationsHtml + '\'' +
                '}';
    }
}
