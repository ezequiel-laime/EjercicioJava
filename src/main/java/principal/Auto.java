package principal;

public class Auto {
	private Estado estado;
	private int velocidad;
	private double reserva_combustible;
	private double capacidad_combustible;
	private double combustible;
	private double temperatura;
	
	public Auto(Estado estado, int velocidad, double reserva_combustible, double combustible, double capacidad_combustible, double temperatura) {
		this.estado = estado;
		this.velocidad = velocidad;
		this.reserva_combustible = reserva_combustible;
		this.combustible = combustible;
		this.capacidad_combustible = capacidad_combustible;
		this.temperatura = temperatura;
	}
	
	public double getCombustible() {
		return this.combustible;
	}
	
	public void consumirCombustible(double consumo) {
		this.combustible -= consumo;
	}
	
	public void aumentarTemperatura(double temperatura) {
		this.temperatura += temperatura;
	}
	
	public void encender() {
		try {
			this.estado.encender(this);
		}catch(YaEncendidoException e) {
			
		}
	}
	public void apagar() {
		estado.apagar(this);
	}
	public void acelerar(double velocidad) {
		estado.acelerar(this, velocidad);
	}
	public void detener() {
		estado.detener(this);
	}
		
}
