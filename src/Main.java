import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String[] opciones = {"CLP a USD", "CLP a EUR", "CLP a GBP", "CLP a JPY", "CLP a KRW", "USD a CLP", "EUR a CLP", "GBP a CLP"};

        // Mostrar cuadro de dialogo
        String seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione nuna opcion de conversion de moneda",
                "Conversor de moneda",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        // Verficar la seleccion y proceder con la conversion
        if(seleccion != null){
            conversorDeMoneda(seleccion);
        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono ninguna opcion ");
        }

    }

    // Metodo para conversor de moenda
    private static void conversorDeMoneda(String seleccion){
        String cantidadStr = JOptionPane.showInputDialog(null, "Ingrese la cantidad: ");
        try {
            double cantidad = Double.parseDouble(cantidadStr);
            double resultado;
            switch (seleccion){
                case "CLP a USD":
                    double tasaClpUsd = 0.0013; // 1 CLP = 0.0013 USD
                    resultado = cantidad * tasaClpUsd;
                    JOptionPane.showMessageDialog(null, "La cantidad en USD es: " + resultado);
                    break;
                case "CLP a EUR":
                    double tasaClpEur = 0.0011; // 1 CLP = 0.0011 EUR
                    resultado = tasaClpEur * cantidad;
                    JOptionPane.showMessageDialog(null, "La cantidad en EUR es: " + resultado);
                    break;
                case "CLP a GBP":
                    double tasaClpGbp = 0.00095; // 1 CLP = 0.00095 GBP
                    resultado = tasaClpGbp * cantidad;
                    JOptionPane.showMessageDialog(null, "La cantidad en GBP es: " + resultado);
                    break;
                case "CLP a JPY":
                    double tasaClpJpy = 0.15; // Ejemplo: 1 CLP = 0.15 JPY
                    resultado = cantidad * tasaClpJpy;
                    JOptionPane.showMessageDialog(null, "La cantidad en JPY es: " + resultado);
                    break;
                case "CLP a KRW":
                    double tasaClpKrw = 1.6; // Ejemplo: 1 CLP = 1.6 KRW
                    resultado = cantidad * tasaClpKrw;
                    JOptionPane.showMessageDialog(null, "La cantidad en KRW es: " + resultado);
                    break;
                case "USD a CLP":
                    double tasaUsdClp = 770.0; // Ejemplo: 1 USD = 770 CLP
                    resultado = cantidad * tasaUsdClp;
                    JOptionPane.showMessageDialog(null, "La cantidad en CLP es: " + resultado);
                    break;
                case "EUR a CLP":
                    double tasaEurClp = 880.0; // Ejemplo: 1 EUR = 880 CLP
                    resultado = cantidad * tasaEurClp;
                    JOptionPane.showMessageDialog(null, "La cantidad en CLP es: " + resultado);
                    break;
                case "GBP a CLP":
                    double tasaGbpClp = 1040.0; // Ejemplo: 1 GBP = 1040 CLP
                    resultado = cantidad * tasaGbpClp;
                    JOptionPane.showMessageDialog(null, "La cantidad en CLP es: " + resultado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada no valida");
        }
    }
}