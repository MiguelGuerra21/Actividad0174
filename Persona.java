
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
    // instance variables - replace the example below with your own
    private String nombre;
    private boolean genero;
    private int peso;
    private int altura;
    private int edad;
    private int caloriasIngeridas;

    /**
     * El constructor de la clase Persona deberá tener (en el mismo orden):

    Un parámetro que permita indicar el nombre de la persona.
    Un parámetro booleano que permita indicar si la persona es un hombre.True si lo es False si no
    Un parámetro entero que permita indicar el peso en kilogramos de la persona.
    Un parámetro entero que permita indicar la altura en centímetros de la persona.
    Un parámetro entero que permita indicar la edad en años de la persona.
     */
    public Persona(String nombre, boolean genero,int peso, int altura ,int edad)
    {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        caloriasIngeridas = 0;
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }

    /**
     * Hombres = (10 x peso en kg) + (6 × altura en cm) + (5 × edad en años) + 5
     * Mujeres = (10 x peso en kg) + (6 × altura en cm) + (5 × edad en años) - 161
     */
    public int comer(Comida nombre){
        caloriasIngeridas = caloriasIngeridas + nombre.getCalorias();
        int caloriasDeLaComida = nombre.getCalorias();
        if(genero = true){
            if(caloriasIngeridas > (10*peso + 6*altura + 5*edad + 5)){
                caloriasIngeridas = caloriasIngeridas - nombre.getCalorias();;
                caloriasDeLaComida = -1;
                System.out.println("No quiero comer mas");
            }
        }
        else{
            if(caloriasIngeridas > (10*peso + 6*altura + 5*edad -161)){
                caloriasIngeridas = caloriasIngeridas - nombre.getCalorias();
                caloriasDeLaComida = -1;
                System.out.println("No quiero comer mas");
            }
        }
        return caloriasDeLaComida;
    }
}
