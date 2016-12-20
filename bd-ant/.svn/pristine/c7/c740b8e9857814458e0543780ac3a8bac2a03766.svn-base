package net.niuniubao.ant.samples;

import net.niuniubao.ant.Page;
import net.niuniubao.ant.Site;
import net.niuniubao.ant.Spider;
import net.niuniubao.ant.processor.PageProcessor;
import net.niuniubao.ant.selector.Html;

import java.util.List;

/**
 * @author dev@niuniubao.net
 */
public class AmanzonPageProcessor implements PageProcessor{
    public void process(Page page) {

        Html html = page.getHtml();
        List<String> questionList =  html.xpath("//table[@class='tgCustomerCommunityCenterColumn']//div[@class='content']//table[@class='dataGrid']//tr").all();

        if(questionList != null && questionList.size() > 1)
        {
            //i=0是列名称，所以i从1开始
            for( int i = 1 ; i < questionList.size(); i++)
            {
                System.out.println(questionList.get(i));
                Html tempHtml =  Html.create("<table>"+questionList.get(i)+"</table>");
                String comment = tempHtml.xpath("//td[@class='title']//a/text()").toString();
                System.out.println(comment);
                String answerNum =  tempHtml.xpath("//td[@class='num']/text()").toString();
                System.out.println(answerNum);
                String createTime = tempHtml.xpath("//td[3]/text()").toString();
                System.out.println(createTime);

				/* Document doc = Jsoup.parse(questionList.get(i));
				 Html hmt  = Html.create(questionList.get(i)) ;
			     String str = hmt.links().toString();
				  String   content =   doc.getElementsByTag("a").text();
				  String ss = doc.text();*/

            }
        }

    }

    @Override
    public Site getSite() {
        return Site.me();
    }

    public static void main(String[] args) {
        Spider.create(new AmanzonPageProcessor()).test("http://www.amazon.de/forum/Fx27CUFD8S7LJ5D");
    }
}
