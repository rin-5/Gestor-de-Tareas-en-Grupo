package gestortareasengrupo;

/**
 * Clase que contiene la información para crear una tarea.
 * @author Jonan Vega, Andrew Guerra 
 * @version 0.1
 * @since 2026
 */
public class Tarea { 
    private String descripcion;
    private boolean completada;

    /**
     * Constructor de la clase Tarea, que incluye una descripción de dicha tarea y su estado.
     * @param descripcion Cadena de texto que contiene la información de una tarea.
     * @param completada  Estado de la tarea, que devuelve falso si no está completa y verdadero si ya ha sido marcada como completada.
     */
    public Tarea(String descripcion, boolean completada) {
        this.descripcion = descripcion;
        this.completada = completada;
    }

    /**
     * Método que devuelve la descripción de una tarea.
     * @return Cadena de texto con la descripcion de una tarea.
     */
    public String getDescripcion() {
        return this.descripcion;
    }
    
    /**
     * Método que establece la descripción de una tarea.
     * @param descripcion Cadena de texto que contiene la información de una tarea.
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Método que devuelve el estado de una tarea.
     * @return El estado de una tarea: no completada (falso) o completada (verdadero).
     */
    public boolean isCompletada() {
        return this.completada;
    }
    /**
     * Método que establece el estado de una tarea.
     * @param completada 
     */
    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    
    
}
