import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {

        //Inicialización de variables
        int opcion = 0;
        Double cantidad ;
        String monedaBase;
        String monedaCambio;

        //Inicialización de objetos
        Scanner lectura = new Scanner(System.in);
        ConsultaConversor conversion = new ConsultaConversor();
        ArrayList codigos = new ArrayList<>();
        MostrarMensajes mensaje = new MostrarMensajes();
        EleccionDeMoneda datos = new EleccionDeMoneda();

        //Asignación de opción de conversión
        opcion = mensaje.visualizarMenu();

        while (opcion != 7){

            //Lectura de la cantidad a convertir
           cantidad = mensaje.ingresoCantidad();

           //Obtención de códigos de conversion de moneda
           codigos = datos.ElegirMoneda(opcion);

           //Método 1 con JsonObk y Jsonparser
           Double moneda = conversion.ConsultaMoneda2(cantidad, (String) codigos.get(0), (String) codigos.get(1));

           //Mandar mensaje de conversión
           mensaje.mensajeConversion(opcion,cantidad,moneda);


           //Método 2 con toJson y fromJson
           // Moneda moneda = conversion.ConsultaMoneda(cantidad,monedaBase,monedaCambio);
           //Gson gson = new GsonBuilder().setPrettyPrinting().create();
           //String representacion = gson.toJson(moneda);
           //Moneda atributos = gson.fromJson(representacion, Moneda.class);

           //var resultadoCambio = atributos.conversion_result();
           //var tasaCambio = atributos.conversion_rate();
           //System.out.println(resultadoCambio);

            opcion = mensaje.visualizarMenu();
        }










    }
}
