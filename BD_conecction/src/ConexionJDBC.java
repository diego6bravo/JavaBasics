import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionJDBC {
    public static void main(String[] args) {
        Connection connection = null;

        try {
            // Definir los detalles de la conexión
            String url = "jdbc:mysql://localhost:3306/nueva_bdjava";
            String usuario = "admin";
            String contraseña = "";
            // Establecer la conexión
            connection = DriverManager.getConnection(url, usuario, contraseña);

            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                // Aquí puedes realizar operaciones en la base de datos
                String createTableSQL = "CREATE TABLE IF NOT EXISTS usuarios ("
                        + "id INT AUTO_INCREMENT PRIMARY KEY,"
                        + "nombre VARCHAR(255) NOT NULL,"
                        + "email VARCHAR(255) NOT NULL"
                        + ")";
                try (Statement statement = connection.createStatement()) {
                    // Ejecutar la consulta SQL para crear la tabla
                    statement.executeUpdate(createTableSQL);
                    System.out.println("Tabla 'usuarios' creada o actualizada correctamente.");
                }

            } else {
                System.out.println("No se pudo conectar a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error de SQL: " + e.getMessage());
        }
        finally {
            // Cerrar la conexión cuando hayas terminado
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}