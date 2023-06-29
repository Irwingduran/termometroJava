class TermometroFahrenheit extends Termometro{

    //Constructor
    public TermometroFahrenheit(double grados){
        super(grados);
    }

    //Implementación del método determinarTemperatura
    public String determinarTemperatura(){
        if(grados < 100.4){
            return "Temperatura normal: " + grados + " °F.";
        }else{
            return "Fiebre: " + grados + " °F.";
        }
    }

    //Implementación del método convertir
    public double convertir(){
        return (grados - 32) * (5.0/9.0);
    }

    //Método toString
    public String toString(){
        return super.toString() + " °F";
    }
}