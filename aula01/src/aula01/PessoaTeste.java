package aula01;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Mehl", 22);
		Pessoa pessoa2 = new Pessoa("Mehl", 22);
				
// Se um método toString() não for sobrescrito, ele imprimirá uma representação padrão da instância do objeto
		
		System.out.println(pessoa1);
		
// Se você não sobrescrever o método equals(), os dois objetos vão apontar para diferentes endereços
// na memória. O código abaixo vai retornar false se não for sobrescrito
		
		System.out.println(pessoa1.equals(pessoa2));

// O mesmo acontece com o método hashCode() quando não é sobrescrito, os objeto terão valor hash diferentes
		
		System.out.println(pessoa1.hashCode() + "|" + pessoa2.hashCode());
		

	}

}
