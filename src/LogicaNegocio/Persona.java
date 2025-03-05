/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LogicaNegocio;

import java.util.ArrayList;

/**
 *
 * @author jessica andrea lasso
 */
public class Persona {
    
    
    public String id, nombre, apellido;
    public ArrayList< Producto> listaproducto;

    public Persona() {
    }

    public Persona(String id, String nombre, String apellido, ArrayList<Producto> listaproducto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listaproducto = listaproducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Producto> getListaproducto() {
        return listaproducto;
    }

    public void setListaproducto(ArrayList<Producto> listaproducto) {
        this.listaproducto = listaproducto;
    }
    
    
    
}
