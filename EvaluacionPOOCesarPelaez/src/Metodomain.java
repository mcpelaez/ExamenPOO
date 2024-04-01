import java.util.Scanner;

public class Metodomain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Ingresar datos del estudiante por teclado
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionEstudiante = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEstudiante = scanner.nextLine();
        System.out.print("Correo: ");
        String correoEstudiante = scanner.nextLine();
        System.out.print("Estado (1, 2, 3, 4): ");
        int estadoEstudiante = scanner.nextInt();

        // Crear el estudiante
        Estudiante estudiante = new Estudiante(nombreEstudiante, direccionEstudiante, telefonoEstudiante, correoEstudiante, estadoEstudiante);

        // Limpiar el buffer del scanner
        scanner.nextLine();

        // Ingresar datos del empleado por teclado
        System.out.println("\nIngrese los datos del empleado:");
        System.out.print("Nombre: ");
        String nombreEmpleado = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccionEmpleado = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefonoEmpleado = scanner.nextLine();
        System.out.print("Correo: ");
        String correoEmpleado = scanner.nextLine();
        System.out.print("Departamento (Contabilidad, Recursos Humanos, Compras): ");
        String departamentoEmpleado = scanner.nextLine();
        System.out.print("Salario: ");
        double salarioEmpleado = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer del scanner
        System.out.print("Fecha de Contratación: ");
        String fechaContratacionEmpleado = scanner.nextLine();

        // Crear el empleado
        Empleado empleado = new Empleado(nombreEmpleado, direccionEmpleado, telefonoEmpleado, correoEmpleado, departamentoEmpleado, salarioEmpleado, fechaContratacionEmpleado);

        // Mostrar los datos del estudiante y el empleado
        System.out.println("\nDatos del Estudiante:");
        System.out.println(estudiante);

        System.out.println("\nDatos del Empleado:");
        System.out.println(empleado);

        scanner.close();
    }

		
	}





