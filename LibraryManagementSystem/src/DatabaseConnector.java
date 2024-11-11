import java.sql.*;

public class DatabaseConnector {
    private static final String DB_URL = "jdbc:mysql://localhost:3307/books";
    private static final String USER = "root";
    private static final String PASS = "joseph";
    private static final String QUERY = "SELECT * FROM book";

    public static void main(String[] args) throws SQLException {
        // Open a connection

        Statement statement = connect().createStatement();
        ResultSet resultSet = statement.executeQuery(QUERY);
        int columnCount = resultSet.getMetaData().getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.print(resultSet.getMetaData().getColumnName(i) + "\t\t");
        }
        System.out.println();

        while (resultSet.next()) {

            for (int i = 1; i <= columnCount; i++) {
                // System.out.print(resultSet.getInt(i));
                System.out.print(resultSet.getString(i) + "\t\t");
                // System.out.print(resultSet.getString(i));
                // System.out.print(resultSet.getDate(i));
            }
            System.out.println();
        }

        // Extract data from result set

        // preparedStatement.setInt(1, 3);
        // preparedStatement.setString(2, "GONE");
        // preparedStatement.setString(3, "Michael Grant");
        // preparedStatement.setDate(4, java.sql.Date.valueOf("2019-10-10"));
        // preparedStatement.executeUpdate();

    }

    public static Connection connect() throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        return conn;
    }
}