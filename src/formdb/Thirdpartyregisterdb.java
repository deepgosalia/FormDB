/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

import static formdb.Constants.*;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

/**
 *
 * @author rushabh
 */
public class Thirdpartyregisterdb {
      public static void insertData(String companyid,String password) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_THIRDPARTY)));
		Put put = new Put(Bytes.toBytes(companyid));
		put.addColumn(TABLE_CF_TPREGISTER, TABLE_C_COMPANYID, Bytes.toBytes(companyid));
		put.addColumn(TABLE_CF_TPREGISTER, TABLE_C_COMPANYPASSWORD, Bytes.toBytes(password));
		table.put(put);
		table.close();
		con.close();
		
	}
   
}
