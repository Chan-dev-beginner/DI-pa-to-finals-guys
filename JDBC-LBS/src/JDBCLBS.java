import java.sql.*;

public class JDBCLBS extends registrationGUI {
    public static void main(String[]args) {
        String url="jdbc:mysql://localhost:3306/lbs_jdbc";
        String username="root";
        String password="";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement=connection.createStatement();

            ResultSet resultSet=statement.executeQuery("SELECT * FROM registertable");

            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString( 2)+" "+resultSet.getString( 3)+" "+resultSet.getString(4));
            }

            connection.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}