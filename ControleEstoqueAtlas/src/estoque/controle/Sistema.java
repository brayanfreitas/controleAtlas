package estoque.controle;

import java.sql.Connection;
import java.util.ArrayList;

import estoque.janelas.TelaGrafica;
import estoque.bd.MarcaDAO;
import estoque.bd.ProdutoDAO;
import estoque.bd.UsuarioDAO;
import estoque.classes.Marca;
import estoque.classes.Produto;
import estoque.classes.Usuario;

public class Sistema {

	private static ProdutoDAO pDAO;
	private static MarcaDAO mDAO;
	private static UsuarioDAO uDAO;
	private static int proxPorduto=0;
	private TelaGrafica tela = new TelaGrafica();

	public Sistema(Connection conexao) {
		mDAO = new MarcaDAO(conexao);
		pDAO = new ProdutoDAO(conexao, mDAO);
		uDAO = new UsuarioDAO(conexao);
		

		Produto p = new Produto(8, "SHUREG", 6.00, 20, "UND", new Marca(3));
		Usuario u = new Usuario();

		boolean teste = pDAO.alterar(p);
		
		ArrayList<Produto> produtos = pDAO.listar();
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println(produtos.get(i).getIdProduto());
			System.out.println(produtos.get(i).getNomeProduto());
			System.out.println(produtos.get(i).getPreco());
			System.out.println(produtos.get(i).getMarca().getNomeMarca());
			System.out.println(produtos.get(i).getMarca().getIdMarca());
			System.out.println("----------------------------------");
		}
		
		System.out.println("--------------------------------------------");
		
		ArrayList<Usuario> usuarios = uDAO.listar();
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i).getIdLogin());
			System.out.println(usuarios.get(i).getNomeUsuario());
			System.out.println(usuarios.get(i).getLogin());
			System.out.println(usuarios.get(i).getSenha());
			System.out.println("----------------------------------");
		}
		
		



		System.out.println(teste);
	}

}
