package com.clouddata.practise;

import java.math.BigDecimal;

public class SharesInfo {

	@Override
	public String toString() {
		return "SharesInfo [shareValue=" + shareValue + ", shareName=" + shareName + "]";
	}

	private BigDecimal shareValue;
	private String shareName;
	
	public BigDecimal getShareValue() {
		return shareValue;
	}
	public void setShareValue(BigDecimal shareValue) {
		this.shareValue = shareValue;
	}
	public String getShareName() {
		return shareName;
	}
	public void setShareName(String shareName) {
		this.shareName = shareName;
	}
	
	public SharesInfo( String shareName,BigDecimal shareValue) {
		super();
		this.shareValue = shareValue;
		this.shareName = shareName;
	}
	
}
