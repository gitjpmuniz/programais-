package janelas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;

public class Ensino extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final JPanel tela2Login = new JPanel();
	private JTextField NomeTELA2;
	private JPasswordField SenhaTELA2;
	private JTextField NomeUsuario;
	private JTextField EmailouCelular;
	private JTextField senhaTELA1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ensino frame = new Ensino();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ensino() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\duduc\\Pictures\\imagens baixadas\\python_18894.png"));
		setTitle("Progamais+");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 761, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 745, 438);
		contentPane.add(layeredPane);
		
		JPanel tela1Cadastro = new JPanel();
		tela1Cadastro.setBounds(0, 0, 745, 438);
		layeredPane.add(tela1Cadastro);
		tela1Cadastro.setVisible(true);
		tela1Cadastro.setBackground(new Color(255, 255, 255));
		tela1Cadastro.setLayout(null);
		
		JLabel Label1TELA1 = new JLabel("Seja bem vindo ao programais+");
		Label1TELA1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		Label1TELA1.setBounds(203, 11, 232, 27);
		tela1Cadastro.add(Label1TELA1);
		
		JLabel label2TELA1 = new JLabel("Para começar seu cadastro insira as seguintes informações");
		label2TELA1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 15));
		label2TELA1.setBounds(101, 38, 422, 27);
		tela1Cadastro.add(label2TELA1);
		
		JLabel LabelN = new JLabel("Nome de usuario");
		LabelN.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		LabelN.setBounds(554, 91, 103, 20);
		tela1Cadastro.add(LabelN);
		
		NomeUsuario = new JTextField();
		NomeUsuario.setBounds(553, 113, 180, 26);
		tela1Cadastro.add(NomeUsuario);
		NomeUsuario.setColumns(10);
		
		JLabel LabelEouC = new JLabel("Email ou Celular:");
		LabelEouC.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		LabelEouC.setBounds(548, 162, 109, 14);
		tela1Cadastro.add(LabelEouC);
		
		EmailouCelular = new JTextField();
		EmailouCelular.setColumns(10);
		EmailouCelular.setBounds(554, 182, 180, 27);
		tela1Cadastro.add(EmailouCelular);
		
		JButton SenhaTELA1 = new JButton("Prosseguir");
		SenhaTELA1.addActionListener(new ActionListener() {
			private JComponent tela3HUD;

			public void actionPerformed(ActionEvent e) {
			if(NomeUsuario.getText().equals("") && EmailouCelular.getText().equals("") && senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"prencha os dados");
			}else if(NomeUsuario.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"e necessario nome de usuario");
			}else if(EmailouCelular.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"email ou telefone incorretos");
			}else if(senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"senha não preenchida");
			}else if(NomeUsuario.getText().equals("") && EmailouCelular.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"senha não foi preenchida");
			}else if(EmailouCelular.getText().equals("") && senhaTELA1.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"e obrigatorio criar nome de usuario");
			}
			if(NomeUsuario.getText().equals("nome") && EmailouCelular.getText().equals("email") && senhaTELA1.getText().equals("senha")) {
				JOptionPane.showMessageDialog(null,"Seja Bem Vindo");
			}tela2Login.setVisible(false);
			tela1Cadastro.setVisible(false);
			tela3HUD.setVisible(true);
			
			}
			
		});
		SenhaTELA1.setBounds(624, 394, 109, 23);
		tela1Cadastro.add(SenhaTELA1);
		
		JButton ButtonTELA1 = new JButton("Login");
		ButtonTELA1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tela2Login.setVisible(true);
			tela1Cadastro.setVisible(false);
			}	
		});
		ButtonTELA1.setForeground(new Color(0, 0, 255));
		ButtonTELA1.setBounds(644, 11, 89, 23);
		tela1Cadastro.add(ButtonTELA1);
		
		JLabel lblNewLabel_4 = new JLabel("Senha:");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		lblNewLabel_4.setBounds(554, 220, 46, 14);
		tela1Cadastro.add(lblNewLabel_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 283, 745, 2);
		tela1Cadastro.add(separator_1);
		
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Não sou um robô");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setForeground(new Color(0, 0, 255));
		chckbxNewCheckBox.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		chckbxNewCheckBox.setBounds(568, 333, 133, 23);
		tela1Cadastro.add(chckbxNewCheckBox);
	
