package net.niuniubao.ant.model;

import net.niuniubao.ant.model.annotation.HelpUrl;
import net.niuniubao.ant.model.annotation.TargetUrl;

/**
 * @author dev@niuniubao.net
 */
@TargetUrl(value = "http://webmagic.io/post/\\d+",sourceRegion = "//li[@class='post']")
@HelpUrl(value = "http://webmagic.io/list/\\d+",sourceRegion = "//li[@class='list']")
public class MockModel {

}
