import java.util.Scanner;
//Importa la clase Scanner para poder leer datos del teclado.


public class DiaHabil {
    public static void main(String[] args) {
//Creo el objeto Scanner para pedir el día
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese día de la semana (en minúsculas y con tildes:) ");
        String diaSemana = scanner.nextLine();
//Usamos nextLine() para leer texto completo.

//Para verificar si es día hábil o no, usamos el condicional .equals
if (diaSemana.equals("lunes") || diaSemana.equals("martes")
        || diaSemana.equals("miércoles") || diaSemana.equals("jueves")
        || diaSemana.equals("viernes")){
    System.out.println("Es un día hábil");
    } else if (diaSemana.equals("sábado") || diaSemana.equals("domingo")){
        System.out.println("No es un día hábil, es un día de fin de semana.");
    }else {
    System.out.println("No es un día válido");
    }
//Cerramos escaner
scanner.close();
    }
}
