package ejercicios;

public class Temperatura3 {
	
	private float temperatura;

	public float getCelsius() {
		return temperatura;
	}

	public void setCelsius(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public float getFahrenheit() {
		return temperatura*1.8f+32;
	}

	public void setFahrenheit(float temperatura) {
		this.temperatura = (temperatura-32)/1.8f;
	}
	
	public static float celsiusToFarenheit(float celsius) {
		return celsius*1.8f+32;
	}
	
	
	public static float farenheitToCelsius(float farenheit) {
		return (farenheit-32)/1.8f;
	}
	
}
