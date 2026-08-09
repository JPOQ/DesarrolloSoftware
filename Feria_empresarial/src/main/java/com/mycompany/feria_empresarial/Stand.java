package com.mycompany.feria_empresarial;
/**
 *
 * @author juan0
 */
public class Stand extends Empresa{
    private String ubicacion;
    private String numUnico;
    private String tamaño;
    public Stand(String nombre, String sector, String correoElectronico, String ubicacion, String numUnico, String tamaño) {
        super(nombre, sector, correoElectronico);
        this.ubicacion = ubicacion;
        this.numUnico = numUnico;
        this.tamaño = tamaño;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getNumUnico() {
        return numUnico;
    }
    public void setNumUnico(String numUnico) {
        this.numUnico = numUnico;
    }
    public String getTamaño() {
        return tamaño;
    }
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}