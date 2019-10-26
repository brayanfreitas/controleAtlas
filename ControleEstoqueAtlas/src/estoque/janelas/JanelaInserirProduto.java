package estoque.janelas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class JanelaInserirProduto {

	private JFrame frmInserirProduto;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaInserirProduto window = new JanelaInserirProduto();
					window.frmInserirProduto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaInserirProduto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmInserirProduto = new JFrame();
		frmInserirProduto.setTitle("Inserir Produto");
		frmInserirProduto.setBounds(100, 100, 473, 314);
		frmInserirProduto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmInserirProduto.getContentPane().setLayout(null);
		
		JLabel lblInserirProduto = new JLabel("Inserir Produto");
		lblInserirProduto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInserirProduto.setBounds(175, 25, 107, 42);
		frmInserirProduto.getContentPane().add(lblInserirProduto);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(29, 92, 46, 14);
		frmInserirProduto.getContentPane().add(lblNome);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o:");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPreo.setBounds(29, 145, 46, 14);
		frmInserirProduto.getContentPane().add(lblPreo);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblQuantidade.setBounds(29, 203, 85, 14);
		frmInserirProduto.getContentPane().add(lblQuantidade);
		
		JLabel lblUnidadeDeMedida = new JLabel("Unidade de Medida:");
		lblUnidadeDeMedida.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUnidadeDeMedida.setBounds(243, 145, 148, 14);
		frmInserirProduto.getContentPane().add(lblUnidadeDeMedida);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(313, 92, 125, 18);
		frmInserirProduto.getContentPane().add(comboBox);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(243, 92, 46, 14);
		frmInserirProduto.getContentPane().add(lblMarca);
		
		textField = new JTextField();
		textField.setBounds(85, 144, 126, 20);
		frmInserirProduto.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(85, 91, 126, 20);
		frmInserirProduto.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 202, 97, 20);
		frmInserirProduto.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(384, 144, 54, 20);
		frmInserirProduto.getContentPane().add(comboBox_1);
	}
}
