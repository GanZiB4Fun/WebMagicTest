package net.niuniubao.ant.simuquan.model;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class CompanyManagerList implements java.io.Serializable{
    private static final long serialVersionUID = 5454155825314635342L;


    private java.lang.Integer manager_list_id; //managerListId
    private java.lang.String id; //id
    private java.lang.String name; //name
    private java.lang.String avatar; //avatar
    private java.lang.String company_id; //companyId
    private java.lang.String data_version; //dataVersion
    private java.lang.Integer proc_status; //procStatus

    public Integer getManager_list_id() {
        return manager_list_id;
    }

    public void setManager_list_id(Integer manager_list_id) {
        this.manager_list_id = manager_list_id;
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

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
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
        return "ManagerList{" +
                "manager_list_id=" + manager_list_id +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avatar='" + avatar + '\'' +
                ", company_id='" + company_id + '\'' +
                ", data_version='" + data_version + '\'' +
                ", proc_status=" + proc_status +
                '}';
    }
}

