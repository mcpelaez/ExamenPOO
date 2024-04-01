class Empleado extends Persona {
    private String departamento;
    private double salario;
    private String fechaContratacion;

    public Empleado(String nombre, String direccion, String telefono, String correo, String departamento, double salario, String fechaContratacion) {
        super(nombre, direccion, telefono, correo);
        if (departamento.equals("Contabilidad") || departamento.equals("Recursos Humanos") || departamento.equals("Compras")) {
            this.departamento = departamento;
        } else {
            this.departamento = "Recursos Humanos";
        }
        this.salario = salario;
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDepartamento: " + departamento + "\nSalario: " + salario + "\nFecha de Contratación: " + fechaContratacion;
    }
}
