package app.salmontt.model;

public class Persona {
    private String rut;
    private String nombrePersona;
    private String apellidoPersona;

    public Persona(String rut, String nombrePersona, String apellidoPersona) {
        this.rut = rut;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    @Override
    public String toString() {
        return "RUT= " + rut + '\'' +
                ", Nombre= " + nombrePersona + '\'' +
                ", Apellido= " + apellidoPersona + '\'';
    }
}