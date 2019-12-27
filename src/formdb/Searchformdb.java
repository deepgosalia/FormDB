

package formdb;

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

import static formdb.Constants.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushabh
 */
public class Searchformdb {
    public static String displayForms(String companyname) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_THIRDPARTY)));
		
		Get get = new Get(Bytes.toBytes(companyname));
		get.addFamily(TABLE_CF_FORM);
		
		Result result = table.get(get);
                String temp="";
		if(result!=null){
			NavigableMap<byte[], byte[]> map = result.getFamilyMap(TABLE_CF_FORM);
			Set<Map.Entry<byte[],byte[]>> set = map.entrySet();
			for(Map.Entry<byte[],byte[]> entry :set){
				
				temp+=Bytes.toString(entry.getValue());
                                temp+=".";
			}
                        
    
}
return temp;
 }
}