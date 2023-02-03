
public class Cliente {
	//ATRIBUTOS
	public int numCliente;
	public String nome;
	public String apelido;
	public String dataNascimento;
	public int cartaConducao;
	
	//CONSTRUTOR
	Cliente(int numCliente,String nome, String apelido,String dataNascimento, int cartaConducao){
		this.numCliente = numCliente;
		this.nome = nome;
		this.apelido = apelido;
		this.dataNascimento = dataNascimento;
		this.cartaConducao = cartaConducao;
	}
	
	
	//MOSTRAR CLIENTES
	public void mostrarClientes() {
		System.out.println("Numero do cliente: " + numCliente + " | Nome: " + nome + " | Apelido: " + apelido + " | Data de Nascimento: " + dataNascimento + " | Carta de Conducao: " + cartaConducao);
	}
	
	//MOSTRAR CLIENTES SIMPLIFICADO
	public void mostrarClienteSimples() {
		System.out.print("Nome: " + nome + " | Apelido: " + apelido + " | Carta de Conducao: " + cartaConducao);

	}


}
