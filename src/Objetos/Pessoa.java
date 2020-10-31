package Objetos;
import java.util.Date;
public class Pessoa {
    private int id;
    private String nome;
    private Date dataN;
    private String cpf;
    private String estado;
    private String city;
    private String end;
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

    public Date getDataN() {
        return dataN;
    }
    private void setDataN(Date dataN) {
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

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEnd() {
        return end;
    }
    private void setEnd(String end) {
        this.end = end;
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
    private void Comprar() {
        
    }
    //--------------------------------------------------------------------------
}
