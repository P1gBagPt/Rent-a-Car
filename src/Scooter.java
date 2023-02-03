
public class Scooter extends Mota{

	//ATRIBUTOS
	
	boolean portaBagagem;

	//CONSTRUTOR
	public Scooter(int idMotas,String matricula , String cor, String marca, int numLugares, int cilindrada, int maxVelocidade, boolean portaBagagem) {
		super(idMotas ,matricula, cor, marca, numLugares, cilindrada, maxVelocidade);
		this.portaBagagem = portaBagagem;
	}

	//Mostrar Scooters
	public void mostrarMotas() {
		String portBagagem;
		if (portaBagagem) {
			portBagagem = "tem";
		}else {
			portBagagem = "não tem";
		}
		System.out.println("Id: " + idMota + " Matricula Mota: " + matricula + " Cor: " + cor + " Marca: " + marca + " Lugares na Mota: " + numLugares + " Cilindrada: " + cilindrada + " " + portBagagem + " Porta Bagagem");
	}


}
