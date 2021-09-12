
package luzmarina_reto1;

import java.util.Scanner;

public class LUZMARINA_RETO1 {
public static double calcularPorcentajeBono(int tiempo,float salario) {
    double porcentaje;        
            if (tiempo >= 10){
                porcentaje = 0.3;
                return porcentaje*salario;
            }
            if (tiempo > 5 && tiempo < 10){
                porcentaje = 0.2;
                return porcentaje*salario;
            }   
            if (tiempo <= 5){
                porcentaje = 0.1;
                return porcentaje*salario;
            }
            else{
                porcentaje = 0.05;
                return porcentaje*salario;
            }
    }    
    public static void main(String[] args) {
       double porcentaje;
         int tiempo;
         int num, i, tipo;
         String nombre;
        double salario, incentivo, incremento, nuevoSalario;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos empleados va a ingresar?");
        num = sc.nextInt();
        for(i=1; i<=num; i++){
            System.out.println("Ingrese el nombre del empleado");
            nombre = sc.next();
            System.out.println("Ingrese el salario");
            salario = sc.nextInt();
            System.out.println("Ingrese el tiempo de antigüedad del empleado: ");
            tiempo = sc.nextInt();
            System.out.println("Seleccione tipo de puesto: 1: vendedor  2: Administrativo");
            tipo = sc.nextInt();
            if (tipo==1){
                incentivo = 0.05*salario;
            }else{
                incentivo = 0.02*salario;
            }  
            double bonificacion=0;
                           
            bonificacion =  calcularPorcentajeBono(tiempo, (float) salario);
           
             incremento=(bonificacion+incentivo);
             nuevoSalario=0;
             nuevoSalario=(salario+incremento);
             
             System.out.println("Empleado  " + nombre);
             System.out.println("El valor de su incentivo  es  " + incentivo);
             System.out.println("El valor de su bono de antiguedad es  " + bonificacion);
             System.out.println("Su salario con incentivo y bono es " + nuevoSalario);
        }
        
    }
             
}
    

