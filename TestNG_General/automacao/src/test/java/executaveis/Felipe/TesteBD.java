package executaveis.Felipe;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TesteBD {

    @Rule
    public TestName test = new TestName();
    @Before
    public void setUp()
    {

    }

    @Test
    public void testChange() {
        Connection conn = null;
        String dbName = "JANUS_TEST2"; //nome da base de dados
        String serverip="10.230.231.39"; //host do banco
        String serverport="1433"; //porta do banco
        String url = "jdbc:sqlserver://"+serverip+"\\SQLEXPRESS:"+serverport+";databaseName="+dbName+"";
        Statement stmt = null;
        ResultSet result = null;
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String databaseUserName = "photonicsbd";
        String databasePassword = "photonicsbd";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url, databaseUserName, databasePassword);
            stmt = conn.createStatement();
            result = null;
            String pa,us;
            result = stmt.executeQuery("SELECT *  FROM JANUS_TEST2.dbo.users"); //query

            while (result.next()) {
                us=result.getString("id"); //coluna desejada
                pa = result.getString("email"); //coluna desejada
                System.out.println(us+"  "+pa); //print das colunas
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown()
    {
    }
}
