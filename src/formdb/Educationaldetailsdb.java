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
public class Educationaldetailsdb {
    
    public static void insertData(String schoolname,String schoolpassyear,String schoolpercentage,String collegename, String collegepassyear,String collegepercentage,String institutename,String coursename,String instituteyear, String institutepercentage,String profession) throws IOException {
		// TODO Auto-generated method stub
		Connection con = ConnectionFactory.createConnection(new Configuration());
		Table table = con.getTable(TableName.valueOf((TABLE_USERS)));
		Put put = new Put(Bytes.toBytes(Keyemail.getEmail()));
		put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_SCHOOLNAME, Bytes.toBytes(schoolname));
		put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_SCHOOLPASSINGYEAR, Bytes.toBytes(schoolpassyear));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_SCHOOLPERCENT, Bytes.toBytes(schoolpercentage));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_COLLEGENAME, Bytes.toBytes(collegename));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_COLLEGEPASSINGYEAR, Bytes.toBytes(collegepassyear));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_COLLEGEPERCENT, Bytes.toBytes(collegepercentage));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_INSTITUTENAME, Bytes.toBytes(institutename));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_COURSENAME, Bytes.toBytes(coursename));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_INSTITUTEPASSYEAR, Bytes.toBytes(instituteyear));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_INSTITUTEPERCENT, Bytes.toBytes(institutepercentage));
                put.addColumn(TABLE_CF_EDUCATIONAL, TABLE_C_CURRENTPROFESSION, Bytes.toBytes(profession));
                
		table.put(put);
		table.close();
		con.close();
		
	}
}
