package net.niuniubao.ant.amac.model;

/**
 * Created by GanJianWei on 2016/5/12.
 */
public class AmacFundManager {

    private Integer amacFundManagerId; //amacFundManagerId
    private String RPI_ID;//rpiId
    private String RPI_NAME;//基金经理姓名
    private String SCO_NAME; //性别
    private String ECO_NAME; //学历
    private String AOI_NAME; //从业机构
    private String PTI_NAME; //从业岗位
    private String CTI_NAME; //CTI
    private String CER_NUM;//证书号
    private String PPP_GET_DATE; //证书获得时间
    private String PPP_END_DATE; //证书有效期至
    private String COUNTCER; //注册变更记录
    private String COUNTCX; //诚信记录
    private String dataVersion; //dataVersion
    private Integer procStatus; //procStatus
    private String htmlId;//htmlId

    public Integer getAmacFundManagerId() {
        return amacFundManagerId;
    }

    public void setAmacFundManagerId(Integer amacFundManagerId) {
        this.amacFundManagerId = amacFundManagerId;
    }

    public String getRPI_ID() {
        return RPI_ID;
    }

    public void setRPI_ID(String RPI_ID) {
        this.RPI_ID = RPI_ID;
    }

    public String getRPI_NAME() {
        return RPI_NAME;
    }

    public void setRPI_NAME(String RPI_NAME) {
        this.RPI_NAME = RPI_NAME;
    }

    public String getSCO_NAME() {
        return SCO_NAME;
    }

    public void setSCO_NAME(String SCO_NAME) {
        this.SCO_NAME = SCO_NAME;
    }

    public String getECO_NAME() {
        return ECO_NAME;
    }

    public void setECO_NAME(String ECO_NAME) {
        this.ECO_NAME = ECO_NAME;
    }

    public String getAOI_NAME() {
        return AOI_NAME;
    }

    public void setAOI_NAME(String AOI_NAME) {
        this.AOI_NAME = AOI_NAME;
    }

    public String getPTI_NAME() {
        return PTI_NAME;
    }

    public void setPTI_NAME(String PTI_NAME) {
        this.PTI_NAME = PTI_NAME;
    }

    public String getCTI_NAME() {
        return CTI_NAME;
    }

    public void setCTI_NAME(String CTI_NAME) {
        this.CTI_NAME = CTI_NAME;
    }

    public String getCER_NUM() {
        return CER_NUM;
    }

    public void setCER_NUM(String CER_NUM) {
        this.CER_NUM = CER_NUM;
    }

    public String getPPP_GET_DATE() {
        return PPP_GET_DATE;
    }

    public void setPPP_GET_DATE(String PPP_GET_DATE) {
        this.PPP_GET_DATE = PPP_GET_DATE;
    }

    public String getPPP_END_DATE() {
        return PPP_END_DATE;
    }

    public void setPPP_END_DATE(String PPP_END_DATE) {
        this.PPP_END_DATE = PPP_END_DATE;
    }

    public String getCOUNTCER() {
        return COUNTCER;
    }

    public void setCOUNTCER(String COUNTCER) {
        this.COUNTCER = COUNTCER;
    }

    public String getCOUNTCX() {
        return COUNTCX;
    }

    public void setCOUNTCX(String COUNTCX) {
        this.COUNTCX = COUNTCX;
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

    public String getHtmlId() {
        return htmlId;
    }

    public void setHtmlId(String htmlId) {
        this.htmlId = htmlId;
    }

    @Override
    public String toString() {
        return "AmacFundManager{" +
                "amac_fund_manager_id=" + amacFundManagerId +
                ", RPI_ID='" + RPI_ID + '\'' +
                ", RPI_NAME='" + RPI_NAME + '\'' +
                ", SCO_NAME='" + SCO_NAME + '\'' +
                ", ECO_NAME='" + ECO_NAME + '\'' +
                ", AOI_NAME='" + AOI_NAME + '\'' +
                ", PTI_NAME='" + PTI_NAME + '\'' +
                ", CTI_NAME='" + CTI_NAME + '\'' +
                ", CER_NUM='" + CER_NUM + '\'' +
                ", PPP_GET_DATE='" + PPP_GET_DATE + '\'' +
                ", PPP_END_DATE='" + PPP_END_DATE + '\'' +
                ", COUNTCER='" + COUNTCER + '\'' +
                ", COUNTCX='" + COUNTCX + '\'' +
                ", dataVersion='" + dataVersion + '\'' +
                ", procStatus=" + procStatus +
                ", htmlId='" + htmlId + '\'' +
                '}';
    }
}
