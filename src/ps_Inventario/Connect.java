package ps_Inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private static Connection conn; 
    private static final String driver = "org.sqlite.JDBC";

    
   String dbLite = "jdbc:sqlite:Inventario.db";
    
   
    
    public Connect(){ 
        conn = null;
        try{   
            Class.forName(driver);
            conn = DriverManager.getConnection(dbLite);
            
            // Connect?
            if(conn != null)
                System.out.println("Conexión establecida exitosamente");
        }catch (ClassNotFoundException | SQLException ex){
            System.out.println("Conexión Fallida:\n\n"+ex);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
}
