package principal;

public class Encendido extends Estado{
	
	@Override
	public void encender(Auto auto) {
		throw new YaEncendidoException("El auto ya esta encendido");
	};

}
