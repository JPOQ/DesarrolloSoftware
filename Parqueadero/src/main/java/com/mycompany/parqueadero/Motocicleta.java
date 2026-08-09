/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parqueadero;

/**
 *
 * @author juan0
 */
public class Motocicleta extends Vehiculo {
        private int cilindrada;

        public Motocicleta(String placa, String marca, String modelo, int cilindrada) {
            super(placa, marca, modelo);
            this.cilindrada = cilindrada;
        }

        public int getCilindrada() {
            return cilindrada;
        }

        public void setCilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
        }
    }