package proyectopaqueteria.programacionclienteservidor;
public class Operacion {

    private String cedula;
    private String primAp;
    private String segAp;
    private String nombre;
    private String direcc;
    private String telef;
    private double salario;

    public Operacion() {
        this.cedula = "";
        this.primAp = "";
        this.segAp = "";
        this.nombre = "";
        this.direcc = "";
        this.telef = "";
        this.salario = 0.00;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimAp() {
        return primAp;
    }

    public void setPrimAp(String primAp) {
        this.primAp = primAp;
    }

    public String getSegAp() {
        return segAp;
    }

    public void setSegAp(String segAp) {
        this.segAp = segAp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    public String getTelef() {
        return telef;
    }

    public void setTelef(String telef) {
        this.telef = telef;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
