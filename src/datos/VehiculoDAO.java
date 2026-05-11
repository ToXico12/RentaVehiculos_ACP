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

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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

    try (Connection cn = CON.conectar();
         PreparedStatement ps = cn.prepareStatement(sql)) {

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
        JOptionPane.showMessageDialog(null, "Error al insertar vehículo: " + e.getMessage());
    }

    return resp;
}
    
    public List<Vehiculo> listar() {

    List<Vehiculo> registros = new ArrayList<>();

    try {

        String sql = "SELECT * FROM vehiculo";

        cn = CON.conectar();

        ps = cn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Vehiculo obj = new Vehiculo();

            obj.setId(rs.getInt("id"));
            obj.setMarca(rs.getString("marca"));
            obj.setModelo(rs.getString("modelo"));
            obj.setAnio(rs.getInt("anio"));
            obj.setColor(rs.getString("color"));
            obj.setPlaca(rs.getString("placa"));
            obj.setPrecioDia(rs.getDouble("precio_dia"));
            obj.setEstado(rs.getString("estado"));
            obj.setActivo(rs.getBoolean("activo"));

            registros.add(obj);
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

    return registros;
    
    
    
    
    
    
    
}
    
    public boolean actualizar(Vehiculo obj) {

    boolean resp = false;

    String sql = "UPDATE vehiculo SET "
            + "marca = ?, "
            + "modelo = ?, "
            + "anio = ?, "
            + "color = ?, "
            + "placa = ?, "
            + "precio_dia = ?, "
            + "estado = ?, "
            + "activo = ? "
            + "WHERE id = ?";

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
        ps.setInt(9, obj.getId());

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
    
    
    
    public boolean eliminar(int id) {

    boolean resp = false;

    String sql = "DELETE FROM vehiculo WHERE id = ?";

    try {

        cn = CON.conectar();

        ps = cn.prepareStatement(sql);

        ps.setInt(1, id);

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