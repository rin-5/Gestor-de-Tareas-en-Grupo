package gestortareasengrupo;

import java.util.ArrayList;

/**
 *
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
    
    
}
