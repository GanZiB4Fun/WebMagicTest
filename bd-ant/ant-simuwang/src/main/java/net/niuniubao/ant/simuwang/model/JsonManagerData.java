package net.niuniubao.ant.simuwang.model;

/**
 * Created by Administrator on 2016/4/18.
 */
public class JsonManagerData {
    private Long manager_list_id;
    private Integer id;
    private String fund_manager_id;
    private String personnel_name;
    private String company_id;
    private String company_short_name;
    private Integer manger_cnts;
    private String fund_id;
    private String fund_short_name;
    private Double ret_incep;
    private Double initial_unit_value;

    private String dataVersion;
    private Integer procStatus;


    public Long getManager_list_id() {
        return manager_list_id;
    }

    public void setManager_list_id(Long manager_list_id) {
        this.manager_list_id = manager_list_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFund_manager_id() {
        return fund_manager_id;
    }

    public void setFund_manager_id(String fund_manager_id) {
        this.fund_manager_id = fund_manager_id;
    }

    public String getPersonnel_name() {
        return personnel_name;
    }

    public void setPersonnel_name(String personnel_name) {
        this.personnel_name = personnel_name;
    }

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public String getCompany_short_name() {
        return company_short_name;
    }

    public void setCompany_short_name(String company_short_name) {
        this.company_short_name = company_short_name;
    }

    public Integer getManger_cnts() {
        return manger_cnts;
    }

    public void setManger_cnts(Integer manger_cnts) {
        this.manger_cnts = manger_cnts;
    }

    public String getFund_id() {
        return fund_id;
    }

    public void setFund_id(String fund_id) {
        this.fund_id = fund_id;
    }

    public String getFund_short_name() {
        return fund_short_name;
    }

    public void setFund_short_name(String fund_short_name) {
        this.fund_short_name = fund_short_name;
    }

    public Double getRet_incep() {
        return ret_incep;
    }

    public void setRet_incep(Double ret_incep) {
        this.ret_incep = ret_incep;
    }

    public Double getInitial_unit_value() {
        return initial_unit_value;
    }

    public void setInitial_unit_value(Double initial_unit_value) {
        this.initial_unit_value = initial_unit_value;
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
        return "SimuWangManagerJsonData{" +
                "id=" + id +
                ", fund_manager_id='" + fund_manager_id + '\'' +
                ", personnel_name='" + personnel_name + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_short_name='" + company_short_name + '\'' +
                ", manger_cnts='" + manger_cnts + '\'' +
                ", fund_id='" + fund_id + '\'' +
                ", fund_short_name='" + fund_short_name + '\'' +
                ", ret_incep=" + ret_incep +
                ", initial_unit_value=" + initial_unit_value +
                ", dataVersion='" + dataVersion + '\'' +
                ", procStatus=" + procStatus +
                '}';
    }
}
