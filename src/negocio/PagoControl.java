package negocio;

import datos.PagoDAO;

import entidades.Pago;

import java.util.List;

public class PagoControl {

    private final PagoDAO dao;

    public PagoControl() {

        dao = new PagoDAO();
    }

    public List<Pago> listar() {

        return dao.listar();
    }

    public String insertar(
        Pago obj
    ) {

        if (dao.insertar(obj)) {

            return "OK";

        } else {

            return "Error al guardar";
        }
    }

    public String actualizar(
        Pago obj
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
