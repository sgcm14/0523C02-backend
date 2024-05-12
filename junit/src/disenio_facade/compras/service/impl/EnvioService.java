package disenio_facade.compras.service.impl;

import disenio_facade.compras.model.Direccion;
import disenio_facade.compras.model.Producto;

import java.util.List;

public class EnvioService {

    public void procesarEnvio(List<Producto> productos, Direccion direccion){
        System.out.println("Enviando productos a " + direccion.getCalle() +" "+ direccion.getNro() +","+ direccion.getBarrio());
    }
}
