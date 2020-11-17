package Objetos;

public class Pessoa {
    private int id;
    private String nome;
    private String dataN;
    private String cpf;
    private String estado;
    private String city;
    private String ende;
    private String email;
    private String passw;
    
    //Métodos Especiais
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="G-S Id">
    public int getId(){    
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Nome">
    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Data de Nascimento">
    public String getDataN() {
        return dataN;
    }
    private void setDataN(String dataN) {
        this.dataN = dataN;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S CPF">
    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Estado">
    public String getEstado() {
        return estado;
    }
    private void setEstado(String estado) {
        this.estado = estado;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Cidade">
    public String getCity() {
        return city;
    }
    private void setCity(String city) {
        this.city = city;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Endereço">
    public String getEnde() {
        return ende;
    }
    private void setEnde(String ende) {
        this.ende = ende;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S E-mail">
    public String getEmail() {
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Senha">
    public String getPassw() {
        return passw;
    }
    private void setPassw(String passw) {    
        this.passw = passw;
    }//</editor-fold>
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    
    public void novoCliente(String nome,    String dataN,   String cpf,    
                            String estado,  String city,    String end,    
                            String email,   String passw) {
        
        this.setNome(nome);
        this.setDataN(dataN);
        this.setCpf(cpf);
        this.setEstado(estado);
        this.setCity(city);
        this.setEnde(end);
        this.setEmail(email);
        this.setPassw(passw);
        
    }
    //--------------------------------------------------------------------------
}
