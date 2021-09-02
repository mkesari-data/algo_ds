package com.clouddata.practise;
import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.LinkedList;
import java.util.Collections;

import java.util.Map.Entry;

class ShareValueComparator implements Comparator<BigDecimal>{
	
	public int compare(BigDecimal first,BigDecimal second) {
		return first.compareTo(second);
	}

}

public class ClientClass {

	public static void main(String[] args) {
		List<AcctInfo> acctHolders=getAcctsInfo();
		List<SharesInfo> sharesInfo=getSharesInfo();
		
		Map<String,BigDecimal> sharesMap=new HashMap<String,BigDecimal>();
		for(int i=0;i<sharesInfo.size();i++) {
				sharesMap.put(sharesInfo.get(i).getShareName(),sharesInfo.get(i).getShareValue());
		}
			
		
		HashMap<Integer,BigDecimal> acctHoldersShareValue=new HashMap<Integer,BigDecimal>();
		
		for (AcctInfo acctHolder : acctHolders) {
			int acctId=acctHolder.getAcctId();
			String shareName=acctHolder.getShareName();
			int numberOfShares = acctHolder.getNoOfShares();
			BigDecimal shareValue= sharesMap.get(shareName);
			
			
			BigDecimal acctHolderValue=BigDecimal.valueOf(0);
			if(acctHoldersShareValue.get(acctId)!=null) {
				acctHolderValue=acctHoldersShareValue.get(acctId);
			}
			
			acctHoldersShareValue.put(acctId,acctHolderValue.add(new BigDecimal(shareValue.doubleValue()*numberOfShares)) );
		
		}
		
		System.out.println("Account Holers share values"+acctHoldersShareValue);
		
		/**
		 * Sort by Value
		 */
		
		
		 List<Entry<Integer,BigDecimal>> al=sortyByShareWorth(acctHoldersShareValue);
		 System.out.println("Account Holers share values - After sort:"+al);
		
		
		System.out.println("HashMap"+sharesMap);
		
		for(int i=0;i<acctHolders.size();i++) {
			System.out.println("Acct Holder"+acctHolders.get(i));
		}
		
		for(int i=0;i<sharesInfo.size();i++) {
			System.out.println("Shares Holder"+sharesInfo.get(i));
		}
		
	}
	
	
	private static List<Entry<Integer,BigDecimal>> sortByShareValue(Map<Integer,BigDecimal> unsorted){
		List<Entry<Integer,BigDecimal>> sortedList=new LinkedList<Entry<Integer,BigDecimal>>(unsorted.entrySet());
		Collections.sort(sortedList,new Comparator<Entry<Integer,BigDecimal>>() {
			public int compare(Entry<Integer,BigDecimal> o1,Entry<Integer,BigDecimal> o2) {
				return o1.getValue().compareTo(o2.getValue());				
			}
		});
		return sortedList;
	}
	
	private static List<Entry<Integer,BigDecimal>> sortyByShareWorth(Map<Integer,BigDecimal> unsorted){
		
		List<Entry<Integer,BigDecimal>> al=new LinkedList<Entry<Integer,BigDecimal>>(unsorted.entrySet());
		
		Collections.sort(al,new Comparator<Entry<Integer,BigDecimal>>() {

			@Override
			public int compare(Entry<Integer, BigDecimal> o1, Entry<Integer, BigDecimal> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
			
		});
		
		return al;

			
	}
	
	 private static Map<String, Integer> sortByComparator(Map<String, Integer> unsortMap, final boolean order)
	  {

	        List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(unsortMap.entrySet());

	        // Sorting the list based on values
	        Collections.sort(list, new Comparator<Entry<String, Integer>>()
	        {
	            public int compare(Entry<String, Integer> o1,
	                    Entry<String, Integer> o2)
	            {
	                if (order)
	                {
	                    return o1.getValue().compareTo(o2.getValue());
	                }
	                else
	                {
	                    return o2.getValue().compareTo(o1.getValue());

	                }
	            }
	        });

	        // Maintaining insertion order with the help of LinkedList
	        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
	        for (Entry<String, Integer> entry : list)
	        {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        return sortedMap;
	    }
	
public static List<SharesInfo> getSharesInfo(){
		
		List<SharesInfo> al=new ArrayList<SharesInfo>();
		al.add(new SharesInfo("Stock1",new BigDecimal(5000)));
		al.add(new SharesInfo("Stock2",new BigDecimal(6000)));
		al.add(new SharesInfo("Stock3",new BigDecimal(4000)));
		
		return al;
	}

	public static List<AcctInfo> getAcctsInfo(){
		
		List<AcctInfo> al=new ArrayList<AcctInfo>();
		al.add(new AcctInfo(100,"Stock1",5));
		al.add(new AcctInfo(100,"Stock2",6));
		al.add(new AcctInfo(100,"Stock3",7));
		
		al.add(new AcctInfo(200,"Stock1",5));
		al.add(new AcctInfo(200,"Stock2",6));
		

		al.add(new AcctInfo(300,"Stock1",5));
		al.add(new AcctInfo(300,"Stock2",6));
		al.add(new AcctInfo(300,"Stock1",5));
		
		al.add(new AcctInfo(400,"Stock1",5));
		al.add(new AcctInfo(400,"Stock2",6));
		al.add(new AcctInfo(400,"Stock1",6));
		
		
		return al;
	}
}
