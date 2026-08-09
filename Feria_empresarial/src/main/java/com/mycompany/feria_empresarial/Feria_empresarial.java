package com.mycompany.feria_empresarial;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author juan0
 */
public class Feria_empresarial{
    public static void main(String[] args) {
        String nombreFeria="SOFA";
        Scanner sc = new Scanner(System.in);
        int registro=0;
        LocalDateTime fechaInicio=LocalDateTime.now();
        LocalDateTime fechaFin=LocalDateTime.now();
        Visitante visitante[]= new Visitante[100];
        Empresa empresa[]= new Empresa[25];
        Stand stand[]= new Stand[25];
        System.out.println("Bienvenidos al "+nombreFeria);
        System.out.println("Estara abierta de: "+fechaInicio+" hasta "+fechaFin);
        for(int i=0;i<20;i++){//estoy permitiendo un maximo de 20 acciones
            System.out.println("MENU PRINCIPAL\n"
                + "1. Registro de empresas\n"
                + "2. Gestion de stand\n"
                + "3. Registro de visitantes\n"
                + "4. Visitar stand\n"
                + "5. Reporte\n"
                + "6. Salir");
            sc.nextLine();
            int opc=sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1://Registro de empresas
                System.out.println("Ingrese el nombre de la empresa:");
                empresa[registro].setNombre(sc.nextLine());
                System.out.println("Ingrese el sector de la empresa:");
                empresa[registro].setSector(sc.nextLine());
                System.out.println("Ingrese el correo electronico de la empresa:");
                empresa[registro].setCorreoElectronico(sc.nextLine());
                registro++;
                break;
                case 2://Gestion de stand
                System.out.println("Ingrese la ubicacion del stand:");
                stand[registro].setUbicacion(sc.nextLine());
                System.out.println("Ingrese el numero unico del stand:");
                stand[registro].setNumUnico(sc.nextLine());
                System.out.println("Ingrese el tamaño del stand:");
                stand[registro].setTamaño(sc.nextLine());
                registro++;
                break;
                case 3://Registro de visitantes
                System.out.println("Ingrese el nombre del visitante:");
                visitante[registro].setNombre(sc.nextLine());
                System.out.println("Ingrese la identificacion del visitante:");
                visitante[registro].setIdentificacion(sc.nextLine());
                System.out.println("Ingrese el correo electronico del visitante:");
                visitante[registro].setCorreoElectronico(sc.nextLine());
                registro++;
                break;
                case 4://Visitar stand
                System.out.println("Ingrese el nombre del visitante:");
                String nombreVisitante=sc.nextLine();
                System.out.println("Ingrese el numero unico del stand:");
                String numUnicoStand=sc.nextLine();
                boolean visitanteEncontrado=false;
                boolean standEncontrado=false;
                for(int j=0;j<registro;j++){
                    if(visitante[j].getNombre().equals(nombreVisitante)){
                        visitanteEncontrado=true;
                    }else{
                        System.out.println("Visitante no encontrado");
                    }//Cierre de if visitante
                    if(stand[j].getNumUnico().equals(numUnicoStand)){
                        standEncontrado=true;
                    }else{
                        System.out.println("Stand no encontrado");
                    }//Cierre de if stand
                    if(visitanteEncontrado && standEncontrado){
                        System.out.println("El visitante "+nombreVisitante+" ha visitado el stand "+numUnicoStand);
                    }
                }
                break;
                case 5://Reporte
                //empresas registradas y sus stands
                for(int j=0;j<empresa.length;j++){
                    System.out.println("Empresa: "+empresa[j].getNombre());
                    System.out.println("Sector: "+empresa[j].getSector());
                    System.out.println("Correo electronico: "+empresa[j].getCorreoElectronico());
                    System.out.println("Stands:");
                    System.out.println("  - Ubicacion: "+stand[j].getUbicacion());
                    System.out.println("    Numero unico: "+stand[j].getNumUnico());
                    System.out.println("    Tamaño: "+stand[j].getTamaño());
                }
                break;
                case 6://Salir
                    System.out.println("Gracias por visitar el "+nombreFeria);
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}