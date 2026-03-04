package gestortareasengrupo;

import java.util.ArrayList;

/**
 * Clase que almacena y gestiona tareas gracias a un ArrayList.
 * @author Jonan Vega, Andrew Guerra
 */
public class GestorTareas {
    
    private ArrayList<Tarea> tareas = new ArrayList<>();
    
    /**
     * Añade una tarea a una lista de tareas dentro del gestor. Automáticamente, todas las tareas son marcadas como <b>incompletas</b>.
     * @param descripcion Descripción de la tarea a añadir.
     */
    public void añadirTarea(String descripcion){
        tareas.add(new Tarea(descripcion,false));
    }
    
    /**
     * Método que muestra las tareas añadidas. En el caso de que no hayan tareas en la lista, dice que no hay tareas pendientes.
     */
    public void MostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas pendientes.");
        } else {
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". "
                        + tareas.get(i));

            } 
        }

    }
}
