package dominio;


import java.io.Serializable;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", length = 1, discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("P")
//public class Pessoa implements Serializable {
public class Pessoa{

	//private static final long serialVersionUID = 1L; //Id padrão do Serializable
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPessoa;
	private String nome;
	private int idade;
		
	public Pessoa() {
		this("", 0);
	}
	public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

	public long getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(long idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) { // Corrigido para aceitar int
		this.idade = idade;
	}

	
	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + ", idade=" + idade +"]";
	}
}
