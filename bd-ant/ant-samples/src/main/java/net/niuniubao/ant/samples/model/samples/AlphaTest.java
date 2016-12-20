package net.niuniubao.ant.samples.model.samples;

import net.niuniubao.ant.MultiPageModel;
import net.niuniubao.ant.model.annotation.ExtractBy;
import net.niuniubao.ant.model.annotation.ExtractByUrl;
import net.niuniubao.ant.model.annotation.TargetUrl;


/**
 * Created by cuiyingjia on 16/4/7.
 */
@TargetUrl("http://gs.amac.org.cn/amac-infodisc/res/pof/fund/\\d+.html")
public class AlphaTest {

    @ExtractBy("//div[@class=\"dataTables_wrapper\"]")
    private String content;


    public String getContent() {
        return content;
    }

    public String toString() {
        return "AlphaTestFFF{" +
                "content='" + content + '\'' +
                '}';
    }
}
