package net.niuniubao.ant.eastmoney.model;


/**
 * Created by GanJianWei on 2016/4/21.
 */
public class FundJsonData {
    private String fundListId;
    private String _id;
    private String FINCODE;
    private String FULLNAME;
    private String SHORTNAME;
    private String ESTABDATE;
    private String DCCODE;
    private String MGRNAME;
    private String PDATE;
    private Double NAV;
    private Double M;
    private Double Q;
    private Double HY;
    private Double Y;
    private Double TWY;
    private Double TRY;
    private Double FY;
    private Double SY;
    private Double SE;

    private String dataVersion;

    private Integer procStatus;

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

    public String getFundListId() {
        return fundListId;
    }

    public void setFundListId(String fundListId) {
        this.fundListId = fundListId;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFINCODE() {
        return FINCODE;
    }

    public void setFINCODE(String FINCODE) {
        this.FINCODE = FINCODE;
    }

    public String getFULLNAME() {
        return FULLNAME;
    }

    public void setFULLNAME(String FULLNAME) {
        this.FULLNAME = FULLNAME;
    }

    public String getSHORTNAME() {
        return SHORTNAME;
    }

    public void setSHORTNAME(String SHORTNAME) {
        this.SHORTNAME = SHORTNAME;
    }

    public String getESTABDATE() {
        return ESTABDATE;
    }

    public void setESTABDATE(String ESTABDATE) {
        this.ESTABDATE = ESTABDATE;
    }

    public String getDCCODE() {
        return DCCODE;
    }

    public void setDCCODE(String DCCODE) {
        this.DCCODE = DCCODE;
    }

    public String getMGRNAME() {
        return MGRNAME;
    }

    public void setMGRNAME(String MGRNAME) {
        this.MGRNAME = MGRNAME;
    }

    public String getPDATE() {
        return PDATE;
    }

    public void setPDATE(String PDATE) {
        this.PDATE = PDATE;
    }

    public Double getNAV() {
        return NAV;
    }

    public void setNAV(Double NAV) {
        this.NAV = NAV;
    }

    public Double getM() {
        return M;
    }

    public void setM(Double m) {
        M = m;
    }

    public Double getQ() {
        return Q;
    }

    public void setQ(Double q) {
        Q = q;
    }

    public Double getHY() {
        return HY;
    }

    public void setHY(Double HY) {
        this.HY = HY;
    }

    public Double getY() {
        return Y;
    }

    public void setY(Double y) {
        Y = y;
    }

    public Double getTWY() {
        return TWY;
    }

    public void setTWY(Double TWY) {
        this.TWY = TWY;
    }

    public Double getTRY() {
        return TRY;
    }

    public void setTRY(Double TRY) {
        this.TRY = TRY;
    }

    public Double getFY() {
        return FY;
    }

    public void setFY(Double FY) {
        this.FY = FY;
    }

    public Double getSY() {
        return SY;
    }

    public void setSY(Double SY) {
        this.SY = SY;
    }

    public Double getSE() {
        return SE;
    }

    public void setSE(Double SE) {
        this.SE = SE;
    }

    @Override
    public String toString() {
        return "FundJsonData{" +
                "fundListId='" + fundListId + '\'' +
                ", _id='" + _id + '\'' +
                ", FINCODE='" + FINCODE + '\'' +
                ", FULLNAME='" + FULLNAME + '\'' +
                ", SHORTNAME='" + SHORTNAME + '\'' +
                ", ESTABDATE='" + ESTABDATE + '\'' +
                ", DCCODE='" + DCCODE + '\'' +
                ", MGRNAME='" + MGRNAME + '\'' +
                ", PDATE='" + PDATE + '\'' +
                ", NAV='" + NAV + '\'' +
                ", M='" + M + '\'' +
                ", Q='" + Q + '\'' +
                ", HY='" + HY + '\'' +
                ", Y='" + Y + '\'' +
                ", TWY='" + TWY + '\'' +
                ", TRY='" + TRY + '\'' +
                ", FY='" + FY + '\'' +
                ", SY='" + SY + '\'' +
                ", SE='" + SE + '\'' +
                '}';
    }

}
