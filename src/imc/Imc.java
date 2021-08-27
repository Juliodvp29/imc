package imc;

public class Imc {
    Imc(){
        
    }
    
    public double calcIMC(double peso, double altura){
        return Math.floor(peso/(altura*altura));
    }
    
    
}
