
package ejercicio.trainee;


public class Vehiculo implements Comparable <Vehiculo> {
   private String tipo; //(Auto o Moto)
   private String marca;
   private String modelo;
   private int puertasCilindrada; //cantidad de puertas en caso de auto o cilindrada en caso de moto
   private double precio;

    public Vehiculo(String tipo, String marca, String modelo, int puertasCilindrada, double precio) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.puertasCilindrada = puertasCilindrada;
        this.precio = precio;
    }

    public Vehiculo() {
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getpuertasOCilindrada() {
        return puertasCilindrada;
    }

    public double getPrecio() {
        return precio;
    }

    //metodo para ordenar la lista
    @Override
    public int compareTo(Vehiculo c) {
        if (c.getPrecio()<precio)
        {
            return -1;
        }
        else if (c.getPrecio() <precio)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }  
}
