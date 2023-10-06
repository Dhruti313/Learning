package sql;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.Scanner;

public class JDBCManagaer {
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/dac_dbt","root" , "Dhruti@31");
        return con;
    }
    public static void display(Connection con) throws SQLException {
        String q1= ("select empname , basicpay from emp where empcode = ? ");
        System.out.println("enter the empcode to retrive the details");
        Scanner sc = new Scanner(System.in);
        int code = sc.nextInt();

        PreparedStatement pmt = con.prepareStatement(q1);
        pmt.setInt(1,code);

        ResultSet rs = pmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString(1) +" "+rs.getInt(2));
        }
        rs.close();
    }
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Connection con = JDBCManagaer.createConnection();
        JDBCManagaer.display(con);
    }
}
