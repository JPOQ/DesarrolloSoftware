package com.mycompany.feria_empresarial;
/**
 *
 * @author juan0
 */
public class Visitante{
    private String nombre;
    private String identificacion;
    private String correoElectronico;

    public Visitante(String nombre, String identificacion, String correoElectronico) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public void  setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}