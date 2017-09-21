
public class esfera {
    private double radio;
    //constructor
    public esfera(double radioInicial){
        if(radioInicial>0){
            this.radio=radioInicial;
            
        }else{
            this.radio=0.0;
        }
    }
    //creamos los metodos del TDAEsfera
    
    public double getRadio(){
        return this.radio;
        
    }
    
    public double getDiametro(){
        return (radio*2);
        
    }
    public double  getCircunferencia(){
        return(Math.PI*getDiametro());
    }
    public double getArea(){
        return(4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return(4*Math.PI*Math.pow(radio, 3))/3;
    }
     
}
