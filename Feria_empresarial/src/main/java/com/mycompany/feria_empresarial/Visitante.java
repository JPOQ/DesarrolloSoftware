package com.mycompany.feria_empresarial;
/**
 *
 * @author juan0
 */
public class Visitante{
    private String nombre;
    private String identificacion;
    private String correo;
    private String visitado;
    public Visitante(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
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
    public String getCorreo() {
        return correo;
    }
    public void setCorreoElectronico(String correo) {
        this.correo = correo;
    }
    public String getVisitado(){
        return visitado;
    }
    public void setVisitado(String visitado){
        this.visitado = visitado;
    }
}