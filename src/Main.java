import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Producto> prod = new ArrayList<Producto>();

    public static void main(String[] args) {
        menuprincipal();
        }


    public static void menuprincipal(){
        Scanner sn = new Scanner(System.in);
        int opcion = 0;

        while (true){
            saludoOpciones();
            System.out.print("Digite una opcion: ");
            opcion = sn.nextInt();

            if (opcion == 0){
                System.out.println("Saliendo del sistema");
                break;
            }


            try{
                switch (opcion){
                    case 1:
                        agregar();
                        break;
                    case 2:
                        modificar();
                        break;
                    case 3:
                        consultarListado();
                        break;
                    default:
                        System.out.println("Digite una opcion valida");
                }


            }catch (Exception e){
                System.out.println("Digite una opcion valida");
            }

        }
    }

    private static void agregar() {
        String nombre, modelo, color, ram, marca, numTelefono, compania, sistemaOperativo, gama;
        int tipo;

        Scanner ag = new Scanner(System.in);

        System.out.print("Digite el nombre: ");
        nombre = ag.nextLine();
        System.out.print("Digite el modelo: ");
        modelo = ag.nextLine();
        System.out.print("Digite el color: ");
        color = ag.nextLine();
        System.out.print("Digite el tamanio de ram: ");
        ram = ag.nextLine();
        System.out.print("Digite la marca: ");
        marca = ag.nextLine();

        System.out.println("Que tipo de articulo es:\n" + "1- Telefono movil\n" + "2- Laptop");
        System.out.print("Digite el tipo de articulo: ");
        tipo = ag.nextInt();
        ag.nextLine();
        switch (tipo){
            case 1:
                System.out.print("Digite la numero de telefono: ");
                numTelefono = ag.nextLine();
                System.out.print("Digite la compania: ");
                compania = ag.nextLine();


                Telefono tel = new Telefono(nombre, modelo, color, ram, marca, numTelefono, compania);

                tel.obtenerPrecio();

                prod.add(tel);
                break;
            case 2:
                System.out.print("Digite el sistema operativo: ");
                sistemaOperativo = ag.nextLine();
                System.out.print("Digite la gama: ");
                gama = ag.nextLine();

                Laptop lap = new Laptop(nombre, modelo, color, ram, marca, sistemaOperativo, gama);
                lap.obtenerPrecio();

                prod.add(lap);
                break;
            default:
                System.out.println("Digite una opcion valida");
        }



    }

    private static void modificar() {
        String nombre, color;
        Scanner sn = new Scanner(System.in);

        System.out.print("Digite el nombre del producto: ");
        nombre = sn.nextLine();

        for (int i = 0; i < prod.size(); i++) {
            if (prod.get(i).getNombre().equals(nombre)) {
                System.out.print("Digite el nuevo color: ");
                color = sn.nextLine();
                prod.get(i).setColor(color);
            }
            else {
                System.out.println("Producto no encontrado");
            }
        }
    }

    private static void consultarListado() {
        for (int i = 0; i < prod.size(); i++) {
            System.out.println("El articulo " + (i + 1) + " tiene las siguites caracteristicas");
            System.out.println("El nombre: " + prod.get(i).getNombre());
            System.out.println("El modelo: " + prod.get(i).getModelo());
            System.out.println("El color: " + prod.get(i).getColor());
            System.out.println("El tamanio de ram: " + prod.get(i).getRam());
            System.out.println("La marca: " + prod.get(i).getMarca());

        }
    }

    public static void saludoOpciones(){
        System.out.println("\nBienvenido a ELectroMart\n" +
                "En este sistema tiene las siguiente opciones:\n" +
                "1- Agregar\n" +
                "2- Modificar\n" +
                "3- Consultar listado de articulos\n" +
                "0- Salir\n");
    }
}