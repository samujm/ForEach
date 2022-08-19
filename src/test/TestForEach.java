package test;
import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        //For mejorado, simplificar la forma de recorrer arreglos o colecciones
        int edades[] = {5,6,8,9};
        //1. Definir una variable del tipo de dato que se almacena en el arreglo int edad:
        //2. Colocar el arreglo que se quiere iterar
        //Ya no se tiene acceso a un contador
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
        
        //No se puede utilizar var para un arreglo
        Persona personas[] = {new Persona("Juan"),new Persona("Karla"),new Persona("Agustin")};
        
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
