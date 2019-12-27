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
public class Thirdpartylogindb {
    
    public static boolean checkValidity(String companyid,String password) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_THIRDPARTY)));
                
                
                Get get = new Get(Bytes.toBytes(companyid));
		get.addFamily(TABLE_CF_TPREGISTER);
                Result result = table.get(get);
                String temppassword=null;
                if(result!=null){
			NavigableMap<byte[], byte[]> map = result.getFamilyMap(TABLE_CF_TPREGISTER);
			Set<Map.Entry<byte[],byte[]>> set = map.entrySet();
                        int c=0;
			for(Map.Entry<byte[],byte[]> entry :set){
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
