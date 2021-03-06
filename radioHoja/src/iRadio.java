
/**
 * Interfaz para el manejo de las caracteristicas basicasde una radio. 
 *
 * @author Andrea Elias
 * @author Alexis Estrada
 * @version 1.0
 * @date 13/01/2018
 */


public interface iRadio
{
    /**
     * Metodo para manejar el encendido y apagado de la radio
     * 
     * @return 
     */
    public boolean encendidoRadio();
    
    /**
     * Metodo para subir la frecuencia que se encuentra actualmente en la radio.
     * 
     * @return Nueva frecuencia a reproducir en la radio.
     */  
    public double subirFrecuencia();
    
    /**
     * Metodo para bajar la frecuencia que se encuentra actualmente en la radio.
     * 
     * @return Nueva frecuencia a reproducir en la radio.
     */  
    
   public double bajarFrecuencia();
    
    /**
     * Metodo para almacenar la frecuencia en el boton seleccionado
     *
     * @param posicion numero del boton de favoritos seleccionado.
     */
   
    public void setFavorito(int posicion);
    
    /**
     * Metodo para obtener la frecuencia almacenada en el boton, segun la emisora.
     *
     * @param posicion numero del boton de favoritos seleccionado.
     * @return frecuencia almacenada en el boton de favoritos.
     */
    
  
public double getFavorito(int posicion);
   
   /**
 * @return identifica cambio de estacion
 */
public boolean cambiarAmFm();
    
    
}