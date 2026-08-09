package com.mycompany.feria_empresarial;
/**
 *
 * @author juan0
 */
public class Empresa{
    private String nombre;
    private String sector;
    private String correoElectronico;
    public Empresa(String nombre, String sector, String correoElectronico) {
        this.nombre = nombre;
        this.sector = sector;
        this.correoElectronico = correoElectronico;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}