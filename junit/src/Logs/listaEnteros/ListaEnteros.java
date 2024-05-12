package Logs.listaEnteros;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaEnteros {

    private static final Logger logger = Logger.getLogger(ListaEnteros.class);
    List<Integer> listaEnteros = new ArrayList<>();
    public ListaEnteros(List<Integer> listaEnteros) throws Exception{
        if(listaEnteros.isEmpty() ){
            logger.error("La lista es igual a cero");
            throw new Exception("La lista es igual a cero");
        }

        this.listaEnteros = listaEnteros;
        if(listaEnteros.size()>5 ){
            logger.info("La longitud de la lista es mayor a 5");
        }

        if(listaEnteros.size()>10 ){
            logger.info("La longitud de la lista es mayor a 10");
        }


    }

    public double calcularPromedio(){
        double promedio = listaEnteros.stream().mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        logger.info("El promedio es:" + promedio);

        return promedio;
    }

   public static void main(String[] args) {
       List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6);
       List<Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5, 6,1, 2, 3, 4, 5, 6);
       List<Integer> lista3 = Arrays.asList();
        try{
            ListaEnteros listaCinco = new ListaEnteros(lista1);
            double promedioCinco = listaCinco.calcularPromedio();
            System.out.println("El promedio de la listaCinco es: " + promedioCinco);

            ListaEnteros listaDiez = new ListaEnteros(lista2);
            double promedioDiez = listaDiez.calcularPromedio();
            System.out.println("El promedio de la listaDiez es: " + promedioDiez);

            ListaEnteros listaVacia = new ListaEnteros(lista3);
            double promedioVacio = listaVacia.calcularPromedio();
            System.out.println("El promedio de la listaVacia es: " + promedioVacio);

        } catch (Exception e){
            System.out.println("[ ERROR ] La lista es igual a cero");
            e.printStackTrace();
        }
    }
}
