
package unam.fi.poo.graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import unam.fi.poo.clases.Usuario;



@SuppressWarnings("serial")

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel ventanaNorte;
	private JPanel ventanaSur;
	private JPanel ventanaCentro;
	private JPanel ventanaEste;
	private JPanel ventanaOeste;
    private JTextField cajaTexton;
    private JTextField cajaTextoap;
    private JTextField cajaTextoam;
    private JTextField cajaTextoe;
    private JLabel lbien;
	

	public VentanaPrincipal() {
		super();		
		this.crearVentanaPrincipal();
		this.agregarComponentes();
		this.setVisible(true);

	}

	public void crearVentanaPrincipal()
	{
		this.setTitle("SCD");
		this.setSize(550,500);
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
        //GridLayout los acomoda por filas y columnas
		this.ventanaNorte = new JPanel(new GridLayout(4,2));
        this.ventanaCentro = new JPanel(new GridLayout(1,3,20,10));
        //panel de sacrificio
		this.ventanaSur = new JPanel(new FlowLayout());
		this.ventanaEste = new JPanel(new FlowLayout());
		this.ventanaOeste = new JPanel(new FlowLayout());
        //panel complementario
        JPanel ventanaCentro1 = new JPanel(new FlowLayout());
        
		this.ventanaNorte.setBackground(Color.pink);
		this.ventanaCentro.setBackground(Color.orange);
        ventanaCentro1.setBackground(Color.orange);
		this.ventanaSur.setBackground(Color.pink);
		this.ventanaEste.setBackground(Color.pink);
		this.ventanaOeste.setBackground(Color.pink);

        //a todos los paneles se les asigna un tamaño y una posiscion
		this.add(this.ventanaOeste,BorderLayout.CENTER);
        ventanaOeste.setSize(550,110);
        ventanaOeste.setLocation(0,0);
		this.add(this.ventanaNorte,BorderLayout.CENTER);
        ventanaNorte.setSize(320,130);
        ventanaNorte.setLocation(140,110);
	    this.add(this.ventanaCentro,BorderLayout.CENTER);
        this.add(ventanaCentro1,BorderLayout.CENTER);
        ventanaCentro.setSize(500,35);
        ventanaCentro.setLocation(20,340);
        ventanaCentro1.setSize(550,35);
        ventanaCentro1.setLocation(0,340);
		this.add(this.ventanaEste,BorderLayout.CENTER);
        ventanaEste.setSize(550,50);
        ventanaEste.setLocation(0,400);
        
        this.add(this.ventanaSur,BorderLayout.CENTER);
        ventanaSur.setSize(300,500);
        ventanaSur.setLocation(10,370);

	}

	public void agregarComponentes()
	{
       //elementos label
		JLabel etiqueta = new JLabel("Sistema de Captura de Datos ");
        JLabel lnombre = new JLabel("Nombre ");
        JLabel lapellp = new JLabel("Apellido paterno ");
        JLabel lapellm = new JLabel("Apellido materno ");
        JLabel ledad = new JLabel("Edad ");
        lbien = new JLabel("¡Bienvenido al sistema!");
        
        //formato de eleemntos label
        etiqueta.setFont(new Font("Arial",Font.PLAIN,20));
        lapellm.setFont(new Font("Arial",Font.PLAIN,20));
        lapellp.setFont(new Font("Arial",Font.PLAIN,20));
        lnombre.setFont(new Font("Arial",Font.PLAIN,20));
        ledad.setFont(new Font("Arial",Font.PLAIN,20));
        lbien.setFont(new Font("Arial",Font.PLAIN,20));
      
        
        //colocando etiqeutas formulario a la derecha
        lnombre.setHorizontalAlignment(SwingConstants.RIGHT);
        lapellm.setHorizontalAlignment(SwingConstants.RIGHT);
        lapellp.setHorizontalAlignment(SwingConstants.RIGHT);
        ledad.setHorizontalAlignment(SwingConstants.RIGHT);
      
        //cajas de texto
        cajaTexton = new JTextField();
        cajaTextoap = new JTextField();
        cajaTextoam = new JTextField();
        cajaTextoe= new JTextField();
        

        //botones
		JButton boton = new JButton("     Cancelar     ");
        JButton botonA = new JButton("     Aceptar     ");
		JButton botoncito = new JButton("     Borrar     ");

    
        //agregando componenetes a los paneles
        
		this.ventanaOeste.add(etiqueta);
        this.ventanaNorte.add(lnombre);
        this.ventanaNorte.add(cajaTexton);
        this.ventanaNorte.add(lapellp);
        this.ventanaNorte.add(cajaTextoap);
        this.ventanaNorte.add(lapellm);
        this.ventanaNorte.add(cajaTextoam);
        this.ventanaNorte.add(ledad);
        this.ventanaNorte.add(cajaTextoe);
		this.ventanaCentro.add(boton);
        this.ventanaCentro.add(botoncito);
        this.ventanaCentro.add(botonA);
        this.ventanaEste.add(lbien);
        
        //creando eventos a cada componente

		boton.addActionListener(this);
        //nombre del evento de boton
        boton.setActionCommand("Cancelar");
		botoncito.addActionListener(this);
        botoncito.setActionCommand("Borrar");
        botonA.addActionListener(this);
        botonA.setActionCommand("Aceptar");
	}

	public void actionPerformed(ActionEvent e)
	{
        //validando eventos
        if(e.getActionCommand().equals("Cancelar"))
        {
            System.exit(0);
        }
        
        if(e.getActionCommand().equals("Borrar"))
        {
            cajaTexton.setText("");
            cajaTextoap.setText("");
            cajaTextoam.setText("");
            cajaTextoe.setText("");
            
        }
        
        if(e.getActionCommand().equals("Aceptar"))
        {
            Usuario miusuario;
            miusuario= new Usuario();
            miusuario.setnombre(cajaTexton.getText());
            miusuario.setapellidop(cajaTextoap.getText());
            miusuario.setapellidom(cajaTextoam.getText());
            int x = Integer.parseInt(cajaTextoe.getText());
            miusuario.setedad(x);
            
            lbien.setText(miusuario.getnombre()+" "+miusuario.getapellidop()+" "+miusuario.getapellidom()+" ("+miusuario.getedad()+")");
            
        }
        
	}

}
