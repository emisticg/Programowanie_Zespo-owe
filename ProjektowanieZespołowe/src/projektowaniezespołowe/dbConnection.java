package projektowaniezespołowe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class dbConnection {
    public Connection Connect() {
        try {
            String url = "jdbc:mariadb://databases.000webhost.com/id1458560_baseprojects";
            String user = "id1458560_baseprojects";
            String password = "zespolowka";

            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }
}