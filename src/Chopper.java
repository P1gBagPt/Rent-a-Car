
public class Chopper extends Mota {
	
	//CONSTRUTOR
	public Chopper(int idMotas,String matricula , String cor, String marca, int numLugares, int cilindrada, int maxVelocidade) {
		super(idMotas, matricula, cor, marca, numLugares, cilindrada, maxVelocidade);
		//this.tetoSolar = tetoSolar;
	}

	//MOSTRAR MOSTAS CHOPPER
	public void mostrarMotas() {
		System.out.println("Id: " + idMota + " Matricula Mota: " + matricula + " Cor: " + cor + " Marca: " + marca + " Lugares na Mota: " + numLugares + " Cilindrada: " + cilindrada);
	}

}
