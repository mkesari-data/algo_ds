package com.clouddata.practise;

public class AcctInfo {

	private int AcctId;
	
	private int noOfShares;
	private String shareName;
	
	@Override
	public String toString() {
		return "AcctInfo [AcctId=" + AcctId + ", noOfShares=" + noOfShares + ", shareName=" + shareName + "]";
	}
	
	public AcctInfo(int acctId, String shareName,int noOfShares) {
		super();
		AcctId = acctId;
		this.noOfShares = noOfShares;
		this.shareName = shareName;
	}
	
	public int getAcctId() {
		return AcctId;
	}
	public void setAcctId(int acctId) {
		AcctId = acctId;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	
	
}
