/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import datos.VehiculoDAO;

import entidades.Vehiculo;

import java.util.List;

public class VehiculoControl {

    private final VehiculoDAO dao;

    public VehiculoControl() {

        dao = new VehiculoDAO();
    }

    public List<Vehiculo> listar() {

        return dao.listar();
    }

    public String insertar(
        Vehiculo obj
    ) {

        if (dao.insertar(obj)) {

            return "OK";

        } else {

            return "Error al guardar";
        }
    }

    public String actualizar(
        Vehiculo obj
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