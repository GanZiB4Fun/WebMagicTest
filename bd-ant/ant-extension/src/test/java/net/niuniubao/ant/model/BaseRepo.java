package net.niuniubao.ant.model;

import net.niuniubao.ant.model.annotation.ExtractBy;

/**
 * @author dev@niuniubao.net
 */
public class BaseRepo {

    @ExtractBy("//ul[@class='pagehead-actions']/li[1]//a[@class='social-count js-social-count']/text()")
    protected int star;
}
