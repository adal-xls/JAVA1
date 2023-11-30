//package co.com.ps.b6;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//
//        int dayOfWeek= 3;
//
//        switch (dayOfWeek){
//            case 1:
//                System.out.println("Lunes");
//                break;
//            case 2:
//                System.out.println("Martes");
//                break;
//            case 3:
//                System.out.println("Miércoles");
//                break;
//            case 4:
//                System.out.println("Jueves");
//                break;
//            case 5:
//                System.out.println("Viernes");
//                break;
//            case 6:
//                System.out.println("Sábado");
//                break;
//            case 7:
//                System.out.println("Domingo");
//                break;
//            default:
//                System.out.println("Número de Día no Válido");
//                break;
//        }
//
//        String dayName = switch (dayOfWeek){
//            case 1 -> "Lunes";
//            case 2 -> "Martes";
//            case 3 -> "Miércoles";
//            case 4 -> "Jueves";
//            case 5 -> "Viernes";
//            case 6 -> "Sábado";
//            case 7 -> "Domingo";
//            default -> "Número de Día no Válido";
//        };
//
//        System.out.println(dayOfWeek);
//
//        //--------------------------------------------------------------------------------------------------------------
//        // Válidaciones whi - Do While
//
//        int contador= 0;
//
//        while(contador <5){
//            System.out.println("Contador: " + contador);
//            contador++;
//        }
//
//        contador = 0;
//        do{
//            System.out.println("Contador: " + contador);
//            contador++;
//        } while (contador < 5);
//        System.out.println("Termino el ciclo ");
//    }
//}