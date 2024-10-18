import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonaPrivada priv1 = new PersonaPrivada("Joel",20,1.70);

        priv1.mostrarDatos();
        priv1.esMayorDeEdad();

        PersonaPublica pub1 = new PersonaPublica("Quitumbe","0986351534","joel.torres@epn.edu.ec");
        System.out.println("Ingrese la nueva direccion: ");
        String nuevaDir = sc.nextLine();
        pub1.cambiarDireccion(nuevaDir);
        pub1.mostrarTelefono();
    }
}