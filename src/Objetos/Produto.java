package Objetos;
public class Produto {
    private int pnum;
    private String nome;
    private int pvenda;
    private int pcusto;
    private int estoque;
    private int depart;
    private String imagem;
    private String descr;
    
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
    public void setPvenda(int pVenda) {
        this.pvenda = pVenda;
    }//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S pCusto">
    public double getPcusto() {
        return pcusto;
    }
    public void setPcusto(int pCusto) {
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
    public int getDepart() {
        return depart;
    }
    private void setDepart(int depart) {
        this.depart = depart;
    }   //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Imagem">
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }   //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="G-S Descrição">
    public String getDescr() {
        return descr;
    }
    public void setDescr(String descr) {
        this.descr = descr;
    }   //</editor-fold>
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    public void NewProduto(String nome,     int pvenda,     int pcusto,
                           int estoque,     int depart,     String imagem,
                           String descr) {
        
        this.setNome(nome);
        this.setPvenda(pvenda);
        this.setPcusto(pcusto);
        this.setEstoque(estoque);
        this.setDepart(depart);
        this.setImagem(imagem);
        this.setDescr(descr);
    }
    
    private void ViewProd(Produto prod){
        
    }
    //--------------------------------------------------------------------------
}
