package disenio_facade.compras.service.impl;


import disenio_facade.compras.model.Tarjeta;

public class PagoService {


    public Boolean procesarPago(Tarjeta tarjeta, String montoACobrar){
        Boolean pagoRealizado = Boolean.FALSE;
        if(tarjeta != null && tarjeta.getNumerosFrente() != null && tarjeta.getCodSeguridad() != null)
            System.out.println("Procesando el pago por "+ montoACobrar);
            pagoRealizado = Boolean.TRUE;


        return pagoRealizado;


    }

}
