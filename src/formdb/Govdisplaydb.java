/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

import static formdb.Constants.*;
import java.io.IOException;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

/**
 *
 * @author rushabh
 */
public class Govdisplaydb {
      public static String[] displayPosts() throws IOException {
		// TODO Auto-generatstringed method stub
                String[] parray=new String[4];
                int k=0;
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		
		Get get = new Get(Bytes.toBytes(Keyemail.getEmail()));
		get.addFamily(TABLE_CF_GOVT);
		
		Result result = table.get(get);
               
                
		if(result!=null){
			NavigableMap<byte[], byte[]> map = result.getFamilyMap(TABLE_CF_GOVT);
			Set<Map.Entry<byte[],byte[]>> set = map.entrySet();
			for(Map.Entry<byte[],byte[]> entry :set){
			
				parray[k++]=Bytes.toString(entry.getValue());
                                
			}
			
			
		
	}
                table.close();
		con.close();
                return parray;

 }    
    
}
