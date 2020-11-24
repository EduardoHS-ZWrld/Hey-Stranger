package Objetos;
public class Produto {
    private int pnum;
    private String nome;
    private double pvenda;
    private double pcusto;
    private int estoque;
    private String depart;
    private String imagem;
    
    //Métodos Especiais
    //--------------------------------------------------------------------------
    //<editor-fold defaultstate="collapsed" desc="G-S Pnum">
    public int getPnum() {
        return pnum;
    }
    private void setPnum(int pnum) {
        this.pnum = pnum;
    }   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="G-S Nome">
    public String getNome() {
        return nome;
    }
    private void setNome(String nome) {
        this.nome = nome;
    }   
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="G-S pVenda">
    public double getPvenda() {
        return pvenda;
    }
    public void setPvenda(double pVenda) {
        this.pvenda = pVenda;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S pCusto">
    public double getPcusto() {
        return pcusto;
    }
    public void setPcusto(double pCusto) {
        this.pcusto = pCusto;
    }   //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="G-S Estoque">
    public int getEstoque() {
        return estoque;
    }
    private void setEstoque(int estoque) {
        this.estoque = estoque;
    }   //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Departamento">
    public String getDepart() {
        return depart;
    }
    private void setDepart(String depart) {
        this.depart = depart;
    }   //</editor-fold>
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    private void ViewProd(Produto prod){
        
    }
    //--------------------------------------------------------------------------
}
