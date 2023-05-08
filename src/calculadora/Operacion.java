/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author estudiante
 */
public class Operacion {

    public float Sumar(float nu1, float nu2) {

        float Sumar = nu1 + nu2;
           
        return Sumar;
//        
    }
     public float Restar(float nu1, float nu2) {
        float Restar = nu1 - nu2;
        return Restar;
    }

    public float Multiplicar(float nu1, float nu2) {
        float Multiplicar = nu1 * nu2;
        return Multiplicar;
    }

    public float Dividir(float nu1, float nu2) {
        float division = nu1 / nu2;
        if ( nu2 == 0) {
            System.out.println("La operación no se puede realizar");
            
            return 0;
        } else {
            return division;
        }
    }

    

}
