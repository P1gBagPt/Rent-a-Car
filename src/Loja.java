import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";

	// Array carro com 15 posições
	static Carro[] carro = new Carro[15];
	// Array mota com 10 posições
	static Mota[] mota = new Mota[10];
	// Array cliente com 10 posições
	static Cliente[] cliente = new Cliente[25];
	// Array AlugadorCarro com 15 posições
	static List<AlugarCarro> alugarCarro = new ArrayList<AlugarCarro>();
	// Array AlugadorMota com 10 posições
	static List<AlugarMota> alugarMota = new ArrayList<AlugarMota>();

	static Scanner scanner = new Scanner(System.in);
	// Total de carros, motas e clientes da rent a car
	static int numeroCarros = 0;
	static int numeroMotas = 0;
	static int numeroClientes = 0;
	//ID dos carros e Motas
	static int idCarros = 0;
	static int idMotas = 0;
	//Numero de carros alugados *cada vez que um carro é alugado numeroAlugados++*
	static int numeroAlugados = 0;

	public static void main(String[] args) {

		//Motas Padrão, 3 Scooters(portaBagagem), 2 Chopper e 1 Sport(Aerodinamica Ativa)
		//ID |MATRICULA | COR | MARCA | LUGARES | CILINDRADA | VELOCIDADE MAXIMA | (PARTICULARIDADE DA MOTA)
		Mota Scooter1 = new Scooter(1,"99-LK-PO", "Branco", "Honda", 2, 125, 115, false);
		Mota Scooter2 = new Scooter(2,"22LK-DV", "Preto", "Aprilia", 2, 125, 125, true);
		Mota Scooter3 = new Scooter(3,"GL-IT-99", "Azul Ciano", "Piaggio", 2, 125, 120, true);

		Mota Chopper1 = new Chopper(4,"23-QW-33", "Preto", "Harley Davidson", 2, 500, 195);
		Mota Chopper2 = new Chopper(5,"57-93-MV", "Verde", "SYM", 2, 500, 200);
		
		Mota Sport1 = new Sport(6,"99-99-SP", "Vermelho", "Ducati", 1, 1000, 350, true);

		//Adicionar a Scooter 1 ao array
		mota[numeroMotas] = Scooter1;
		numeroMotas++;
		//Adicionar a Scooter 2 ao array
		mota[numeroMotas] = Scooter2;
		numeroMotas++;
		//Adicionar a Scooter 3 ao array
		mota[numeroMotas] = Scooter3;
		numeroMotas++;

		//Adicionar a Chopper 1 ao array
		mota[numeroMotas] = Chopper1;
		numeroMotas++;
		//Adicionar a Chopper 2 ao array
		mota[numeroMotas] = Chopper2;
		numeroMotas++;
						
		//Adicionar o Sport 1 ao array
		mota[numeroMotas] = Sport1;
		numeroMotas++;

		//Carros Padrão, 3 citadinos e 3 jipes(tetoSolar)
		//ID | MATRICULA | COR | MARCA | LUGARES | NUMERO DE JANELAS | NUMERO DE PORTAS | VELOCIDADE MAXIMA | (PARTICULARIDADE DO VEICULO)
		Carro Citadino1 = new Citadino(1, "25-KB-98", "Vermelho", "BMW", 5, 4, 250, 5);
		Carro Citadino2 = new Citadino(2, "56-88-HB", "Preto", "Audi", 5, 4, 300, 5);
		Carro Citadino3 = new Citadino(3, "20-KG-87", "Amarelo", "Ibiza", 5, 4, 200, 5);
		Carro Jipe1 = new Jipe(4, "79-42-PT", "Cinzento", "Range Rover", 5, 4, 250, false);
		Carro Jipe2 = new Jipe(5, "26-77-YU", "Azul", "Opel", 5, 4, 250, true);
		Carro Jipe3 = new Jipe(6, "GH-44-RE", "Verde", "Lamborghini", 5, 4, 600, true);


		//Adicionar o Citadino 1 ao array
		carro[numeroCarros] = Citadino1;
		numeroCarros++;
		//Adicionar o Citadino 2 ao array
		carro[numeroCarros] = Citadino2;
		numeroCarros++;
		//Adicionar o Citadino 3 ao array
		carro[numeroCarros] = Citadino3;
		numeroCarros++;

		//Adicionar o Jipe 1 ao array
		carro[numeroCarros] = Jipe1;
		numeroCarros++;
		//Adicionar o Jipe 2 ao array
		carro[numeroCarros] = Jipe2;
		numeroCarros++;
		//Adicionar o Jipe 3 ao array
		carro[numeroCarros] = Jipe3;
		numeroCarros++;

		//Clientes pre adicionados
		Cliente Cliente1 = new Cliente(1,"Daniel", "Cunha", "05/06/2003", 132165461);
		Cliente Cliente2 = new Cliente(2,"Miguel", "Gaspar", "12/06/2003", 654321323); 	
		cliente[numeroClientes] = Cliente1;
		numeroClientes++;

		cliente[numeroClientes] = Cliente2;
		numeroClientes++;

		while (true) {
			System.out.println("---------Menu---------");
			System.out.println("| 1 - Mostrar Carros   |");
			System.out.println("| 2 - Mostrar Motas    |");
			System.out.println("| 3 - Inserir Carros   |");
			System.out.println("| 4 - Inserir Motas    |");
			System.out.println("| 5 - Mostrar Clientes |");
			System.out.println("| 6 - Inserir Clientes |");
			System.out.println("| 7 - Alugar Carro     |");
			System.out.println("| 8 - Retomar Carro    |");
			System.out.println("| 9 - Alugar Mota      |");
			System.out.println("|10 - Retomar Mota     |");
			System.out.println("|11 - Veiculos Alugados|");
			System.out.println("|12 - Sair             |");
			System.out.print("Opção: ");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				//Mostrar carros
				mostrarCarros();
				break;
			case 2:
				//Mostrar Motas
				mostrarMotas();
				break;
			case 3:
				//Inserir Carros
				inserirCarros();
				break;
			case 4:
				inserirMotas();
				//Inserir Motas
				break;
			case 5:
				//Mostrar Clientes
				mostrarClientes();
				break;
			case 6:
				//Inserir Clientes
				inserirClientes();
				break;
			case 7:
				//Alugar Carro
				//Função para mostrar os Carros Alugados
				mostrarCarros();

				System.out.print("Id do carro a alugar: ");
				int carId = scanner.nextInt();
				//O id do carro tem que ser valido entre 1 e numeroCarros
				if(carId > 0 && carId <= numeroCarros) {
					if(!carro[carId - 1].isRented){
						//Variavel para Armazenar o ID do cliente a alugar carro
						int clientId;
						do {
							//Mostrar todos os clientes existentes
							mostrarClientes();
							//Pedir um Id de cliente válido (clientId)
							System.out.print("Id do Cliente: ");
							clientId = scanner.nextInt();
						}while(clientId < 1 || clientId > numeroClientes);

						//Dias do aluguer do Carro
						System.out.print("Duração em dias: ");
						int duration = scanner.nextInt();

						//Metodo com o id do carro - 1 que passa o id do cliente e a duração para mudar o status do carro a alugar
						carro[carId - 1].rentCar(clientId, duration);
						//Cria um objeto com o id do carro, id do cliente associado e duração do aluguer
						AlugarCarro AlugarCarro = new AlugarCarro(carId, clientId, duration);
						//Adicionar á lista o objeto
						alugarCarro.add(AlugarCarro);	  

						numeroAlugados++;	
					}else{
						//Em caso do carro já estar alugado
						System.out.println(ANSI_RED + "Este carro já está alugado" + ANSI_RESET);
					}															
				} else {
					//Quando o ID não é valido
					System.out.println(ANSI_RED + "Id do carro inválido. Por favor, insira um id de carro válido." + ANSI_RESET);
				}
				break;			
			case 8:
				//Retomar Carro
				//Se existir algum carro alugado pede as informações para retomar o carro
				if (alugarCarro.stream().anyMatch(x -> x.getIsRented())) {
					System.out.println("↓-----CARROS ALUGADOS-----↓");
					//Mostrar todas os carros alugados
					mostrarCarrosAlugados();
					System.out.println("Id do Carro a Retomar: ");
					int returnCarId = scanner.nextInt();
					AlugarCarro alugarCarroToReturn = alugarCarro.stream().filter(x -> x.getVehicleId() == returnCarId).findFirst().orElse(null);
					if(alugarCarroToReturn != null){
						carro[returnCarId - 1].returnCar();
						alugarCarroToReturn.setIsRented(false);
					}else {
						System.out.println(ANSI_RED + "Carro com esse ID não foi alugado antes." + ANSI_RESET);
					}
				} else {
					System.out.println(ANSI_RED + "Não há carros alugados no momento." + ANSI_RESET);
				}

				break;
			case 9:
				//Alugar Mota
				//Função para mostrar as Motas Alugadas
				mostrarMotas();
				System.out.print("Id da mota a alugar: ");
				int motaId = scanner.nextInt();
				//O id da Mota tem que ser valido entre 1 e numeroMotas
				if(motaId > 0 && motaId <= numeroCarros) {
					if(!mota[motaId - 1].isRented){
						//Variavel para Armazenar o ID do cliente a alugar o carro
						int clientIdMota;
						do {
							//Mostrar todos os clientes existentes
							mostrarClientes();
							System.out.print("Id do Cliente: ");
							//Pedir um Id de cliente válido (clientId)
							clientIdMota = scanner.nextInt();
						}while(clientIdMota < 1 || clientIdMota > numeroClientes); 

						//Dias do aluguer da Mota
						System.out.print("Duração em dias: ");
						int duracao = scanner.nextInt();

						//Metodo com o id da mota - 1 que passa o id do cliente e a duração para mudar o status da mota a alugar
						mota[motaId - 1].rentMota(clientIdMota, duracao);
						//Cria um objeto com o id da mota, id do cliente associado e duração do aluguer
						AlugarMota AlugarMota = new AlugarMota(motaId, clientIdMota, duracao);
						//Adicionar á lista o objeto
						alugarMota.add(AlugarMota);	  

						numeroAlugados++;	
					}else{
						//Em caso da mota já estar alugada
						System.out.println(ANSI_RED + "Esta mota já está alugada" + ANSI_RESET);
					}	
				}else {
					//Quando o ID não é valido
					System.out.println(ANSI_RED + "Id da Mota inválida. Por favor, insira um id de uma Mota válida." + ANSI_RESET);
				}
				break;
			case 10:
				//Retomar MOTA
				//Se existir alguma Mota alugada pede as informações para retomar a mota
				if (alugarMota.stream().anyMatch(x -> x.getIsRented())) {
					System.out.println("↓-----MOTAS ALUGADAS-----↓");
					//Mostrar todas as motas alugadas
					mostrarMotasAlugadas();
					System.out.println("Id da Mota a Retomar: ");
					int returnMotaId = scanner.nextInt();
					
					//Retomar a Mota
					AlugarMota alugarMotaToReturn = alugarMota.stream().filter(x -> x.getVehicleId() == returnMotaId).findFirst().orElse(null);
					if(alugarMotaToReturn != null){
						mota[returnMotaId - 1].returnMota();
						alugarMotaToReturn.setIsRented(false);
					}else {
						System.out.println(ANSI_RED + "Mota com esse ID não foi alugada antes." + ANSI_RESET);
					}
				}else {
					System.out.println(ANSI_RED + "Não há Motas alugadas no momento." + ANSI_RESET);
				}
				break;				
			case 11:
				//Mostrar todos os veiculos alugados (Carros e Motas)
				mostrarVeiculosAlugados();				
				break;
			case 12:   
				//SAIR
				return;
			default:
				System.out.println(ANSI_RED + "Escolha inválida!" + ANSI_RESET);
				break;
			}
		}
	}

	//Função para mostrar todos os veiculos alugados mostrarVeiculosAlugados()
	public static void mostrarVeiculosAlugados() {
		boolean rentedCarsFound = false;
		if (alugarCarro.stream().anyMatch(x -> x.getIsRented())) {
			System.out.println("↓-----CARROS ALUGADOS-----↓");
		}
		//Percorre toda a lista e mostra todos os carros alugados
		for (AlugarCarro rentedCar : alugarCarro) {
			if (rentedCar != null && rentedCar.getIsRented()) {
				rentedCarsFound = true;
				int carId = rentedCar.getVehicleId();
				// Mostrar detalhes do carro
				carro[carId - 1].mostrar();
				int clienteId = rentedCar.getClientId();
				// Mostrar detalhes do cliente
				cliente[clienteId - 1].mostrarClienteSimples();
				rentedCar.mostrarAlugados();
			}
		}
		boolean rentedMotasFound = false;
		if (alugarMota.stream().anyMatch(x -> x.getIsRented())) {
			System.out.println("↓-----MOTAS ALUGADAS-----↓");
		}
		//Percorre toda a lista e mostra todas as motas alugadas
		for (AlugarMota rentedMota : alugarMota) {
			if (rentedMota != null && rentedMota.getIsRented()) {
				rentedMotasFound = true;
				int motaId = rentedMota.getVehicleId();
				// Mostrar detalhes do carro
				mota[motaId - 1].mostrarMotas();
				int clienteId = rentedMota.getClientId();
				// Mostrar detalhes do cliente
				cliente[clienteId - 1].mostrarClienteSimples();
				rentedMota.mostrarAlugados();
			}
		}

		//Se não existir nenhum veiculo alugados mostra a mensagem a informar
		if (!rentedCarsFound && !rentedMotasFound) {
			System.out.println(ANSI_RED + "Não há veiculos alugados no momento." + ANSI_RESET);
		}
	}


	//Função para mostrar SÓ os carros alugados
	public static void mostrarCarrosAlugados() {
		boolean rentedCarsFound = false;
		for (AlugarCarro rentedCar : alugarCarro) {
			if (rentedCar != null && rentedCar.getIsRented()) {
				rentedCarsFound = true;
				int carId = rentedCar.getVehicleId();
				// Mostrar detalhes do carro
				carro[carId - 1].mostrar();
				int clienteId = rentedCar.getClientId();
				// Mostrar detalhes do cliente
				cliente[clienteId - 1].mostrarClienteSimples();
				rentedCar.mostrarAlugados();
			}
		}
	}

	//Função para mostrar SÓ as Motas alugadas
	public static void mostrarMotasAlugadas() {
		boolean rentedMotasFound = false;
		for (AlugarMota rentedMota : alugarMota) {
			if (rentedMota != null && rentedMota.getIsRented()) {
				rentedMotasFound = true;
				int motaId = rentedMota.getVehicleId();
				// Mostrar detalhes da Mota
				mota[motaId - 1].mostrarMotas();
				int clienteId = rentedMota.getClientId();
				// Mostrar detalhes do cliente
				cliente[clienteId - 1].mostrarClienteSimples();
				rentedMota.mostrarAlugados();
			}
		}
	}


	// MostrarClientes
	public static void mostrarClientes() {
		for (int u = 0; u < numeroClientes; u++) {
			cliente[u].mostrarClientes();
			idCarros = u;
		}
		System.out.println(numeroClientes + " Clientes");

	}

	// Mostrar Carros
	public static void mostrarCarros() {
		for (int i = 0; i < numeroCarros; i++) {
			carro[i].mostrar();
		}
		System.out.println(numeroCarros + " Carros");
	}

	// Mostrar Motas
	public static void mostrarMotas() {
		for (int j = 0; j < numeroMotas; j++) {
			mota[j].mostrarMotas();
		}
		System.out.println(numeroMotas + " Motas");
	}

	public static void inserirCarros() {
		if (numeroCarros == 15) {
			System.out.println("Renta a car está cheia :)");
			return;
		}else {		
			/*
			 * Adicionar Carro Jipe ou Citadino Com os parametros: Matricula, Cor, Marca,
			 * NumJanelas, NumPortas, Velocidade Máxima
			 */
			//Pedir as informações do carro
			System.out.print("Tipo de Carro (Citadino ou Jipe): ");
			String tipoCarro = scanner.next();
			System.out.print("Matricula: ");
			String matricula = scanner.next();
			System.out.print("Cor: ");
			String cor = scanner.next();
			System.out.print("Marca: ");
			String marca = scanner.next();
			System.out.print("Numero de Janelas: ");
			int numJanelas = scanner.nextInt();
			System.out.print("Numero de Portas: ");
			int numPortas = scanner.nextInt();
			System.out.print("Velocidade Maxima: ");
			int maxVelocidade = scanner.nextInt();

			//CITADINO
			if (tipoCarro.equalsIgnoreCase("Citadino")) {
				System.out.print("Lugares do Carro Citadino: ");
				int numLugares = scanner.nextInt();

				Carro Citadino = new Citadino(numeroCarros + 1, matricula, cor, marca, numJanelas, numPortas, maxVelocidade,
						numLugares);
				carro[numeroCarros] = Citadino;
				numeroCarros++;
				//JIPE
			} else if (tipoCarro.equalsIgnoreCase("Jipe")) {
				System.out.print("O jipe tem teto de abrir? (true/false): ");
				boolean temTetoSolar = scanner.nextBoolean();

				Carro Jipe = new Jipe(numeroCarros + 1, matricula, cor, marca, numJanelas, numPortas, maxVelocidade,
						temTetoSolar);
				carro[numeroCarros] = Jipe;
				numeroCarros++;
			} else {
				//Erro
				System.out.println("Carro Inválido");
			}		
		}
	}

	public static void inserirMotas() {
		if (numeroMotas == 10) {
			System.out.println("Limite de Motas atinjido)");
			return;
		}else {
			
			/*
			 * Adicionar Mota Scooter, Chooper, Sport Com os parametros: atricula, Cor,
			 * Marca, Lugares, Cilindrada e Velocidade Máxima
			 */
			//Pedir as informações da Mota
			System.out.print("Tipo de Mota (Scooter, Chopper ou Sport): ");
			String tipoMota = scanner.next();
			System.out.print("Matricula: ");
			String matricula = scanner.next();
			System.out.print("Cor: ");
			String cor = scanner.next();
			System.out.print("Marca: ");
			String marca = scanner.next();
			System.out.print("Numero de Lugares: ");
			int numLugares = scanner.nextInt();
			System.out.print("Cilindrada: ");
			int cilindrada = scanner.nextInt();
			System.out.print("Velocidade Maxima: ");
			int maxVelocidade = scanner.nextInt();

			//Scooter
			if (tipoMota.equalsIgnoreCase("Scooter")) {
				System.out.print("A Scooter tem mala para guardar pertences? (true/false): ");
				boolean portaBagagem = scanner.nextBoolean();

				Mota Scooter = new Scooter(numeroMotas + 1, matricula, cor, marca, numLugares, cilindrada, maxVelocidade,
						portaBagagem);
				mota[numeroMotas] = Scooter;
				numeroMotas++;
				//Chopper
			} else if (tipoMota.equalsIgnoreCase("Chopper")) {
				Mota Chopper = new Chopper(numeroMotas + 1, matricula, cor, marca, numLugares, cilindrada, maxVelocidade);
				mota[numeroMotas] = Chopper;
				numeroMotas++;
				//Sport
			} else if (tipoMota.equalsIgnoreCase("Sport")) {
				System.out.print("A mota tem Aerodinamica Ativa? (true/false): ");
				boolean aero = scanner.nextBoolean();

				Mota Sport = new Sport(numeroMotas + 1, matricula, cor, marca, numLugares, cilindrada, maxVelocidade, aero);
				mota[numeroMotas] = Sport;
				numeroMotas++;
			} else {
				System.out.println("Mota Inválida");
			}		
		}

	}

	public static void inserirClientes() {
		if (numeroClientes == 25) {
			System.out.println("Numero máximo de clientes atingido");
			return;
		}
		/*
		 * Adicionar Clientes Com os parametros: Nome, Apelido, Data de Nascimento,
		 * cartaConducao
		 */

		//Dados dos clientes
		int numCliente = numeroClientes + 1;
		System.out.println("Nome: ");
		String nomeCliente = scanner.next();
		System.out.println("Apelido: ");
		String apelidoCliente = scanner.next();
		System.out.println("Data de Nascimento: ");
		String dataNascimento = scanner.next();

		int cartaConducao;
		do {
			System.out.println("Numero da Carta de Condução (8 Numeros): ");
			cartaConducao = scanner.nextInt();
		} while (String.valueOf(cartaConducao).length() != 8);

		Cliente Cliente = new Cliente(numCliente, nomeCliente, apelidoCliente, dataNascimento, cartaConducao);
		cliente[numeroClientes] = Cliente;
		numeroClientes++;
	}
}