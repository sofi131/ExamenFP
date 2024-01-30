import utils.Iban;

import java.time.LocalDate;

public class Trabajador extends Candidato{
private NSS nss;
private LocalDate fechaAlta;
private utils.Iban iban;
private Double salario;
    //nos da error al poner extends y nos crea una clase super donde metemos lo de candidato
//    public Trabajador(Nif dni, String apellidosNombre, String direccion, String telefono, String email) {
//        super(dni, apellidosNombre, direccion, telefono, email);
//    }
//y luego creamos un constructor con lo anterior (ya no sirve lo anterior)
    public Trabajador(Nif dni, String apellidosNombre, String direccion, String telefono, String email, NSS nss, LocalDate fechaAlta, Iban iban, Double salario) {
        super(dni, apellidosNombre, direccion, telefono, email);
        this.nss = nss;
        this.fechaAlta = fechaAlta;
        this.iban = iban;
        this.salario = salario;
    }
//--------------------------------getter----------------------------
    public NSS getNss() {
        return nss;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public Iban getIban() {
        return iban;
    }

    public Double getSalario() {
        return salario;
    }
    //------------------------------------setter-----------------------------

    public void setNss(NSS nss) {
        this.nss = nss;
    }

//    public void setFechaAlta(LocalDate fechaAlta) {
//        this.fechaAlta = fechaAlta;
//    }

//    public void setIban(Iban iban) {
//        this.iban = iban;
//    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
