package net.niuniubao.ant.samples.util;

import net.niuniubao.ant.HttpClientUtil;

/**
 * Created by cuiyingjia on 16/4/8.
 */
public class HttpUtil {

    public static void main(String[] args) {
        Object object = HttpClientUtil.httpPostJson("http://gs.amac.org.cn/amac-infodisc/api/pof/manager?rand=0.6105541929136962&page=0&size=20","{}");
        System.out.println(object);
    }
}
