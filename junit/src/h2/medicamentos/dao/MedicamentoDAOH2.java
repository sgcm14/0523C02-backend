package h2.medicamentos.dao;

import h2.medicamentos.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MedicamentoDAOH2 implements iDao<Medicamento> {
    /*private Integer id;
  private Integer codigo;
  private String nombre;
  private String laboratorio;
  private Integer cantidad;
  private Double precio;*/
    private static final Logger logger= Logger.getLogger(MedicamentoDAOH2.class);
    private static final String SQL_INSERT="INSERT INTO MEDICAMENTOS VALUES(?,?,?,?,?,?)";
    private static final String SQL_SEARCH="SELECT * FROM MEDICAMENTOS WHERE ID=?";

    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection= null;
        try{
            connection= BD.getConnection();
            logger.info("conexion establecida");
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT);
            //ahora debemos cargar las parametrizadas
            psInsert.setInt(1,medicamento.getId());
            psInsert.setInt(2,medicamento.getCodigo());
            psInsert.setString(3, medicamento.getNombre());
            psInsert.setString(4, medicamento.getLaboratorio());
            psInsert.setInt(5,medicamento.getCantidad());
            psInsert.setDouble(6,medicamento.getPrecio());
            psInsert.execute();
            logger.warn("medicamento guardado con exito");
        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }

    @Override
    public Medicamento buscarPorID(Integer id) {
        Connection connection= null;
        Medicamento medicamento = new Medicamento();
        try{
            connection= BD.getConnection();
            logger.info("conexion establecida");
            PreparedStatement psSearch= connection.prepareStatement(SQL_SEARCH);
            psSearch.setInt(1,id);
            ResultSet rs = psSearch.executeQuery();
            while (rs.next()){
                medicamento.setId(rs.getInt(1));
                medicamento.setCodigo(rs.getInt(2));
                medicamento.setNombre(rs.getString(3));
                medicamento.setLaboratorio(rs.getString(4));
                medicamento.setCantidad(rs.getInt(5));
                medicamento.setPrecio(rs.getDouble(6));
            }

            logger.warn("medicamento encontrado con exito");
        }catch (Exception e){
            e.printStackTrace();
        }
        return medicamento;
    }


}
