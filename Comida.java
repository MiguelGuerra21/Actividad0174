
/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida
{
    // instance variables - replace the example below with your own
    private String nombreComida;
    private int calorias;

    /**
     * Constructor for objects of class Comida
     */
    public Comida(String nombre, int calorias)
    {
        nombreComida = nombre;
        this.calorias = calorias;
    }
    public int getCalorias(){
        return calorias;
    }
    public String getNombre(){
        return nombreComida;
    }
}
