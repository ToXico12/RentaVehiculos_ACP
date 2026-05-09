/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import entidades.Vehiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehiculoDAO {

    private final Conexion CON;
    private Connection cn;
    private PreparedStatement ps;

    public VehiculoDAO() {
        CON = Conexion.getInstancia();
    }

    public boolean insertar(Vehiculo obj) {

        boolean resp = false;

        String sql = "INSERT INTO vehiculo "
                + "(marca, modelo, anio, color, placa, precio_dia, estado, activo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setString(1, obj.getMarca());
            ps.setString(2, obj.getModelo());
            ps.setInt(3, obj.getAnio());
            ps.setString(4, obj.getColor());
            ps.setString(5, obj.getPlaca());
            ps.setDouble(6, obj.getPrecioDia());
            ps.setString(7, obj.getEstado());
            ps.setBoolean(8, obj.isActivo());

            if (ps.executeUpdate() > 0) {
                resp = true;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            try {
                ps.close();
                CON.desconectar();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return resp;
    }
}