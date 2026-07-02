//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package arra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CbidChecking {
    int count;
    String cbid;
    Statement stmt;
    Connection conn;
    String url = "jdbc:sqlserver://8.8.242.193\\ICPORTAL;databaseName=icAppsAAA_APM";
    String username = "icaqauser";
    String password = "IcaQ@User@!";

    public static void main(String[] var0) {
        CbidChecking var1 = new CbidChecking();
        System.out.println(var1.getCbId("select idCallBack AS 'cbId' from [icAppsAAA_APM].[dbo].[icc_ProgramCallBack] where PhoneNumber = '8662560480';", "cbId"));
    }

    public String getCbId(String var1, String var2) {
        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            this.stmt = this.conn.createStatement();
            ResultSet var3 = this.stmt.executeQuery(var1);
            var3.next();
            this.cbid = var3.getString("colName");
            var3.close();
        } catch (SQLException var4) {
            System.out.println("There is an error");
            var4.printStackTrace();
        }

        return this.cbid;
    }
}
