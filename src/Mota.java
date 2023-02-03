
public abstract class Mota {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";


	//ATRIBUTOS
	boolean isRented;
    private AlugarMota rental;
    
	int idMota;
	String matricula;
	String cor;
	String marca;
	int numLugares;
	int cilindrada;
	int maxVelocidade;

	
	//CONSTRUTOR
	public Mota(int idMotas, String matricula,String cor, String marca, int numLugares, int cilindrada, int maxVelocidade) {
		this.idMota = idMotas;
		this.matricula = matricula;
		this.cor = cor;
		this.marca = marca;
		this.numLugares = numLugares;
		this.cilindrada = cilindrada;
		this.maxVelocidade = maxVelocidade;
	}
	
	
	//FUNCAO ALUGAR
	public void rentMota(int clientId, int duration) {
        if (!this.isRented) {
            this.rental = new AlugarMota(this.idMota, clientId, duration);
            this.isRented = true;
            System.out.println(ANSI_GREEN + "Mota alugada com sucesso!" + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Esta Mota já está alugada!" + ANSI_RESET);
        }
    }
		
	//FUNCAO RETORNAR
	public void returnMota() {
	    this.isRented = false;
	    this.rental.setIsRented(false);
	    this.rental = null;
	    System.out.println(ANSI_GREEN + "Mota retomada com sucesso!" + ANSI_RESET);
	}

	public int getIdMota() {
		return idMota;
	}


	public abstract void mostrarMotas();

}
