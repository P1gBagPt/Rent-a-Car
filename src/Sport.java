
public class Sport extends Mota{

	//ATRIBUTOS
	boolean aerodinamica_ativa;

	//CONSTRUTOR
	public Sport(int idMotas,String matricula , String cor, String marca, int numLugares, int cilindrada, int maxVelocidade, boolean aerodinamica_ativa) {
		super(idMotas, matricula, cor, marca, numLugares, cilindrada, maxVelocidade);
		this.aerodinamica_ativa = aerodinamica_ativa;
	}

	//MOSTRAR MOTAS SPORT
	public void mostrarMotas() {
		String aero;
		if(aerodinamica_ativa) {
			aero = "Tem";
		}else {
			aero = "Não tem";
		}
		System.out.println("Id: " + idMota +  " Matricula Mota: " + matricula + " Cor: " + cor + " Marca: " + marca + " Lugares na Mota: " + numLugares + " Cilindrada: " + cilindrada + " Velocidade Máxima: " + maxVelocidade + " " + aero +" Aerodinamica Ativa");
	}

}
