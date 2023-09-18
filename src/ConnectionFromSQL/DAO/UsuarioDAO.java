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
import java.awt.Toolkit;
import java.util.Random;

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
            pstm.setString(1, objusuariodto.getCpf_login());
            pstm.setString(2, objusuariodto.getId_senha());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Catch" + erro);
            return null;
        }
    }

    public UsuarioDTO PerfilUser() {
        conn = new Conexao().conectaDB();
        UsuarioDTO userCode = new UsuarioDTO();
        String sql = "select * from grupo4 where CPF = " + userCode.getCpf_login();        
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                objUsuarioDTO.setId_CPF(rs.getString("CPF"));
                objUsuarioDTO.setId_nome(rs.getString("NOME"));
                objUsuarioDTO.setId_email(rs.getString("EMAIL"));
                objUsuarioDTO.setId_agencia(rs.getInt("AGENCIA"));
                objUsuarioDTO.setId_conta(rs.getInt("CONTA"));

                //Armazena as informações acima dentro da array
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO pesquisar" + erro);
        }
        return objUsuarioDTO;
    }

    public UsuarioDTO PerfilSaldo() {
        conn = new Conexao().conectaDB();
        UsuarioDTO objUsuarioDTO = new UsuarioDTO();
        String sql = "select NOME, SALDO from grupo4 where CPF = " + objUsuarioDTO.getCpf_login();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                objUsuarioDTO.setId_nome(rs.getString("NOME"));
                objUsuarioDTO.setId_saldo(rs.getFloat("SALDO"));

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no UsuarioDAO saldo" + erro);
        }
        return objUsuarioDTO;
    }

    public void AtualizaInvest(UsuarioDTO objUsuarioDTO) {
        String sqlInvestimento = "SELECT TOTAL_INVESTIDO FROM `grupo4` WHERE CPF = ?;";
        conn = new Conexao().conectaDB();
        try {
            // Obter investimento do banco de dados
            PreparedStatement pstmInvestimento = conn.prepareStatement(sqlInvestimento);
            pstmInvestimento.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet investimentoResultado = pstmInvestimento.executeQuery();
            float investimento = 0.0f;
            if (investimentoResultado.next()) {
                investimento = investimentoResultado.getFloat("TOTAL_INVESTIDO");
            }
            objUsuarioDTO.setId_InvestTotal(investimento);
            investimentoResultado.close();
            pstmInvestimento.close();
        } catch (SQLException erro) {
        }
    }

    public void RegistraInvestimento(UsuarioDTO objUsuarioDTO) {
        String sql = "UPDATE grupo4 SET SALDO = SALDO - ?, TOTAL_INVESTIDO = TOTAL_INVESTIDO + ? WHERE CPF = ?;";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
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
                pstmAtualizacao.setString(3, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso!");
            } else {
                // Saldo é maior que o investimento, portanto, cancelar o Investimento
                throw new Exception("Saldo insuficiente para realizar o Investimento.");
            }

            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RegistrarInvestimento: " + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Investimento cancelada: " + erro);
        }
    }
    
    public void RegistrarTransfTed(UsuarioDTO objUsuarioDTO){
        
        String sql = "UPDATE grupo4 SET SALDO = CASE WHEN CPF = ? THEN SALDO - ? WHEN CONTA = ? AND AGENCIA = ? THEN SALDO + ? ELSE SALDO END WHERE CPF IN (?) OR (CONTA = ? AND AGENCIA = ?);";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float valorTED = objUsuarioDTO.getId_valorTransTED();

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= valorTED) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);                
                pstmAtualizacao.setString(1, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_valorTransTED());
                //////
                pstmAtualizacao.setInt(3, objUsuarioDTO.getId_contaDestinatario());
                pstmAtualizacao.setInt(4, objUsuarioDTO.getId_agenciaDestinatario());
                pstmAtualizacao.setFloat(5, objUsuarioDTO.getId_valorTransTED());
                /////
                pstmAtualizacao.setString(6, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.setInt(7, objUsuarioDTO.getId_contaDestinatario());
                pstmAtualizacao.setInt(8, objUsuarioDTO.getId_agenciaDestinatario());
                /////
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                JOptionPane.showMessageDialog(null, "Tranferencia realizada com sucesso!");
                ImprimeBDTD(objUsuarioDTO);
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
    
    
    public void RegistrarTransfPIX(UsuarioDTO objUsuarioDTO){
        
        String sql = "UPDATE grupo4 SET SALDO = CASE WHEN CPF = ? THEN SALDO - ? WHEN CPF = ? THEN SALDO + ? ELSE SALDO END WHERE CPF IN (?, ?);";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float valorpix = objUsuarioDTO.getId_valorTransPix();

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= valorpix) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);                
                pstmAtualizacao.setString(1, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_valorTransPix());
                //////
                pstmAtualizacao.setString(3, objUsuarioDTO.getId_cpfDestinatario());
                pstmAtualizacao.setFloat(4, objUsuarioDTO.getId_valorTransPix());
                /////
                pstmAtualizacao.setString(5, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.setString(6, objUsuarioDTO.getId_cpfDestinatario());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();        
                
                JOptionPane.showMessageDialog(null, "Tranferencia realizada com sucesso!");
                ImprimeBDPIX(objUsuarioDTO);
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
    
    
    public void ImprimeBDPIX(UsuarioDTO objUsuarioDTO){
        String sqlArmazena = "INSERT INTO `grupo4historico` (TIPO_TRANS, CPF_REMET, VALOR, CPF_DEST) VALUES (?, ?, ?, ?);";
        conn = new Conexao().conectaDB();
        
        try{
            PreparedStatement pstmArmazenaDados = conn.prepareStatement(sqlArmazena);
            pstmArmazenaDados.setString(1, objUsuarioDTO.getId_tipoPix());
            pstmArmazenaDados.setString(2, objUsuarioDTO.getCpf_login());                
            pstmArmazenaDados.setFloat(3, objUsuarioDTO.getId_valorTransPix());
            pstmArmazenaDados.setString(4, objUsuarioDTO.getId_cpfDestinatario());

            pstmArmazenaDados.execute();
            pstmArmazenaDados.close();
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao armazenar dados: " + erro.getMessage());
        }
    }
    
    
    public void ImprimeBDTD(UsuarioDTO objUsuarioDTO){
        
        String sqlArmazenaTD = "INSERT INTO `grupo4historico` (`CPF_REMET`,`VALOR`, `CONTA_REMET`, `CONTA_DEST`, `AGENCIA_REMET`, `AGENCIA_DEST`, `TIPO_TRANS`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        conn = new Conexao().conectaDB();
        
        try{
            PreparedStatement pstmArmazenaDados = conn.prepareStatement(sqlArmazenaTD);
            pstmArmazenaDados.setString(1, objUsuarioDTO.getCpf_login());
            pstmArmazenaDados.setFloat(2, objUsuarioDTO.id_valorTransTED);
            pstmArmazenaDados.setInt(3, objUsuarioDTO.id_conta);
            pstmArmazenaDados.setInt(4, objUsuarioDTO.id_contaDestinatario);            
            pstmArmazenaDados.setInt(5, objUsuarioDTO.id_agencia);
            pstmArmazenaDados.setInt(6, objUsuarioDTO.getId_agenciaDestinatario());
            pstmArmazenaDados.setString(7, objUsuarioDTO.getId_TipoTD());

            pstmArmazenaDados.execute();
            pstmArmazenaDados.close();
        }catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao armazenar dados: " + erro.getMessage());
        }
    }
    
    public ArrayList<UsuarioDTO> HistoricoPIX(String cpf){ 
        
        conn = new Conexao().conectaDB();
        String sql = "SELECT * FROM grupo4historico WHERE CPF_REMET =" + cpf + " AND TIPO_TRANS = 'PIX' ";
        try{        
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setCpf_login(rs.getString("CPF_REMET"));
                objUsuarioDTO.setId_valorTransPix(rs.getFloat("VALOR"));
                objUsuarioDTO.setId_cpfDestinatario(rs.getString("CPF_DEST"));
               
                
                lista.add(objUsuarioDTO);
            }
        }catch(SQLException erro){            
            JOptionPane.showMessageDialog(null, "Erro pesquisar Historico" + erro);
        }
        return lista;
    }


    public ArrayList<UsuarioDTO> HistoricoTEDDOC(String cpf){ 
        
        conn = new Conexao().conectaDB();
        String sql = "SELECT * FROM grupo4historico WHERE CPF_REMET =" + cpf + " AND TIPO_TRANS = 'TED/DOC' ";
        try{        
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                UsuarioDTO objUsuarioDTO = new UsuarioDTO();
                objUsuarioDTO.setId_conta(rs.getInt("CONTA_REMET"));
                objUsuarioDTO.setId_agencia(rs.getInt("AGENCIA_REMET"));
                objUsuarioDTO.setId_valorTransTED(rs.getFloat("VALOR"));
                objUsuarioDTO.setId_contaDestinatario(rs.getInt("CONTA_DEST"));
                objUsuarioDTO.setId_agenciaDestinatario(rs.getInt("AGENCIA_DEST"));
                
                lista.add(objUsuarioDTO);
            }
        }catch(SQLException erro){            
            JOptionPane.showMessageDialog(null, "Erro pesquisar Historico" + erro);
        }
        return lista;
    }
    
    public void CadastrarUsuario(UsuarioDTO objUsuarioDTO) {
        String sql = "insert into grupo4 (CPF, SENHA, NOME, AGENCIA, CONTA, EMAIL, SALDO, INVESTIMENTO) values (?, ?, ?, ?, ?, ?, 0.0, 0.0)";

        GeraNum();
        
        int[] numeros = GeraNum(); // Chama o método GeraNum() para obter os números de conta e agência
        
        int contaGerada = numeros[0]; // Obtém o número de conta gerado
        int agenciaGerada = numeros[1]; // Obtém o número de agência gerado

        
        conn = new Conexao().conectaDB();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getId_CadastCPF());
            pstm.setString(2, objUsuarioDTO.getId_CadastSenha());
            pstm.setString(3, objUsuarioDTO.getId_CadastNome());
            pstm.setInt(4, agenciaGerada);
            pstm.setInt(5, contaGerada);
            pstm.setString(6, objUsuarioDTO.getId_CadastEmail());

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO " + erro);
        }
        
    }   
   
   public int[] GeraNum(){
        // Gerar número aleatório de conta e agência
        Random random = new Random();
        // Gera um número de 6 dígitos entre 1000 e 9999
        var conta = 100000 + random.nextInt(900000); 
         // Gera um número de 4 dígitos entre 100 e 999
        var agencia = 1000 + random.nextInt(9000);
        
        int[] numeros = {conta, agencia}; // Armazena os números em um array e retorna
        return numeros;
   }
     
   public void RegistraCDB(UsuarioDTO objUsuarioDTO) {
        String sql = "UPDATE grupo4 SET SALDO = SALDO - ?, CDB = CDB + ? WHERE CPF = ?;";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        String sqlAtualizaTotalBD = "UPDATE grupo4 SET TOTAL_INVESTIDO = TOTAL_INVESTIDO + ? WHERE CPF = ?;";
        String sqlAtualizaCDB = "SELECT CDB FROM grupo4 WHERE CPF = ?";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float investimento = objUsuarioDTO.getId_investimento();
            float CDB = 0.0f;

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= investimento) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);
                pstmAtualizacao.setFloat(1, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setString(3, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                
                PreparedStatement ptsmAtualiza = conn.prepareCall(sqlAtualizaTotalBD);
                ptsmAtualiza.setFloat(1, objUsuarioDTO.getId_investimento());
                ptsmAtualiza.setString(2, objUsuarioDTO.getCpf_login());
                ptsmAtualiza.execute();
                ptsmAtualiza.close();
                
                PreparedStatement ptsmSqlAtualizaCDB = conn.prepareCall(sqlAtualizaCDB);
                ptsmSqlAtualizaCDB.setString(1, objUsuarioDTO.getCpf_login());
                ResultSet cDBResultado = ptsmSqlAtualizaCDB.executeQuery();
                if (cDBResultado.next()) {
                CDB = cDBResultado.getFloat("CDB");
                cDBResultado.close();
                ptsmSqlAtualizaCDB.close();
                objUsuarioDTO.setCdbInvest(CDB);
                
            }
                JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso!");
            } else {
                // Saldo é maior que o investimento, portanto, cancelar o Investimento
                throw new Exception("Saldo insuficiente para realizar o Investimento.");
            }
            
            if(saldo >= investimento){
                
            }else{
                throw new Exception("Falha ao atualizar");
            }
            
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RegistrarInvestimento: " + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Investimento cancelada: " + erro);
        }
    }
   
   public void AtualizaInterfaceCDB (UsuarioDTO objUsuarioDTO) throws SQLException{
       String sqlAtualizaCDB = "SELECT CDB FROM grupo4 WHERE CPF = ?";
       conn = new Conexao().conectaDB();
       float CDB = 0.0f;
       PreparedStatement ptsmSqlAtualizaCDB = conn.prepareCall(sqlAtualizaCDB);
       ptsmSqlAtualizaCDB.setString(1, objUsuarioDTO.getCpf_login());
       ResultSet cDBResultado = ptsmSqlAtualizaCDB.executeQuery();
       try {
           
           if (cDBResultado.next()) {
               CDB = cDBResultado.getFloat("CDB");
               cDBResultado.close();
               ptsmSqlAtualizaCDB.close();
               objUsuarioDTO.setCdbInvest(CDB);

       }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Investimento cancelada: " );
        }
    }
   
   public void RegistraCDI(UsuarioDTO objUsuarioDTO) {
        String sql = "UPDATE grupo4 SET SALDO = SALDO - ?, CDI = CDI + ? WHERE CPF = ?;";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        String sqlAtualizaTotalBD = "UPDATE grupo4 SET TOTAL_INVESTIDO = TOTAL_INVESTIDO + ? WHERE CPF = ?;";
        String sqlAtualizaCDI = "SELECT CDI FROM grupo4 WHERE CPF = ?";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float investimento = objUsuarioDTO.getId_investimento();
            float CDI = 0.0f;

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= investimento) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);
                pstmAtualizacao.setFloat(1, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setString(3, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                
                PreparedStatement ptsmAtualiza = conn.prepareCall(sqlAtualizaTotalBD);
                ptsmAtualiza.setFloat(1, objUsuarioDTO.getId_investimento());
                ptsmAtualiza.setString(2, objUsuarioDTO.getCpf_login());
                ptsmAtualiza.execute();
                ptsmAtualiza.close();
                
                PreparedStatement ptsmSqlAtualizaCDI = conn.prepareCall(sqlAtualizaCDI);
                ptsmSqlAtualizaCDI.setString(1, objUsuarioDTO.getCpf_login());
                ResultSet cDIResultado = ptsmSqlAtualizaCDI.executeQuery();
                if (cDIResultado.next()) {
                CDI = cDIResultado.getFloat("CDI");
                cDIResultado.close();
                ptsmSqlAtualizaCDI.close();
                objUsuarioDTO.setCdiInvest(CDI);
                
            }
                JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso!");
            } else {
                // Saldo é maior que o investimento, portanto, cancelar o Investimento
                throw new Exception("Saldo insuficiente para realizar o Investimento.");
            }
            
            if(saldo >= investimento){
                
            }else{
                throw new Exception("Falha ao atualizar");
            }
            
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RegistrarInvestimento: " + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Investimento cancelada: " + erro);
        }
    }
   
   public void AtualizaInterfaceCDI (UsuarioDTO objUsuarioDTO) throws SQLException{
       String sqlAtualizaCDI = "SELECT CDI FROM grupo4 WHERE CPF = ?";
       conn = new Conexao().conectaDB();
       float CDI = 0.0f;
       PreparedStatement ptsmSqlAtualizaCDI = conn.prepareCall(sqlAtualizaCDI);
       ptsmSqlAtualizaCDI.setString(1, objUsuarioDTO.getCpf_login());
       ResultSet cDIResultado = ptsmSqlAtualizaCDI.executeQuery();
       try {
           
           if (cDIResultado.next()) {
               CDI = cDIResultado.getFloat("CDI");
               cDIResultado.close();
               ptsmSqlAtualizaCDI.close();
               objUsuarioDTO.setCdiInvest(CDI);

       }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Investimento cancelada: " );
        }
    }
   
   public void RegistraLCA(UsuarioDTO objUsuarioDTO) {
        String sql = "UPDATE grupo4 SET SALDO = SALDO - ?, LCA = LCA + ? WHERE CPF = ?;";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        String sqlAtualizaTotalBD = "UPDATE grupo4 SET TOTAL_INVESTIDO = TOTAL_INVESTIDO + ? WHERE CPF = ?;";
        String sqlAtualizaLCA = "SELECT LCA FROM grupo4 WHERE CPF = ?";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float investimento = objUsuarioDTO.getId_investimento();
            float LCA = 0.0f;

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= investimento) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);
                pstmAtualizacao.setFloat(1, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setString(3, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                
                PreparedStatement ptsmAtualiza = conn.prepareCall(sqlAtualizaTotalBD);
                ptsmAtualiza.setFloat(1, objUsuarioDTO.getId_investimento());
                ptsmAtualiza.setString(2, objUsuarioDTO.getCpf_login());
                ptsmAtualiza.execute();
                ptsmAtualiza.close();
                
                PreparedStatement ptsmSqlAtualizaLCA = conn.prepareCall(sqlAtualizaLCA);
                ptsmSqlAtualizaLCA.setString(1, objUsuarioDTO.getCpf_login());
                ResultSet lCAResultado = ptsmSqlAtualizaLCA.executeQuery();
                if (lCAResultado.next()) {
                LCA = lCAResultado.getFloat("LCA");
                lCAResultado.close();
                ptsmSqlAtualizaLCA.close();
                objUsuarioDTO.setLcaInvest(LCA);
                
            }
                JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso!");
            } else {
                // Saldo é maior que o investimento, portanto, cancelar o Investimento
                throw new Exception("Saldo insuficiente para realizar o Investimento.");
            }
            
            if(saldo >= investimento){
                
            }else{
                throw new Exception("Falha ao atualizar");
            }
            
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RegistrarInvestimento: " + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Investimento cancelada: " + erro);
        }
    }
   
   public void AtualizaInterfaceLCA (UsuarioDTO objUsuarioDTO) throws SQLException{
       String sqlAtualizaLCA = "SELECT LCA FROM grupo4 WHERE CPF = ?";
       conn = new Conexao().conectaDB();
       float LCA = 0.0f;
       PreparedStatement ptsmSqlAtualizaLCA = conn.prepareCall(sqlAtualizaLCA);
       ptsmSqlAtualizaLCA.setString(1, objUsuarioDTO.getCpf_login());
       ResultSet lCAResultado = ptsmSqlAtualizaLCA.executeQuery();
       try {
           
           if (lCAResultado.next()) {
               LCA = lCAResultado.getFloat("LCA");
               lCAResultado.close();
               ptsmSqlAtualizaLCA.close();
               objUsuarioDTO.setLcaInvest(LCA);

       }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Investimento cancelada: " );
        }
    }
   
   public void RegistraRendaFixa(UsuarioDTO objUsuarioDTO) {
        String sql = "UPDATE grupo4 SET SALDO = SALDO - ?, RENDA_FIXA = RENDA_FIXA + ? WHERE CPF = ?;";
        String sqlSaldo = "SELECT SALDO FROM `grupo4` WHERE CPF = ?;";
        String sqlAtualizaTotalBD = "UPDATE grupo4 SET TOTAL_INVESTIDO = TOTAL_INVESTIDO + ? WHERE CPF = ?;";
        String sqlAtualizaRENDA_FIXA = "SELECT RENDA_FIXA FROM grupo4 WHERE CPF = ?";
        conn = new Conexao().conectaDB();
        try {
            // Obter saldo do banco de dados
            PreparedStatement pstmSaldo = conn.prepareStatement(sqlSaldo);
            pstmSaldo.setString(1, objUsuarioDTO.getCpf_login());
            ResultSet saldoResultado = pstmSaldo.executeQuery();
            float saldo = 0.0f;
            if (saldoResultado.next()) {
                saldo = saldoResultado.getFloat("SALDO");
            }
            saldoResultado.close();
            pstmSaldo.close();
            float investimento = objUsuarioDTO.getId_investimento();
            float RENDA_FIXA = 0.0f;

            // Verificar se o saldo é menor ou igual ao investimento
            if (saldo >= investimento) {
                // Atualizar saldo e investimento na tabela
                PreparedStatement pstmAtualizacao = conn.prepareStatement(sql);
                pstmAtualizacao.setFloat(1, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setFloat(2, objUsuarioDTO.getId_investimento());
                pstmAtualizacao.setString(3, objUsuarioDTO.getCpf_login());
                pstmAtualizacao.execute();
                pstmAtualizacao.close();
                
                PreparedStatement ptsmAtualiza = conn.prepareCall(sqlAtualizaTotalBD);
                ptsmAtualiza.setFloat(1, objUsuarioDTO.getId_investimento());
                ptsmAtualiza.setString(2, objUsuarioDTO.getCpf_login());
                ptsmAtualiza.execute();
                ptsmAtualiza.close();
                
                PreparedStatement ptsmSqlAtualizaRENDA_FIXA = conn.prepareCall(sqlAtualizaRENDA_FIXA);
                ptsmSqlAtualizaRENDA_FIXA.setString(1, objUsuarioDTO.getCpf_login());
                ResultSet rENDA_FIXAResultado = ptsmSqlAtualizaRENDA_FIXA.executeQuery();
                if (rENDA_FIXAResultado.next()) {
                RENDA_FIXA = rENDA_FIXAResultado.getFloat("RENDA_FIXA");
                rENDA_FIXAResultado.close();
                ptsmSqlAtualizaRENDA_FIXA.close();
                objUsuarioDTO.setRendaF(RENDA_FIXA);
                
            }
                JOptionPane.showMessageDialog(null, "Investimento realizado com sucesso!");
            } else {
                // Saldo é maior que o investimento, portanto, cancelar o Investimento
                throw new Exception("Saldo insuficiente para realizar o Investimento.");
            }
            
            if(saldo >= investimento){
                
            }else{
                throw new Exception("Falha ao atualizar");
            }
            
            conn.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RegistrarInvestimento: " + erro);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Investimento cancelada: " + erro);
        }
    }
   
   public void AtualizaInterfaceRENDA_FIXA (UsuarioDTO objUsuarioDTO) throws SQLException{
       String sqlAtualizaRENDA_FIXA = "SELECT RENDA_FIXA FROM grupo4 WHERE CPF = ?";
       conn = new Conexao().conectaDB();
       float RENDA_FIXA = 0.0f;
       PreparedStatement ptsmSqlAtualizaRENDA_FIXA = conn.prepareCall(sqlAtualizaRENDA_FIXA);
       ptsmSqlAtualizaRENDA_FIXA.setString(1, objUsuarioDTO.getCpf_login());
       ResultSet rENDA_FIXAResultado = ptsmSqlAtualizaRENDA_FIXA.executeQuery();
       try {
           
           if (rENDA_FIXAResultado.next()) {
               RENDA_FIXA = rENDA_FIXAResultado.getFloat("RENDA_FIXA");
               rENDA_FIXAResultado.close();
               ptsmSqlAtualizaRENDA_FIXA.close();
               objUsuarioDTO.setRendaF(RENDA_FIXA);

       }
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "Investimento cancelada: " );
        }
    }
         
}

