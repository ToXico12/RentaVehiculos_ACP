/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.ClienteDAO;

import entidades.Cliente;

import java.util.List;

public class ClienteControl {

    private final ClienteDAO dao;

    public ClienteControl() {

        dao = new ClienteDAO();
    }

    public List<Cliente> listar() {

        return dao.listar();
    }

    public String insertar(
        Cliente obj
    ) {

        if (dao.insertar(obj)) {

            return "OK";

        } else {

            return "Error al guardar";
        }
    }

    public String actualizar(
        Cliente obj
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
