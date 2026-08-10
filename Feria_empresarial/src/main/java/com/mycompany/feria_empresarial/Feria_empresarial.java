package com.mycompany.feria_empresarial;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author juan0
 */
 public class Feria_empresarial {
    public static void main(String[] args) {
        Empresa empresa[]=new Empresa[10];
        Stand stand[]=new Stand[10];
        Visitante visitante[]=new Visitante[10];
        Comentario comentario[]=new Comentario[10];
        Scanner sc=new Scanner(System.in);
        int opcion;
        int iEmpresa=0;
        int iStand=0;
        int iVisitante=0;
        System.out.println("Bienvenido a la Feria Empresarial");
        System.out.println("1. Registrar empresa");
        System.out.println("2. Registrar stand");
        System.out.println("3. Registrar visitante");
        System.out.println("4. Visitante visita stand");
        System.out.println("5. Mostrar información de la feria");
        System.out.println("6. Salir");
        do{
            System.out.println("Ingrese una opción:");
            opcion=sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            switch(opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la empresa:");
                    empresa[iEmpresa].setNombre(sc.nextLine());;
                    System.out.println("Ingrese el sector de la empresa:");
                    empresa[iEmpresa].setSector(sc.nextLine());
                    System.out.println("Ingrese el correo de la empresa:");
                    empresa[iEmpresa].setCorreo(sc.nextLine());
                    iEmpresa++;
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la empresa del stand:");
                    stand[iStand].setNumUnico(sc.nextLine());
                    System.out.println("Ingrese el número del stand:");
                    stand[iStand].getNumUnico();
                    System.out.println("Ingrese la ubicación del stand:");
                    stand[iStand].getUbicacion();
                    System.out.println("Ingrese el tamaño del stand:");
                    stand[iStand].getTamaño();
                    iStand++;
                    break;
                case 3:
                    System.out.println("Ingrese el nombre del visitante:");
                    visitante[iVisitante].setNombre(sc.nextLine());
                    System.out.println("Ingrese el ID del visitante:");
                    visitante[iVisitante].setIdentificacion(sc.nextLine());
                    System.out.println("Ingrese el correo del visitante:");
                    visitante[iVisitante].setCorreoElectronico(sc.nextLine());
                    iVisitante++;
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del visitante:");
                    String nombreVisitante=sc.nextLine().toLowerCase();
                    for(int i=0;i<visitante.length;i++){
                        if(nombreVisitante!=visitante[i].getNombre().toLowerCase()){
                            System.out.println("Visitante no encontrado o no registrado");
                        }else{
                    System.out.println("Ingrese el stand que desea visitar:");
                    String standVisitado=sc.nextLine().toLowerCase();
                    for(int j=0; j<stand.length;j++){
                        if(standVisitado!=stand[j].getNombre().toLowerCase()){
                            System.out.println("Stand no encontrado o no registrado");
                    }else{
                    visitante[i].setVisitado(standVisitado);
                    System.out.println("Ingrese un comentario sobre el stand:");
                    comentario[i].setComentario(sc.nextLine());
                    System.out.println("Ingrese una calificación del stand (1-5):");
                    comentario[i].setCalificacion(sc.nextInt());
                    sc.nextLine();
                    comentario[i].setFechaComentario(LocalDateTime.now());
                        }
                    }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Información de la feria:");
                    System.out.println("Empresas registradas:");
                    for(int i=0;i<iEmpresa;i++){
                        System.out.println("Nombre: "+empresa[i].getNombre());
                        System.out.println("Sector: "+empresa[i].getSector());
                        System.out.println("Correo: "+empresa[i].getCorreo());
                    }
                    System.out.println("Stands registrados:");
                    for(int i=0;i<iStand;i++){
                        System.out.println("Nombre de la empresa: "+stand[i].getNombre());
                        System.out.println("Número del stand: "+stand[i].getNumUnico());
                        System.out.println("Ubicación: "+stand[i].getUbicacion());
                        System.out.println("Tamaño: "+stand[i].getTamaño());
                    }
                    System.out.println("Visitantes registrados:");
                    for(int i=0;i<iVisitante;i++){
                        System.out.println("Nombre: "+visitante[i].getNombre());
                        System.out.println("ID: "+visitante[i].getIdentificacion());
                        System.out.println("Correo: "+visitante[i].getCorreo());
                        System.out.println("Interacciones registradas");
                        System.out.println("Stand visitado: "+visitante[i].getVisitado());
                        System.out.println("Comentario: "+comentario[i].getComentario()+ "Fecha del comentario: "+comentario[i].getFechaComentario());
                        System.out.println("Calificación: "+comentario[i].getCalificacion());
                    }
                    break;
            }
        }while(opcion!=6);
            System.out.println("Gracias por participar en la feria empresarial");
            System.exit(0);
    }
}