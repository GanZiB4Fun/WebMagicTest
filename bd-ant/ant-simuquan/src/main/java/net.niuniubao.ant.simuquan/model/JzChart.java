package net.niuniubao.ant.simuquan.model;


/**
 *
 *
 * http://api.quchaogu.com/fund/info/detail?apiversion=1.1&app_version=2.2.0.7&fund_id=142234&show_jz_chart=1
 *
 */
public class JzChart  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;




	private Integer simuquan_jz_chart_id; //simuquanJzChartId
	private Integer fund_id; //fundId
	private Integer date; //日期
	private Integer fund_percent; //本基金
	private Integer hs300_percent; //沪深300
	private Integer similar_percent; //同类均值
	private String data_version; //dataVersion
	private Integer proc_status; //procStatus

	public Integer getSimuquan_jz_chart_id() {
		return simuquan_jz_chart_id;
	}

	public void setSimuquan_jz_chart_id(Integer simuquan_jz_chart_id) {
		this.simuquan_jz_chart_id = simuquan_jz_chart_id;
	}

	public Integer getFund_id() {
		return fund_id;
	}

	public void setFund_id(Integer fund_id) {
		this.fund_id = fund_id;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getFund_percent() {
		return fund_percent;
	}

	public void setFund_percent(Integer fund_percent) {
		this.fund_percent = fund_percent;
	}

	public Integer getHs300_percent() {
		return hs300_percent;
	}

	public void setHs300_percent(Integer hs300_percent) {
		this.hs300_percent = hs300_percent;
	}

	public Integer getSimilar_percent() {
		return similar_percent;
	}

	public void setSimilar_percent(Integer similar_percent) {
		this.similar_percent = similar_percent;
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

