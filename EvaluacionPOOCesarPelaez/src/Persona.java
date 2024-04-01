class Persona {
    protected String nombre;
    protected String direccion;
    protected String telefono;
    protected String correo;

    public Persona(String nombre, String direccion, String telefono, String correo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nDirección: " + direccion + "\nTeléfono: " + telefono + "\nCorreo: " + correo;
    }
}
