package LIBRARY;
import java.sql.Connection;
import java.sql.DriverManager;

public class dataBase {
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/lbs_jdbc",
                    "root",
                    ""
            );
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
    
}
