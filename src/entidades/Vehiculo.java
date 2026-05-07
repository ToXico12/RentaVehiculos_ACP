/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author camil
 */
public class Vehiculo {
        private int id;
    private String marca;
    private String modelo;
    private int anio;
    private String color;
    private String placa;
    private double precioDia;
    private String estado;
    private boolean activo;

    // Constructores

    public Vehiculo() {
    }

    public Vehiculo(int id, String marca, String modelo, int anio, String color, String placa, double precioDia, String estado, boolean activo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
        this.placa = placa;
        this.precioDia = precioDia;
        this.estado = estado;
        this.activo = activo;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {
        this.precioDia = precioDia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", marca=" + marca +
                ", modelo=" + modelo +
                ", anio=" + anio +
                ", color=" + color +
                ", placa=" + placa +
                ", precioDia=" + precioDia +
                ", estado=" + estado +
                ", activo=" + activo +
                '}';
    }
}
