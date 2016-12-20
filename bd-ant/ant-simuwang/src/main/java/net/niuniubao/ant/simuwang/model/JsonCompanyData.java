package net.niuniubao.ant.simuwang.model;

/**
 * Created by ganjianwei on 2016/4/18.
 */
public class JsonCompanyData {

    private Long id;
    private String end_date;
    private String company_id;
    private String company_name;
    private String company_short_name;
    private String manage_cnts;
    private String fund_id;
    private String fund_name;
    private String fund_short_name;
    private String register_number;
    private String strategy;
    private String fund_type;
    private String city;
    private String fund_managers_id;
    private String fund_managers;
    private String inception_date;
    private String inception_year;
    private Double initial_unit_value;
    private Double ret_incep;

    private String dataVersion;
    private Integer procStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_short_name() {
        return company_short_name;
    }

    public void setCompany_short_name(String company_short_name) {
        this.company_short_name = company_short_name;
    }

    public String getManage_cnts() {
        return manage_cnts;
    }

    public void setManage_cnts(String manage_cnts) {
        this.manage_cnts = manage_cnts;
    }

    public String getFund_id() {
        return fund_id;
    }

    public void setFund_id(String fund_id) {
        this.fund_id = fund_id;
    }

    public String getFund_name() {
        return fund_name;
    }

    public void setFund_name(String fund_name) {
        this.fund_name = fund_name;
    }

    public String getFund_short_name() {
        return fund_short_name;
    }

    public void setFund_short_name(String fund_short_name) {
        this.fund_short_name = fund_short_name;
    }

    public String getRegister_number() {
        return register_number;
    }

    public void setRegister_number(String register_number) {
        this.register_number = register_number;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getFund_type() {
        return fund_type;
    }

    public void setFund_type(String fund_type) {
        this.fund_type = fund_type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFund_managers_id() {
        return fund_managers_id;
    }

    public void setFund_managers_id(String fund_managers_id) {
        this.fund_managers_id = fund_managers_id;
    }

    public String getFund_managers() {
        return fund_managers;
    }

    public void setFund_managers(String fund_managers) {
        this.fund_managers = fund_managers;
    }

    public String getInception_date() {
        return inception_date;
    }

    public void setInception_date(String inception_date) {
        this.inception_date = inception_date;
    }

    public String getInception_year() {
        return inception_year;
    }

    public void setInception_year(String inception_year) {
        this.inception_year = inception_year;
    }

    public Double getInitial_unit_value() {
        return initial_unit_value;
    }

    public void setInitial_unit_value(Double initial_unit_value) {
        this.initial_unit_value = initial_unit_value;
    }

    public Double getRet_incep() {
        return ret_incep;
    }

    public void setRet_incep(Double ret_incep) {
        this.ret_incep = ret_incep;
    }

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

    @Override
    public String toString() {
        return "SimuWangCompanyJsonData{" +
                "id=" + id +
                ", end_date='" + end_date + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", company_short_name='" + company_short_name + '\'' +
                ", manage_cnts='" + manage_cnts + '\'' +
                ", fund_id='" + fund_id + '\'' +
                ", fund_name='" + fund_name + '\'' +
                ", fund_short_name='" + fund_short_name + '\'' +
                ", register_number='" + register_number + '\'' +
                ", strategy='" + strategy + '\'' +
                ", fund_type='" + fund_type + '\'' +
                ", city='" + city + '\'' +
                ", fund_managers_id='" + fund_managers_id + '\'' +
                ", fund_managers='" + fund_managers + '\'' +
                ", inception_date='" + inception_date + '\'' +
                ", inception_year='" + inception_year + '\'' +
                ", initial_unit_value=" + initial_unit_value +
                ", ret_incep=" + ret_incep +
                ", dataVersion='" + dataVersion + '\'' +
                ", procStatus=" + procStatus +
                '}';
    }
}
