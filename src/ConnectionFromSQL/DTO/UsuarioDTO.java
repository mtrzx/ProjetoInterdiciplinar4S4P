package ConnectionFromSQL.DTO;

public class UsuarioDTO {

    
    public int id_agencia;
    public int id_conta;
    private String id_senha;
    private String id_CPF;
    private String id_nome;
    private String id_email;
    private static float id_saldo;
    private static float id_investimento;
    private float id_InvestTotal;
    public float id_valorTransTED;
    private float id_valorTransPix;
    private String id_cpfDestinatario;
    public int id_contaDestinatario;
    private int id_agenciaDestinatario;
    private String id_tipoPix = "PIX";
    private String id_TipoTD = "TED/DOC";
    public String tipo_CDI = "CDI";
    public String tipo_CDB = "CDB";
    public String tipo_LCA = "LCA";
    public String tipo_RendaFixa = "RENDA_FIXA";
    private String id_CadastCPF;
    private String id_CadastSenha;
    private String id_CadastNome;
    private int id_CadastAgencia;
    private int id_CadastConta;
    private String id_CadastEmail;
    private int idade;
    private static String cpf_login;
    public static float cdiInvest;
    public static float cdbInvest;
    public static float lcaInvest;
    public static float rendaF;
    public static float inputResgate;
    public static String dataDto;
    public String tipoAtivo;
    public float valorAtivo;
    public String dataAtivo;
    
    
    /////////////////////////////////

    public String getCpf_login() {
        return cpf_login;
    }

    public void setCpf_login(String cpf_login) {
        this.cpf_login = cpf_login;
    }
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
        return this.id_CPF;
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
        
    /**
     * @return the id_valorTransTED
     */
    public float getId_valorTransTED() {
        return id_valorTransTED;
    }

    /**
     * @param id_valorTransTED the id_valorTransTED to set
     */
    public void setId_valorTransTED(float id_valorTransTED) {
        this.id_valorTransTED = id_valorTransTED;
    }

    /**
     * @return the id_cpfDestinatario
     */
    public String getId_cpfDestinatario() {
        return id_cpfDestinatario;
    }

    /**
     * @param id_cpfDestinatario the id_cpfDestinatario to set
     */
    public void setId_cpfDestinatario(String id_cpfDestinatario) {
        this.id_cpfDestinatario = id_cpfDestinatario;
    }

    /**
     * @return the id_valorTransPix
     */
    public float getId_valorTransPix() {
        return id_valorTransPix;
    }

    /**
     * @param id_valorTransPix the id_valorTransPix to set
     */
    public void setId_valorTransPix(float id_valorTransPix) {
        this.id_valorTransPix = id_valorTransPix;
    }

    /**
     * @return the id_contaDestinatario
     */
    public int getId_contaDestinatario() {
        return id_contaDestinatario;
    }

    /**
     * @param id_contaDestinatario the id_contaDestinatario to set
     */
    public void setId_contaDestinatario(int id_contaDestinatario) {
        this.id_contaDestinatario = id_contaDestinatario;
    }

    /**
     * @return the id_agenciaDestinatario
     */
    public int getId_agenciaDestinatario() {
        return id_agenciaDestinatario;
    }

    /**
     * @param id_agenciaDestinatario the id_agenciaDestinatario to set
     */
    public void setId_agenciaDestinatario(int id_agenciaDestinatario) {
        this.id_agenciaDestinatario = id_agenciaDestinatario;
    }

    /**
     * @return the id_tipoPix
     */
    public String getId_tipoPix() {
        return id_tipoPix;
    }

    /**
     * @return the id_TipoTD
     */
    public String getId_TipoTD() {
        return id_TipoTD;
    }

    /**
     * @return the id_CadastCPF
     */
    public String getId_CadastCPF() {
        return id_CadastCPF;
    }

    /**
     * @param id_CadastCPF the id_CadastCPF to set
     */
    public void setId_CadastCPF(String id_CadastCPF) {
        this.id_CadastCPF = id_CadastCPF;
    }

    /**
     * @return the id_CadastSenha
     */
    public String getId_CadastSenha() {
        return id_CadastSenha;
    }

    /**
     * @param id_CadastSenha the id_CadastSenha to set
     */
    public void setId_CadastSenha(String id_CadastSenha) {
        this.id_CadastSenha = id_CadastSenha;
    }

