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
public class Govdetailsdb {
     public static void insertData(String aadhar,String pan,String gst,String passport) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		Put put = new Put(Bytes.toBytes(Keyemail.getEmail()));
		put.addColumn(TABLE_CF_GOVT, TABLE_C_AADHAR, Bytes.toBytes(aadhar));
		put.addColumn(TABLE_CF_GOVT, TABLE_C_PAN, Bytes.toBytes(pan));
                put.addColumn(TABLE_CF_GOVT, TABLE_C_GST, Bytes.toBytes(gst));
                put.addColumn(TABLE_CF_GOVT, TABLE_C_PASSPORT, Bytes.toBytes(passport));
		table.put(put);
		table.close();
		con.close();
		
	}
    
}
