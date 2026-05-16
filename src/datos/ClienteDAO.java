/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import entidades.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private final Conexion CON;
    private Connection cn;
    private PreparedStatement ps;

    public ClienteDAO() {

        CON = Conexion.getInstancia();
    }

    // INSERTAR
    public boolean insertar(Cliente obj) {

        boolean resp = false;

        String sql = "INSERT INTO cliente "
                + "(nombre, tipo_documento, num_documento, "
                + "direccion, telefono, email, activo) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getTipoDocumento());
            ps.setString(3, obj.getNumDocumento());
            ps.setString(4, obj.getDireccion());
            ps.setString(5, obj.getTelefono());
            ps.setString(6, obj.getEmail());
            ps.setBoolean(7, obj.isActivo());

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

    // LISTAR
    public List<Cliente> listar() {

        List<Cliente> registros = new ArrayList<>();

        try {

            String sql = "SELECT * FROM cliente";

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Cliente obj = new Cliente();

                obj.setId(rs.getInt("id"));
                obj.setNombre(rs.getString("nombre"));
                obj.setTipoDocumento(rs.getString("tipo_documento"));
                obj.setNumDocumento(rs.getString("num_documento"));
                obj.setDireccion(rs.getString("direccion"));
                obj.setTelefono(rs.getString("telefono"));
                obj.setEmail(rs.getString("email"));
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

    // ACTUALIZAR
    public boolean actualizar(Cliente obj) {

        boolean resp = false;

        String sql = "UPDATE cliente SET "
                + "nombre = ?, "
                + "tipo_documento = ?, "
                + "num_documento = ?, "
                + "direccion = ?, "
                + "telefono = ?, "
                + "email = ?, "
                + "activo = ? "
                + "WHERE id = ?";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setString(1, obj.getNombre());
            ps.setString(2, obj.getTipoDocumento());
            ps.setString(3, obj.getNumDocumento());
            ps.setString(4, obj.getDireccion());
            ps.setString(5, obj.getTelefono());
            ps.setString(6, obj.getEmail());
            ps.setBoolean(7, obj.isActivo());
            ps.setInt(8, obj.getId());

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

    // ELIMINAR
    public boolean eliminar(int id) {

        boolean resp = false;

        String sql = "DELETE FROM cliente WHERE id = ?";

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