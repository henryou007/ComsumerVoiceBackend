package edu.upenn.cis350.util;

import java.sql.ResultSet;

public class ProviderHelper {
	private DBHelper db;

	private static ProviderHelper providerhelper = null;

	private ProviderHelper()
	{
		try {
			db = new DBHelper();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static synchronized ProviderHelper getProviderHelper()
	{
		if(providerhelper == null)
		{
			providerhelper = new ProviderHelper();
		}
		return providerhelper;
	}
	
	public String getProviderAddress(String providerid){
		String sql="select * from provider where providerid='"+providerid+"'";
		try {
			ResultSet rs=db.executeQuery(sql);
			if(rs.next()){
				String id = rs.getString("providerid");
				String address=rs.getString("address");
				String name=rs.getString("name");
				String phone=rs.getString("phone");

				
				//System.out.println("Provider ID:"+ id +"; Name:"+name+"; Address: "+address+"; Phone: "+phone);
				
				
				return address;
			}
			else return null;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
	
	
}
