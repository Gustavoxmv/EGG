/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.producto;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Gustavo
 */
public class productoDAO extends DAO{
    
    public void GuardarProducto (producto Producto) throws Exception{
    
        try {
            
            if (Producto==null){
            throw new Exception("Debe indicar un producto");
            
            }
           
      
            String sql = "INSERT INTO producto (nombre,precio,codigo_fabricante)"
                    + "VALUES ( '" + Producto.getNombre() +  "' , " + Producto.getPrecio()+ ", " + Producto.getCodigo_fabricante() + " );";

          insertarModificarEliminar(sql);
          
        } catch (Exception e) {
            
            throw e;
        }
    
    }
    
    public void ModificarProducto(producto Producto) throws Exception{
    try {
            
            if (Producto==null){
            throw new Exception("Debe indicar un producto");
            
            }
           
      
            String sql = "UPDATE producto SET "
                    + "nombre = '" + Producto.getNombre() +  "' WHERE codigo = '" + Producto.getCodigo() + "'";

          insertarModificarEliminar(sql);
          
        } catch (Exception e) {
            
            throw e;
        }
    
    
    
    }
    
    public void eliminarProducto(String nombre) throws Exception {
        try {

            String sql = "DELETE FROM producto WHERE nombre = '" + nombre + "'";

            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
    
    
     public producto buscarProdcutoporId(Integer id) throws Exception {
        try {

            String sql = "SELECT codigo,nombre,precio,codigo_fabricante FROM producto "
                    + " WHERE codigo = '" + id + "'";

            consultarBase(sql);

            producto Producto = null;
            while (resultado.next()) {
                Producto = new producto();
                Producto.setCodigo(resultado.getInt(1));
                Producto.setNombre(resultado.getString(2));
                Producto.setPrecio(resultado.getInt(3));
                Producto.setCodigo_fabricante(resultado.getInt(4));
               
            }
            desconectarBase();
            return Producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
     public Collection<producto> listarproducto() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ";

            consultarBase(sql);

            producto Producto = null;
            Collection<producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto = new producto();
                Producto.setNombre(resultado.getString(1));
                Producto.setPrecio(resultado.getInt(2));
               
                productos.add(Producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     
     
     public ArrayList<producto> listarproducto120y202() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto Where precio >=120 and precio <=202 ";

            consultarBase(sql);

            producto Producto = null;
            ArrayList<producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto = new producto();
                Producto.setNombre(resultado.getString(1));
                Producto.setPrecio(resultado.getInt(2));
               
                productos.add(Producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
   

