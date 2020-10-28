package Conexões;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQL {

    // Atributos
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
    
    private String servidor = "127.0.0.1:3306";
    private String nomeDoBanco = "banco_loja";
    private String usuario = "marcio";
    private String senha = "root";

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
    
    
}
