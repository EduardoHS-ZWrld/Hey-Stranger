package Conexões;

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
    private String nomeDoBanco = "HeyStranger";
    final String URL = "jdbc:mysql://"+ servidor +"/"+ nomeDoBanco;
    private String usuario = "root";
    private String senha = "EdEdhs29182@MySQL";
    private String passw = null;
    //--------------------------------------------------------------------------

    //Constructor
    //--------------------------------------------------------------------------
    public MySQL() {
    }

    public MySQL(String serv, String nBanco, String user, String senha) {
        this.servidor = serv;
        this.nomeDoBanco = nBanco;
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
    //--------------------------------------------------------------------------
    
    //Métodos
    //--------------------------------------------------------------------------
    public void conectaBanco(){
        try {
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
            System.out.println(this.passw);
        }
    }
    
    public void cadastrarSQL(String SQL){
        try {
            this.setStatement(getConn().createStatement());
            
            resultSet = this.getStatement().executeQuery(SQL);
            while (resultSet.next()) {
                this.passw = resultSet.getString("@Senha");
            }
            System.out.println(this.passw);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(this.passw);
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
