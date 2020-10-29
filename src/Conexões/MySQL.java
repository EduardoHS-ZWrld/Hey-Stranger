package Conexões;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQL {

    // Atributos
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
    
    final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private String servidor = "127.0.0.1:3306";
    private String nomeDoBanco = "PessoaStranger";
    final String URL = "jdbc:mysql://"+ servidor +"/"+ nomeDoBanco;
    private String usuario = "root";
    private String senha = "EdEdhs29182@MySQL";

    public MySQL() {
    }

    public MySQL(String serv, String nBanco, String user, String senha) {
        this.servidor = serv;
        this.nomeDoBanco = nBanco;
        this.usuario = user;
        this.senha = senha;
    }
    
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
    
    public void conectaBanco(){
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, usuario, senha);
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
        public int insertSQL(String SQL){
        int status = 0;
        try {
            this.setStatement(getConn().createStatement());
            
            this.getStatement().executeUpdate(SQL);            
        
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }
    
        public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
}
