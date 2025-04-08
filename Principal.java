import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {

        //Crear el objeto paciente con entrada de datos
        Scanner entrada = new Scanner(System.in);
        Paciente paciente1 = new Paciente();

        //Solicitud del nombre
        System.out.print("Nombre del paciente: ");
        paciente1.nombre = entrada.nextLine();

        //Solicitud de la edad
        System.out.print("Edad del paciente: ");
        paciente1.edad = entrada.nextInt();
        entrada.nextLine();

        //Solicitud del número de expediente
        System.out.println("Número de expediente: ");
        paciente1.numexpediente = entrada.nextLine();

        System.out.println();

        //Mandar a llamar la información que se ingresó
        paciente1.mostrarInformacion();
    }
}