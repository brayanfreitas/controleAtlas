package estoque.janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.JSeparator;

public class JanelaMenu {

	private JFrame frmMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaMenu window = new JanelaMenu();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setBounds(100, 100, 487, 318);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMenu.setBounds(215, 11, 56, 14);
		frmMenu.getContentPane().add(lblMenu);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduto.setBounds(99, 45, 56, 14);
		frmMenu.getContentPane().add(lblProduto);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnInserir.setBounds(77, 86, 104, 29);
		frmMenu.getContentPane().add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterar.setBounds(77, 126, 104, 29);
		frmMenu.getContentPane().add(btnAlterar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnListar.setBounds(77, 166, 104, 29);
		frmMenu.getContentPane().add(btnListar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluir.setBounds(77, 209, 104, 29);
		frmMenu.getContentPane().add(btnExcluir);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(238, 49, 1, 219);
		frmMenu.getContentPane().add(desktopPane);
		
		JLabel lblVenda = new JLabel("Venda");
		lblVenda.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblVenda.setBounds(316, 44, 48, 17);
		frmMenu.getContentPane().add(lblVenda);
		
		JButton btnNovaVenda = new JButton("Nova Venda");
		btnNovaVenda.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNovaVenda.setBounds(286, 127, 113, 27);
		frmMenu.getContentPane().add(btnNovaVenda);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(372, 245, 89, 23);
		frmMenu.getContentPane().add(btnCancelar);
	}
}
