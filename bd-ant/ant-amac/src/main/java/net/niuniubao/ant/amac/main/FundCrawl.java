package net.niuniubao.ant.amac.main;

import net.niuniubao.ant.amac.crawl.PageCrawl;
import net.niuniubao.ant.amac.mapper.AmacMapper;
import net.niuniubao.ant.amac.model.Fund;
import net.niuniubao.ant.amac.model.FundList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoming(a)wallaw.cn on 16/4/25.
 */
public class FundCrawl extends PageCrawl<Fund, FundList> {

    private static long counter = 0;
    private CompanyCrawl companyCrawl;

    public FundCrawl(CompanyCrawl companyCrawl) {
        super(Fund.class);
        this.companyCrawl = companyCrawl;
    }

    @Override
    protected List<FundList> list(AmacMapper mapper) {
        return mapper.selectFundNotProcess(0);
    }

    @Override
    protected int listen() {
        if (companyCrawl.getState() == Thread.State.TERMINATED)
            return 0;
        else
            return 1;
    }

    @Override
    protected List<String> getUrls(List<FundList> list) {
        List<String> urls = new ArrayList<String>();
        for (FundList fundList : list) {
            urls.add(fundList.getFundUrl());
        }
        return urls;
    }

    @Override
    protected void insert(Fund entity, AmacMapper mapper) {
        if (entity != null) {
            entity.setDataVersion(AmacCrawlMain.version);
            entity.setProcStatus(0);
            mapper.insertAmacFund(entity);

            mapper.updateFundList(entity.getFundId());
        }
    }

    @Override
    protected synchronized void addCounter() {
        counter++;
    }

    public static long getCounter() {
        return counter;
    }
}
