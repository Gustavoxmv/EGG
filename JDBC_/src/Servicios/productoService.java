/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.producto;
import Persistencia.productoDAO;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class productoService {

    private productoDAO dao;

    public productoService() {
        this.dao = new productoDAO();
    }

    public void crearProducto(String nombre, int precio, int codigo_fabricante) throws Exception {

        try {
            //Validamos

            //Creamos el usuario
            producto Producto = new producto();
            Producto.setNombre(nombre);
            Producto.setPrecio(precio);
            Producto.setCodigo_fabricante(codigo_fabricante);

            dao.GuardarProducto(Producto);
        } catch (Exception e) {
            throw e;
        }
    }

    public void borrarProducto(String nombre) throws Exception {

        try {
            //Validamos

            //Creamos el usuario
            producto Producto = new producto();
            Producto.setNombre(nombre);

            dao.eliminarProducto(nombre);

        } catch (Exception e) {
            throw e;
        }
    }

    public producto buscarProductoPorId(Integer id) throws Exception {

        try {

            //Validamos
            if (id == null) {
                throw new Exception("Debe indicar el id");
            }

            producto Producto = new producto();
            Producto.setCodigo(id);

            return Producto;
        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProductoPorid(int id, String nombre) throws Exception {

        //Buscamos
        try {
            producto Producto = buscarProductoPorId(id);

            //Modificamos
            Producto.setNombre(nombre);

            dao.ModificarProducto(Producto);
        } catch (Exception e) {
            throw e;
        }

    }

    public Collection<producto> listarProducto() throws Exception {

        try {

            Collection<producto> productos = dao.listarproducto();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public Collection<producto> listarProducto120() throws Exception {

        try {

            Collection<producto> productos = dao.listarproducto120y202();

            return productos;
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductos() throws Exception {

        try {

            //Listamos los usuarios
            Collection<producto> productos = listarProducto();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (producto u : productos) {
                    System.out.println(u.getNombre() );
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
       public void imprimirProductosprecios() throws Exception {

        try {

            //Listamos los usuarios
            Collection<producto> productos = listarProducto();

            //Imprimimos los usuarios
            if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (producto u : productos) {
                    System.out.println(u.getNombre() + " Precio = " + u.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }
    
    
    public void imprimirProductos120() throws Exception{
    
        try {
             Collection<producto> productos = listarProducto120();
                 if (productos.isEmpty()) {
                throw new Exception("No existen usuarios para imprimir");
            } else {
                for (producto u : productos) {
                    System.out.println(u.getNombre() + " Precio = " + u.getPrecio());
                }
            }
            
        } catch (Exception e) {
            
            
            
        }
    
    
    }
}
