package negocio;

import datos.AlquilerDAO;

import entidades.Alquiler;

import java.util.List;

public class AlquilerControl {

    private final AlquilerDAO dao;

    public AlquilerControl() {

        dao = new AlquilerDAO();
    }

    public List<Alquiler> listar() {

        return dao.listar();
    }

    public String insertar(
        Alquiler obj
    ) {

        if (dao.insertar(obj)) {

            return "OK";

        } else {

            return "Error al guardar";
        }
    }

    public String actualizar(
        Alquiler obj
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