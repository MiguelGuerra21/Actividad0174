
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombre, int calorias)
    {
        this.nombre = nombre;
        this.calorias = calorias;
    }
    public int getCalorias(){
        return calorias;
    }
}
