/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculaareacirculo;

/**
 *
 * @author JuanJ
 */
public class CalculaAreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radio = 15;
        float pi = (float)3.1416;
        float area;
        
        area = (float) (pi*Math.pow(radio,2));
        
        System.out.println("El radio del circulo es: " + radio + "Cm");
        System.out.println("Pi equivale a: " + pi);
        System.out.println("El area del Circulo es: " + area + "Cm2");
    }
    
}
