package net.niuniubao.ant.amac.main;

import net.niuniubao.ant.amac.crawl.PageCrawl;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.amac.model.*;
import net.niuniubao.ant.amac.util.XmlUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/24.
 */
public class CompanyCrawl extends PageCrawl<Company,JsonCompanyData> {

    private static long counter = 0;

    public CompanyCrawl() {
        super(Company.class);
    }

    @Override
    protected List<JsonCompanyData> list(AmacMapper mapper) {
        return mapper.selectCompanyNotProc(0);
    }

    @Override
    protected int listen() {
        return JsonManagerCrawl.getTaskCount();
    }

    @Override
    protected List<String> getUrls(List<JsonCompanyData> list) {
        List<String> urls = new ArrayList<String>();
        for (JsonCompanyData jsonCompanyData: list){
             urls.add("http://gs.amac.org.cn/amac-infodisc/res/pof/manager/" + jsonCompanyData.getId() + ".html");
        }
        return urls;
    }

    @Override
    protected void insert(Company entity, AmacMapper mapper) {
        if (entity != null) {

            List<Executive> managerInfoList = XmlUtil.htmlParseToManagerInfo(entity.getExecutivesHtml());

            entity.setDataVersion(AmacCrawlMain.version);
            entity.setProcStatus(0);

            mapper.insertCompany(entity);

            //基金公司高管资料
            for (Executive executive : managerInfoList) {
                executive.setCompanyId(entity.getCompanyId());
                executive.setDataVersion(AmacCrawlMain.version);
                executive.setProcStatus(0);
                mapper.insertExecutives(executive);
            }

            //基金公司法人履历
            List<OwnerResume> ownerResumes = XmlUtil.htmlParseToResume(entity.getRepresentativesHtml());
            for (OwnerResume ownerResume : ownerResumes) {
                ownerResume.setCompanyId(entity.getCompanyId());
                ownerResume.setDataVersion(AmacCrawlMain.version);
                ownerResume.setProcStatus(0);
                mapper.insertOwnerResume(ownerResume);
            }
            //基金公司 暂行办法实施前成立的基金
            List<FundList> fundInfosBefore = XmlUtil.htmlParseToFundInfo(entity.getProductsBeforeMeasuresHtml(), FundList.FundType.BEFORE_MEASURES);
            for (FundList fundInfo : fundInfosBefore) {
                fundInfo.setCompanyId(entity.getCompanyId());
                fundInfo.setFundId(getFundIdFromUrl(fundInfo.getFundUrl()));
                fundInfo.setDataVersion(AmacCrawlMain.version);
                fundInfo.setProcStatus(0);
                mapper.insertFundList(fundInfo);
            }

            //基金公司 暂行办法实施后成立的基金
            List<FundList> fundInfosAfter = XmlUtil.htmlParseToFundInfo(entity.getProductsAfterMeasuresHtml(), FundList.FundType.AFTER_MEASURES);

            for (FundList fundInfo : fundInfosAfter) {
                fundInfo.setCompanyId(entity.getCompanyId());
                fundInfo.setFundId(getFundIdFromUrl(fundInfo.getFundUrl()));
                fundInfo.setDataVersion(AmacCrawlMain.version);
                fundInfo.setProcStatus(0);
                mapper.insertFundList(fundInfo);
            }

            //基金公司 非正常清盘基金
            List<FundList> fundInfosImproper = XmlUtil.htmlParseToFundInfo(entity.getImproperLiquidationsHtml(), FundList.FundType.IMPROPER_LIQUIDATION);

            for (FundList fundInfo : fundInfosImproper) {
                fundInfo.setCompanyId(entity.getCompanyId());
                fundInfo.setFundId(getFundIdFromUrl(fundInfo.getFundUrl()));
                fundInfo.setDataVersion(AmacCrawlMain.version);
                fundInfo.setProcStatus(0);
                mapper.insertFundList(fundInfo);
            }

            mapper.updateCompanyList(entity.getCompanyId());
        }
    }

    @Override
    protected synchronized void addCounter() {
         counter++;
    }

    public static long getCounter(){
        return counter;
    }

    private static Long getFundIdFromUrl(String url){
        String temp = url.substring(url.lastIndexOf("/")+1,url.length()-5);

        return Long.parseLong(temp);
    }
}
