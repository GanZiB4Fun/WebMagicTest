package net.niuniubao.ant.simuquan.model;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class NewsList {

    //json数据
    private String id;
    private String title;
    private String description;
    private String source_from;
    private String pubtime;
    //自定义数据
    private int news_list_id;
    private String company_id;
    private String data_version; //dataVersion
    private Integer proc_status; //procStatus

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSource_from() {
        return source_from;
    }

    public void setSource_from(String source_from) {
        this.source_from = source_from;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }

    public int getNews_list_id() {
        return news_list_id;
    }

    public void setNews_list_id(int news_list_id) {
        this.news_list_id = news_list_id;
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
}
