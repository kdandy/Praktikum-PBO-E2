import java.sql.*;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception{
        String name = person.getname();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo","root","dandy");
        String query ="INSERT INTO person (NAME) VALUE('"+name+"')";
        System.out.println(query);
        Statement s= con.createStatement();
        s.executeUpdate(query);

        con.close();
    }
}