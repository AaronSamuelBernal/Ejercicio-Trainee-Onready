
package ejercicio.trainee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;


public class Main {


    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.00");
        Vehiculo auto1 = new Vehiculo ("Auto","Peugeot","206",4,200000.00);
        Vehiculo moto1 = new Vehiculo ("Moto","Honda","Titan",125,60000.00);
        Vehiculo auto2 = new Vehiculo ("Auto","Peugeot","208",5,250000.00);
        Vehiculo moto2 = new Vehiculo ("Moto","Yamaha","YBR",160,80500.50);
        
        ArrayList <Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(auto1);
        vehiculos.add(moto1);
        vehiculos.add(auto2);
        vehiculos.add(moto2);
        
        for (Vehiculo v: vehiculos)
        {
            if (v.getTipo()=="Auto")
            {
                System.out.println("Marca: "+v.getMarca()+ " // Modelo: "+v.getModelo()+" // Puertas: "+v.getpuertasOCilindrada()+" // Precio: "+formato.format(v.getPrecio()));
            }
            else
            {
                System.out.println("Marca: "+v.getMarca()+ " // Modelo: "+v.getModelo()+" // Cilindrada: "+v.getpuertasOCilindrada()+"cc // Precio: "+formato.format(v.getPrecio()));
            }
        }
        System.out.println("=============================");
        
        double precioMayor = auto1.getPrecio();
        String nombreMayor = auto1.getMarca()+" "+auto1.getModelo();
        
        String nombreMenor = auto1.getMarca()+ " "+auto1.getModelo();
        double precioMenor = auto1.getPrecio();
        
        
        for (Vehiculo h: vehiculos)
        {
            if(h.getPrecio() < precioMenor )
            {
                nombreMenor = h.getMarca()+" "+h.getModelo();
                precioMenor = h.getPrecio();
            }
            if(h.getPrecio() > precioMayor )
            {
                nombreMayor = h.getMarca()+" "+h.getModelo();
                precioMayor = h.getPrecio();
            }
            
        }
        
        System.out.println("Vehículo más caro: "+nombreMayor);
        System.out.println("Vehículo más barato: "+nombreMenor);
        for (Vehiculo c: vehiculos)
        {
            if(c.getModelo().contains("Y")||(c.getModelo().contains("y")))
            {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: "+c.getMarca()+" "+c.getModelo()+" "+formato.format(c.getPrecio()));
            }
            
        }
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        Collections.sort(vehiculos);
        for (Vehiculo J: vehiculos)
        {
            System.out.println(J.getMarca()+" "+J.getModelo());
        }

 
        
    }
    
}
