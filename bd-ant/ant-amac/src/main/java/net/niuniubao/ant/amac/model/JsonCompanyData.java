package net.niuniubao.ant.amac.model;

import java.io.Serializable;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/15.
 */
public class JsonCompanyData implements Serializable{

    private static final long serialVersionUID = -8128701619109160804L;

    /**
     * 自定义数据项
     */
    private Long listId;
    private Integer procStatus;
    private String dataVersion;

    /**
     * Json数据项
     */
    private Long id;
    private String managerName;
    private String artificialPersonName;
    private String registerNo;
    private Long establishDate;
    private String managerHasProduct;
    private String url;
    private Long registerDate;
    private String registerAddress;
    private String registerProvince;
    private String registerCity;
    private String regAdrAgg;
    private Integer fundCount;
    private Double fundScale;
    private Boolean hasSpecialTips;
    private Boolean inBlacklist;
    private Boolean hasCreditTips;
    private String regCoordinate;
    private String officeCoordinate;
    private String officeAddress;
    private String officeProvince;
    private String officeCity;
    private String primaryInvestType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getArtificialPersonName() {
        return artificialPersonName;
    }

    public void setArtificialPersonName(String artificialPersonName) {
        this.artificialPersonName = artificialPersonName;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public Long getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Long establishDate) {
        this.establishDate = establishDate;
    }

    public String getManagerHasProduct() {
        return managerHasProduct;
    }

    public void setManagerHasProduct(String managerHasProduct) {
        this.managerHasProduct = managerHasProduct;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Long registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    public String getRegisterProvince() {
        return registerProvince;
    }

    public void setRegisterProvince(String registerProvince) {
        this.registerProvince = registerProvince;
    }

    public String getRegisterCity() {
        return registerCity;
    }

    public void setRegisterCity(String registerCity) {
        this.registerCity = registerCity;
    }

    public String getRegAdrAgg() {
        return regAdrAgg;
    }

    public void setRegAdrAgg(String regAdrAgg) {
        this.regAdrAgg = regAdrAgg;
    }

    public Integer getFundCount() {
        return fundCount;
    }

    public void setFundCount(Integer fundCount) {
        this.fundCount = fundCount;
    }

    public Double getFundScale() {
        return fundScale;
    }

    public void setFundScale(Double fundScale) {
        this.fundScale = fundScale;
    }

    public Boolean getHasSpecialTips() {
        return hasSpecialTips;
    }

    public void setHasSpecialTips(Boolean hasSpecialTips) {
        this.hasSpecialTips = hasSpecialTips;
    }

    public Boolean getInBlacklist() {
        return inBlacklist;
    }

    public void setInBlacklist(Boolean inBlacklist) {
        this.inBlacklist = inBlacklist;
    }

    public Boolean getHasCreditTips() {
        return hasCreditTips;
    }

    public void setHasCreditTips(Boolean hasCreditTips) {
        this.hasCreditTips = hasCreditTips;
    }

    public String getRegCoordinate() {
        return regCoordinate;
    }

    public void setRegCoordinate(String regCoordinate) {
        this.regCoordinate = regCoordinate;
    }

    public String getOfficeCoordinate() {
        return officeCoordinate;
    }

    public void setOfficeCoordinate(String officeCoordinate) {
        this.officeCoordinate = officeCoordinate;
    }

    public String getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getOfficeProvince() {
        return officeProvince;
    }

    public void setOfficeProvince(String officeProvince) {
        this.officeProvince = officeProvince;
    }

    public String getOfficeCity() {
        return officeCity;
    }

    public void setOfficeCity(String officeCity) {
        this.officeCity = officeCity;
    }

    public String getPrimaryInvestType() {
        return primaryInvestType;
    }

    public void setPrimaryInvestType(String primaryInvestType) {
        this.primaryInvestType = primaryInvestType;
    }

    public Long getListId() {
        return listId;
    }

    public void setListId(Long listId) {
        this.listId = listId;
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
}

