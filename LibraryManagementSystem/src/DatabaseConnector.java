import java.sql.*;

public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/library_management_system";
    private static final String USER = "root";
    private static final String PASS = "";
    protected String query;
    protected Statement statement;
    protected ResultSet resultSet;
    protected PreparedStatement prepStatement;
    protected CallableStatement callStatement;

    protected Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
    }
}