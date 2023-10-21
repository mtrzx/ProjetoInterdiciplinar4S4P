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
    private static String id_cpfDestinatario;    
    public static int id_contaDestinatario;
    private static int id_agenciaDestinatario;
    private String id_tipoPix = "PIX";
    private String id_TipoTD = "TED/DOC";
    public String tipo_CDI = "CDI";
    public String tipo_CDB = "CDB";
    public String tipo_LCA = "LCA";
    public String tipo_RendaFixa = "RENDA FIXA";
    
    //Variaveis para o cadastro
    private String id_CadastCPF;
    private String id_CadastSenha;
    private String id_CadastNome;
    public String id_CadastEndereco;
    public static String id_CadastDate;
    private int id_CadastAgencia;
    private int id_CadastConta;
    private String id_CadastEmail;    
    //Variaveis para o cadastro
    
    private int idade;
    private static String cpf_login;
    public static float cdiInvest;
    public static float cdbInvest;
    public static float lcaInvest;
    public static float rendaF;
    public static float inputResgate;
    public static String dataDto;
    
    ////////////////////    
    public float valorInvestido;
    public float valorResgatado;
    public String tipoDeInvestimento;
    public String tipoDeResgate;
    public String dataInvestimento;
    public String dataResgate;
    ////////////////////
    
    public String chavePIX;
    public static String chavePIXalt;
    public static String chavePixBD;
    public static boolean chaveDup;
    
    ////////////////////
    public static String senhaBancoDeDados;
    public static boolean DestinatarioEncontrado;
    public static boolean DestinatarioEncontradoTD;
    public static int contaSelf;
    public static int agenciaSelf;
    public static String dataDtoTransf;
    public static String pixSelf;
    
    public String tableid_cpfDestinatario;
    public String tableid_chavePixDestinatario;
    public int tableid_contaDestinatario;
    public int tableid_agenciaDestinatario;
    public String tableid_dataPix;
    public String tableid_dataTD;
    
    /////////////////////////////////

    public String cpf_Remetente;
    public String data_Remetente;
    public float valor_Remetente;
    public String tipoTransf_Remetente;
    
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
     * @return the id_CadastEndereco
     */
    public String getId_CadastEndereco() {
        return id_CadastEndereco;
    }

    /**
     * @param id_CadastEndereco the id_CadastEndereco to set
     */
    public void setId_CadastEndereco(String id_CadastEndereco) {
        this.id_CadastEndereco = id_CadastEndereco;
    }

    /**
     * @return the id_CadastDate
     */
    public String getId_CadastDate() {
        return id_CadastDate;
    }

    /**
     * @param id_CadastDate the id_CadastDate to set
     */
    public void setId_CadastDate(String id_CadastDate) {
        this.id_CadastDate = id_CadastDate;
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
     * @return the senhaBancoDeDados
     */
    public String getSenhaBancoDeDados() {
        return senhaBancoDeDados;
    }

    /**
     * @param senhaBancoDeDados the senhaBancoDeDados to set
     */
    public void setSenhaBancoDeDados(String senhaBancoDeDados) {
        this.senhaBancoDeDados = senhaBancoDeDados;
    }

    /**
     * @return the DestinatarioEncontrado
     */
    public boolean isDestinatarioEncontrado() {
        return DestinatarioEncontrado;
    }

    /**
     * @param DestinatarioEncontrado the DestinatarioEncontrado to set
     */
    public void setDestinatarioEncontrado(boolean DestinatarioEncontrado) {
        this.DestinatarioEncontrado = DestinatarioEncontrado;
    }

    /**
     * @return the DestinatarioEncontradoTD
     */
    public static boolean isDestinatarioEncontradoTD() {
        return DestinatarioEncontradoTD;
    }

    /**
     * @param aDestinatarioEncontradoTD the DestinatarioEncontradoTD to set
     */
    public static void setDestinatarioEncontradoTD(boolean aDestinatarioEncontradoTD) {
        DestinatarioEncontradoTD = aDestinatarioEncontradoTD;
    }

    /**
     * @return the contaSelf
     */
    public static int getContaSelf() {
        return contaSelf;
    }

    /**
     * @param aContaSelf the contaSelf to set
     */
    public static void setContaSelf(int aContaSelf) {
        contaSelf = aContaSelf;
    }

    /**
     * @return the agenciaSelf
     */
    public static int getAgenciaSelf() {
        return agenciaSelf;
    }

    /**
     * @param aAgenciaSelf the agenciaSelf to set
     */
    public static void setAgenciaSelf(int aAgenciaSelf) {
        agenciaSelf = aAgenciaSelf;
    }

    /**
     * @return the tableid_cpfDestinatario
     */
    public String getTableid_cpfDestinatario() {
        return tableid_cpfDestinatario;
    }

    /**
     * @param tableid_cpfDestinatario the tableid_cpfDestinatario to set
     */
    public void setTableid_cpfDestinatario(String tableid_cpfDestinatario) {
        this.tableid_cpfDestinatario = tableid_cpfDestinatario;
    }

    /**
     * @return the tableid_contaDestinatario
     */
    public int getTableid_contaDestinatario() {
        return tableid_contaDestinatario;
    }

    /**
     * @param tableid_contaDestinatario the tableid_contaDestinatario to set
     */
    public void setTableid_contaDestinatario(int tableid_contaDestinatario) {
        this.tableid_contaDestinatario = tableid_contaDestinatario;
    }

    /**
     * @return the tableid_agenciaDestinatario
     */
    public int getTableid_agenciaDestinatario() {
        return tableid_agenciaDestinatario;
    }

    /**
     * @param tableid_agenciaDestinatario the tableid_agenciaDestinatario to set
     */
    public void setTableid_agenciaDestinatario(int tableid_agenciaDestinatario) {
        this.tableid_agenciaDestinatario = tableid_agenciaDestinatario;
    }

    /**
     * @return the dataDtoTransf
     */
    public static String getDataDtoTransf() {
        return dataDtoTransf;
    }

    /**
     * @param aDataDtoTransf the dataDtoTransf to set
     */
    public static void setDataDtoTransf(String aDataDtoTransf) {
        dataDtoTransf = aDataDtoTransf;
    }

    /**
     * @return the tableid_dataPix
     */
    public String getTableid_dataPix() {
        return tableid_dataPix;
    }

    /**
     * @param tableid_dataPix the tableid_dataPix to set
     */
    public void setTableid_dataPix(String tableid_dataPix) {
        this.tableid_dataPix = tableid_dataPix;
    }

    /**
     * @return the tableid_dataTD
     */
    public String getTableid_dataTD() {
        return tableid_dataTD;
    }

    /**
     * @param tableid_dataTD the tableid_dataTD to set
     */
    public void setTableid_dataTD(String tableid_dataTD) {
        this.tableid_dataTD = tableid_dataTD;
    }    

    /**
     * @return the valorInvestido
     */
    public float getValorInvestido() {
        return valorInvestido;
    }

    /**
     * @param valorInvestido the valorInvestido to set
     */
    public void setValorInvestido(float valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    /**
     * @return the valorResgatado
     */
    public float getValorResgatado() {
        return valorResgatado;
    }

    /**
     * @param valorResgatado the valorResgatado to set
     */
    public void setValorResgatado(float valorResgatado) {
        this.valorResgatado = valorResgatado;
    }

    /**
     * @return the tipoDeInvestimento
     */
    public String getTipoDeInvestimento() {
        return tipoDeInvestimento;
    }

    /**
     * @param tipoDeInvestimento the tipoDeInvestimento to set
     */
    public void setTipoDeInvestimento(String tipoDeInvestimento) {
        this.tipoDeInvestimento = tipoDeInvestimento;
    }

    /**
     * @return the tipoDeResgate
     */
    public String getTipoDeResgate() {
        return tipoDeResgate;
    }

    /**
     * @param tipoDeResgate the tipoDeResgate to set
     */
    public void setTipoDeResgate(String tipoDeResgate) {
        this.tipoDeResgate = tipoDeResgate;
    }

    /**
     * @return the dataInvestimento
     */
    public String getDataInvestimento() {
        return dataInvestimento;
    }

    /**
     * @param dataInvestimento the dataInvestimento to set
     */
    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    /**
     * @return the dataResgate
     */
    public String getDataResgate() {
        return dataResgate;
    }

    /**
     * @param dataResgate the dataResgate to set
     */
    public void setDataResgate(String dataResgate) {
        this.dataResgate = dataResgate;
    }

    /**
     * @return the chavePIX
     */
    public String getChavePIX() {
        return chavePIX;
    }

    /**
     * @param chavePIX the chavePIX to set
     */
    public void setChavePIX(String chavePIX) {
        this.chavePIX = chavePIX;
    }

    /**
     * @return the chavePIXalt
     */
    public String getChavePIXalt() {
        return chavePIXalt;
    }

    /**
     * @param chavePIXalt the chavePIXalt to set
     */
    public void setChavePIXalt(String chavePIXalt) {
        this.chavePIXalt = chavePIXalt;
    }

    /**
     * @return the chaveDup
     */
    public boolean isChaveDup() {
        return chaveDup;
    }

    /**
     * @param chaveDup the chaveDup to set
     */
    public void setChaveDup(boolean chaveDup) {
        this.chaveDup = chaveDup;
    }

    /**
     * @return the chavePixBD
     */
    public static String getChavePixBD() {
        return chavePixBD;
    }

    /**
     * @param aChavePixBD the chavePixBD to set
     */
    public static void setChavePixBD(String aChavePixBD) {
        chavePixBD = aChavePixBD;
    }

    /**
     * @return the tableid_chavePixDestinatario
     */
    public String getTableid_chavePixDestinatario() {
        return tableid_chavePixDestinatario;
    }

    /**
     * @param tableid_chavePixDestinatario the tableid_chavePixDestinatario to set
     */
    public void setTableid_chavePixDestinatario(String tableid_chavePixDestinatario) {
        this.tableid_chavePixDestinatario = tableid_chavePixDestinatario;
    }

    /**
     * @return the pixSelf
     */
    public static String getPixSelf() {
        return pixSelf;
    }

    /**
     * @param aPixSelf the pixSelf to set
     */
    public static void setPixSelf(String aPixSelf) {
        pixSelf = aPixSelf;
    }

    /**
     * @return the cpf_Remetente
     */
    public String getCpf_Remetente() {
        return cpf_Remetente;
    }

    /**
     * @param cpf_Remetente the cpf_Remetente to set
     */
    public void setCpf_Remetente(String cpf_Remetente) {
        this.cpf_Remetente = cpf_Remetente;
    }

    /**
     * @return the data_Remetente
     */
    public String getData_Remetente() {
        return data_Remetente;
    }

    /**
     * @param data_Remetente the data_Remetente to set
     */
    public void setData_Remetente(String data_Remetente) {
        this.data_Remetente = data_Remetente;
    }

    /**
     * @return the valor_Remetente
     */
    public float getValor_Remetente() {
        return valor_Remetente;
    }

    /**
     * @param valor_Remetente the valor_Remetente to set
     */
    public void setValor_Remetente(float valor_Remetente) {
        this.valor_Remetente = valor_Remetente;
    }

    /**
     * @return the tipoTransf_Remetente
     */
    public String getTipoTransf_Remetente() {
        return tipoTransf_Remetente;
    }

    /**
     * @param tipoTransf_Remetente the tipoTransf_Remetente to set
     */
    public void setTipoTransf_Remetente(String tipoTransf_Remetente) {
        this.tipoTransf_Remetente = tipoTransf_Remetente;
    }

}

