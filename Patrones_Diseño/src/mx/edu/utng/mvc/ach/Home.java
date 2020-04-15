package mx.edu.utng.mvc.ach;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Home extends JFrame {
	
	private JPanel contentPane;
	private javax.swing.JScrollPane jScrollPane1;
	private JTextField txtProducto;
	String temp = "";
    Producto Objproduc = new Producto ();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 530);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre del Producto");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(22, 71, 158, 30);
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Productos Electronicos");
		lblNewLabel.setBounds(111, 11, 202, 24);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1_1 = new JLabel("Marca");
		lblNewLabel_1_1.setToolTipText("");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setBounds(22, 112, 158, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Precio");
		lblNewLabel_1_1_1.setToolTipText("");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Arial", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1_1.setBounds(22, 153, 158, 30);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(190, 77, 176, 24);
		contentPane.add(txtProducto);
		txtProducto.setColumns(10);
		
		JTextField txtMarca = new JTextField();
		txtMarca.setColumns(10);
		txtMarca.setBounds(190, 116, 176, 24);
		contentPane.add(txtMarca);
		
		JTextField txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(190, 157, 176, 24);
		contentPane.add(txtPrecio);
		
		JButton btnNewButton = new JButton("Capturar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Objproduc.setNombre(txtProducto.getText());
		        Objproduc.setMarca(txtMarca.getText());
		        Objproduc.setPrecio(Double.parseDouble(txtPrecio.getText()));
		        JOptionPane.showMessageDialog(null, "Datos capturados correctamente");
		        
		        
		        txtProducto.setText("");
		        txtMarca.setText("");
		        txtPrecio.setText("");
			}
		});
		btnNewButton.setBounds(277, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Costos de los Productos Ingresados");
		lblNewLabel_1_2.setToolTipText("");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblNewLabel_1_2.setBackground(Color.WHITE);
		lblNewLabel_1_2.setBounds(71, 252, 281, 30);
		contentPane.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setToolTipText("");
		scrollPane.setBounds(81, 293, 257, 127);
		contentPane.add(scrollPane);
		
		JTextArea txtAreaProduct = new JTextArea();
		scrollPane.setViewportView(txtAreaProduct);
		txtAreaProduct.setToolTipText("");
		
		txtAreaProduct.setLineWrap(true);
		
		JButton btnVer = new JButton("Ver");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				temp = temp +"************Producto*************" + "\n"+
	                     "Nombre: "+ Objproduc.getNombre() + "\n" +
	                     "Marca: " +  Objproduc.getMarca() + "\n" +
	                     "Precio: "+ Objproduc.getPrecio() + "\n" +
	                "**************************************";
	        txtAreaProduct.setText(temp);
			}
		});
		btnVer.setBounds(177, 431, 89, 23);
		contentPane.add(btnVer);
	}
}
