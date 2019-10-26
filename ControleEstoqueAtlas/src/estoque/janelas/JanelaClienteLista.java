package estoque.janelas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneLayout;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import loja.entidades.Cliente;
import loja.entidades.Marca;
import loja.entidades.Unidade;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class JanelaClienteLista implements ActionListener,
		ListSelectionListener {
	protected JTable tbClientes;
	protected ClienteTableModel tmCliente;

	protected JDialog frame;
	protected JScrollPane scroll;
	protected JPanel panelBotoes;
	protected JButton btFechar;
	private JButton btSelecionar;
	// protected JPanel panel; nao foi usado
	private Cliente clienteSel;
	public static final int SEMSELECAO = 0;
	public static final int COMSELECAOALTERAR = 1;
	public static final int COMSELECAOEXCLUIR = 2;
	private JButton btnExcluir;
	private JButton btnAlterar;
	private JLabel lblOrdenarPor;
	private JRadioButton rdbtnCdigo;
	private JRadioButton rdbtnNomeDoServio;
	private JRadioButton rdbtncidade;
	private JRadioButton rdbtnCpf;
	private JLabel lblProcurarPor;
	private JTextField tfprocurar;
	private JToolBar toolBar;
	public JanelaClienteLista(List<Cliente> clientes, int tipo) {
		initGUI(clientes, tipo);
	}

	public Cliente getClienteSel() {
		return clienteSel;
	}

	public void setVisible(boolean visible) {
		frame.setVisible(visible);
	}

	private void initGUI(List<Cliente> clientes, int tipo) {
		frame = new JDialog();
		frame.setTitle("Lista Cliente");
		frame.setModal(true);
		frame.setSize(550, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		// BorderLayout l = (BorderLayout) frame.getContentPane().getLayout();
		// l.setHgap(10);
		// l.setVgap(10);

		tmCliente = new ClienteTableModel(clientes);

		tbClientes = new JTable();
		tbClientes.setModel(tmCliente);
		// apenas uma linha È selecionada pro vez
		tbClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// tamanhho da coluna em pixels
		tbClientes.getColumnModel().getColumn(0).setPreferredWidth(60);
		// se a coluna È redimensionavel
		tbClientes.getColumnModel().getColumn(0).setResizable(true);
		tbClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
		tbClientes.getColumnModel().getColumn(1).setResizable(true);
		tbClientes.getColumnModel().getColumn(2).setPreferredWidth(120);
		tbClientes.getColumnModel().getColumn(2).setResizable(true);
		tbClientes.getColumnModel().getColumn(3).setPreferredWidth(120);
		tbClientes.getColumnModel().getColumn(3).setResizable(true);
		tbClientes.getColumnModel().getColumn(4).setPreferredWidth(90);
		tbClientes.getColumnModel().getColumn(4).setResizable(true);
		tbClientes.getColumnModel().getColumn(5).setPreferredWidth(150);
		tbClientes.getColumnModel().getColumn(5).setResizable(true);
		tbClientes.getColumnModel().getColumn(6).setPreferredWidth(60);
		tbClientes.getColumnModel().getColumn(6).setResizable(true);
		tbClientes.getColumnModel().getColumn(7).setPreferredWidth(100);
		tbClientes.getColumnModel().getColumn(7).setResizable(true);
		tbClientes.getColumnModel().getColumn(8).setPreferredWidth(100);
		tbClientes.getColumnModel().getColumn(8).setResizable(true);
		// tbProdutos.getColumnModel().getColumn(4).setPreferredWidth(100);
		// tbProdutos.getColumnModel().getColumn(4).setResizable(true);
		// possibilidade de reordenar as colunas
		tbClientes.getTableHeader().setReorderingAllowed(false);
		frame.getContentPane().setLayout(null);
		tbClientes.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		scroll = new JScrollPane(tbClientes,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(32, 80, 469, 239);
		// panel.add(scroll);
		// scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		// scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		// scroll.setViewportView(tbProdutos);
		frame.getContentPane().add(scroll);
		
		toolBar = new JToolBar();
		scroll.setColumnHeaderView(toolBar);

		panelBotoes = new JPanel();
		panelBotoes.setBounds(0, 329, 544, 43);
		FlowLayout layout = (FlowLayout) panelBotoes.getLayout();
		layout.setVgap(10);
		layout.setHgap(10);
		layout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panelBotoes);

		if (tipo == JanelaClienteLista.COMSELECAOALTERAR) {
			tbClientes.getSelectionModel().addListSelectionListener(this);
			btSelecionar = new JButton("Alterar");
			btSelecionar.setEnabled(false);
			btSelecionar.addActionListener(this);
			panelBotoes.add(btSelecionar);
		}
		
		if (tipo == JanelaClienteLista.COMSELECAOEXCLUIR) {
			tbClientes.getSelectionModel().addListSelectionListener(this);
			btSelecionar = new JButton("Excluir");
			btSelecionar.setEnabled(false);
			btSelecionar.addActionListener(this);
			panelBotoes.add(btSelecionar);
		}

		btFechar = new JButton("Fechar");
		btFechar.setEnabled(true);
		btFechar.setBounds(438, 51, 89, 23);
		btFechar.addActionListener(this);
		panelBotoes.add(btFechar);
		
		
		JLabel lblListarClientes = new JLabel("Listagem de Clientes");
		lblListarClientes.setBounds(193, 5, 176, 14);
		lblListarClientes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblListarClientes);
		
		lblOrdenarPor = new JLabel("Procurar Por:");
		lblOrdenarPor.setBounds(10, 30, 79, 14);
		frame.getContentPane().add(lblOrdenarPor);
		
		ButtonGroup bg = new ButtonGroup();
		
		rdbtnCdigo = new JRadioButton("C\u00F3digo");
		rdbtnCdigo.setBounds(100, 26, 64, 23);
		rdbtnCdigo.setSelected(false);
		rdbtnCdigo.addActionListener(this);
		bg.add(rdbtnCdigo);
		frame.getContentPane().add(rdbtnCdigo);
		
		rdbtnNomeDoServio = new JRadioButton("Nome do Cliente");
		rdbtnNomeDoServio.setBounds(181, 26, 109, 23);
		rdbtnNomeDoServio.setSelected(false);
		rdbtnNomeDoServio.addActionListener(this);
		bg.add(rdbtnNomeDoServio);
		frame.getContentPane().add(rdbtnNomeDoServio);
		
		rdbtncidade = new JRadioButton("Cidade");
		rdbtncidade.setBounds(313, 26, 79, 23);
		rdbtncidade.setSelected(false);
		rdbtncidade.addActionListener(this);
		bg.add(rdbtncidade);
		frame.getContentPane().add(rdbtncidade);
		
		rdbtnCpf = new JRadioButton("CPF");
		rdbtnCpf.setBounds(405, 26, 79, 23);
		rdbtnCpf.setSelected(false);
		rdbtnCpf.addActionListener(this);
		bg.add(rdbtnCpf);
		frame.getContentPane().add(rdbtnCpf);
		
		lblProcurarPor = new JLabel("Pesquisar Por:");
		lblProcurarPor.setBounds(10, 55, 90, 14);
		frame.getContentPane().add(lblProcurarPor);
		
		tfprocurar = new JTextField();
		tfprocurar.setBounds(100, 53, 314, 20);
		frame.getContentPane().add(tfprocurar);
		tfprocurar.setColumns(10);
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(428, 53, 89, 23);
		btnProcurar.setEnabled(false);
		btnProcurar.addActionListener(this);
		frame.getContentPane().add(btnProcurar);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == btFechar) {
			frame.dispose();
		} else if (o == btSelecionar) {
			// getSelectedRow retorna o indice da linha Selecionada
			int linhaSel = tbClientes.getSelectedRow();
			// atravez da linha pego o produto
			clienteSel = tmCliente.getCliente(linhaSel);
			frame.dispose();
		}
	}

//	public static void main(String[] args) {
//		List<Produto> prods = new ArrayList<Produto>();
//		prods.add(new Produto(1, "Arroz", new Marca(1, "Sepe"), "Bom", 10, 200,
//				Unidade.PCT, true, new Date()));
//		prods.add(new Produto(2, "Feij√£o", new Marca(2, "Supang"), "", 3.5,
//				100, Unidade.PCT, true, new Date()));
//
//		JanelaProdutoLista j = new JanelaProdutoLista(prods,
//				JanelaProdutoLista.COMSELECAOALTERAR);
//		j.setVisible(true);
//	}

	@Override
	// o Metodo valueChanged sera exexutado toda vez q uma linha for selecionada
	// no JTable
	public void valueChanged(ListSelectionEvent e) {
		btSelecionar.setEnabled(true); // ativando o botao

	}
}
