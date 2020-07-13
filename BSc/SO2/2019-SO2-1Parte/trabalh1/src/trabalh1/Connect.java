package trabalh1;

import java.sql.*;

public class Connect {
    private String PG_HOST="alunos.di.uevora.pt";
    private String PG_DB= "l36975";
    private String USER= "l36975";
    private String PWD= "teste";

    Connection con = null;
    Statement stmt = null;

    public void connect() throws Exception {
        
        try {
            Class.forName("org.postgresql.Driver");        
            
            con = DriverManager.getConnection("jdbc:postgresql://"+PG_HOST+":5432/"+PG_DB,
                                              USER,
                                              PWD);
            
            stmt = con.createStatement();
            
        } 
        
        catch (Exception e)
        {
            e.printStackTrace();
            System.err.println("Problems setting the connection");
        }
    }

    public void disconnect()
    {    
        try {
            stmt.close();
            con.close();
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public Statement getStatement()
    {
        return stmt;
    }
}

    
