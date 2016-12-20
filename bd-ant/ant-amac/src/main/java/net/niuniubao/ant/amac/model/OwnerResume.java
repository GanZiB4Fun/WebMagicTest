package net.niuniubao.ant.amac.model;

/**
 * 基金公司法人履历
 */
public class OwnerResume {

    private String period;//时间

    private String workAddr;//工作地点

    private String duty;//职务

    private Long companyId;

    private Long id;

    private String dataVersion;

    private Integer procStatus;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getWorkAddr() {
        return workAddr;
    }

    public void setWorkAddr(String workAddr) {
        this.workAddr = workAddr;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return "AmacManagerResume{" +
                "period='" + period + '\'' +
                ", workAddr='" + workAddr + '\'' +
                ", duty='" + duty + '\'' +
                ", companyId='" + companyId + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
