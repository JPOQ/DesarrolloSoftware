package com.mycompany.feria_empresarial;
import java.time.LocalDateTime;
/**
 *
 * @author juan0
 */
public class Comentario extends Visitante{
    private String comentario;
    private double calificacion;
    private LocalDateTime fechaComentario;
    public Comentario(String nombre, String identificacion, String correoElectronico, String comentario, double calificacion, LocalDateTime fechaComentario) {
        super(nombre, identificacion, correoElectronico);
        this.comentario = comentario;
        this.calificacion = calificacion;
        this.fechaComentario = fechaComentario;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    public LocalDateTime getFechaComentario() {
        return fechaComentario;
    }
    public void setFechaComentario(LocalDateTime fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
}
