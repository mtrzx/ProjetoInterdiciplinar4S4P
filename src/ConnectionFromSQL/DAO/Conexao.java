/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionFromSQL.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author mathe
 */
public class Conexao {
    public Connection conectaDB(){
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost:3306/bancorubik?user=root&password=";
            conn = DriverManager.getConnection(url);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro na conexão DAO" +  erro.getMessage());
        }
        
        return conn;
    }
}
