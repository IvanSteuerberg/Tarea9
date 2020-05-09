
package tarea9;

import java.util.ArrayList;

/**
 *
 * @author ivansteuerberg
 */
public class Vendedor extends Empregado{
private Coche coche;
private String telfMovil;
private String areaVentas;
private ArrayList<String> listaClientes;
private int comision;

    public Vendedor(Coche coche, String telfMovil, String areaVentas, ArrayList<String> listaClientes, int comision, String nome, String apelidos, String DNI, String direccion, int antigüedad, String telf, Empregado supervisor, int salario) {
        super(nome, apelidos, DNI, direccion, antigüedad, telf, supervisor, salario);
        this.coche = coche;
        this.telfMovil = telfMovil;
        this.areaVentas = areaVentas;
        this.listaClientes = listaClientes;
        this.comision = comision;
    }

    public Vendedor() {
    super();
    }

    @Override
    public String imprimir() {
        return "Vendedor" + "coche=" + coche + ", telfMovil=" + telfMovil + ", areaVentas=" + areaVentas + ", listaClientes=" 
        + listaClientes + ", comision=" + comision + super.imprimir();
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public String getTelfMovil() {
        return telfMovil;
    }

    public void setTelfMovil(String telfMovil) {
        this.telfMovil = telfMovil;
    }

    public String getAreaVentas() {
        return areaVentas;
    }

    public void setAreaVentas(String areaVentas) {
        this.areaVentas = areaVentas;
    }

    public ArrayList<String> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<String> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }

    public void darDeAlta(ArrayList<String> listaClientes,String cliente){
    listaClientes.add(cliente);
    }

    public void darDeBaixa(ArrayList<String> listaClientes,String cliente){
        
        for (int i = 0; i < listaClientes.size(); i++) {
        if (listaClientes.get(i).equals(cliente)){
        listaClientes.remove(i);
        }
        }
    }

        @Override
    public void incrementarSalario() {
    int salario = super.getSalario();
        super.setSalario((int)(salario*1.1));
    }
    

}
