package confeitaria.model;

public abstract class BoloBase {
	
	private String recheio, sabor;
	private float preco, peso;
	int tipo;

	
	public BoloBase(String recheio, String sabor, float preco, float peso, int tipo) {
	this.recheio = recheio;
	this.sabor = sabor;
	this.preco = preco;
	this.peso = peso;
	this.tipo = tipo;

	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
