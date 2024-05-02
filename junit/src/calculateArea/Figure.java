package calculateArea;

public class Figure {
    public double calculateArea(String shapeType, double measure){

    double area =0;

    switch (shapeType){
        case "circulo" :
            area = Math.PI * Math.pow(measure, 2);
            break;
        case "cuadrado" :
            area = Math.pow(measure, 2);
            break;
        default:
            System.out.println("Tipo de figura "+shapeType+" no es válido");
            return 0; //termina la ejecución
    }
        if(measure<=0){
            System.out.println("El valor del " + (shapeType.equals("circulo") ? "radio" : "lado") + " del "+ shapeType +" debe ser mayor que cero");
            return 0; //termina la ejecución
        } else {
            System.out.println("El area del " + shapeType + " es " + area + " unidades");
            return area;
        }


    }
}
