package net.niuniubao.ant.samples.model.vo;

import net.niuniubao.ant.model.annotation.ExtractBy;


/**
 * Created by cuiyingjia on 16/4/8.
 */
public class EastMoneyManagerObj {

//    @ExtractBy("//div[@class=\"content_out\"]")
//    private String content;
//    public String toString() {
//        return "{" +
//                "全部内容:" + content + "," +
//                "}";
//    }

    @ExtractBy("//h3[@id=name_1]/text()")
    private String name;//姓名

    @ExtractBy("//div[@class=right AND @class=jd]/text()")// FIXME: 16/4/13
    private String workDays;//从业时间

    @ExtractBy("//div[@class=right AND @class=jd]/text()")// FIXME: 16/4/13
    private String workBegin;//任职开始时间

    @ExtractBy("//div[@class=right AND @class=jd]/a/text()")
    private String company;//现任基金公司

    @ExtractBy("//div[@class=gmleft AND @class=gmlefts]/span[@class=numtext]/span[1]/text()")
    private String currentScale;//现任基金资产总规模(亿元)

    @ExtractBy("//div[@class=gmContainer]/div[2]//span[@class=redText]/text()")
    private String bestProfit;//从业期间最佳基金回报(%)

    @ExtractBy("//div[@class=right AND @class=ms]/p/text()")
    private String introduction;//简介

    @ExtractBy("//div[@class=content_out]/div[1]//tbody")// FIXME: 16/4/13 拆分成多条数据
    private String historyFundList;//管理过的基金一览

    @ExtractBy("//div[@class=content_out]/div[2]//tbody")
    //    @ExtractBy(value = ".content_out table.ftrs td", type = ExtractBy.Type.Css)
    private String currentFundList;//现任基金一览

    public String toString() {
        return "{" +
                "姓名:" + name + "," +
                "累计从业时间和任职开始日期:" + workDays + "," +
                "现任基金公司:" + company + "," +
                "现任基金资产总规模:" + currentScale + "亿元," +
                "从业期间最佳基金回报:" + bestProfit + "," +
                "基金经理简介:"+introduction + "," +
                "管理过的基金一览:"+historyFundList + "," +
                "现任基金一览:"+currentFundList + "" +
                "}";
    }




}

