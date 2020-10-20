package Objetos;
public class Produto {
    private int pnum;
    private String nome;
    private float preço;
    private int estoque;
    private String depart;
    
    //Métodos Especiais
    //--------------------------------------------------------------------------
    public int getPnum() {
        return pnum;
    }
    private void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreço() {
        return preço;
    }
    private void setPreço(float preço) {
        this.preço = preço;
    }

    public int getEstoque() {
        return estoque;
    }
    private void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getDepart() {
        return depart;
    }
    private void setDepart(String depart) {
        this.depart = depart;
    }
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    private void View(){
        System.out.println("------------------------");
        System.out.println(getNome() + "            " + getPreço());
    }
    //--------------------------------------------------------------------------
}
