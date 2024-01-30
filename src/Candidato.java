public class Candidato {
    private final Nif dni;
    //en el paquete utils va el nif ((que ene ste caso está dentro)
    private String apellidosNombre;
    private String direccion;
    private String telefono;
    private String email;
//clase constructor de Candidato
    public Candidato(Nif dni, String apellidosNombre, String direccion, String telefono, String email) {
        this.dni = dni;
        this.apellidosNombre = apellidosNombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }
//-----------------------------------------------getter-----------------------------
    public Nif getDni() {
        return dni;
    }

    public String getApellidosNombre() {
        return apellidosNombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
//--------------------------------------setter------------------------------------
    public void setApellidosNombre(String apellidosNombre) {
        this.apellidosNombre = apellidosNombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //-------------------------------------------------toString---------------------------


    @Override
    public String toString() {
        return "Candidato{" +
                "dni=" + dni +
                ", apellidosNombre='" + apellidosNombre + '\'' +
                '}';
    }
//esto habrá que cambiarlo
//    @Override
//    public String toString() {
//        return "[" + dni + "] " + apellidosNombre;
//    }
}

