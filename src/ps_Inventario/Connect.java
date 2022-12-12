package ps_Inventario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import ps_controller.Elementos;

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

    public ArrayList getListaElementos() {
              
        ArrayList mListaElementos = new ArrayList();   
        Elementos elemento = null;
        Statement consulta;
        ResultSet resultado;
        try {
            consulta = conn.createStatement();
            resultado = consulta.executeQuery("select * from articulos");

            while (resultado.next()) {
                elemento = new Elementos();
                elemento.setId(resultado.getInt("id"));
                elemento.setelemento(resultado.getString("elemento"));
                //elemento.setFechaOut(resultado.getString("date_out"));
                mListaElementos.add(elemento);
            }
        resultado.close();
        consulta.close();
        } catch (SQLException e) {
        }
        return mListaElementos;
        
    }
}
