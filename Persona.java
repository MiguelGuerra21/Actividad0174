import java.util.ArrayList;
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
    private int metabolismoBasalMaximo;
    private Comida comidaMasCalorica;
    private ArrayList<String> listaDeComidas;
    private Comida[] comidasDesordenadas;

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
        comidaMasCalorica = null;
        listaDeComidas = new ArrayList<String>(10);
        comidasDesordenadas = new Comida[10];
        if(genero = true){
            metabolismoBasalMaximo = 10*peso + 6*altura + 5*edad + 5;
        }
        else{
            metabolismoBasalMaximo = 10*peso + 6*altura + 5*edad -161;
        }
    }

    public int getCaloriasIngeridas(){
        return caloriasIngeridas;
    }

    /**
     * Hombres = (10 x peso en kg) + (6 × altura en cm) + (5 × edad en años) + 5
     * Mujeres = (10 x peso en kg) + (6 × altura en cm) + (5 × edad en años) - 161
     */
    public int comer(Comida nombre){
        int caloriasDeLaComida = nombre.getCalorias();
        int contador = 0;
        if(caloriasIngeridas <= metabolismoBasalMaximo){
            caloriasIngeridas = caloriasIngeridas + nombre.getCalorias();
            if(comidaMasCalorica == null){
                comidaMasCalorica = nombre;
            }
            else if(comidaMasCalorica.getCalorias() < nombre.getCalorias()){
                comidaMasCalorica = nombre;
            }
        }
        else{
            caloriasDeLaComida = -1;
            System.out.println("No quiero comer mas");
        }
        comidasDesordenadas[contador] = nombre;
        contador++;
        return caloriasDeLaComida;
    }

    public String contestar(String pregunta){
        String preguntaRealizada = pregunta;
        String respuesta = "";
        if((preguntaRealizada.length()%3) == 0 && caloriasIngeridas < metabolismoBasalMaximo){
            respuesta = "SI";
        }
        else{
            respuesta = "NO";
        }
        if(preguntaRealizada.contains(nombre)) {
            respuesta = pregunta.toUpperCase();
        }
        else if(caloriasIngeridas > metabolismoBasalMaximo){
            respuesta = pregunta.toUpperCase();
        }
        System.out.println(respuesta);
        return respuesta;
    }

    public String getAlimentoMasCaloricoConsumido(){
        //En caso de que la persona no haya comido nada el método infoma por pantalla de tal situación y devuelve null. 
        //En caso de que haya empate entre dos o más comidas, imprime y devuelve la última de ellas.
        String comidaADevolver = null;
        if(comidaMasCalorica == null){
            System.out.println("No he comido nada");
        }
        else{
            comidaADevolver = comidaMasCalorica.getNombre();
        }
        return comidaADevolver;
    }
    //Implementa el código necesario para disponer de un método llamado verListadoComidasIngeridas 
    //en la clase Persona que no devuelve nada y que imprime por pantalla la lista de comidas ingeridas ordenadas de mayor a menor valor calórico. 
    //En el listado debe mostrarse el nombre de la comida y su valor calórico
    public void verListadoComidasIngeridas(){
        System.out.println(listaDeComidas);
    }
}
