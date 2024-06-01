import java.util.Scanner;

public class MostrarMensajes {

    Scanner lectura = new Scanner(System.in);

    public int visualizarMenu(){
        System.out.println("""
                1) Peso Mexicano a Dólar Estadounidense
                2) Peso Mexicano a Euro
                3) Peso Mexicano a Peso Chileno
                4) Dolar Estadounidense a Peso Mexicano
                5) Euro a Peso Mexicano
                6) Peso Chileno a Peso Mexicano
                7) Salir""");
        int opcion = lectura.nextInt();
        return opcion;
    }

    public Double ingresoCantidad(){
        System.out.println("Ingresa la cantidad a convertir: ");
        Double cantidad = lectura.nextDouble();
        return cantidad;
    }

    public void mensajeConversion(int opcion, Double cantidad, Double cambio){
        switch (opcion){
            case 1:
                System.out.println(cantidad+" Pesos Mexicanos equivale a "+
                        cambio + " Dólares Estadounidenses\n");
                break;
            case 2:
                System.out.println(cantidad+" Pesos Mexicanos equivale a "+
                        cambio + " Euros\n");
                break;
            case 3:
                System.out.println(cantidad+" Pesos Mexicanos equivale a "+
                        cambio + " Pesos Chilenos\n");
                break;
            case 4:
                System.out.println(cantidad+" Dólares Estadounidenses equivale a "+
                        cambio + " Pesos Mexicanos\n");
                break;
            case 5:
                System.out.println(cantidad+" Euros equivale a "+
                        cambio + " Pesos Mexicanos\n");
                break;
            case 6:
                System.out.println(cantidad+" Pesos Chilenos equivale a "+
                        cambio + " Pesos Mexicanos\n");
                break;
            default:
                System.out.println("No hay mensaje");
        }
    }
}
