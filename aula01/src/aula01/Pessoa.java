// Criando uma classe POJO e aprendendo encapsulamento e métodos sobrescritos

package aula01;

import java.util.Objects;

public class Pessoa {


	private String nome;
	private int idade;
	
// Construtores
	
	public Pessoa(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	
	public Pessoa() {
		super();
	}

// Getters e Setters
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}

// Sobrescrever métodos é necessário para que o objeto se comporte conforme o esperado

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}


// Agora veremos os métodos equals() e hashCode()

	@Override
	public int hashCode() {
		return Objects.hash(idade, nome);
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
		return idade == other.idade && Objects.equals(nome, other.nome);
	}
	

	
}
