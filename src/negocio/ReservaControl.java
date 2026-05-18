package negocio;

import datos.ReservaDAO;

import entidades.Reserva;

import java.util.List;

public class ReservaControl {

    private final ReservaDAO dao;

    public ReservaControl() {

        dao = new ReservaDAO();
    }

    public List<Reserva> listar() {

        return dao.listar();
    }

    public String insertar(
        Reserva obj
    ) {

        if (dao.insertar(obj)) {

            return "OK";

        } else {

            return "Error al guardar";
        }
    }

    public String actualizar(
        Reserva obj
    ) {

        if (dao.actualizar(obj)) {

            return "OK";

        } else {

            return "Error al actualizar";
        }
    }

    public String eliminar(int id) {

        if (dao.eliminar(id)) {

            return "OK";

        } else {

            return "Error al eliminar";
        }
    }
}