    /**
     * @return the id_CadastNome
     */
    public String getId_CadastNome() {
        return id_CadastNome;
    }

    /**
     * @param id_CadastNome the id_CadastNome to set
     */
    public void setId_CadastNome(String id_CadastNome) {
        this.id_CadastNome = id_CadastNome;
    }

    /**
     * @return the id_CadastAgencia
     */
    public int getId_CadastAgencia() {
        return id_CadastAgencia;
    }

    /**
     * @param id_CadastAgencia the id_CadastAgencia to set
     */
    public void setId_CadastAgencia(int id_CadastAgencia) {
        this.id_CadastAgencia = id_CadastAgencia;
    }

    /**
     * @return the id_CadastConta
     */
    public int getId_CadastConta() {
        return id_CadastConta;
    }

    /**
     * @param id_CadastConta the id_CadastConta to set
     */
    public void setId_CadastConta(int id_CadastConta) {
        this.id_CadastConta = id_CadastConta;
    }

    /**
     * @return the id_CadastEmail
     */
    public String getId_CadastEmail() {
        return id_CadastEmail;
    }

    /**
     * @param id_CadastEmail the id_CadastEmail to set
     */
    public void setId_CadastEmail(String id_CadastEmail) {
        this.id_CadastEmail = id_CadastEmail;
    }
    
    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the cdiInvest
     */
    public float getCdiInvest() {
        return cdiInvest;
    }

    /**
     * @param cdiInvest the cdiInvest to set
     */
    public void setCdiInvest(float cdiInvest) {
        this.cdiInvest = cdiInvest;
    }

    /**
     * @return the cdbInvest
     */
    public float getCdbInvest() {
        return cdbInvest;
    }

    /**
     * @param cdbInvest the cdbInvest to set
     */
    public void setCdbInvest(float cdbInvest) {
        this.cdbInvest = cdbInvest;
    }

    /**
     * @return the lcaInvest
     */
    public float getLcaInvest() {
        return lcaInvest;
    }

    /**
     * @param lcaInvest the lcaInvest to set
     */
    public void setLcaInvest(float lcaInvest) {
        this.lcaInvest = lcaInvest;
    }

    /**
     * @return the rendaF
     */
    public float getRendaF() {
        return rendaF;
    }

    /**
     * @param rendaF the rendaF to set
     */
    public void setRendaF(float rendaF) {
        this.rendaF = rendaF;
    }

    /**
     * @return the inputResgate
     */
    public float getInputResgate() {
        return inputResgate;
    }

    /**
     * @param inputResgate the inputResgate to set
     */
    public void setInputResgate(float inputResgate) {
        this.inputResgate = inputResgate;
    }
    
    /**
     * @return the dataDto
     */
    public static String getDataDto() {
        return dataDto;
    }

    /**
     * @param aDataDto the dataDto to set
     */
    public static void setDataDto(String aDataDto) {
        dataDto = aDataDto;
    }   

    /**
     * @return the tipo_CDI
     */
    public String getTipo_CDI() {
        return tipo_CDI;
    }

    /**
     * @return the tipo_CDB
     */
    public String getTipo_CDB() {
        return tipo_CDB;
    }

    /**
     * @return the tipo_LCA
     */
    public String getTipo_LCA() {
        return tipo_LCA;
    }

    /**
     * @return the tipo_RendaFixa
     */
    public String getTipo_RendaFixa() {
        return tipo_RendaFixa;
    }

    /**
     * @return the tipoAtivo
     */
    public String getTipoAtivo() {
        return tipoAtivo;
    }

    /**
     * @param tipoAtivo the tipoAtivo to set
     */
    public void setTipoAtivo(String tipoAtivo) {
        this.tipoAtivo = tipoAtivo;
    }

    /**
     * @return the valorAtivo
     */
    public float getValorAtivo() {
        return valorAtivo;
    }

    /**
     * @param valorAtivo the valorAtivo to set
     */
    public void setValorAtivo(float valorAtivo) {
        this.valorAtivo = valorAtivo;
    }

    /**
     * @return the dataAtivo
     */
    public String getDataAtivo() {
        return dataAtivo;
    }

    /**
     * @param dataAtivo the dataAtivo to set
     */
    public void setDataAtivo(String dataAtivo) {
        this.dataAtivo = dataAtivo;
    }
}

