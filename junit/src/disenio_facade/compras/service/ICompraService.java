package disenio_facade.compras.service;


import disenio_facade.compras.model.Direccion;
import disenio_facade.compras.model.Tarjeta;

public interface ICompraService {

    public void procesarCompra(String productoId, Integer cantidad, Tarjeta tarjeta, Direccion direccion);
}
