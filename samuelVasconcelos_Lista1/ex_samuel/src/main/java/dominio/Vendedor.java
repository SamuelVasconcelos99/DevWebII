package dominio;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity //entidade de domínio
@DiscriminatorValue("V")
public class Vendedor extends Pessoa {
    
    private int codigoVendedor;

    public Vendedor(String nome, int idade, int codigoVendedor) {
        super(nome, idade);
        this.codigoVendedor = codigoVendedor;
    }

    public Vendedor() {
        this("" ,0, 0);
    }
    
    public int getCodigoVendedor() {
        return this.codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }
    
    @Override
    public String toString() {
        return "Vendedor [idPessoa= " + super.getIdPessoa() + ", nome= " + super.getNome() + ", codigoVendedor= "
        + getCodigoVendedor() + "]";
    }
    
    public void imprimeDados() {
        System.out.println("Nome: "+ super.getNome());
        System.out.println("Codigo Vendedor: "+ getCodigoVendedor());
    }
}