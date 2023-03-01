package smsystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Integer.parseInt;
import java.sql.SQLException;

public class StudentRetrieveExcel{
    public void retrieve() throws ClassNotFoundException, SQLException {
       Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
              "jdbc:sqlserver://localhost:1433;databaseName=SavetheFuture;selectMethod=cursor", "sa", "123456");

        String filePath="E:\\book4.csv";

        int batchSize=200;

       


        try{
          
            connection.setAutoCommit(false);

            String sql="insert into student2(name,id,email,mobile) values(?,?,?,?)";

            PreparedStatement statement=connection.prepareStatement(sql);

            BufferedReader lineReader=new BufferedReader(new FileReader(filePath));

            String lineText=null;
            int count=0;

            lineReader.readLine();
            while ((lineText=lineReader.readLine())!=null){
                String[] data=lineText.split(",");

                String id=data[1];
                String name=data[0];
                String email=data[2];
                String mobile=data[3];

                statement.setInt(2,parseInt(id));
                statement.setString(1,name);
                statement.setString(3,email);
                statement.setInt(4,parseInt(mobile));
                statement.addBatch();
                if(count%batchSize==0){
                    statement.executeBatch();
                }
            }
            lineReader.close();
            statement.executeBatch();
            connection.commit();
            connection.close();
            System.out.println("Data has been inserted successfully.");

        }
        catch (Exception exception){
            exception.printStackTrace();
        }

    }
}