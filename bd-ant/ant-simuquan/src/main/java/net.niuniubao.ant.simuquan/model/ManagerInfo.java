package net.niuniubao.ant.simuquan.model;

/**
 * Created by GanJianWei on 2016/4/28.
 */
public class ManagerInfo {
    private java.lang.Integer manager_info_id; //managerInfoId
    private java.lang.String id; //基金经理人Id
    private java.lang.String name; //基金经理人姓名
    private java.lang.String avatar; //基金经理人头像
    private java.lang.String work_years; //基金经理人从业年限
    private java.lang.String resume_bg; //从业背景
    private java.lang.String edu; //学历
    private java.lang.String employ_date; //私募任职时间
    private java.lang.String employ_org; //过往从业机构
    private java.lang.String desc; //简介
    private java.lang.String company_id; //公司id
    private java.lang.String company_name; //公司名称
    private java.lang.String fund_num; //旗下基金数
    private java.lang.String data_version; //dataVersion
    private java.lang.Integer proc_status; //procStatus

    public Integer getManager_info_id() {
        return manager_info_id;
    }

    public void setManager_info_id(Integer manager_info_id) {
        this.manager_info_id = manager_info_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWork_years() {
        return work_years;
    }

    public void setWork_years(String work_years) {
        this.work_years = work_years;
    }

    public String getResume_bg() {
        return resume_bg;
    }

    public void setResume_bg(String resume_bg) {
        this.resume_bg = resume_bg;
    }

    public String getEdu() {
        return edu;
    }

    public void setEdu(String edu) {
        this.edu = edu;
    }

    public String getEmploy_date() {
        return employ_date;
    }

    public void setEmploy_date(String employ_date) {
        this.employ_date = employ_date;
    }

    public String getEmploy_org() {
        return employ_org;
    }

    public void setEmploy_org(String employ_org) {
        this.employ_org = employ_org;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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

    public String getFund_num() {
        return fund_num;
    }

    public void setFund_num(String fund_num) {
        this.fund_num = fund_num;
    }

    public String getData_version() {
        return data_version;
    }

    public void setData_version(String data_version) {
        this.data_version = data_version;
    }

    public Integer getProc_status() {
        return proc_status;
    }

    public void setProc_status(Integer proc_status) {
        this.proc_status = proc_status;
    }

    @Override
    public String toString() {
        return "ManagerInfo{" +
                "manager_info_id=" + manager_info_id +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", work_years='" + work_years + '\'' +
                ", resume_bg='" + resume_bg + '\'' +
                ", edu='" + edu + '\'' +
                ", employ_date='" + employ_date + '\'' +
                ", employ_org='" + employ_org + '\'' +
                ", describe='" + desc + '\'' +
                ", company_id='" + company_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", fund_num='" + fund_num + '\'' +
                ", data_version='" + data_version + '\'' +
                ", proc_status=" + proc_status +
                '}';
    }
}
