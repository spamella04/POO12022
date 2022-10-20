/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jadg13
 */
public class Conexion {

    private static final String SERVIDOR = "165.98.12.158";
    private static final String PUERTO = "1432";
    private static final String NOMBREBD = "PruebaBD";
    private static final String USUARIO = "sa";
    private static final String PW = "123";
    private static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public Connection obtenerConexion() {
        try {
            String connectionUrl = "jdbc:sqlserver://" + SERVIDOR + ":" + PUERTO
                    + "; Databasename= " + NOMBREBD + "; user = " + USUARIO + "; password= "
                    + PW + ";";
            Class.forName(DRIVER);
            return (DriverManager.getConnection(connectionUrl));
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    
    public void close(Connection conn) {
        try {
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   
}
