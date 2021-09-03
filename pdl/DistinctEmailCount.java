package com.pdl;

import java.util.Arrays;

public class DistinctEmailCount {

	public static void main(String[] args) {

		System.out.println("Input Emails ->:"+Arrays.toString(args));
		String[] inputEmails= args;
		long distinctCount=countDistinctEmails(inputEmails);
		System.out.println("Different addresses that actually receive mails => "+distinctCount);
		
	}
	
	/**
	 * @param inputEmails:String[]
	 * @return Number of distinct email's : long
	 * 
	 * 1. remove local name . occurrence 
	 * 2. Remove post string after + in local name. 
	 * 3. count distinct emails and return. 
	 * 
	 */
	private static long countDistinctEmails(String[] inputEmails) {
		return Arrays.stream(inputEmails).map(email -> {
			String localName=email.split("@")[0].replaceAll("\\.", "").split("\\+")[0];
			String domainName=email.split("@")[1];
			return localName+"@"+domainName;
		}).distinct().count();
	}
	
}
