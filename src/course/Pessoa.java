package course;

public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	public PersonStatus status;

	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public enum PersonStatus {
		PENDING_PAYMENT,
		PROCESSING,
		SHIPPED,
		DELIVERED
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		this.status = PersonStatus.DELIVERED;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + " status= "+status+"]";
	}
	
	

}
