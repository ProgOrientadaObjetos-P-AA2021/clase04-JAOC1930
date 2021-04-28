/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        String nombre;
        String ciudad;
        int numeroDoctores;
        int numeroEnfermeros;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("Ingresa la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese numero de doctores");
        numeroDoctores = entrada.nextInt();
        System.out.println("Ingresar numero de enfermeros");
        numeroEnfermeros = entrada.nextInt();
        Hospital hospital = new Hospital(nombre, ciudad, numeroDoctores, numeroEnfermeros);
        System.out.printf("%s\n", hospital.toString());
    }
}
