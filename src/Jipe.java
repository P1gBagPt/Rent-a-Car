
public class Jipe extends Carro{

	//ATRIBUTOS
	boolean tetoSolar;

	//CONTRUTOR
	public Jipe(int idCarro, String matricula , String cor, String marca, int numJanelas, int numPortas, int maxVelocidade, boolean tetoSolar) {
		super(idCarro, matricula, cor, marca, numJanelas, numPortas, maxVelocidade);
		this.tetoSolar = tetoSolar;
	}

	//MOSTRAR Jipe
	public void mostrar() {
		String tetSol;
		if (tetoSolar) {
			tetSol = "com";
		}else {
			tetSol = "sem";
		}
		System.out.println("Id: " + idCarro + " Cor: " + cor + " Marca: " + marca + " Numero de janelas e Portas: " + numJanelas + " | " + numPortas + " Velocidade Máxima:  " + maxVelocidade + " km/h, e " + tetSol + " Teto Solar.");
	}
}
