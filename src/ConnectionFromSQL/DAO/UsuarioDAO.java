package ConnectionFromSQL.DAO;

import ConnectionFromSQL.DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import ConnectionFromSQL.VIEW.InternalTrans;
import ConnectionFromSQL.VIEW.TelaLogin;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();

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

    public ArrayList<UsuarioDTO> PerfilUser() {
        conn = new Conexao().conectaDB();
        String userInput = JOptionPane.showInputDialog("Digite novamente o cpf: ");
        String sql = "select * from grupo4 where CPF = " + userInput;
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_CPF(rs.getString("CPF"));
                objUsuarioDTO.setId_nome(rs.getString("NOME"));
                objUsuarioDTO.setId_email(rs.getString("EMAIL"));
                objUsuarioDTO.setId_agencia(rs.getInt("AGENCIA"));
                objUsuarioDTO.setId_conta(rs.getInt("CONTA"));

                //Armazena as informações acima dentro da array
                lista.add(objUsuarioDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO pesquisar" + erro);
        }
        return lista;
    }

    public ArrayList<UsuarioDTO> PerfilSaldo() {
        conn = new Conexao().conectaDB();
        String userInput = JOptionPane.showInputDialog("Digite novamente o cpf: ");
        String sql = "select CPF, NOME, SALDO from grupo4 where CPF = " + userInput;
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_CPF(rs.getString("CPF"));
                objUsuarioDTO.setId_nome(rs.getString("NOME"));
                objUsuarioDTO.setId_saldo(rs.getFloat("SALDO"));

                //Armazena as informações acima dentro da array
                lista.add(objUsuarioDTO);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO saldo" + erro);
        }
        return lista;
    }

    public void AtualizaInvest(UsuarioDTO objUsuarioDTO) {
        String sqlInvestimento = "SELECT INVESTIMENTO FROM `grupo4` WHERE CPF = ?;";
        conn = new Conexao().conectaDB();
        try {
            // Obter investimento do banco de dados
            PreparedStatement pstmInvestimento = conn.prepareStatement(sqlInvestimento);
            pstmInvestimento.setString(1, objUsuarioDTO.getId_CPF());
            ResultSet investimentoResultado = pstmInvestimento.executeQuery();
            float investimento = 0.0f;
            if (investimentoResultado.next()) {
                investimento = investimentoResultado.getFloat("INVESTIMENTO");
            }
            objUsuarioDTO.setId_InvestTotal(investimento);
            investimentoResultado.close();
            pstmInvestimento.close();
        } catch (SQLException erro) {
            System.out.println("Catch do AtualizaInvest");
        }
    }

    public void RegistraTransferencia(UsuarioDTO objUsuarioDTO) {
        String sql = "UPDATE grupo4 SET SALDO = SALDO - ?, INVESTIMENTO = INVESTIMENTO + ? WHERE CPF = ?;";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getId_CPF());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float investimento = objUsuarioDTO.getId_investimento();

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= investimento) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);
                pstmAtualizacao.setFloat(1, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setString(3, objUsuarioDTO.getId_CPF());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso!");
            } else {
                // Saldo é maior que o investimento, portanto, cancelar a transferência
                throw new Exception("Saldo insuficiente para realizar a transferência.");
            }

            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RegistrarTransferencia: " + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Transferência cancelada: " + erro);
        }
    }
}
