package sql;
import javax.swing.plaf.nimbus.State;
import java.sql.*;
public class DemoClass {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/dac_dbt" ,"root" , "Dhruti@31");
        Statement smt = con.createStatement();
        String q1 = "select empname , empcode , basicpay from emp";
        ResultSet rs = smt.executeQuery(q1);

        while(rs.next()){
            System.out.println(rs.getString(1) + " "+rs.getInt(2) +" " +rs.getInt(3));
        }
        rs.close();
    }


}
