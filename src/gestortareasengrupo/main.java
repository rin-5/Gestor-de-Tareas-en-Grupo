package gestortareasengrupo;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in, "UTF-8");
        GestorTareas gestor = new GestorTareas();
        
        int option;
        
        do{
            System.out.println("\n=== Gestor de tareas ===");
            System.out.println("\u001B[4m"+"Opciones:"+"\u001B[0m");
            System.out.println("0: Salir");
            System.out.println("1: Añadir tarea");
            System.out.println("2: Listar tareas");
            System.out.println("\n\nSelecciona una opción:");
            option = sc.nextInt();
            sc.nextLine();
            
            switch(option){
                case 2:
                    gestor.MostrarTareas();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            
        }while (option != 0);   
    }
}
