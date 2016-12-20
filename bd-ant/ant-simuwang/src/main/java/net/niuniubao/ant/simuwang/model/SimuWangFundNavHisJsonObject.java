package net.niuniubao.ant.simuwang.model;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SimuWangFundNavHisJsonObject {

    private Integer id;
    private Long price_date;
    private Double nav;
    private Double cumulative_nav_withdrawal;
    private Double cumulative_nav;
    private Double price_change;
    private Double init_unit_value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPrice_date() {
        return price_date;
    }

    public void setPrice_date(Long price_date) {
        this.price_date = price_date;
    }

    public Double getNav() {
        return nav;
    }

    public void setNav(Double nav) {
        this.nav = nav;
    }

    public Double getCumulative_nav_withdrawal() {
        return cumulative_nav_withdrawal;
    }

    public void setCumulative_nav_withdrawal(Double cumulative_nav_withdrawal) {
        this.cumulative_nav_withdrawal = cumulative_nav_withdrawal;
    }

    public Double getCumulative_nav() {
        return cumulative_nav;
    }

    public void setCumulative_nav(Double cumulative_nav) {
        this.cumulative_nav = cumulative_nav;
    }

    public Double getPrice_change() {
        return price_change;
    }

    public void setPrice_change(Double price_change) {
        this.price_change = price_change;
    }

    public Double getInit_unit_value() {
        return init_unit_value;
    }

    public void setInit_unit_value(Double init_unit_value) {
        this.init_unit_value = init_unit_value;
    }
}
