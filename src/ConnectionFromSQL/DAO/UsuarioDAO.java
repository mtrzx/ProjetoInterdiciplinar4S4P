package ConnectionFromSQL.DAO;

import ConnectionFromSQL.DTO.UsuarioDTO;
import ConnectionFromSQL.VIEW.TelaPrincipal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList <UsuarioDTO> lista = new ArrayList<>();

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
    
    /**
     *
     * @return
     */
    public ArrayList<UsuarioDTO> PerfilUser(){
        conn = new Conexao().conectaDB();
        String userInput = JOptionPane.showInputDialog("Digite novamente o cpf: ");
        String sql = "select * from grupo4 where CPF = " + userInput;
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_CPF(rs.getString("CPF"));
                objUsuarioDTO.setId_nome(rs.getString("NOME"));
                objUsuarioDTO.setId_email(rs.getString("EMAIL"));
                objUsuarioDTO.setId_agencia(rs.getInt("AGENCIA"));
                objUsuarioDTO.setId_conta(rs.getInt("CONTA"));
                
                //Armazena as informações acima dentro da array
                lista.add(objUsuarioDTO);
            }
                    
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO pesquisar" + erro);
        }
        return lista;
    }
    
    
    public ArrayList<UsuarioDTO> PerfilSaldo(){
        conn = new Conexao().conectaDB();
        String userInput = JOptionPane.showInputDialog("Digite novamente o cpf: ");
        String sql = "select CPF, NOME, SALDO from grupo4 where CPF = " + userInput;
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while(rs.next()){
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_CPF(rs.getString("CPF"));
                objUsuarioDTO.setId_nome(rs.getString("NOME"));
                objUsuarioDTO.setId_saldo(rs.getFloat("SALDO"));
                
                //Armazena as informações acima dentro da array
                lista.add(objUsuarioDTO);
            }
                    
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO saldo" + erro);
        }
        return lista;
    }
}
