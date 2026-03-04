package gestortareasengrupo;

import java.util.ArrayList;

/**
 *
 * @author Andrew Guerra, Jonan Vega
 */
public class GestorTareas {

    private ArrayList<Tarea> tareas = new ArrayList<>();

    /**
     * Alumno B:Muestra todas las tareas por consola.
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
