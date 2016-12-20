package net.niuniubao.ant.samples.model.vo;


import net.niuniubao.ant.model.annotation.ExtractBy;

/**
 * Created by Administrator on 2016/4/13.
 */
public class SimuWangFundObj {

    private int simuWangFundId;

    private String htmlId;

    @ExtractBy("//h1[@class=fl AND @class=f16 AND @class=f024590]/text()")
    private String fundName;//基金产品名称

    @ExtractBy("//div[@class=tabli AND @class=f14 AND @class=fr]/span[1]/text()")
    private String recordCode;//备案编码

    @ExtractBy("//div[@class=tabli AND @class=f14 AND @class=fr]/span[2]/text()")
    private String stutas;//运行状态

    @ExtractBy("//div[@class=tabli AND @class=f14 AND @class=fr]/span[3]/text()")
    private String showLogo;//披露标识

    @ExtractBy("//ul[@class=box8]/li[1]/p/span/text()")
    private String currentProfit;//今年收益

    @ExtractBy("//ul[@class=box8]//li[2]/p/span/text()")
    private String totalProfit;//累计收益

    @ExtractBy("//ul[@class=box8]//li[3]/p/text()")
    private String lastestPerValue;//最新净值

    @ExtractBy("//ul[@class=box8]//li[4]/p/text()")
    private String totalPerValue;//累计净值

    @ExtractBy("//ul[@class=tabli5]")// FIXME: 16/4/15 基金经理是列表,单个基金经理和多个基金经理样式不同
    private String fundManager;//基金经理

    @ExtractBy("//div[@id=mtarget3]//div[@class=fr]//p[2]/text()")
    private String company;//私募公司

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[1]/td[2]/text()")
    private String lockUpPeriod;//封闭期

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[2]/td[2]/a/text() | //div[@class=w340 and @class=fl]//div[5]//div[2]//tr[2]/td[2]/text()")
    private String openDay;//开放日

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[3]/td[2]/text()")
    private String subscriptionStartPoint;//认购起点

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[4]/td[2]/text()")
    private String plusStartPoint;//追加起点

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[5]/td[2]/span/text() | //div[@class=w340 and @class=fl]//div[5]//div[2]//tr[5]/td[2]/text()")
    private String subscriptionRate;//认购费率

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[6]/td[2]/span/text() | //div[@class=w340 and @class=fl]//div[5]//div[2]//tr[6]/td[2]/text()")
    private String redemptionRate;//赎回费率

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[7]/td[2]/text()")
    private String precautiousLine;//预警线

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//div[2]//tr[8]/td[2]/text()")
    private String stopLine;//止损线

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[1]/td[2]/a/text()")
    private String investmentAdviser;//投资顾问

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[2]/td[2]/span/text()")
    private String performanceFee;//业绩报酬

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[3]/td[2]/text()")
    private String fundManagement;//基金管理人

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[4]/td[2]/span/text()")
    private String managementFeeRate;//管理费率

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[5]/td[2]/text()")
    private String custodian;//基金托管人

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[6]/td[2]/text()")
    private String brokerageHouse;//证券经纪商

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[7]/td[2]/text()")
    private String futuresBroker;//期货经纪商

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[1]/td[2]/text()")
    private String createDate;//成立日期

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[3]/td[2]/text()")
    private String initialSize;//初始规模

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[4]/td[2]/text()")
    private String durationOfInverse;//续存期限

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[5]/td[2]/text()")
    private String isgraded;//是否分级

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[6]/td[2]/text()")
    private String ifUmbellateFund;//是否伞型

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[7]/td[2]/text()")
    private String productType;//产品类型

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[8]/td[2]/text()")
    private String investmentStrategy;//投资策略

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[3]//tr[9]/td[2]/text()")
    private String subInvestment;//子投资

    @ExtractBy("//div[@class=w340 and @class=fl]//div[5]//table[2]//tr[1]/td[2]/a/@href")
    private String comPanyUrl;//基金公司页面



//    //TODO 动态列表的字段: 区间收益 年度回报 月度回报 回撤分析、风险分析、投资风格。


    @Override
    public String toString() {
        return "{" +
                "基金产品名称:" + fundName + "," +
                "备案编码:"+recordCode+","+
                "运行状态:"+stutas+","+
                "披露标识:"+showLogo+","+
                "今年收益:"+currentProfit+","+
                "累计收益:"+totalProfit+","+
                "最新净值:"+lastestPerValue+","+
                "累计净值:"+totalPerValue+ ","+
                "私募公司:"+company+ ",\n"+
                "封闭期:"+lockUpPeriod+ ",\n"+
                "开放日:"+ openDay + ",\n"+
                "认购起点:"+subscriptionStartPoint+ ",\n"+
                "追加起点:"+plusStartPoint+ ",\n"+
                "认购费率:"+subscriptionRate+ ",\n"+
                "赎回费率:"+redemptionRate+ ",\n"+
                "预警线:"+precautiousLine+ ",\n"+
                "止损线:"+stopLine+ ",\n"+
                "投资顾问:"+investmentAdviser+ ",\n"+
                "基金管理人:"+fundManagement+ ",\n"+
                "管理费率:"+managementFeeRate+ ",\n"+
                "基金托管人:"+custodian+ ",\n"+
                "证券经纪商:"+brokerageHouse+ ",\n"+
                "期货经纪商:"+futuresBroker+ ",\n"+
                "成立日期:"+createDate+ ",\n"+
                "初始规模:"+initialSize+ ",\n"+
                "续存期限:"+durationOfInverse+ ",\n"+
                "是否分级:"+isgraded+ ",\n"+
                "是否伞形:"+ifUmbellateFund+ ",\n"+
                "产品类型:"+productType+ ",\n"+
                "投资策略:"+investmentStrategy+ ",\n"+
                "子投资:"+subInvestment+ "\n"+

                "}";
    }
}
