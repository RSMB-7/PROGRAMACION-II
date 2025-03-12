public class FiguraGeometrica {
    //CIRCULO
    double area (double radio){
        return Math.PI * radio * radio; //CIRCULO 
    }
    //RECTANGULO
    double area (double base, double altura){
        return base * altura;
    }
     //TRIANGULO RECTANGULO
     double area (float base, float altura){
        return (base*altura)/2;
    }
    //TRAPECIO 
    double area (double a, double b, double h){
        return (a+b)*h/2;
    }
    //PENTAGONO
    double area(float a, double p) {
        return (a * p) / 2;
        }
    }