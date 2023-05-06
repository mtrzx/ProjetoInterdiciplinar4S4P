/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionFromSQL.DAO;

import ConnectionFromSQL.DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
        conn = new Conexao().conectaDB();

        try {
            String sql = "select * from grupo4 where CPF = ?  and SENHA = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objusuariodto.getId_CPF());
            pstm.setString(2, objusuariodto.getId_senha());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Catch" + erro);
            return null;
        }
    }
    
    public UsuarioDTO dadosPerfil (UsuarioDTO objUsuarioDTO){
        conn = new Conexao().conectaDB();
        
        try{
            String sql = "select * from grupo4 where CPF = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getId_CPF());
            
            
        }
        
        return null;
    }
    
    
}
