package h2.transaccionesPacientes;

import h2.transacciones.Usuario;

import java.sql.*;

public class TestPaciente {
    private static  final String SQL_TABLE_CREATE = "DROP TABLE IF EXISTS PACIENTES; CREATE TABLE PACIENTES ("
            +"ID INT AUTO_INCREMENT PRIMARY KEY,"
            +"NOMBRE varchar(100) NOT NULL,"
            +"APELLIDO varchar(100) NOT NULL,"
            +"DOMICILIO varchar(100) NOT NULL,"
            +"DNI varchar(7) NOT NULL,"
            +"FECHA_ALTA DATE NOT NULL,"
            +"USUARIO varchar(10) NOT NULL,"
            +"PASSWORD varchar(20) NOT NULL"
            +")";

    private static final String SQL_INSERT = "INSERT INTO PACIENTES(NOMBRE, APELLIDO, DOMICILIO, DNI, FECHA_ALTA, USUARIO, PASSWORD) VALUES(?, ?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE PACIENTES SET PASSWORD = ? WHERE ID = ?";


    public static void main(String[] args) throws Exception {
        Paciente paciente = new Paciente("Juan","Perez", "Calle 123","1234567",Date.valueOf("2024-05-12"),"usuario1","password1");
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_TABLE_CREATE);

            PreparedStatement psInsert = connection.prepareStatement(SQL_INSERT);

            // EMPIEZO A INSERTAR EN LA BD
            psInsert.setInt(1,1);
            psInsert.setString(1, paciente.getNombre());
            psInsert.setString(2, paciente.getApellido());
            psInsert.setString(3, paciente.getDomicilio());
            psInsert.setString(4, paciente.getDni());
            psInsert.setDate(5, paciente.getFechaAlta()); // Fecha de alta
            psInsert.setString(6, paciente.getUsuario());
            psInsert.setString(7, paciente.getPassword());

            psInsert.execute();

            // EMPIEZO LA TRANSACCION
            connection.setAutoCommit(false);

            // Imprimir la contraseña actual del paciente
            System.out.println("Contraseña actual del paciente: " + paciente.getPassword());

            // Actualizar la contraseña del paciente
            PreparedStatement psUpdate = connection.prepareStatement(SQL_UPDATE);
            psUpdate.setString(1, "nuevaPassword");
            psUpdate.setInt(2, 1);

            // Imprimir la contraseña que voy a poner al paciente
            System.out.println("Contraseña que cambiará del paciente: " + "nuevaPassword");
            psUpdate.execute();

            //generar una excepción (throw new Exception)
            int a=4/0;


            connection.commit();
            connection.setAutoCommit(true);

            // Verificar que el paciente existe y que la contraseña se mantuvo
            String sql = "SELECT * FROM PACIENTES WHERE USUARIO = ?";
            PreparedStatement psSelect = connection.prepareStatement(sql);
            psSelect.setString(1, paciente.getUsuario());
            ResultSet rs = psSelect.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("ID") + ", Nombre: " + rs.getString("NOMBRE") + ", Apellido: " + rs.getString("APELLIDO") + ", Password: " + rs.getString("PASSWORD"));
            }

        } catch (Exception e){
            e.printStackTrace();
                connection.rollback();
        }finally {

                connection.close();

        }

        Connection connection1 = getConnection();
        String sql = "SELECT * FROM PACIENTES WHERE USUARIO = ?";
        PreparedStatement psSelect = connection1.prepareStatement(sql);
        psSelect.setString(1, paciente.getUsuario());
        ResultSet rs = psSelect.executeQuery();
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("ID") + ", Nombre: " + rs.getString("NOMBRE") + ", Apellido: " + rs.getString("APELLIDO") + ", Password: " + rs.getString("PASSWORD"));
        }

    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/my","f","myPassword");
    }

}
