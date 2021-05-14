package course;

public class aula1 {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("João",20,"M");
		Pessoa p1 = new Pessoa("Maria",23,"F");
		
		System.out.println(p.toString());
		System.out.println(p1.toString());
		p.setIdade(25);
		p1.setIdade(30);
		System.out.println(p.getNome()+" tem idade de "+p.getIdade());
		System.out.println(p1.getNome()+" tem idade de "+p1.getIdade());
		
		p.setNome("Pedro");
		System.out.println(p.toString());
	}

}
