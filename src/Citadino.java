
public class Citadino extends Carro{
	//ATRIBUTOS
	int numLugares;

	//CONSTRUTOR
	public Citadino(int idCarro ,String matricula , String cor, String marca, int numJanelas, int numPortas, int maxVelocidade, int numLugares) {
		super(idCarro,matricula ,cor, marca, numJanelas, numPortas, maxVelocidade);
		this.numLugares = numLugares;
	}

	//MOSTRAR Jipe
	public void mostrar() {
		System.out.println("Id: " + idCarro + " Cor: " + cor + " Marca: " + marca + " Numero de janelas e Portas: " + numJanelas + " | " + numPortas + " Velocidade Máxima:  " + maxVelocidade + " km/h, e " + numLugares + " lugares.");

	}
}
