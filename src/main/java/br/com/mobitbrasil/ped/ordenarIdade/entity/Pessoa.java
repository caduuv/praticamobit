package br.com.mobitbrasil.ped.ordenarIdade.entity;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Pessoa")
public class Pessoa implements java.lang.Comparable<Pessoa>{

    private String nome;
    
    @ApiModelProperty(notes = "Campo utilizado para ordenar as instâncias de Pessoa")
    private Integer idade;
    
    private String email;
    
    private String telefone;
    
    public Pessoa() {
    	
	}
 
    public Pessoa(String nome, Integer idade, String email, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.telefone = telefone;
	}
    

	public Integer getIdade() {
        return idade;
    }

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nome, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(email, other.email) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && Objects.equals(telefone, other.telefone);
	}

	@Override
	public int compareTo(Pessoa o) {
		return this.getIdade().compareTo(o.getIdade());
	}
}
