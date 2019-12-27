package formdb;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.lang.String;
import java.util.Set;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;

import  static formdb.Constants.*;

public class Userlogindb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your beverage rating : ");
		String beveragerating=sc.nextLine();
		System.out.println("Enter your food rating : ");
		String foodrating=sc.nextLine();
		System.out.println("Enter your comfort rating : ");
		String comfortrating=sc.nextLine();
		System.out.println("Enter your overall rating : ");
		String overallrating=sc.nextLine();
		long rowkey=0;
		try {
			rowkey=insertRating(name,beveragerating,foodrating,comfortrating,overallrating);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Your unique id is : "+rowkey);*/
	}

	public static boolean checkValidity(String email,String password) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
                
                
                Get get = new Get(Bytes.toBytes(email));
		get.addFamily(TABLE_CF_REGISTER);
                Result result = table.get(get);
                String temppassword=null;
                if(result!=null){
			NavigableMap<byte[], byte[]> map = result.getFamilyMap(TABLE_CF_REGISTER);
			Set<Entry<byte[],byte[]>> set = map.entrySet();
                        int c=0;
			for(Entry<byte[],byte[]> entry :set){
				if(c==0)
                                {
                                    c++;
                                    continue;
                                }
                                temppassword=Bytes.toString(entry.getValue());
                        }
                      
                }
                if(password.equals(temppassword))
                {
                    table.close();
                    con.close();
                    return true;
                }   
		table.close();
		con.close();
		return false;
		
        }


}
