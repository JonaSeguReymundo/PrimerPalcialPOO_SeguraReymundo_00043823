import java.util.Scanner;

public class Telefono extends Producto implements Especificaciones{
    // Atributos
    private String numTelefono;
    private String compania;

    // Método constructor vacio
    public Telefono(){}

    // Método constructor co parametros
    public Telefono(String nombre, String modelo, String color, String ram, String marca, String numTelefono, String compania){
        super.setNombre(nombre);
        super.setModelo(modelo);
        super.setColor(color);
        super.setRam(ram);
        super.setMarca(marca);
        this.numTelefono = numTelefono;
        this.compania = compania;
    }

    // Implementacion de metodos
    @Override
    public void obtenerPrecio() {
        double cantidad;
        Scanner telp = new Scanner(System.in);

        System.out.print("Digite el precio del telefono: ");
        cantidad = telp.nextDouble();
    }

    @Override
    public void descripcionArticulo() {
        String desc;
        Scanner teld = new Scanner(System.in);

        System.out.print("Digite la descripcion del telefono: ");
        desc = teld.nextLine();
    }

    // Métodos Getter y Setter
    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }
}
