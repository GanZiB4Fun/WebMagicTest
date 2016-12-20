package net.niuniubao.ant.samples.model.vo;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SimuWangFundJsonObject {
    private Integer id;
    private String fund_id;
    private String fund_short_name;
    private String advisor_id;
    private String company_name;
    private String inception_date;
    private Integer manager_id;
    private String manager_name;
    private Double nav;
    private String price_date;
    private Double ret_ytd;
    private Double ret_incep;
    private Double ret_incep_a;
    private Double initial_unit_value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAdvisor_id() {
        return advisor_id;
    }

    public void setAdvisor_id(String advisor_id) {
        this.advisor_id = advisor_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getInception_date() {
        return inception_date;
    }

    public void setInception_date(String inception_date) {
        this.inception_date = inception_date;
    }

    public Integer getManager_id() {
        return manager_id;
    }

    public void setManager_id(Integer manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public Double getNav() {
        return nav;
    }

    public void setNav(Double nav) {
        this.nav = nav;
    }

    public String getPrice_date() {
        return price_date;
    }

    public void setPrice_date(String price_date) {
        this.price_date = price_date;
    }

    public Double getRet_ytd() {
        return ret_ytd;
    }

    public void setRet_ytd(Double ret_ytd) {
        this.ret_ytd = ret_ytd;
    }

    public Double getRet_incep() {
        return ret_incep;
    }

    public void setRet_incep(Double ret_incep) {
        this.ret_incep = ret_incep;
    }

    public Double getRet_incep_a() {
        return ret_incep_a;
    }

    public void setRet_incep_a(Double ret_incep_a) {
        this.ret_incep_a = ret_incep_a;
    }

    public Double getInitial_unit_value() {
        return initial_unit_value;
    }

    public void setInitial_unit_value(Double initial_unit_value) {
        this.initial_unit_value = initial_unit_value;
    }

    @Override
    public String toString() {
        return "SimuWangFundJsonObject{" +
                "id=" + id +
                ", fund_id='" + fund_id + '\'' +
                ", fund_short_name='" + fund_short_name + '\'' +
                ", advisor_id='" + advisor_id + '\'' +
                ", company_name='" + company_name + '\'' +
                ", inception_date='" + inception_date + '\'' +
                ", manager_id=" + manager_id +
                ", manager_name='" + manager_name + '\'' +
                ", nav=" + nav +
                ", price_date='" + price_date + '\'' +
                ", ret_ytd=" + ret_ytd +
                ", ret_incep=" + ret_incep +
                ", ret_incep_a=" + ret_incep_a +
                ", initial_unit_value=" + initial_unit_value +
                '}';
    }
}
