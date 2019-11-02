package estoque.janelas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaMenu implements ActionListener {
	private JDialog frmMenu;
	private JButton btnSair;
	private JLabel lblMenu;
	private JLabel lblProduto;
	private JButton btnInserir;
	private JButton btnAlterar;
	private JButton btnListar;
	private JButton btnExcluir;
	private JLabel lblEstoque;
	private JButton btnNovo;
	private JButton btnBaixa;

	private final JPanel contentPanel = new JPanel();

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

	public JanelaMenu() {
		initialize();
	}
	
	public void initialize() {
		frmMenu = new JDialog();
		frmMenu.setBounds(100, 100, 450, 314);
		frmMenu.getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmMenu.getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(198, 64, 1, 186);
		contentPanel.add(desktopPane);
		
		lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenu.setBounds(175, 23, 46, 14);
		contentPanel.add(lblMenu);
		
		lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblProduto.setBounds(59, 49, 64, 14);
		contentPanel.add(lblProduto);
		
		btnInserir = new JButton("Inserir");
		btnInserir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInserir.setBounds(45, 91, 89, 23);
		contentPanel.add(btnInserir);
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAlterar.setBounds(45, 137, 89, 23);
		contentPanel.add(btnAlterar);
		
		btnListar = new JButton("Listar");
		btnListar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnListar.setBounds(45, 185, 89, 23);
		contentPanel.add(btnListar);
		
		btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExcluir.setBounds(45, 230, 89, 23);
		contentPanel.add(btnExcluir);
		
		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSair.addActionListener(this);
		btnSair.setBounds(335, 241, 89, 23);
		contentPanel.add(btnSair);
		
		lblEstoque = new JLabel("Estoque");
		lblEstoque.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEstoque.setBounds(289, 49, 64, 14);
		contentPanel.add(lblEstoque);
		
		btnNovo = new JButton("Novo");
		btnNovo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNovo.setBounds(278, 117, 89, 23);
		contentPanel.add(btnNovo);
		
		btnBaixa = new JButton("Baixa");
		btnBaixa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBaixa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBaixa.setBounds(278, 167, 89, 23);
		contentPanel.add(btnBaixa);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btnSair) {
			frmMenu.dispose();
		}

		
	}
}
