package estoque.controle;

import java.sql.Connection;
import java.util.ArrayList;

import estoque.janelas.TelaGrafica;
import estoque.bd.ProdutoDAO;
import estoque.classes.Marca;
import estoque.classes.Produto;

public class Sistema {

	private static ProdutoDAO pDAO;
	private static int proxPorduto=0;
	private TelaGrafica tela = new TelaGrafica();

	public Sistema(Connection conexao) {
		pDAO = new ProdutoDAO(conexao);

		Produto p = new Produto(8, "SHUREG", 6.00, 20, "UND", new Marca(1, "Marca"));

		ArrayList<Produto> produtos = pDAO.Listar();
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getIdProduto());
			System.out.println(produtos.get(i).getNomeProduto());
			System.out.println(produtos.get(i).getPreco());
			System.out.println("----------------------------------");
		}
		boolean teste = pDAO.alterar(p);

		// testar LISTAR

		System.out.println(teste);
	}

}
