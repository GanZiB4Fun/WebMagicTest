package net.niuniubao.ant.eastmoney.model;


import java.io.Serializable;
import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class Json<T> implements Serializable {
    private static final long serialVersionUID = 7833407848693721608L;

    private List<T> datas;

    private Integer PageIndex;

    public Integer getPageIndex() {
        return PageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        PageIndex = pageIndex;
    }

    public List<T> getDatas() {
        return this.datas;
    }

    public void setDatas(List<T> Datas) {
        this.datas = Datas;
    }
}
