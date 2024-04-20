import java.util.Scanner;

public class Laptop extends Producto implements Especificaciones{
    // Atributos
    private String sistemaOperativo;
    private String gama;

    // Método constructor vacio
    public Laptop(){}

    // Método constructor con parametros
    public Laptop(String nombre, String modelo, String color, String ram, String marca, String sistemaOperativo, String gama){
        super.setNombre(nombre);
        super.setModelo(modelo);
        super.setColor(color);
        super.setRam(ram);
        super.setMarca(marca);
        this.sistemaOperativo = sistemaOperativo;
        this.gama = gama;
    }

    // Implementacion de metodos
    @Override
    public void obtenerPrecio() {
        double cantidad;
        Scanner lapp = new Scanner(System.in);

        System.out.print("Digite el precio de la laptop: ");
        cantidad = lapp.nextDouble();
    }

    @Override
    public void descripcionArticulo() {
        String desc;
        Scanner lapd = new Scanner(System.in);

        System.out.print("Digite la descripcion de la laptop: ");
        desc = lapd.nextLine();
    }

    // Métodos Getter y Setter
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }
}
