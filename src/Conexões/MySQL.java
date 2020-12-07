package Conexões;

import Objetos.Produto;
import java.sql.*;
import javax.swing.JOptionPane;

public class MySQL {

    // Atributos
    //--------------------------------------------------------------------------
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
    
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private String servidor = "127.0.0.1:3306";
    private String dbPess = "HS_Pess";
    private String dbProd = "HS_Prod";
    private String URL = "";
    final String URLps = "jdbc:mysql://"+ servidor +"/"+ dbPess;
    final String URLpr = "jdbc:mysql://"+ servidor +"/"+ dbProd;
    private String usuario = "root";
    private String senha = "EdEdhs29182@MySQL";
    private String passw = null;
    
    private String anome;
    private int apreço;
    private int aestoq;
    private String adescr;
    //--------------------------------------------------------------------------

    //Constructor
    //--------------------------------------------------------------------------
    public MySQL() {
    }

    public MySQL(String serv, String nBanco, String user, String senha) {
        this.servidor = serv;
        this.dbProd = nBanco;
        this.usuario = user;
        this.senha = senha;
    }
    //--------------------------------------------------------------------------
    
    //Métodos Especiais
    //--------------------------------------------------------------------------
    public Connection getConn() {
        return conn;
    }
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    public String getPassw() {
        return passw;
    }
    public void setPassw(String passw) {
        this.passw = passw;
    }

    //<editor-fold defaultstate="collapsed" desc="G-S Identificar Prod">
    public String getAnome() {
        return anome;
    }

    public void setAnome(String anome) {
        this.anome = anome;
    }

    public int getApreço() {
        return apreço;
    }

    public void setApreço(int apreço) {
        this.apreço = apreço;
    }

    public int getAestoq() {
        return aestoq;
    }

    public void setAestoq(int aestoq) {
        this.aestoq = aestoq;
    }

    public String getAdescr() {
        return adescr;
    }

    public void setAdescr(String adescr) {
        this.adescr = adescr;
    }
    //</editor-fold>
    
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    public void conectaBanco(int db){
        try {
            switch (db) {
                case 1:     URL = URLps; break;  
                case 2:     URL = URLpr; break;  
                default:    break;  
            }
            
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, usuario, senha);
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver não encontrado!\n" 
                + e.toString());
            System.out.println("Driver não encontrado!\n" 
                + e.toString());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Problema na conexão com a fonte de dados\n" 
                + e.toString());
            System.out.println("Problema na conexão com a fonte de dados\n" 
                + e.toString());
        }
    }
    
    public void entrarSQL(String SQL){
        this.passw = null;
        try {
            this.setStatement(getConn().createStatement());
            
            resultSet = this.getStatement().executeQuery(SQL);
            while (resultSet.next()) {
                this.passw = resultSet.getString("@Senha");
            }
            System.out.println(this.passw);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(this.getPassw());
        }
    }
    
    public void cadastrarSQL(String SQL, int db){
        try {
            this.setStatement(getConn().createStatement());
            this.getStatement().executeUpdate(SQL); 
            
            switch (db) {
                case 1:
                    System.out.println("Novo cliente cadastrado!");
                    break;
                case 2:
                    System.out.println("Novo produto cadastrado!");
                    break;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void identificaProd(int n) {
        try {
            String SQL = "call hs_prod.identificaProduto("+ n +");";
            
            this.setStatement(getConn().createStatement());
            resultSet = this.getStatement().executeQuery(SQL); 
            
            while (resultSet.next()) {
                this.anome = resultSet.getString("nome");
                System.out.println(this.anome);
                this.apreço = resultSet.getInt("pvenda");
                System.out.println(this.apreço);
                this.aestoq = resultSet.getInt("estoque");
                System.out.println(this.aestoq);
                this.adescr = resultSet.getString("descr");
                System.out.println(this.adescr);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void comprarProd(String SQL) {
        try {
            this.setStatement(getConn().createStatement());
            this.getStatement().executeUpdate(SQL);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean fechaBanco(){
        try {
            conn.close();
            System.out.println("Conexão encerrada!");
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
}
