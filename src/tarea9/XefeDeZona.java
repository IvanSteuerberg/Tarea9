package tarea9;

import java.util.ArrayList;

/**
 *
 * @author ivansteuerberg
 */
public class XefeDeZona extends Empregado{
private String despacho="ten despacho";   
private ArrayList<String> listaVendedores;
private Coche coche;
private Secretario secretario;

    public XefeDeZona(ArrayList<String> listaVendedores, Coche coche, Secretario secretario, String nome, String apelidos, String DNI, String direccion, int antigüedad, String telf, Empregado supervisor, int salario) {
        super(nome, apelidos, DNI, direccion, antigüedad, telf, supervisor, salario);
        this.listaVendedores = listaVendedores;
        this.coche = coche;
        this.secretario = secretario;
    }

    public XefeDeZona() {
    super();
    }

    @Override
    public String imprimir() {
        return "XefeDeZona " + "despacho=" + despacho + ", listaVendedores=" + listaVendedores + ", coche=" + coche + super.imprimir();
    }

    public void darDeAlta(ArrayList<String> listaVendedores,String vendedor){
    listaVendedores.add(vendedor);
    }

    public void darDeBaixa(ArrayList<String> listaVendedores,String vendedor){
        
        for (int i = 0; i < listaVendedores.size(); i++) {
        if (listaVendedores.get(i).equals(vendedor)){
        listaVendedores.remove(i);
        }
        }
    }

    @Override
    public void incrementarSalario() {
    int salario = super.getSalario();
        super.setSalario((int)(salario*1.2));
    }
    


}
