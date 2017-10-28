
package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel ventanaNorte;
	private JPanel ventanaSur;
	private JPanel ventanaCentro;
	private JPanel ventanaEste;
	private JPanel ventanaOeste;
	

	public VentanaPrincipal() {
		super();		
		this.crearVentanaPrincipal();
		this.agregarComponentes();
		this.setVisible(true);

	}

	public void crearVentanaPrincipal()
	{
		this.setTitle("Practica 9");
		this.setSize(500,400);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.ventanaNorte = new JPanel(new FlowLayout()); 
		this.ventanaCentro = new JPanel(new FlowLayout());
		this.ventanaSur = new JPanel(new FlowLayout()); 
		this.ventanaEste = new JPanel(new FlowLayout()); 
		this.ventanaOeste = new JPanel(new FlowLayout()); 

		this.ventanaNorte.setBackground(Color.cyan); 
		this.ventanaCentro.setBackground(Color.pink);
		this.ventanaSur.setBackground(Color.green);
		this.ventanaEste.setBackground(Color.red);
		this.ventanaOeste.setBackground(Color.yellow);  

		this.add(this.ventanaOeste,BorderLayout.WEST); 
		this.add(this.ventanaNorte,BorderLayout.NORTH); 
		this.add(this.ventanaCentro,BorderLayout.CENTER); 
		this.add(this.ventanaEste,BorderLayout.EAST); 
		this.add(this.ventanaSur,BorderLayout.SOUTH); 

	}

	public void agregarComponentes()
	{
		JLabel etiqueta = new JLabel("Insertar informacion: ");
		JTextField cajaTexto = new JTextField(20);
		JButton boton = new JButton("ok :v");

		JButton botoncito = new JButton("BOTONCITO");

		boton.addActionListener(this);
		botoncito.setBackground(Color.gray);

		this.ventanaCentro.add(etiqueta);
		this.ventanaCentro.add(cajaTexto);
		this.ventanaCentro.add(boton);

		this.ventanaCentro.add(botoncito);

		this.ventanaCentro.add(boton);
		boton.addActionListener(this);
		botoncito.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Evento: "+e.getActionCommand());
	}

}
