package net.niuniubao.ant.utils;

import org.testng.annotations.Test;

/**
 * @author dev@niuniubao.net
 */
public class IPUtilsTest {

    @Test
    public void testGetFirstNoLoopbackIPAddresses() throws Exception {
        System.out.println(IPUtils.getFirstNoLoopbackIPAddresses());
    }
}
