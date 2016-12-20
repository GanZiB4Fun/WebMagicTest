package net.niuniubao.ant.amac.model;

import net.niuniubao.ant.HttpClientUtil;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by cuiyingjia on 16/4/16.
 */
public class ManagerFundTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(ManagerFundTest.class);

    @Test
    public void fund() {
        int page = 0;
        Object object = HttpClientUtil.httpPostJson("http://gs.amac.org.cn//amac-infodisc/api/pof/fund?rand=0.27688526129350066&page=" + page + "&size=20", "{}");
        JSONObject jsonObject = JSONObject.fromObject(object.toString());
    }

}
