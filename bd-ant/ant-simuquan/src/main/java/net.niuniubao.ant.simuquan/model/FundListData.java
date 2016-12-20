package net.niuniubao.ant.simuquan.model;


import java.io.Serializable;
import java.util.List;

/**
 * Created by cuiyingjia on 16/4/26.
 */
public class FundListData implements Serializable{

    private static final long serialVersionUID = 5454155825324635342L;

    private List<FundList> fund_list;

    private String sort_key;

    private String show_field;

    private String show_field_text;

    public List<FundList> getFund_list() {
        return fund_list;
    }

    public void setFund_list(List<FundList> fund_list) {
        this.fund_list = fund_list;
    }

    public String getSort_key() {
        return sort_key;
    }

    public void setSort_key(String sort_key) {
        this.sort_key = sort_key;
    }

    public String getShow_field() {
        return show_field;
    }

    public void setShow_field(String show_field) {
        this.show_field = show_field;
    }

    public String getShow_field_text() {
        return show_field_text;
    }

    public void setShow_field_text(String show_field_text) {
        this.show_field_text = show_field_text;
    }
}
