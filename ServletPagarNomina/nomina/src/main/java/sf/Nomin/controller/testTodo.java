/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sf.Nomin.controller;


public class testTodo {
    public static void main(String args[]){
        
        //primero  creamos el trabajador 
        Trabajador t=new Trabajador(1,"Juan",40,200);
        Nomina n=new Nomina(t);
        n.pagarNomina();
    }
    
}
