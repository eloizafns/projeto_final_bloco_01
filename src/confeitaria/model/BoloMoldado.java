package confeitaria.model;

public class BoloMoldado extends BoloBase {

	String formato;

	public BoloMoldado(String recheio, String sabor, float preco, float peso,int tipo, String formato) {
		super(recheio, sabor, preco, peso, tipo);
		this.formato = formato;

	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public void visualizar() {
		
		String tipo = "";
		
		switch (this.tipo) {
		case 1:
			tipo = "Redondo";
			break;
		case 2:
			tipo = "Retangular";
			break;
		}
		
		System.out.println("Formato: " + tipo);

	}

}
