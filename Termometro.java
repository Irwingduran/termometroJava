import java.util.ArrayList;

//Clase abstracta Termómetro
abstract class Termometro{
    protected double grados;
    protected ArrayList<Double> memoria;

    //Constructor
    public Termometro(double grados){
        this.grados = grados;
        this.memoria = new ArrayList<Double>();
    }

    public double convertir(){
        return (grados - 32) * (5.0/9.0);
    }
    //Getter y setter para grados
    public double getGrados(){
        return grados;
    }

    public void setGrados(double grados){
        this.grados = grados;
    }

    //Método abstracto para determinar la temperatura
    public abstract String determinarTemperatura();

    //Método para guardar la temperatura en la memoria
    public void guardarEnMemoria(){
        memoria.add(grados);
    }

    //Método para imprimir la memoria
    public String imprimirMemoria(){
        String temperaturas = "";
        for(double temp : memoria){
            temperaturas += temp + " ";
        }
        return temperaturas;
    }

    //Método para resetear la memoria
    public void resetearMemoria(){
        memoria.clear();
    }

    //Método para encontrar la temperatura mínima
    public double minimo(){
        double min = Double.MAX_VALUE;
        for(double temp : memoria){
            if(temp < min){
                min = temp;
            }
        }
        return min;
    }

    //Método para encontrar la temperatura máxima
    public double maximo(){
        double max = Double.MIN_VALUE;
        for(double temp : memoria){
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }
}