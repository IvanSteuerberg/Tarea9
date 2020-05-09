
package tarea9;

/**
 *
 * @author ivansteuerberg
 */
public class Secretario extends Empregado{
private String numFax;
private String despacho="ten despacho";

    public Secretario(String numFax, String nome, String apelidos, String DNI, String direccion, int antigüedad, String telf, Empregado supervisor, int salario) {
        super(nome, apelidos, DNI, direccion, antigüedad, telf, supervisor, salario);
        this.numFax = numFax;
    }

    public Secretario() {
    super();
    }

    @Override
    public String imprimir() {
        return "Secretario" + "numFax=" + numFax + ", despacho=" + despacho + super.imprimir();
    }

    public String getNumFax() {
        return numFax;
    }

    public void setNumFax(String numFax) {
        this.numFax = numFax;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    @Override
    public void incrementarSalario() {
    int salario = super.getSalario();
        super.setSalario((int)(salario*1.05));
    }
    
    

}
