import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class OperacionesBasesDeDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/java8";
    private static final String USUARIO = "admin";
    private static final String CONTRASENA = "";

    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        System.out.println("introduza el nombre del usuario: ");
        Scanner sc = new Scanner(System.in);
        usuario.setNombre(sc.nextLine());

        try (Connection connection = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Crear una nueva tabla
            // crearTablaUsuarios(connection);

            // Insertar un nuevo usuario
            insertarUsuario(connection, usuario.getNombre(), "Pablo123@example.com");

            // Leer todos los usuarios
            leerUsuarios(connection);

            // Actualizar un usuario
            //actualizarUsuario(connection, 8, "Pedro",
                   // "pedro@gmail.com");

            // Eliminar un usuario
            // eliminarUsuario(connection, 5);

        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        }
    }

    public static void crearTablaUsuarios(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INT AUTO_INCREMENT PRIMARY KEY,"
                + "nombre VARCHAR(255) NOT NULL,"
                + "email VARCHAR(255) NOT NULL"
                + ")";
        try (PreparedStatement statement = connection.prepareStatement(createTableSQL)) {
            statement.executeUpdate();
            System.out.println("Tabla 'usuarios' creada o actualizada correctamente.");
        }
    }

    public static void insertarUsuario(Connection connection, String nombre, String email) throws SQLException {
        String insertSQL = "INSERT INTO usuarios (nombre, email) VALUES (? , ? )";
        try (PreparedStatement statement = connection.prepareStatement(insertSQL)) {
            statement.setString(1, nombre);
            statement.setString(2, email);
            statement.setString(2, email);
            statement.executeUpdate();
            System.out.println("Nuevo usuario insertado en la tabla 'usuarios'.");
        }
    }

    public static void leerUsuarios(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM usuarios";
        try (PreparedStatement statement = connection.prepareStatement(selectSQL);
                ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String email = resultSet.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }
        }
    }

    public static void actualizarUsuario(Connection connection, int id, String nuevoNombre, String nuevoEmail)
            throws SQLException {
        String updateSQL = "UPDATE usuarios SET nombre = ?, email = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(updateSQL)) {
            statement.setString(1, nuevoNombre);
            statement.setString(2, nuevoEmail);
            statement.setInt(3, id);
            int modificaciones = statement.executeUpdate();
            if (modificaciones > 0)
                System.out.println("Se realizaron " + modificaciones + " modificaciones.");
            else
                System.out.println("No se realizaron modificaciones");
        }
    }

    public static void eliminarUsuario(Connection connection, int id) throws SQLException {
        String deleteSQL = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(deleteSQL)) {
            statement.setInt(1, id);
            int modificaciones = statement.executeUpdate();
            if (modificaciones > 0)
                System.out.println("Se realizaron " + modificaciones + " modificaciones.");
            else
                System.out.println("No se realizaron modificaciones");
        }
    }
}