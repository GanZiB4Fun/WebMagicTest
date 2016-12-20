package net.niuniubao.ant.eastmoney.main;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.eastmoney.model.FundJzObj;
import net.niuniubao.ant.eastmoney.model.FundListJsonData;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by design on 2016/5/4.
 */
public class FundJzMain {
    public static void main(String[] args) {

        //数据库事务准备
        SqlSession session = MybatisSession.mybatisSession().openSession();
        Mapper mapper =session.getMapper(Mapper.class);

        //循环取出UrlId 获得相应的基金净值数据
        while (true) {
            List<FundListJsonData> fundListJsonDatas = mapper.selectFundIdNotProc(-1);
            if (fundListJsonDatas.size()==0||fundListJsonDatas==null) break;
            for (int k = 0; k < fundListJsonDatas.size(); k++) {
                mapper.updateFundListStatus(1,fundListJsonDatas.get(k).getFundListId());
                String queryUrl = "http://fund.eastmoney.com/f10/F10DataApi.aspx?type=lsjz&code="+fundListJsonDatas.get(k).getFundUrlId()+ "&page=1&per=10000000";
                String resp = HttpClientUtil.httpGetGBK(queryUrl).replaceAll("var apidata=", "") + "}";
                JSONObject jsonObject = JSONObject.fromObject(resp);
                String content = jsonObject.getString("content");

                //切割字符串
                String temp = content.replaceAll("<table class='w782 comm lsjz'>" +
                        "<thead><tr><th class='first'>净值日期</th><th>单位净值</th><th>累计净值" +
                        "</th><th>日增长率</th><th>申购状态</th><th>赎回状态</th>" +
                        "<th class='tor last'>分红送配</th></tr></thead>" +
                        "<tbody>", "").replaceAll("</tbody></table>", "").replaceAll(" class='tor bold bck'","").replaceAll(" class='tor bold'", "").replaceAll(" class='red unbold'", "").replaceAll("<tr><td>", "").replaceAll(" class='tor bold grn'", "").replaceAll(" class='tor bold red'", "").replaceAll("<td>", "").replaceAll("</tr>", "|").replaceAll("</td>", ",");
                String jzData[] = temp.split("\\|");

                //赋值
                for (int i = 0; i < jzData.length; i++) {
                    String[] jzInfo = jzData[i].toString().split("\\,");
                        FundJzObj fundJzObj = new FundJzObj();
                        if(jzInfo.length<6) continue;
                        fundJzObj.setFund_url_id(fundListJsonDatas.get(k).getFundUrlId());
                        fundJzObj.setDate(jzInfo[0]);
                        fundJzObj.setUnit_net(Double.valueOf(jzInfo[1]));
                        fundJzObj.setAccumulated_net(Double.valueOf(jzInfo[2]));
                        fundJzObj.setDaily_growth_rate(jzInfo[3]);
                        fundJzObj.setPurchase_status(jzInfo[4]);
                        fundJzObj.setRedemption_status(jzInfo[5]);
                        if (jzInfo.length == 7) {
                            fundJzObj.setFeng_hong_song_pei(jzInfo[6]);
                        } else {
                            fundJzObj.setFeng_hong_song_pei("");
                        }
                        mapper.insertFundJz(fundJzObj);
                        session.commit();
                        System.out.println(fundJzObj);
                }
            }
        }
        session.close();
    }
}
