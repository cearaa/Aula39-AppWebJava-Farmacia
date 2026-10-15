package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection;
    public static void closeConnection(){
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (Exception e) {
            System.out.println("Erros: " + e.getMessage());
        }
    }
    public static Connection getConnection(){
        try{
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //busca dadosde conexão nas variaveis de ambiente
            String url = System.getenv("DB_URL");
            String user = System.getenv("DB_USER");
            String pass = System.getenv("DB_PASS");
            if (url == null || user == null || pass == null) {
                throw new RuntimeException("Variaveis de ambiente do banco não configuradas");
            }
            connection = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            System.out.println("Erro de SQL: " + e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println("Erro nome da classe: " + e.getMessage());
        }
        return connection;
    }
}