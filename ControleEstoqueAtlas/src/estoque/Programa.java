package estoque;

import java.sql.Connection;
import java.util.ArrayList;

import estoque.bd.ConnectionFactory;
import estoque.bd.ProdutoDAO;
import estoque.classes.Marca;
import estoque.classes.Produto;



public class Programa {

	public static void main(String[] args) {
		Connection conexao = new ConnectionFactory().getConnection();
		ProdutoDAO pDAO = new ProdutoDAO(conexao);
		
		//TESTANDO BD //
		Produto p = new Produto(7, "BOLA", 6.00, 20, "UND", new Marca(1, "Marca"));
		
		ArrayList<Produto> produtos = pDAO.Listar();
		for (int i=0; i< produtos.size(); i++) {
			System.out.println(produtos.get(i).getIdProduto());
			System.out.println(produtos.get(i).getNomeProduto());
			System.out.println(produtos.get(i).getPreco());
			System.out.println("----------------------------------");
		}
		boolean teste = pDAO.inserir(p);
		
		//testar LISTAR
		
		System.out.println(teste);
		//teste commit//dwfdsfvfv
		

	}

}
