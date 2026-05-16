/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import entidades.Pago;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class PagoDAO {

    private final Conexion CON;

    private Connection cn;

    private PreparedStatement ps;

    public PagoDAO() {

        CON = Conexion.getInstancia();
    }

    // INSERTAR

    public boolean insertar(Pago obj) {

        boolean resp = false;

        String sql =
            "INSERT INTO pago "
            + "(alquiler_id, monto, "
            + "metodo_pago, fecha, "
            + "estado, referencia) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setInt(
                1,
                obj.getAlquilerId()
            );

            ps.setDouble(
                2,
                obj.getMonto()
            );

            ps.setString(
                3,
                obj.getMetodoPago()
            );

            ps.setDate(
                4,
                new java.sql.Date(
                    obj.getFecha().getTime()
                )
            );

            ps.setString(
                5,
                obj.getEstado()
            );

            ps.setString(
                6,
                obj.getReferencia()
            );

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

    public List<Pago> listar() {

        List<Pago> lista =
            new ArrayList<>();

        String sql =
            "SELECT * FROM pago";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ResultSet rs =
                ps.executeQuery();

            while (rs.next()) {

                Pago obj =
                    new Pago();

                obj.setId(
                    rs.getInt("id")
                );

                obj.setAlquilerId(
                    rs.getInt("alquiler_id")
                );

                obj.setMonto(
                    rs.getDouble("monto")
                );

                obj.setMetodoPago(
                    rs.getString(
                        "metodo_pago"
                    )
                );

                obj.setFecha(
                    rs.getDate("fecha")
                );

                obj.setEstado(
                    rs.getString("estado")
                );

                obj.setReferencia(
                    rs.getString(
                        "referencia"
                    )
                );

                lista.add(obj);
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }

        return lista;
    }

    // ACTUALIZAR

    public boolean actualizar(
        Pago obj
    ) {

        boolean resp = false;

        String sql =
            "UPDATE pago SET "
            + "alquiler_id = ?, "
            + "monto = ?, "
            + "metodo_pago = ?, "
            + "fecha = ?, "
            + "estado = ?, "
            + "referencia = ? "
            + "WHERE id = ?";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setInt(
                1,
                obj.getAlquilerId()
            );

            ps.setDouble(
                2,
                obj.getMonto()
            );

            ps.setString(
                3,
                obj.getMetodoPago()
            );

            ps.setDate(
                4,
                new java.sql.Date(
                    obj.getFecha().getTime()
                )
            );

            ps.setString(
                5,
                obj.getEstado()
            );

            ps.setString(
                6,
                obj.getReferencia()
            );

            ps.setInt(
                7,
                obj.getId()
            );

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

        String sql =
            "DELETE FROM pago "
            + "WHERE id = ?";

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