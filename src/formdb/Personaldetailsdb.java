/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import  static formdb.Constants.*;

/**
 *
 * @author rushabh
 */
public class Personaldetailsdb {
    public static void insertData(String name,String dob,String gender,String contactno, String address,String caste,String maritalstatus) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		Put put = new Put(Bytes.toBytes(Keyemail.getEmail()));
		put.addColumn(TABLE_CF_PERSONAL, TABLE_C_NAME, Bytes.toBytes(name));
		put.addColumn(TABLE_CF_PERSONAL, TABLE_C_DOB, Bytes.toBytes(dob));
                put.addColumn(TABLE_CF_PERSONAL, TABLE_C_GENDER, Bytes.toBytes(gender));
                put.addColumn(TABLE_CF_PERSONAL, TABLE_C_CONTACTNO, Bytes.toBytes(contactno));
                put.addColumn(TABLE_CF_PERSONAL, TABLE_C_ADDRESS, Bytes.toBytes(address));
                put.addColumn(TABLE_CF_PERSONAL, TABLE_C_CASTE, Bytes.toBytes(caste));
                put.addColumn(TABLE_CF_PERSONAL, TABLE_C_MARITAL, Bytes.toBytes(maritalstatus));
		table.put(put);
		table.close();
		con.close();
		
	}
}
