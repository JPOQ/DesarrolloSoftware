package com.mycompany.parqueadero;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;
/**
 *
 * @author juan0
 */
    public class Parqueadero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo vehiculo[] = new Vehiculo[10];//Lista de vehiculos
        double costoAuto=2000;
        double costoMoto=1000;
        double costoCamion=3000;
        for (int i=0; i<vehiculo.length;i++){
        System.out.println("MENU PARQUEADERO\n"
                + "1. Registro de ingreso\n"
                + "2. Registro de salida\n"
                + "3. Comprobar espacios\n"
                + "4. Salir");
        int opc=sc.nextInt();//Seleccionar opcion
        sc.nextLine();//limpiar scaner
        switch(opc){
            case 1://Ingreso vehiculo
                System.out.println("Ingrese el tipo de vehiculo\n"
                        + "(automovil / motocicleta / camion):");
                String tipoVehiculo = sc.nextLine();
                System.out.println("Ingrese la placa del vehiculo:");
                String placa = sc.nextLine().toLowerCase();
                System.out.println("Ingrese la marca del vehiculo:");
                String marca = sc.nextLine();
                System.out.println("Ingrese el modelo del vehiculo:");
                String modelo = sc.nextLine();
                LocalDateTime horaIngreso = LocalDateTime.now();
                switch(tipoVehiculo.toLowerCase()){
                    case "automovil":
                        System.out.println("Ingrese el tipo de combustible del automovil:\n"
                                + "(diesel / combustible / electrico)");
                        String tipoCombustible = sc.nextLine();
                        vehiculo[i] = new Automovil(placa, marca, modelo, tipoCombustible);
                        break;
                    case "motocicleta":
                        System.out.println("Ingrese la cilindrada de la motocicleta: (cc)");
                        int cilindrada = sc.nextInt();
                        sc.nextLine();
                        vehiculo[i] = new Motocicleta(placa, marca, modelo, cilindrada);
                        break;
                    case "camion":
                        System.out.println("Ingrese la capacidad de carga del camion(Kg):");
                        double capacidadCarga = sc.nextDouble();
                        sc.nextLine();
                        vehiculo[i] = new Camion(placa, marca, modelo, capacidadCarga);
                        break;
                    default:
                        System.out.println("Tipo de vehiculo invalido o no identificado");
                }
                break;
            case 2://Salida vehiculo
                System.out.println("Ingrese la placa del vehiculo a retirar");
                String retiro=sc.nextLine();
                boolean existe=false;
                double costo=0;
                for(int j=0;j<vehiculo.length;j++){
                    if(vehiculo[j]!=null && vehiculo[j].getPlaca().equals(retiro.toLowerCase())){//se busca la placa
                        existe=true;//Se encuentra la placa
                        LocalDateTime horaSalida = LocalDateTime.now();
                        Duration duracion = Duration.between(vehiculo[j].getHoraIngreso(), horaSalida);
                        switch(vehiculo[j].getClass().getSimpleName().toLowerCase()){//valida el tipo de vehiculo
                            case "automovil":
                                costo=duracion.toHours()*costoAuto;
                                break;
                            case "motocicleta":
                                costo=duracion.toHours()*costoMoto;
                                break;
                            case "camion":
                                costo=duracion.toHours()*costoCamion;
                                break;
                        }
                        System.out.println("Costo a pagar: "+costo);
                        vehiculo[j]=null;//Retira vehiculo
                        System.out.println("Vehiculo retirado exitosamente");
                    }else{
                        System.out.println("Placa no encontrada o no reconocida");
                    }
                }
                break;
            case 3://Conteo de espacios
                int espacioLibre=0;
                for(Vehiculo v:vehiculo){
                    if(v==null){
                        espacioLibre++;
                    }
                }
                System.out.println("Espacios disponibles: "+espacioLibre+"\n"
                        + "Espacios ocupados: "+(vehiculo.length-espacioLibre));
                break;
            case 4://Salir
                System.out.println("Cerrando\n");
                System.exit(0);//Detener el programa
                break;
            default://opciones invalidas
                System.out.println("Ha seleccionado una opcion invalida");
        }
        }
        }
    }