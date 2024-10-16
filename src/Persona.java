public class Persona {
    public String Nombre;
    public int edad;

    public Persona(String nombre, int edad){
        this.Nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        return "Nombre: " + Nombre + " Edad: " + edad +".";   
    }
    
}
