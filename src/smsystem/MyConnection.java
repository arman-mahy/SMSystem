

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class MyConnection {
    public void connectDB(){
try {
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
Connection connection = DriverManager
.getConnection(
"jdbc:sqlserver://localhost:1433;databaseName=SavetheFuture;selectMethod=cursor", "sa", "123456");


} catch (Exception e) {
e.printStackTrace();
}
}
}