///////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		JTextPane textPaneTela1 = new JTextPane();
		textPaneTela1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		textPaneTela1.setText("Fale conosco: programais+@gmail.com");
		textPaneTela1.setBounds(10, 385, 317, 27);
		tela1Cadastro.add(textPaneTela1);
		
		JTextPane texttela1_1 = new JTextPane();
		texttela1_1.setText("Nesta plataforma voce ira da seus primeiros passos na linguagem de programção em python,treinando seu pensamento computacional e aprendendo estruturas basicas de programção.\r\n");
		texttela1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		texttela1_1.setEditable(false);
		texttela1_1.setBounds(0, 108, 425, 101);
		tela1Cadastro.add(texttela1_1);
		
		senhaTELA1 = new JTextField();
		senhaTELA1.setBounds(554, 245, 179, 27);
		tela1Cadastro.add(senhaTELA1);
		senhaTELA1.setColumns(10);
		tela2Login.setBounds(0, 0, 745, 438);
		layeredPane.add(tela2Login);
		tela2Login.setVisible(false);
		tela2Login.setLayout(null);
		tela2Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		tela2Login.setBackground(Color.WHITE);
		
/////////////////////////////////////////////////////////
		
		
		JLabel labelS = new JLabel("Insira sua senha:");
		labelS.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		labelS.setBounds(145, 166, 108, 26);
		tela2Login.add(labelS);
		
		JLabel labelE = new JLabel("Insira seu nome:");
		labelE.setForeground(Color.BLACK);
		labelE.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		labelE.setBounds(145, 121, 103, 14);
		tela2Login.add(labelE);
		
		NomeTELA2 = new JTextField();
		NomeTELA2.setColumns(10);
		NomeTELA2.setBackground(Color.WHITE);
		NomeTELA2.setBounds(263, 119, 176, 20);
		tela2Login.add(NomeTELA2);
		
		
		
		JButton buttonTELA2 = new JButton("Prosseguir");
		buttonTELA2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(NomeTELA2.getText().equals("") && SenhaTELA2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"nome e senha não preenchidos");
			}else if(NomeTELA2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"nome não preenchido");
			}else if(SenhaTELA2.getText().equals("")) {
				JOptionPane.showMessageDialog(null,"senha não preenchido");
			}else if(NomeTELA2.getText().equals("nome") && SenhaTELA2.getText().equals("senha")) {
				JOptionPane.showMessageDialog(null,"acesso concedido");
			}tela1Cadastro.setVisible(false);
			tela2Login.setVisible(false);
				
			}
		});
		buttonTELA2.setBackground(Color.WHITE);
		buttonTELA2.setBounds(630, 404, 103, 23);
		tela2Login.add(buttonTELA2);
		
		JLabel lblNewLabel_2 = new JLabel("Seja bem vindo ao programais+");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(219, 11, 245, 20);
		tela2Login.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Por favor");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(304, 43, 81, 14);
		tela2Login.add(lblNewLabel_3);
		
		SenhaTELA2 = new JPasswordField();
		SenhaTELA2.setBounds(263, 170, 176, 20);
		tela2Login.add(SenhaTELA2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 217, 723, 2);
		tela2Login.add(separator);
		
		JCheckBox Checagem = new JCheckBox("Não sou um robô");
		Checagem.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		Checagem.setForeground(new Color(0, 0, 255));
		Checagem.setBounds(257, 320, 150, 23);
		tela2Login.add(Checagem);
		
		JPanel tela3HUD = new JPanel();
		tela3HUD.setBounds(0, 0, 745, 438);
		layeredPane.add(tela3HUD);
		tela3HUD.setBackground(new Color(255, 255, 255));
		tela3HUD.setLayout(null);
		
		JTextPane JtextpaneTELA3 = new JTextPane();
		JtextpaneTELA3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 14));
		JtextpaneTELA3.setEditable(false);
		JtextpaneTELA3.setText("Ola lidou boas vindas ao programais+ nesta seção voce ira acessar\r\nseu material didatico e dara o inicio e fim de seu curso, para verficar\r\nos modulos va para o menu acima e selecioni o modulo que deseja");
		JtextpaneTELA3.setBounds(10, 181, 470, 71);
		tela3HUD.add(JtextpaneTELA3);
		
		JMenuBar menuBar_1TELA3 = new JMenuBar();
		menuBar_1TELA3.setForeground(new Color(192, 192, 192));
		menuBar_1TELA3.setBackground(new Color(192, 192, 192));
		menuBar_1TELA3.setBounds(0, 0, 741, 22);
		tela3HUD.add(menuBar_1TELA3);
		
		JMenu Modulo1 = new JMenu("Modulo1");
		Modulo1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		Modulo1.setBackground(new Color(255, 255, 255));
		Modulo1.setForeground(new Color(0, 0, 255));
		menuBar_1TELA3.add(Modulo1);
		
		JMenuItem modulo1cap1 = new JMenuItem("Capitulo1");
		modulo1cap1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tela3HUD.setVisible(false);
				
			}
		});
		Modulo1.add(modulo1cap1);
		
		JMenu mnNewMenu_1 = new JMenu("Modulo2");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		mnNewMenu_1.setForeground(new Color(255, 128, 64));
		menuBar_1TELA3.add(mnNewMenu_1);
		
		JMenuItem modulo2cap1 = new JMenuItem("Capitulo1");
		modulo2cap1.addActionListener(new ActionListener() {
			
			private JComponent tela5Modulo2;
			private JComponent tela4Modulo1;

			public void actionPerformed(ActionEvent e) {
				tela3HUD.setVisible(false);
				tela5Modulo2.setVisible(true);
				tela4Modulo1.setVisible(false);
			}
		});
		mnNewMenu_1.add(modulo2cap1);
		
		JMenu modulo3 = new JMenu("Modulo3");
		modulo3.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		modulo3.setForeground(new Color(0, 0, 255));
		menuBar_1TELA3.add(modulo3);
		
		JMenuItem modulo3cap1 = new JMenuItem("Capitulo1");
		modulo3cap1.addActionListener(new ActionListener() {
			private JComponent tela5Modulo2;
			private JComponent tela4Modulo1;
			private JComponent tela6Modulo3;

			public void actionPerformed(ActionEvent e) {
				tela6Modulo3.setVisible(true);
				tela4Modulo1.setVisible(false);
				tela3HUD.setVisible(false);
				tela5Modulo2.setVisible(false);
			}
			
		});
		modulo3.add(modulo3cap1);
		
		JPanel tela4Modulo1 = new JPanel();
		tela4Modulo1.setForeground(new Color(0, 0, 0));
		tela4Modulo1.setBounds(0, 0, 745, 438);
		layeredPane.add(tela4Modulo1);
		tela4Modulo1.setBackground(new Color(255, 255, 255));
		tela4Modulo1.setLayout(null);
		
		JScrollPane scrollPaneTELA4 = new JScrollPane();
		scrollPaneTELA4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA4.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA4.setBounds(0, 0, 735, 438);
		tela4Modulo1.add(scrollPaneTELA4);
		
		JTextArea JtextareaTELA4 = new JTextArea();
		JtextareaTELA4.setEditable(false);
		scrollPaneTELA4.setViewportView(JtextareaTELA4);
		JtextareaTELA4.setText("1_INTRODUÇÃO                                                                                                                                                                                                        \r\n A linguagem python foi criada e desevolvida no final dos ãnos 80 pelo alemão Guido Van Rossum como um passatempo de progra\r\nmação Guido era fã da serie de comedia The Monty Python's Flaying Circus o que o inspirou no nome da linguagem de progração,\r\nem seu conceito original foi pensado como um interpretador, mas nos dias atuais se tornou uma linguagem universal sendo de sen\r\nso comum em adoção nas mais diferentes areas de aplicação.\r\n1.2_CARACTERISTICAS\r\n Python e uma linguagem de alto nivel ou seja uma linguagem que se aproxima mais perto possivel da linguagem humana tendo\r\na colocação de linguagens mais faceis de se aprender, outras caracteristicas que ela possui são multiparadigma, suporta banco de\r\ndados e poder suporta interface com usuario e muito mais.\r\n1.3_TIPOSE DE DADOS, VARIAVEIS, EXPRESSOES\r\n -Print()\r\nSaida/Exibição de Dados:\r\n A função print(), que, em inglês, significa imprimir, imprime na tela o que estiver entre parênteses utilizaremos sempre que quiser\r\nmos mostrar algo, como uma mensagem ou o resultado de uma operação numérica, etc assim como na matematica em que f(x)\r\nopera em x que esta entre parenteses\r\n-Variaveis:\r\n Qualquer dado que seja manipulado pelo programa deve ficar armazenado na memória principal do computador para que o \r\narmazenamento de dados seja possível, é preciso reservar espaços para isso na memória principal as variáveis e constantes são unidades      \r\nbásicas de armazenamento dos dados em programação Elas são um espaço de memória reservado para armazenar um certo tipo\r\nde dado e possuem um identificador (nome) para referenciar o seu conteúdo.\r\n Podemos dizer que a nomeação de regiões da memoria facilita o nosso trabalho conseguindo fazer a = 5 estar armazenado, em algum\r\nlocal da RAM, enqunto o valor 5 podemos dizer que \"a recebe 5\" nos referindo pela variavel a que foi definida no começo o uso de\r\nvariaveis depende principalmente de sua inteligibilidade e no reuso do código.\r\nEx.: a = 5\r\nb = 3\r\nprint(a + b)\r\n-tipos:\r\n As variáveis têm, além de valores e nomes, tipos onde python possui tipagem dinâmica não precisandoespecificar\r\nos tipos das variáveis, como em outras linguagens\r\nOs tipos são:\r\nTexto: str\r\nNuméricos: int, float, complex\r\nSequência: list, tuple, range\r\nMapeamento: dict\r\nConjuntos: set, frozenset\r\nBooleano: bool\r\nBinários: bytes, bytearray, memoryview\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		
		JPanel tela5Modulo2 = new JPanel();
		tela5Modulo2.setBackground(new Color(255, 255, 255));
		tela5Modulo2.setBounds(0, 0, 745, 438);
		layeredPane.add(tela5Modulo2);
		tela5Modulo2.setLayout(null);
		
		JScrollPane scrollPaneTELA5 = new JScrollPane();
		scrollPaneTELA5.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA5.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA5.setBounds(0, 0, 735, 438);
		tela5Modulo2.add(scrollPaneTELA5);
		
		JTextArea txtrFFFTELA5 = new JTextArea();
		txtrFFFTELA5.setText("2_ ESTRUTURAÇÃO PYTHON                                                                                                                                                                            !\r\n As estruturas de controle permitem selecionar quais partes do código (chamadas de estruturas de decisão) serão executadas e\r\nrepetir blocos de instruções com base em algum critério, como uma variável de controle ou a validade de alguma condição\r\n(denominadas estruturas de repetição) neste módulo, vamos conhecer as estruturas de decisão e de repetição em Python.\r\n As estruturas  de decisão e de repetição possuem sintaxes bastante semelhantes em C e em Python mesmo com essa grande se\r\n-melhança existe uma diferença crítica no tratamento das condições, diferentemente da linguagem c python oferece o tipo bool\r\npor isso cabe ressaltar a diferença de comportamento das duas linguagens nesse tratamento\r\n2.2_ESTRUTURAS DE DECISÃO\r\n Em python uma das estruturas de decisão que e possivel utilizar são\" if \", \"if-else\" e \"else\" (curiosidade e possivel utilizar essas estruduras da\r\nmesma na forma linguagem c), if nada mais e nada menos que o nosso \"se\" podemos entendelo da seguinte forma caso a condi\r\n-ção seja verdadeira faça a ação.\r\nex: a = 33\r\nb = 200\r\nif b>a:\r\n  print(\"b e maior que a\")\r\n\r\n Quando temos um cenário onde uma condição é simplesmente a negação da primeira, podemos usar uma forma de para sim\r\n-plificar os programas essa forma é a comando else, que significa \"caso contrário\".\r\nex: pc = \"linux\"\r\nif pc == \"linux\":\r\nprint(\"Eh Linux!\" )\r\nelse: print(\"não eh linux...\")\r\r\n\r\n O bloco else if ou elif e a combinação dos dois blocos fazendo duas condições por exemplo se determinada condição não for ver\r\n-dadeira faça imprimir a  dizendo mensagem que falsa.\r\nex:\r\ncategoria = int(input(\"Digite a categoria do produto\"))\r\nif categoria == 1:\r\npreco = 10\r\nelif categoria == 2:\r\npreco = 20\r\nelif categoria == 3:\r\npreco = 30\r\nelif categoria == 4:\r\npreco = 40\r\nelse:\r\npreco = 50\r\nprint(\"Preco = %d\" % preco)\r\n\r\n \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n");
		scrollPaneTELA5.setViewportView(txtrFFFTELA5);
		
		JPanel tela6Modulo3 = new JPanel();
		tela6Modulo3.setBackground(new Color(255, 255, 255));
		tela6Modulo3.setBounds(0, 0, 745, 438);
		layeredPane.add(tela6Modulo3);
		tela6Modulo3.setLayout(null);
		
		JScrollPane scrollPaneTELA6 = new JScrollPane();
		scrollPaneTELA6.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA6.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPaneTELA6.setBounds(0, 0, 735, 438);
		tela6Modulo3.add(scrollPaneTELA6);
		
		JTextArea textAreaTELA6 = new JTextArea();
		textAreaTELA6.setText("3_ ESTRUTURAÇÃO DE REPETIÇÃO                                                                                                                                                                         !\r\n Em estruturas de repetição como os blocos \"for\" e \"while\" são casos do tipo se tal condição permaneçer verdadeira o processo sera\r\nrepitido definido ou indefinidamente.\r\n O bloco for que na tradução fica para \"para\" ira ter a função de por exemplo dizer que essa condição ira se considerada legitima sua\r\nestrutura sera repetida\r\nex:\r\nfor x in range(1, 10):\r\nprint(x)\r\n Ja o bloco while que na tradução fica para \"quando\" tem a funçao de dizer que quando tal condição receber o valor especifico\r\nela inicia seu ciclo se não receber não inicia o ciclo");
		scrollPaneTELA6.setViewportView(textAreaTELA6);
	
	}
}
