import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Vinho {

	private String tipo;

	private String marca;

	private int volume;

	private LocalDate dtProd;

	private double valor;

	public Vinho(String tipo, String marca, int volume, LocalDate dtProd, double valor) {
		setTipo(tipo);
		this.marca = marca;
		setVolume(volume);
		setDtProd(dtProd);
		setValor(valor);
	}

	public Vinho() {
		this("branco", "", 0, LocalDate.now(), 0);
	}

	public Vinho(String tipo, int volume) {
		this(tipo, "", volume, LocalDate.now(), 0);
	}

	public void setTipo(String tipo) {
		if(tipo.equalsIgnoreCase("tinto") || tipo.equalsIgnoreCase("seco"))
			this.tipo = tipo;
	}

	public long getIdadeDias() {
		return LocalDate.now().until(dtProd, ChronoUnit.DAYS);
	}

	public String getTipo() {
		return tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume>0)
			this.volume = volume;
	}

	public LocalDate getDtProd() {
		return dtProd;
	}

	public void setDtProd(LocalDate dtProd) {
		if(dtProd.isBefore(LocalDate.now().plusDays(1)))
			this.dtProd = dtProd;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if(valor >= 0)
			this.valor = valor;
	}
}
