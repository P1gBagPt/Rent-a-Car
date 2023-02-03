

public abstract class Carro {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";


	//Atributos
	boolean isRented;
    private AlugarCarro rental;
    
	int idCarro;
	String matricula;
	String cor;
	String marca;
	int numJanelas;
	int numPortas;
	int maxVelocidade;

	//CONSTRUTOR
	public Carro(int idCarro ,String matricula,String cor, String marca, int numJanelas, int numPortas, int maxVelocidade) {
		this.idCarro = idCarro;
		this.matricula = matricula;
		this.cor = cor;
		this.marca = marca;
		this.numJanelas = numJanelas;
		this.numPortas = numPortas;
		this.maxVelocidade = maxVelocidade;
		
	}
	
	//FUNCAO ALUGAR
	public void rentCar(int clientId, int duration) {
		if (!this.isRented) {
		    this.rental = new AlugarCarro(this.idCarro, clientId, duration);
		    this.isRented = true;
		    System.out.println(ANSI_GREEN + "Carro alugado com sucesso!" + ANSI_RESET);
		} else {
		    System.out.println(ANSI_RED + "Este carro já está alugado!" + ANSI_RESET);
		}
    }
	//FUNCAO RETORNAR
	public void returnCar() {
	    this.isRented = false;
	    this.rental.setIsRented(false);
	    this.rental = null;
	    System.out.println(ANSI_GREEN + "Carro retomado com sucesso!" + ANSI_RESET);
	}

	
	
    

	public abstract void mostrar();
}