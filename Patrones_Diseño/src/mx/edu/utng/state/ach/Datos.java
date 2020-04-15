package mx.edu.utng.state.ach;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import javax.swing.JEditorPane;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Datos extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtAccion;
	dat d = new dat();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos frame = new Datos();
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
	public Datos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 637, 392);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Informaci\u00F3n de Areas de Signot");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 22));
		lblNewLabel.setForeground(Color.WHITE);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 4;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1- Recursos Humanos");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1.setForeground(Color.BLACK);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 6;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2- Juridico");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 6;
		gbc_lblNewLabel_2.gridy = 4;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3- Programaci\u00F3n");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 6;
		gbc_lblNewLabel_3.gridy = 5;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("4- Are\u00E1 de Pruebas");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 6;
		gbc_lblNewLabel_4.gridy = 6;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtxtAccion = new JTextField();
		jtxtAccion.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_jtxtAccion = new GridBagConstraints();
		gbc_jtxtAccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtxtAccion.gridheight = 2;
		gbc_jtxtAccion.insets = new Insets(0, 0, 5, 5);
		gbc_jtxtAccion.gridx = 6;
		gbc_jtxtAccion.gridy = 8;
		contentPane.add(jtxtAccion, gbc_jtxtAccion);
		jtxtAccion.setHorizontalAlignment(SwingConstants.CENTER);
		jtxtAccion.setColumns(10);
		
		//Boton accion
		JButton btnAccion = new JButton("Verificar");
		GridBagConstraints gbc_btnAccion = new GridBagConstraints();
		gbc_btnAccion.insets = new Insets(0, 0, 5, 5);
		gbc_btnAccion.gridx = 6;
		gbc_btnAccion.gridy = 10;
		contentPane.add(btnAccion, gbc_btnAccion);
		btnAccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				Scanner scanner = new Scanner(jtxtAccion.getText());
		        char opcion;
	
		        while (true) {
		            opcion = scanner.next().charAt(0);
		            switch (opcion) {
		                case '1': 
		                	d.rh(); 
		                	jtxtAccion.setText("");
		                	break;
		                case '2': 
		                	d.jud(); 
		                	jtxtAccion.setText("");
		                	break;
		                case '3': 
		                	d.prog(); 
		                	jtxtAccion.setText("");
		                	break;
		                case '4': 
		                	d.prueb();
		                	jtxtAccion.setText("");
		                	break;
		                default: 
		                	JOptionPane.showMessageDialog(null,"Opcion no válida");
		                	jtxtAccion.setText("");
		            }
		        }
				}catch(Exception e) {
					
				}
				
			}
		});
	}
	
	
}
