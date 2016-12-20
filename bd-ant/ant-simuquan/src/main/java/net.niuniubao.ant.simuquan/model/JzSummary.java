package net.niuniubao.ant.simuquan.model;


/**
 *
 *
 * http://api.quchaogu.com/fund/info/detail?apiversion=1.1&app_version=2.2.0.7&fund_id=142234&show_jz_summary=1
 *
 *
 */
public class JzSummary  implements java.io.Serializable{
	private static final long serialVersionUID = 5454155825314635342L;

	private Integer simuquan_jz_summary_id; //sumuquanJzSummaryId
	private Integer fund_id; //基金ID
	private String text; //类型(近一周,近一月,近三月,近半年,今年以来,近一年,近两年,近三年,近五年,成立以来)
	private String fund; //收益
	private String hs300; //沪深300
	private String similar; //同类均值
	private String data_version; //dataVersion
	private Integer proc_status; //procStatus

	public Integer getSimuquan_jz_summary_id() {
		return simuquan_jz_summary_id;
	}

	public void setSimuquan_jz_summary_id(Integer simuquan_jz_summary_id) {
		this.simuquan_jz_summary_id = simuquan_jz_summary_id;
	}

	public Integer getFund_id() {
		return fund_id;
	}

	public void setFund_id(Integer fund_id) {
		this.fund_id = fund_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFund() {
		return fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	public String getHs300() {
		return hs300;
	}

	public void setHs300(String hs300) {
		this.hs300 = hs300;
	}

	public String getSimilar() {
		return similar;
	}

	public void setSimilar(String similar) {
		this.similar = similar;
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

