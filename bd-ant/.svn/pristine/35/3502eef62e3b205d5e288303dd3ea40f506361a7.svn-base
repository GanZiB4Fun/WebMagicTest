package net.niuniubao.ant.eastmoney.model;

import net.niuniubao.ant.HttpClientUtil;
import net.niuniubao.ant.eastmoney.mapper.Mapper;
import net.niuniubao.ant.mybatis.MybatisSession;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static org.testng.Assert.*;

public class FundJzObjTest {
    public static void main(String[] args) {

                String queryUrl = "http://fund.eastmoney.com/f10/F10DataApi.aspx?type=lsjz&code=000634&page=1&per=10000000";
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
                         for (int i = 0; i < jzData.length; i++) {
                    String[] jzInfo = jzData[i].toString().split("\\,");
                        FundJzObj fundJzObj = new FundJzObj();
                             if(jzInfo.length<6) continue;
                        fundJzObj.setFund_url_id("000634");
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

                        System.out.println(fundJzObj);
                }
            }
}