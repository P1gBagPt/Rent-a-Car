
public class AlugarCarro {
	//ATRIBUTOS
    private int vehicleId;
    private int clientId;
    private int duration;
    private boolean isRented;

    //CONSTRUTOR
    public AlugarCarro(int vehicleId, int clientId, int duration) {
        this.vehicleId = vehicleId;
        this.clientId = clientId;
        this.duration = duration;
        this.isRented = true;
    }

    /*GETS E SETS*/
    public int getVehicleId() {
        return vehicleId;
    }

    public int getClientId() {
        return clientId;
    }

    public int getDuration() {
        return duration;
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }
    /*GETS E SETS*/
    
    //Mostrar os dias do Aluguer
    public void mostrarAlugados() {
		System.out.println(" | Duração do Aluguer: " + duration + " dias");
	}

    
}
