package com.ssm.model;

public class TFy {

	private String Bh;

	private String Mc;
	
	private String pBh;
	
	private String Fjm;
	
	private String Szsf;

	public TFy(String bh, String mc, String pBh, String fjm, String szsf) {
		super();
		Bh = bh;
		Mc = mc;
		this.pBh = pBh;
		Fjm = fjm;
		Szsf = szsf;
	}

	public TFy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBh() {
		return Bh;
	}

	public void setBh(String bh) {
		Bh = bh;
	}

	public String getMc() {
		return Mc;
	}

	public void setMc(String mc) {
		Mc = mc;
	}

	public String getpBh() {
		return pBh;
	}

	public void setpBh(String pBh) {
		this.pBh = pBh;
	}

	public String getFjm() {
		return Fjm;
	}

	public void setFjm(String fjm) {
		Fjm = fjm;
	}

	public String getSzsf() {
		return Szsf;
	}

	public void setSzsf(String szsf) {
		Szsf = szsf;
	}

	@Override
	public String toString() {
		return "TFy [Bh=" + Bh + ", Mc=" + Mc + ", pBh=" + pBh + ", Fjm=" + Fjm + ", Szsf=" + Szsf + "]";
	}
	
	
}
