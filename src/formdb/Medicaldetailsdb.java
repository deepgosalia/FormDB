package formdb;



import static formdb.Constants.*;
import formdb.Keyemail;
import java.io.IOException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.util.Bytes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushabh
 */
public class Medicaldetailsdb {
     public static void insertData(String bloodgroup,String handicap,String details) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		Put put = new Put(Bytes.toBytes(Keyemail.getEmail()));
		put.addColumn(TABLE_CF_MEDICAL, TABLE_C_BLOODGROUP, Bytes.toBytes(bloodgroup));
		put.addColumn(TABLE_CF_MEDICAL, TABLE_C_HANDICAP, Bytes.toBytes(handicap));
                put.addColumn(TABLE_CF_MEDICAL, TABLE_C_ADDITIONALINFO, Bytes.toBytes(details));
		table.put(put);
		table.close();
		con.close();
		
	}
    
}
