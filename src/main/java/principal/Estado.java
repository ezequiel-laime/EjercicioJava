package principal;

public abstract class Estado {
	public void encender(Auto auto) {};
	public void apagar(Auto auto) {};
	public void acelerar(Auto auto, double velocidad) {};
	public void detener(Auto auto) {};
}
