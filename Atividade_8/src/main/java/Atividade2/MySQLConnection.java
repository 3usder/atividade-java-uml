package Atividade2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_musicas_e2";
    private static final String USER = "root"; // SEU USUÁRIO
    private static final String PASSWORD = "5e5d3rElder@"; // SUA SENHA

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("✅ Driver MySQL carregado!");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Erro ao carregar driver: " + e.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}