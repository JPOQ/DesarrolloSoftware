/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.centralpacientes;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author juan0
 */
class Paciente{
    int ID, edad;
    String nombre, clinica;
    public Paciente(int ID, int edad, String nombre, String clinica){
        this.ID=ID;
        this.edad=edad;
        this.nombre=nombre;
        this.clinica=clinica;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+"\n"
                + "Edad: "+edad+"\n"
                + "ID: "+ID+"\n"
                + "Clinica: "+clinica+"\n");
    }
}
public class CentralPacientes{
    public static void main(){
        LinkedList<Paciente>listaPacientes=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        int opc;
        do{
            System.out.println("Digite la opción deseada\n"
                    + "1. Agregar paciente\n"
                    + "2. Buscar paciente\n"
                    + "3. Eliminar paciente\n"
                    + "4. Mostrar todos los pacientes\n"
                    + "0. Salir");
            opc=sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    System.out.println("Digite el ID del paciente");
                    int ID=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite el nombre del paciente");
                    String nombre=sc.nextLine();
                    System.out.println("Digite la edad del paciente");
                    int edad=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite la clinica del paciente");
                    String clinica=sc.nextLine();
                    listaPacientes.add(new Paciente(ID, edad, nombre, clinica));
                    break;
                    case 2:
                    System.out.println("Digite el ID del paciente a buscar");
                    int IDBuscar=sc.nextInt();
                    sc.nextLine();
                    for(Paciente p: listaPacientes){
                        if(p.ID==IDBuscar){
                            p.mostrarInformacion();
                            break;
                        }else{
                            System.out.println("No se encontro a ningun paciente con esa ID");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Digite el ID del paciente a eliminar");
                    int IDEliminar=sc.nextInt();
                    sc.nextLine();
                    for(Paciente p: listaPacientes){
                        if(p.ID==IDEliminar){
                            listaPacientes.remove(p);
                            System.out.println("Paciente eliminado");
                            break;
                        }
                    }
                    break;
                case 4:
                    for(Paciente p: listaPacientes){
                        p.mostrarInformacion();
                    }
                    break;
            }
    }while(opc!=0);
    }
}
