package Objetos;
import java.util.Date;
public class Pessoa {
    private int id;
    private String nome;
    private Date idade;
    private String cpf;
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

    public Date getIdade() {
        return idade;
    }
    private void setIdade(Date idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }
    private void setCpf(String cpf) {
        this.cpf = cpf;
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
