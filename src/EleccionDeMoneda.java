import java.util.*;


public class EleccionDeMoneda {

    ArrayList <String> codigos = new ArrayList<>();

    public ArrayList ElegirMoneda(int opcion){
        Map<String, String> codigosMonedas = new HashMap<>();
        codigosMonedas.put("Dolar Estadounidense","USD");
        codigosMonedas.put("Peso Mexicano","MXN");
        codigosMonedas.put("Euro","EUR");
        codigosMonedas.put("Peso Chileno","CLP");

        switch (opcion){
            case 1:
                codigos.add(codigosMonedas.get("Peso Mexicano"));
                codigos.add(codigosMonedas.get("Dolar Estadounidense"));
                break;
            case 2:
                codigos.add(codigosMonedas.get("Peso Mexicano"));
                codigos.add(codigosMonedas.get("Euro"));
                break;
            case 3:
                codigos.add(codigosMonedas.get("Peso Mexicano"));
                codigos.add(codigosMonedas.get("Peso Chileno"));
                break;
            case 4:
                codigos.add(codigosMonedas.get("Dolar Estadounidense"));
                codigos.add(codigosMonedas.get("Peso Mexicano"));
                break;
            case 5:
                codigos.add(codigosMonedas.get("Euro"));
                codigos.add(codigosMonedas.get("Peso Mexicano"));
                break;
            case 6:
                codigos.add(codigosMonedas.get("Peso Chileno"));
                codigos.add(codigosMonedas.get("Peso Mexicano"));
                break;
            default:
                System.out.println("No existe esa opción, intente de nuevo");
        }
        return codigos;
    }




}
