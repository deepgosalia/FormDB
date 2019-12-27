/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formdb;

/**
 *
 * @author rushabh
 */
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

import  static formdb.Constants.*;

public class Userregisterdb {
    
    
    public static void insertData(String email,String password) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		Put put = new Put(Bytes.toBytes(email));
		put.addColumn(TABLE_CF_REGISTER, TABLE_C_EMAIL, Bytes.toBytes(email));
		put.addColumn(TABLE_CF_REGISTER, TABLE_C_PASSWORD, Bytes.toBytes(password));
		table.put(put);
		table.close();
		con.close();
		
	}
    
}
