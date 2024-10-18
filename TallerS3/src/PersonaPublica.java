public class PersonaPublica {
    public String direccion;
    public String telefono;
    public String email;

    // Constructor
    public PersonaPublica(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public void cambiarDireccion(String direccion){
        System.out.println("Nueva direccion: " + direccion);
    }

    public void mostrarTelefono(){
        System.out.println("Numero de telefono: " + telefono);
    }
}
