package tarea9;

/**
 *
 * @author ivansteuerberg
 */
public class Empregado {
private String nome;
private String apelidos;
private String DNI;
private String direccion;
private int antigüedad;
private String telf;
private Empregado supervisor;
private int salario;

    public Empregado(String nome, String apelidos, String DNI, String direccion, int antigüedad, String telf, Empregado supervisor, int salario) {
        this.nome = nome;
        this.apelidos = apelidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.antigüedad = antigüedad;
        this.telf = telf;
        this.supervisor = supervisor;
        this.salario = salario;
    }

    public Empregado() {
    }

    public String imprimir() {
        return "nome=" + nome + ", apelidos=" + apelidos + ", DNI=" + DNI +
               ", direccion=" + direccion + ", antigüedad=" + antigüedad + ", telf=" + telf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
        this.apelidos = apelidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getAntigüedad() {
        return antigüedad;
    }

    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public Empregado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empregado supervisor) {
        this.supervisor = supervisor;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


    public void incrementarSalario(){
      
    }




}
