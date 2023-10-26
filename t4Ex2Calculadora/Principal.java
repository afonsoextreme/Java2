package t4Ex2Calculadora;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;



public class Principal extends JFrame {



	private static final long serialVersionUID = 1;
	private double termo1;
	private String operacao="nenhum";
	private double termo2;
	private double resultado;
	private JPanel contentPane;
	
	private JTextField textFieldEcran;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);


		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"7");
			}
		});
		btnNewButton.setBounds(10, 54, 127, 58);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"8");
			
			}
		});

		btnNewButton_1.setBounds(147, 54, 127, 58);
		contentPane.add(btnNewButton_1);


		JButton btnNewButton_2 = new JButton("9");

		btnNewButton_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"9");
				
			}

		});



		btnNewButton_2.setBounds(284, 54, 127, 58);

		contentPane.add(btnNewButton_2);



		JButton btnNewButton_3 = new JButton("4");

		btnNewButton_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"4");

			

			}

		});

		btnNewButton_3.setBounds(10, 123, 127, 58);

		contentPane.add(btnNewButton_3);



		JButton btnNewButton_4 = new JButton("5");

		btnNewButton_4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"5");
				

			}

		});

		btnNewButton_4.setBounds(147, 123, 127, 58);

		contentPane.add(btnNewButton_4);



		JButton btnNewButton_5 = new JButton("6");

		btnNewButton_5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"6");
				
			}

		});

		btnNewButton_5.setBounds(284, 123, 127, 58);

		contentPane.add(btnNewButton_5);



		JButton btnNewButton_6 = new JButton("1");

		btnNewButton_6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"1");

				

			}

		});

		btnNewButton_6.setBounds(10, 192, 127, 58);

		contentPane.add(btnNewButton_6);



		JButton btnNewButton_7 = new JButton("2");

		btnNewButton_7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"2");
			

			}

		});

		btnNewButton_7.setBounds(147, 192, 127, 58);

		contentPane.add(btnNewButton_7);



		JButton btnNewButton_8 = new JButton("3");

		btnNewButton_8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"3");

				

			}

		});

		btnNewButton_8.setBounds(284, 192, 127, 58);

		contentPane.add(btnNewButton_8);



		JButton btn0 = new JButton("0");

		btn0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+"0");

			

			}

		});

		btn0.setBounds(10, 261, 127, 58);

		contentPane.add(btn0);



		JButton btnPonto = new JButton(".");

		btnPonto.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				textFieldEcran.setText(textFieldEcran.getText()+".");

			

			}

		});

		btnPonto.setBounds(147, 261, 127, 58);

		contentPane.add(btnPonto);



		JButton btnMenos = new JButton("-");

		btnMenos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(operacao=="nenhum") {
					termo1=Double.parseDouble(textFieldEcran.getText());
					operacao="subtracao";
				}
				textFieldEcran.setText("");

				

			}

		});

		btnMenos.setBounds(421, 261, 127, 58);

		contentPane.add(btnMenos);



		JButton btnNewButton_12 = new JButton("/");

		btnNewButton_12.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(operacao=="nenhum") {
					termo1=Double.parseDouble(textFieldEcran.getText());
					operacao="divisao";
				}
				textFieldEcran.setText("");
				
			

			}

		});

		btnNewButton_12.setBounds(421, 54, 127, 58);

		contentPane.add(btnNewButton_12);



		JButton btnMultiplicacao = new JButton("*");

		btnMultiplicacao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(operacao=="nenhum") {
					termo1=Double.parseDouble(textFieldEcran.getText());
					operacao="multiplicacao";
				}
				textFieldEcran.setText("");

				

			}

		});

		btnMultiplicacao.setBounds(421, 123, 127, 58);

		contentPane.add(btnMultiplicacao);



		JButton btnAdicao = new JButton("+");

		btnAdicao.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//se a operacao que estiver em memoria for igual  a "nenhum"
					//vou colocar no termo1 em doule o que estava em texto no ecran
					//atualizo a operacao para "soma"
				//Senão 
					//...
				//limpo o texto do ecran
				
				//
				if(operacao=="nenhum") {
					termo1=Double.parseDouble(textFieldEcran.getText()) ;
					operacao="soma";
				}
				textFieldEcran.setText("");
				

			}

		});

		btnAdicao.setBounds(421, 192, 127, 58);

		contentPane.add(btnAdicao);



		JButton btnNewButton_15 = new JButton("=");

		btnNewButton_15.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				switch(operacao) {
				case "nenhum":
					break;
				case "soma":
					termo2=Double.parseDouble(textFieldEcran.getText()) ;
					textFieldEcran.setText("");
					break;
				case "divisao":
					break;
				case "multiplicacao":
					break;
				case "subtracao":
					break;
				
				}

			}

		});

		btnNewButton_15.setBounds(284, 261, 127, 58);

		contentPane.add(btnNewButton_15);
		
		textFieldEcran = new JTextField();
		textFieldEcran.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldEcran.setEditable(false);
		textFieldEcran.setBounds(10, 11, 538, 32);
		contentPane.add(textFieldEcran);
		textFieldEcran.setColumns(10);

	}




	
	
}