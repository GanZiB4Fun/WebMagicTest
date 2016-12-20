package net.niuniubao.ant.amac.util;

import net.niuniubao.ant.amac.model.FundList;
import net.niuniubao.ant.amac.model.Executive;
import net.niuniubao.ant.amac.model.OwnerResume;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuiyingjia on 16/4/15.
 */
public class XmlUtil {

    /**
     * 基金业协会私募基金管理人公示
     * 法人工作履历
     * @param html
     * @return
     */
    public static List<OwnerResume> htmlParseToResume(String html) {

        html = html.replaceAll("\n","").replaceAll(" ","")
                .replaceAll("<tbody>","").replaceAll("</tbody>","")
                .replaceAll("</tr><tr>","\\|").replaceAll("</tr>","").replaceAll("<tr>","")
                .replaceAll("</td><td>",",").replaceAll("<td>","").replaceAll("</td>","");
        String[] strings = html.split("\\|");
        List<OwnerResume> ownerResumes = new ArrayList<OwnerResume>();

        if (strings!=null&&strings.length>0){
            for (String string: strings) {
                String[] strs = string.split(",");
                if (strs!=null&&strs.length==3) {
                    OwnerResume ownerResume = new OwnerResume();
                    ownerResume.setPeriod(strs[0]);
                    ownerResume.setWorkAddr(strs[1]);
                    ownerResume.setDuty(strs[2]);
                    ownerResumes.add(ownerResume);
                }
            }
        }

        return ownerResumes;
    }

    /**
     * 高管情况
     * @param html
     * @return
     */
    public static List<Executive> htmlParseToManagerInfo(String html){
        html = html.replaceAll("\n","").replaceAll("\r","").replaceAll(" ","")
                .replaceAll("</td><td>",",").replaceAll("<td>","").replaceAll("</td>","")
                .replaceAll("</tr><tr>","\\|").replaceAll("<tbody>","").replaceAll("</tbody>","")
                .replaceAll("<!--是-->","").replaceAll("<!--否-->","")
                .replaceAll("<tr>","").replaceAll("</tr>","");

        String[] strings = html.split("\\|");
        List<Executive> executives = new ArrayList<Executive>();
        if (strings!=null&&strings.length>0) {
            for (String string : strings) {
                String[] strs = string.split(",");
                if (strs!=null&&strs.length==3) {
                    Executive executive = new Executive();
                    executive.setManagerName(strs[0]);
                    executive.setDuty(strs[1]);
                    executive.setQualified(strs[2]);
                    executives.add(executive);
                }
            }
        }
        return executives;
    }

    /**
     * 基金列表
     * @param html
     */
    public static List<FundList> htmlParseToFundInfo(String html, Enum fundType){

        html = html.replaceAll("\n","").replaceAll(" ","").replaceAll("<tdclass=\"td-content\"colspan=\"3\">","")
        .replaceAll("</td>","").replaceAll("<p>","").replaceAll("</p>","")
        .replaceAll("<ahref=\"","").replaceAll("\">",",");
        String[] strings = html.split("</a>");
        List<FundList> fundLists = new ArrayList<FundList>();
        if (strings!=null&&strings.length>0) {
            for (String string : strings) {
                String[] strs = string.split(",");
                if (strs!=null&&strs.length==2) {
                    FundList fundList = new FundList();
                    fundList.setFundUrl(strs[0]);
                    fundList.setFundName(strs[1]);
                    fundList.setFundType(fundType);
                    fundLists.add(fundList);
                }
            }
        }
        return fundLists;
    }

}
