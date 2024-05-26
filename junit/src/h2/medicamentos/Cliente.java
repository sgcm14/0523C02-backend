package h2.medicamentos;

import h2.medicamentos.dao.BD;
import h2.medicamentos.model.Medicamento;
import h2.medicamentos.service.MedicamentoService;

public class Cliente {
    public static void main(String[] args) {
        //cual es el primer paso?
        BD.crearTablas();
        //Ahora creo el medicamento
        Medicamento medicamento= new Medicamento(1,1234,"Ibuprofeno","Bago",10,100.0);
        Medicamento medicamento2= new Medicamento(2,1235,"Naproxeno","Bago",11,120.0);

        //quien debe guardar el medicamento?
        MedicamentoService medicamentoService= new MedicamentoService();
        ///ahora que tenemos el service?
        medicamentoService.guardarMedicamento(medicamento);
        medicamentoService.guardarMedicamento(medicamento2);


        //orden de sucesos

        /*
        * 1 service
        * 2 dao correspondiente
        *3 bd
        * 4 entity o model
        *  */

        Medicamento medicamento1 = medicamentoService.buscarMedicamentoPorId(2);
        System.out.println(medicamento1.toString());
    }
}
