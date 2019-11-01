package estoque.janelas;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class JanelaLogin implements ActionListener{

	private JDialog frmLogin;
	private JTextField tfUsuario;
	private JPasswordField tfSenha;
	private JLabel lblUsuario;
	private JButton btnEntrar;
	private JLabel lblLogin;
	private JLabel lblSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaLogin window = new JanelaLogin();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JDialog();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 249, 212);
		frmLogin.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("Usu\u00E1rio:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(14, 37, 57, 25);
		frmLogin.getContentPane().add(lblUsuario);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(14, 84, 46, 25);
		frmLogin.getContentPane().add(lblSenha);
		
		tfUsuario = new JTextField();
		tfUsuario.setBounds(70, 41, 114, 20);
		frmLogin.getContentPane().add(tfUsuario);
		tfUsuario.setColumns(10);
		
		tfSenha = new JPasswordField();
		tfSenha.setBounds(70, 88, 114, 20);
		frmLogin.getContentPane().add(tfSenha);
		tfSenha.setColumns(10);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(this);
		btnEntrar.setBounds(81, 131, 89, 23);
		frmLogin.getContentPane().add(btnEntrar);
		
		lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLogin.setBounds(103, 11, 62, 19);
		frmLogin.getContentPane().add(lblLogin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o == btnEntrar) {
			boolean preenchido = true;
			if (tfUsuario.getText().equals("")) {
				tfUsuario.setBackground(Color.PINK);
				preenchido = false;
			}else {
				tfUsuario.setBackground(Color.WHITE);
			}
			
			if (tfSenha.getText().equals("")) {
				tfSenha.setBackground(Color.PINK);
				preenchido = false;
			}else {
				tfSenha.setBackground(Color.WHITE);
			}
			if (preenchido == true) {
				String usuario = tfUsuario.getText();
				String senha = tfSenha.getText();
			}
			
		}
		
	}
}
