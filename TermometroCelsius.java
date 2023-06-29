class TermometroCelsius extends Termometro{

    //Constructor
    public TermometroCelsius(double grados){
        super(grados);
    }

    //Implementación del método determinarTemperatura
    public String determinarTemperatura(){
        if(grados < 38){
            return "Temperatura normal: " + grados + " °C.";
        }else{
            return "Fiebre: " + grados + " °C.";
        }
    }

    //Implementación del método convertir
    public double convertir(){
        return (grados * (9.0/5.0)) + 32;
    }

    //Método toString
    public String toString(){
        return super.toString() + " °C";
    }
}