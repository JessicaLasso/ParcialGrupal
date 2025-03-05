
package Helpers;

import LogicaNegocio.Persona;
import java.util.ArrayList;


public class HelperImpresion {
    
    
    public static void ImprimirInfo(ArrayList<Persona> listapersonas) {

        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println("Persona" + (i + 1) + "\n");
            System.out.println("El nombre de la persona es:" + "\t" + listapersonas.get(i).getNombre());
            System.out.println("El apellido de la persona es:" + "\t" + listapersonas.get(i).getApellido());
            System.out.println("El ID de la persona es:" + "\t" + listapersonas.get(i).getId());
            System.out.println("\n");

            for (int j = 0; j < listapersonas.get(i).getListaproducto().size(); j++) {
                System.out.println("Producto" + (j + 1));
                System.out.println("El ID del producto es:" + "\t" + listapersonas.get(i).getListaproducto().get(j).getId());
                System.out.println("El nombre del producto es:" + "\t" + listapersonas.get(i).getListaproducto().get(j).getNombre());
                System.out.println("La descripcion del prodcuto es:" + "\t" + listapersonas.get(i).getListaproducto().get(j).getDescripcion());
                System.out.println("\n");
            }
        }

    }

    public static void BuscarPersona(String id, ArrayList<Persona> lista) {
        int band = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i).getId())) {
                band = 1;
                System.out.println("El nombre de la persona es:" + "\t" + lista.get(i).getNombre());
                System.out.println("El apellido de la persona es:" + "\t" + lista.get(i).getApellido());
                System.out.println("El ID de la persona es:" + "\t" + lista.get(i).getId());
                for (int j = 0; j < lista.get(i).getListaproducto().size(); j++) {
                    System.out.println("Producto" + (j + 1));
                    System.out.println("El ID del prodcuto es:" + "\t" + lista.get(i).getListaproducto().get(j).getId());
                    System.out.println("El nombre del producto es:" + "\t" + lista.get(i).getListaproducto().get(j).getNombre());
                    System.out.println("La descripcion del producto es:" + "\t" + lista.get(i).getListaproducto().get(j).getDescripcion());
                }
            }
        }
        if (band == 0) {
                System.out.println("id no encontrado");
            }
    }
}
