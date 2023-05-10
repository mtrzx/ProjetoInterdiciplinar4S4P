package ConnectionFromSQL.DTO;

public class UsuarioDTO {

    public int id_agencia;
    public int id_conta;
    public String id_senha;
    public String id_CPF;
    public String id_nome;
    public String id_email;
    public float id_saldo;
    public float id_investimento;
    public float id_InvestTotal;
    
    /////////////////////////////////
    
    public float getId_saldo() {
        return id_saldo;
    }

    public void setId_saldo(float id_saldo) {
        this.id_saldo = id_saldo;
    }
    
    public int getId_agencia() {
        return id_agencia;
    }

    public void setId_agencia(int id_agencia) {
        this.id_agencia = id_agencia;
    }

    public int getId_conta() {
        return id_conta;
    }

    public void setId_conta(int id_conta) {
        this.id_conta = id_conta;
    }
    
    public String getId_nome() {
        return id_nome;
    }

    public void setId_nome(String id_nome) {
        this.id_nome = id_nome;
    }

    public String getId_email() {
        return id_email;
    }

    public void setId_email(String id_email) {
        this.id_email = id_email;
    }

    public String getId_senha() {
        return id_senha;
    }

    public void setId_senha(String id_senha) {
        this.id_senha = id_senha;
    }

    public String getId_CPF() {
        return id_CPF;
    }

    public void setId_CPF(String id_CPF) {
        this.id_CPF = id_CPF;
    }
    
    public float getId_investimento() {
        return id_investimento;
    }

    public void setId_investimento(float id_investimento) {
        this.id_investimento = id_investimento;
    }

    /**
     * @return the id_InvestTotal
     */
    public float getId_InvestTotal() {
        return id_InvestTotal;
    }

    /**
     * @param id_InvestTotal the id_InvestTotal to set
     */
    public void setId_InvestTotal(float id_InvestTotal) {
        this.id_InvestTotal = id_InvestTotal;
    }
}

