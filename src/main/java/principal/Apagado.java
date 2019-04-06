package principal;

public class Apagado extends Estado{
	
	@Override
	public void encender(Auto auto) {
		double consumo = auto.getCombustible() * 0.001;
		auto.consumirCombustible(consumo);
		auto.aumentarTemperatura(70);
	}
}
