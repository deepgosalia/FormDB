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
public class Keycompanyid {
    static String companyid=null;
    
    public static void setCompanyid(String tempid)
    {
        companyid=tempid;
    }
    public static String getCompanyid()
    {
        return companyid;
    }
    
}
