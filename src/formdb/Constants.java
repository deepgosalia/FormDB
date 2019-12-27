package formdb;

import org.apache.hadoop.hbase.util.Bytes;

public class Constants {
	
	public static final String TABLE_USERS="user";
        public static final String TABLE_THIRDPARTY="thirdparty";
        
        //table users
	public static final byte[] TABLE_CF_PERSONAL=Bytes.toBytes("personaldetails");
        public static final byte[] TABLE_CF_EDUCATIONAL=Bytes.toBytes("educationaldetails");
        public static final byte[] TABLE_CF_BANK=Bytes.toBytes("bankdetails");
        public static final byte[] TABLE_CF_MEDICAL=Bytes.toBytes("medicaldetails");
        public static final byte[] TABLE_CF_REGISTER=Bytes.toBytes("register");
        public static final byte[] TABLE_CF_GOVT=Bytes.toBytes("govtid");
        public static final byte[] TABLE_CF_USERID=Bytes.toBytes("userid");
        
        //personal columnfamily
	public static final byte[] TABLE_C_NAME=Bytes.toBytes("name");
	public static final byte[] TABLE_C_DOB=Bytes.toBytes("dob");
	public static final byte[] TABLE_C_GENDER=Bytes.toBytes("gender");
	public static final byte[] TABLE_C_CONTACTNO=Bytes.toBytes("contactno");
	public static final byte[] TABLE_C_ADDRESS=Bytes.toBytes("address");
        public static final byte[] TABLE_C_CASTE=Bytes.toBytes("caste");
        public static final byte[] TABLE_C_MARITAL=Bytes.toBytes("maritalstatus");
        
        
        //educational columnfamily
        public static final byte[] TABLE_C_SCHOOLNAME=Bytes.toBytes("schoolname");
        public static final byte[] TABLE_C_SCHOOLPASSINGYEAR=Bytes.toBytes("schoolpassingyear");
        public static final byte[] TABLE_C_SCHOOLPERCENT=Bytes.toBytes("schoolpercent");
        public static final byte[] TABLE_C_COLLEGENAME=Bytes.toBytes("collegename");
        public static final byte[] TABLE_C_COLLEGEPASSINGYEAR=Bytes.toBytes("collegepassingyear");
        public static final byte[] TABLE_C_COLLEGEPERCENT=Bytes.toBytes("collegepercent");
        public static final byte[] TABLE_C_INSTITUTENAME=Bytes.toBytes("institutename");
        public static final byte[] TABLE_C_COURSENAME=Bytes.toBytes("coursename");
        public static final byte[] TABLE_C_INSTITUTEPASSYEAR=Bytes.toBytes("institutepassyear");
        public static final byte[] TABLE_C_INSTITUTEPERCENT=Bytes.toBytes("institutepercent");
        public static final byte[] TABLE_C_CURRENTPROFESSION=Bytes.toBytes("currentprofession");
        
        //bank columnfamily
        public static final byte[] TABLE_C_BANKNAME=Bytes.toBytes("bankname");
        public static final byte[] TABLE_C_IFSC=Bytes.toBytes("ifsc");
        public static final byte[] TABLE_C_ACCOUNTNO=Bytes.toBytes("accountno");
        public static final byte[] TABLE_C_ANNUALINCOME=Bytes.toBytes("annualincome");
        
        //medical columnfamily
        public static final byte[] TABLE_C_BLOODGROUP=Bytes.toBytes("bloodgroup");
        public static final byte[] TABLE_C_HANDICAP=Bytes.toBytes("handicap");
        public static final byte[] TABLE_C_ADDITIONALINFO=Bytes.toBytes("additionalinfo");
        
        //register columnfamily
        public static final byte[] TABLE_C_EMAIL=Bytes.toBytes("email");
        public static final byte[] TABLE_C_PASSWORD=Bytes.toBytes("password");
        
        //government columnfamily
        public static final byte[] TABLE_C_AADHAR=Bytes.toBytes("aadhar");
        public static final byte[] TABLE_C_PAN=Bytes.toBytes("pan");
        public static final byte[] TABLE_C_GST=Bytes.toBytes("gst");
        public static final byte[] TABLE_C_PASSPORT=Bytes.toBytes("passport");
        
        
        //table thirdparty
        public static final byte[] TABLE_CF_FORM=Bytes.toBytes("form");
        public static final byte[] TABLE_CF_TPDETAILS=Bytes.toBytes("tpdetails");
        public static final byte[] TABLE_CF_TPREGISTER=Bytes.toBytes("tpregister");
        
        
        //form columnfamily
        public static final byte[] TABLE_C_FORMNAME=Bytes.toBytes("formname");
        public static final byte[] TABLE_C_REQUIREMENTS=Bytes.toBytes("requirements");
        
        //tpdetails columnfamily
        public static final byte[] TABLE_C_COMPANYNAME=Bytes.toBytes("companyname");
        public static final byte[] TABLE_C_COMPANYADDRESS=Bytes.toBytes("companyaddress");
        public static final byte[] TABLE_C_COMPANYCONTACTNO=Bytes.toBytes("companycontactno");
        
        //regsiter columnfamily
        public static final byte[] TABLE_C_COMPANYID=Bytes.toBytes("companyid");
        public static final byte[] TABLE_C_COMPANYPASSWORD=Bytes.toBytes("companypassword");
        
        
	
        

}
