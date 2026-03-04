package gestortareasengrupo;
import java.util.Scanner;

/**
 * Clase que permite gestionar tareas de manera interactiva.
 * @author Jonán Vega, Andrew Guerra
 */
public class main {
    /**
     * Contiene un menú interactivo para gestionar las tareas.
     * @param args  Argumentos de líneas de comandos. (No se usan en esta aplicación)
     */
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
                case 1:
                    System.out.println("Introduce la descripción:");
                    String desc = sc.nextLine();
                    gestor.añadirTarea(desc);
                    break;
                    
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
