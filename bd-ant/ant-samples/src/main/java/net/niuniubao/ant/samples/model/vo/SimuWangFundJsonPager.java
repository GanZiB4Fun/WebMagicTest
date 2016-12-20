package net.niuniubao.ant.samples.model.vo;

import java.util.List;

/**
 * Created by Administrator on 2016/4/17.
 */
public class SimuWangFundJsonPager {

    private Integer rowcount;

    private Integer page;

    private Integer pagesize;

    private Integer pagecount;

    private List<SimuWangFundJsonPager> pager;

    public List<SimuWangFundJsonPager> getPager() {
        return pager;
    }

    public void setPager(List<SimuWangFundJsonPager> pager) {
        this.pager = pager;
    }

    public Integer getRowcount() {
        return rowcount;
    }

    public void setRowcount(Integer rowcount) {
        this.rowcount = rowcount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public Integer getPagecount() {
        return pagecount;
    }

    public void setPagecount(Integer pagecount) {
        this.pagecount = pagecount;
    }

    @Override
    public String toString() {
        return "SimuWangFundNavHisJsonPager{" +
                "rowcount=" + rowcount +
                ", page=" + page +
                ", pagesize=" + pagesize +
                ", pagecount=" + pagecount +
                '}';
    }
}
