package net.niuniubao.ant.simuquan.model;

/**
 *
 * http://api.quchaogu.com/fund/info/list?apiversion=1.1&app_version=2.2.0.7&page=1&pagecount=20
 *
 *
 * */

public class FundList  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;


	private Integer simuquan_fund_list_id; //simuquanFundList
	private Integer fund_id; //fundId
	private String alias; //别名
	private String company_id;//所属公司Id
	private Integer strategy; //类型(1股票型 4宏观型 0其它 3期货型 5套利型)
	private Integer status; //状态
	private String next_open_date; //下一个开放日
	private Integer jz_price; //净值(后四位小数)
	private Integer jz_date; //净值日期
	private String company_name; //公司名称
	private String manager_name; //基金经理名字
	private Integer percent; //今年收益(后两位小数)
	private String strategy_text; //类型文字描述
	private String percent_text; //今年收益文字描述
	private String tag_text; //标签
	private String data_version; //dataVersion
	private Integer proc_status; //procStatus


	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public Integer getSimuquan_fund_list_id() {
		return simuquan_fund_list_id;
	}

	public void setSimuquan_fund_list_id(Integer simuquan_fund_list_id) {
		this.simuquan_fund_list_id = simuquan_fund_list_id;
	}

	public Integer getFund_id() {
		return fund_id;
	}

	public void setFund_id(Integer fund_id) {
		this.fund_id = fund_id;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getStrategy() {
		return strategy;
	}

	public void setStrategy(Integer strategy) {
		this.strategy = strategy;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getNext_open_date() {
		return next_open_date;
	}

	public void setNext_open_date(String next_open_date) {
		this.next_open_date = next_open_date;
	}

	public Integer getJz_price() {
		return jz_price;
	}

	public void setJz_price(Integer jz_price) {
		this.jz_price = jz_price;
	}

	public Integer getJz_date() {
		return jz_date;
	}

	public void setJz_date(Integer jz_date) {
		this.jz_date = jz_date;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public Integer getPercent() {
		return percent;
	}

	public void setPercent(Integer percent) {
		this.percent = percent;
	}

	public String getStrategy_text() {
		return strategy_text;
	}

	public void setStrategy_text(String strategy_text) {
		this.strategy_text = strategy_text;
	}

	public String getPercent_text() {
		return percent_text;
	}

	public void setPercent_text(String percent_text) {
		this.percent_text = percent_text;
	}

	public String getTag_text() {
		return tag_text;
	}

	public void setTag_text(String tag_text) {
		this.tag_text = tag_text;
	}

	public String getData_version() {
		return data_version;
	}

	public void setData_version(String data_version) {
		this.data_version = data_version;
	}

	public Integer getProc_status() {
		return proc_status;
	}

	public void setProc_status(Integer proc_status) {
		this.proc_status = proc_status;
	}
}

