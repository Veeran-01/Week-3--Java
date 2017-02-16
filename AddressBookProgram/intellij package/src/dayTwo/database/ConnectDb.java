package dayTwo.database;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by student on 16/02/2017.
 */
public class ConnectDb {
    private Connection con;

    //Connection string variables
    private String userName ="awesome";
    private String password ="Password100";
    private String url ="jdbc:mysql://localhost:3306/boom?UseSSL=false";        //jdbc is library, localhost is this computer, 3306 is port number, useSSL=false means don't need to encrypt (because were using  it on this machine otherwise would  = true

    public ConnectDb() throws Exception{
        //load the database driver
        Class.forName("com.mysql.jdbc.Driver");     //need to add go to file->Project Structure
        //connect to database
        con = DriverManager.getConnection(url, userName, password);
    }

    //create getter
    public Connection getCon() {
        return con;
    }
}
