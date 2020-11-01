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
    public int getId(){    
        return id;
    }
    private void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataN() {
        return dataN;
    }
    private void setDataN(String dataN) {
        this.dataN = dataN;
    }

    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getEnde() {
        return ende;
    }
    private void setEnde(String ende) {
        this.ende = ende;
    }

    public String getEmail() {
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassw() {
        return passw;
    }
    private void setPassw(String passw) {    
        this.passw = passw;
    }
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    
    public void novoCliente(String nome, String dataN, String cpf, String estado, 
                            String city, String end, String email, String passw) {
        
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
