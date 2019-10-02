
package frame;


//clase que define las características del producto
public class Producto implements Comparable<Producto>{ 
private String nombre; 
private int cantidad; 

//constructor de la clase producto

public Producto(String s, int i) { 
nombre = s; 
cantidad = i; 
                                 } 
//método de la clase object
public String toString(){ 
return ("Nombre: "+nombre+" Cantidad: "+cantidad); 
} 

//métodos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 

    @Override
    public int compareTo(Producto arg0) {
    return nombre.compareTo(arg0.getNombre());
        
    }
} 
