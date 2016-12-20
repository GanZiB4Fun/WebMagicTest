package net.niuniubao.ant.selector;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

/**
 * @author dev@niuniubao.net <br>
 */
public class RegexSelectorTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testRegexWithSingleLeftBracket() {
        String regex = "\\d+(";
        new RegexSelector(regex);
    }

    @Test
    public void testRegexWithLeftBracketQuoted() {
        String regex = "\\(.+";
        String source = "(hello world";
        RegexSelector regexSelector = new RegexSelector(regex);
        String select = regexSelector.select(source);
        Assertions.assertThat(select).isEqualTo(source);
    }
}
