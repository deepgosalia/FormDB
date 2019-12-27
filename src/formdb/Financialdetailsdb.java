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
public class Financialdetailsdb {
     public static void insertData(String bankname,String ifsc,String accountno,String annualincome) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		Put put = new Put(Bytes.toBytes(Keyemail.getEmail()));
		put.addColumn(TABLE_CF_BANK, TABLE_C_BANKNAME, Bytes.toBytes(bankname));
		put.addColumn(TABLE_CF_BANK, TABLE_C_IFSC, Bytes.toBytes(ifsc));
                put.addColumn(TABLE_CF_BANK, TABLE_C_ACCOUNTNO, Bytes.toBytes(accountno));
                put.addColumn(TABLE_CF_BANK, TABLE_C_ANNUALINCOME, Bytes.toBytes(annualincome));
		table.put(put);
		table.close();
		con.close();
		
	}
    
}
