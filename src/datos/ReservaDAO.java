package datos;

import database.Conexion;
import entidades.Reserva;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {

    private final Conexion CON;
    private Connection cn;
    private PreparedStatement ps;

    public ReservaDAO() {

        CON = Conexion.getInstancia();
    }

    // INSERTAR
    public boolean insertar(Reserva obj) {

        boolean resp = false;

        String sql = "INSERT INTO reserva "
                + "(cliente_id, vehiculo_id, "
                + "fecha_inicio, fecha_fin, "
                + "estado, fecha_creacion) "
                + "VALUES (?, ?, ?, ?, ?, ?)";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setInt(1, obj.getClienteId());
            ps.setInt(2, obj.getVehiculoId());

            ps.setDate(
    3,
    new java.sql.Date(
        obj.getFechaInicio().getTime()
    )
);
           ps.setDate(
    4,
    new java.sql.Date(
        obj.getFechaFin().getTime()
    )
);

            ps.setString(5, obj.getEstado());
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
    public List<Reserva> listar() {

        List<Reserva> lista = new ArrayList<>();

    String sql = "SELECT * FROM reserva";

    try {

        cn = CON.conectar();

        ps = cn.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Reserva obj = new Reserva();

            obj.setId(rs.getInt("id"));
            obj.setClienteId(
                rs.getInt("cliente_id")
            );
            obj.setVehiculoId(
                rs.getInt("vehiculo_id")
            );
            obj.setFechaInicio(
                rs.getDate("fecha_inicio")
            );
            obj.setFechaFin(
                rs.getDate("fecha_fin")
            );
            obj.setEstado(
                rs.getString("estado")
            );
            obj.setFechaCreacion(
                rs.getDate("fecha_creacion")
            );

            lista.add(obj);
        }

    } catch (SQLException e) {

        System.out.println(e.getMessage());
    }

    return lista;    }

    // ACTUALIZAR
    public boolean actualizar(Reserva obj) {

        boolean resp = false;

        String sql = "UPDATE reserva SET "
                + "cliente_id = ?, "
                + "vehiculo_id = ?, "
                + "fecha_inicio = ?, "
                + "fecha_fin = ?, "
                + "estado = ?, "
                + "fecha_creacion = ? "
                + "WHERE id = ?";

        try {

            cn = CON.conectar();

            ps = cn.prepareStatement(sql);

            ps.setInt(1, obj.getClienteId());
            ps.setInt(2, obj.getVehiculoId());

            ps.setDate(
    3,
    new java.sql.Date(
        obj.getFechaInicio().getTime()
    )
);
ps.setDate(
    4,
    new java.sql.Date(
        obj.getFechaFin().getTime()
    )
);

            ps.setString(5, obj.getEstado());
ps.setDate(
    6,
    new java.sql.Date(
        obj.getFechaCreacion().getTime()
    )
);

            ps.setInt(7, obj.getId());

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

        String sql = "DELETE FROM reserva WHERE id = ?";

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
