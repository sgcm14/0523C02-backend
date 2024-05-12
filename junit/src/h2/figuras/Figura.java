package h2.figuras;

import java.sql.*;

public class Figura {

    public static void main(String[] args) {
        //crear una conexion
        Connection connection= null;
        try{
            connection=getConnection(); //traigo la conexion
            Statement statement= connection.createStatement(); //encargado de llevar el mundo de los objetos a las tablas
            statement.execute("DROP TABLE IF EXISTS FIGURAS; CREATE TABLE FIGURAS" +
                    "(id INT AUTO_INCREMENT PRIMARY KEY, tipo VARCHAR(50) NOT NULL, color VARCHAR(50) NOT NULL)");

            // Insertar círculos y cuadrados
            insertarFigura(statement, "circulo", "rojo");
            insertarFigura(statement, "circulo", "azul");
            insertarFigura(statement, "cuadrado", "verde");
            insertarFigura(statement, "cuadrado", "amarillo");
            insertarFigura(statement, "cuadrado", "azul");

           // insertarFigura(connection, "circulo", "rojo");
           // insertarFigura(connection, "circulo", "azul");
          //  insertarFigura(connection, "cuadrado", "verde");
          //  insertarFigura(connection, "cuadrado", "amarillo");
          //  insertarFigura(connection, "cuadrado", "azul");

            // Crear una query para ver los círculos de color rojo
            String queryCirculosRojo = "SELECT * FROM FIGURAS WHERE tipo = 'circulo' AND color = 'rojo'";
            ResultSet resultSetCirculosRojo =  statement.executeQuery(queryCirculosRojo);
            System.out.println("Círculos de color rojo:");
            while (resultSetCirculosRojo.next()) {
                System.out.println("ID: " + resultSetCirculosRojo.getInt("id") + ", Tipo: " + resultSetCirculosRojo.getString("tipo") + ", Color: " + resultSetCirculosRojo.getString("color"));
            }

            // Mostrar todas las figuras

            ResultSet rs= statement.executeQuery("SELECT * FROM FIGURAS");
            //NECESITO SI O SI RECORRER PARAR VER LOS DATOS
            System.out.println("Todas las figuras:");
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("id") + ", Tipo: " + rs.getString("tipo") + ", Color: " + rs.getString("color"));
            }
            // Cerrar la conexión
            connection.close();

        }catch (Exception e){
            e.printStackTrace();

        }

    }
    public static Connection getConnection() throws Exception{
        //ahora debo cargar el driver
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/figura","sa","sa");
    }

    private static void insertarFigura(Statement sta, String tipo, String color) throws Exception {
        String insertQuery = "INSERT INTO FIGURAS (tipo, color) VALUES ('" + tipo + "', '" + color + "')";
        sta.execute(insertQuery);
    }

    /*
    private static void insertarFigura(Connection con, String tipo, String color) throws Exception {
        String insertQuery = "INSERT INTO FIGURAS (tipo, color) VALUES (?, ?)";
        PreparedStatement preparedStatement = con.prepareStatement(insertQuery);
        preparedStatement.setString(1, tipo);
        preparedStatement.setString(2, color);
        preparedStatement.executeUpdate();
    }
    */
}
