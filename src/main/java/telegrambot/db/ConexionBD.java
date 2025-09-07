package telegrambot.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionBD {
    private static final String URL = System.getenv("DB_URL");
    private static final String USER = System.getenv("DB_USER");
    private static final String PASS = System.getenv("DB_PWD");

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            throw new RuntimeException("Error al conectar a PostgreSQL en Render", e);
        }
    }
}
