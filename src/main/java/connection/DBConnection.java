package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    Connection connection;
    static String bd = "railway";
    static String port = "6928";
    static String login = "root";
    static String password = "af09YzyhhTSW0WW9YlRJ";
    static String ip = "containers-us-west-85.railway.app";

    public DBConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://"+ DBConnection.ip +":" + DBConnection.port + "/" + DBConnection.bd;
            connection = DriverManager.getConnection(url, DBConnection.login, this.password);
            System.out.println("Conexion");
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }

    
    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        connection = null;
    }
}
