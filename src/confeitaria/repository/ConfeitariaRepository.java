package confeitaria.repository;

import confeitaria.model.BoloBase;

public interface ConfeitariaRepository {
	
	public void cadastrar(String produto);
	public void procurarPorNumero (int numero);
	public void listarTodos();
	public void atualizar(Bolo preco);
	public void apagar(String produto);
	

	

}
