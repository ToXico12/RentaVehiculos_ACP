/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;

/**
 *
 * @author camil
 */
public class Pago {

    private int id;
    private int alquilerId;
    private double monto;
    private String metodoPago;
    private Date fecha;
    private String estado;
    private String referencia;

    // Constructores

    public Pago() {
    }

    public Pago(int id, int alquilerId, double monto,
                 String metodoPago, Date fecha,
                 String estado, String referencia) {

        this.id = id;
        this.alquilerId = alquilerId;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fecha = fecha;
        this.estado = estado;
        this.referencia = referencia;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlquilerId() {
        return alquilerId;
    }

    public void setAlquilerId(int alquilerId) {
        this.alquilerId = alquilerId;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id=" + id +
                ", alquilerId=" + alquilerId +
                ", monto=" + monto +
                ", metodoPago=" + metodoPago +
                ", fecha=" + fecha +
                ", estado=" + estado +
                ", referencia=" + referencia +
                '}';
    }
}
