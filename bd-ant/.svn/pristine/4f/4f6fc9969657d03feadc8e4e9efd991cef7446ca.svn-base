package net.niuniubao.ant.formatter;

import net.niuniubao.ant.model.formatter.DateFormatter;
import org.testng.annotations.Test;

import java.util.Date;

/**
 * @author dev@niuniubao.net
 */
public class DateFormatterTest {

    @Test
    public void testDateFormatter() throws Exception {
        DateFormatter dateFormatter = new DateFormatter();
        dateFormatter.initParam(new String[]{"yyyy-MM-dd HH:mm"});
        Date format = dateFormatter.format("2013-09-10 22:11");
        System.out.println(format);
    }
}
