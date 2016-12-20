package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.Site;
import net.niuniubao.ant.model.OOSpider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by cuiyingjia on 16/4/16.
 */
public class CompanyTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyTest.class);


    @Test
    public void manager() {

        OOSpider ooSpider = OOSpider.create(Site.me().setSleepTime(0), Company.class);
        Company company = ooSpider.get("http://gs.amac.org.cn/amac-infodisc/res/pof/manager/166.html");
//        List<AmacManagerResume> resumes =XmlUtil.htmlParseToResume(amacManager.getRepresentativesHtml());
//        System.out.println(resumes);
//        List<AmacManagerInfo> managerInfo =XmlUtil.htmlParseToManagerInfo(amacManager.getExecutivesHtml());
//        System.out.println(managerInfo);
        ooSpider.close();

//        System.out.println(amacManager);



    }
}
