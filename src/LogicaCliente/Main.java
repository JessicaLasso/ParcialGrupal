
package LogicaCliente;

import Helpers.HelperValidacion;
import LogicaNegocio.Producto;
import LogicaNegocio.Persona;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
          //abstaccion tiene los atyributos 
        String idPer = null, nombreper, apellido;
        String idProd, nombreprod, descripcion;
        int rta, conteo, opc = 0, num_productos;
        
        // Se crea la lista de compuitador y persona
// Se crea la lista global = null para que se borre la información y no se sobreescriba 
        ArrayList<Producto> listaproductosglobal;
        ArrayList<Persona> listaPersona = new ArrayList<>();
        
        Producto prod;
        Persona per;
        
                do {
            System.out.println("1. Registar Persona");
            System.out.println("2. Mostrar Persona");
            System.out.println("3. Buscar persona");
            System.out.println("4. Salir");

            System.out.println("Digite una opcion valida");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    ArrayList<Producto> listaproductoslocal = new ArrayList<>();
                    System.out.println("Digite el numero de productos");
                    num_productos = scan.nextInt();

                    for (int i = 0; i < num_productos; i++) {
                        scan.nextLine();
                        // TO DO computador
                        System.out.println("Digite el ID del producto");
                        idProd = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(idProd);

                        while (rta > 0) {
                            System.out.println("Digite el ID del producto");
                            idProd = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(idProd);
                        }

                        conteo = HelperValidacion.ValidarTodoSerial(idProd);

                        while (conteo != 0) {
                            System.out.println("Digite el ID del producto");
                            idProd = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodoSerial(idProd);

                        }

                        System.out.println("Digite el nombre del producto");
                        nombreprod = scan.nextLine();

                        rta = HelperValidacion.ValidarVacio(nombreprod);

                        while (rta > 0) {
                            System.out.println("Digite el nombre del producto");
                            nombreprod = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(nombreprod);
                        }

                        conteo = HelperValidacion.ValidarTodo(nombreprod);

                        while (conteo != 0) {
                            System.out.println("Digite el nombre del producto");
                            nombreprod = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(nombreprod);

                        }

                        System.out.println("Digite la descripcion del producto");
                        descripcion = scan.nextLine();

                        rta = HelperValidacion.ValidarVacio(descripcion);

                        while (rta > 0) {
                            System.out.println("Digite la descripcion del producto");
                            descripcion = scan.nextLine();
                            rta = HelperValidacion.ValidarVacio(descripcion);
                        }

                        conteo = HelperValidacion.ValidarTodo(descripcion);

                        while (conteo != 0) {
                            System.out.println("Digite la descripcion del producto");
                            descripcion = scan.nextLine();
                            conteo = HelperValidacion.ValidarTodo(descripcion);

                        }

                       prod = new Producto(idProd, nombreprod, descripcion);
                       listaproductoslocal.add(prod);
                   
                    }

                    listaproductosglobal = listaproductoslocal;
                    listaproductoslocal = null;

                    //TO DO Persona
                    System.out.println("Digite el nombre de la persona");
                    nombreper = scan.nextLine();
                    rta = HelperValidacion.ValidarVacio(nombreper);

                    while (rta > 0) {
                        System.out.println("Digite el nombre de la persona");
                        nombreper = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(nombreper);
                    }

                    conteo = HelperValidacion.ValidarTodo(nombreper);

                    while (conteo != 0) {
                        System.out.println("Digite el nombre de la persona");
                        nombreper = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodo(nombreper);

                    }

                    System.out.println("Digite el apellido de la persona");
                    apellido = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(apellido);

                    while (rta > 0) {
                        System.out.println("Digite el apellido de la persona");
                        apellido = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(apellido);
                    }

                    conteo = HelperValidacion.ValidarTodo(apellido);

                    while (conteo != 0) {
                        System.out.println("Digite el apellido de la persona");
                        apellido = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodo(apellido);

                    }

                    System.out.println("Digite el ID de la persona");
                    idPer = scan.nextLine();

                    rta = HelperValidacion.ValidarVacio(idPer);

                    while (rta > 0) {
                        System.out.println("Digite la ID de la persona");
                        idPer = scan.nextLine();
                        rta = HelperValidacion.ValidarVacio(idPer);
                    }

                    conteo = HelperValidacion.ValidarTodoLetra(idPer);

                    while (conteo != 0) {
                        System.out.println("Digite la ID de la persona");
                        idPer = scan.nextLine();
                        conteo = HelperValidacion.ValidarTodoLetra(idPer);

                    }


                    // En esta parte se hace la asociación
                    
                    
                    per = new Persona(idPer, nombreper, apellido, listaproductosglobal);
                    listaPersona.add(per);
                  
                    break;
                // cambio la forma de imprimir, es con helperImpresion
                case 2:
                    Helpers.HelperImpresion.ImprimirInfo(listaPersona);
                    break;
                case 3:
                    Helpers.HelperImpresion.BuscarPersona(idPer, listaPersona);
                    
                    break;
                case 4:
                    break;
            }

        } while (opc != 4);

    }
        
        
    
    
}
