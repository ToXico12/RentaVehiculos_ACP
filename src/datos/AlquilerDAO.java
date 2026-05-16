/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import database.Conexion;
import entidades.Alquiler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class AlquilerDAO {

    private final Conexion CON;

    private Connection cn;

    private PreparedStatement ps;

    public AlquilerDAO() {

        CON = Conexion.getInstancia();
    }

    // INSERTAR

    public boolean insertar(Alquiler obj) {

        boolean resp = false;

        String sql =
            "INSERT INTO alquiler "
            + "(reserva_id, fecha_inicio, "
            + "fecha_fin, costo_total, "
            + "estado, fecha_creacion) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setInt(1, obj.getReservaId());

            ps.setDate(
                2,
                new java.sql.Date(
                    obj.getFechaInicio().getTime()
                )
            );

            ps.setDate(
                3,
                new java.sql.Date(
                    obj.getFechaFin().getTime()
                )
            );

            ps.setDouble(
                4,
                obj.getCostoTotal()
            );

            ps.setString(
                5,
                obj.getEstado()
            );

            ps.setDate(
                6,
                new java.sql.Date(
                    obj.getFechaCreacion().getTime()
                )
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

    public List<Alquiler> listar() {

        List<Alquiler> lista =
            new ArrayList<>();

        String sql =
            "SELECT * FROM alquiler";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ResultSet rs =
                ps.executeQuery();

            while (rs.next()) {

                Alquiler obj =
                    new Alquiler();

                obj.setId(
                    rs.getInt("id")
                );

                obj.setReservaId(
                    rs.getInt("reserva_id")
                );

                obj.setFechaInicio(
                    rs.getDate("fecha_inicio")
                );

                obj.setFechaFin(
                    rs.getDate("fecha_fin")
                );

                obj.setCostoTotal(
                    rs.getDouble("costo_total")
                );

                obj.setEstado(
                    rs.getString("estado")
                );

                obj.setFechaCreacion(
                    rs.getDate(
                        "fecha_creacion"
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
        Alquiler obj
    ) {

        boolean resp = false;

        String sql =
            "UPDATE alquiler SET "
            + "reserva_id = ?, "
            + "fecha_inicio = ?, "
            + "fecha_fin = ?, "
            + "costo_total = ?, "
            + "estado = ?, "
            + "fecha_creacion = ? "
            + "WHERE id = ?";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setInt(
                1,
                obj.getReservaId()
            );

            ps.setDate(
                2,
                new java.sql.Date(
                    obj.getFechaInicio().getTime()
                )
            );

            ps.setDate(
                3,
                new java.sql.Date(
                    obj.getFechaFin().getTime()
                )
            );

            ps.setDouble(
                4,
                obj.getCostoTotal()
            );

            ps.setString(
                5,
                obj.getEstado()
            );

            ps.setDate(
                6,
                new java.sql.Date(
                    obj.getFechaCreacion().getTime()
                )
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
            "DELETE FROM alquiler "
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
