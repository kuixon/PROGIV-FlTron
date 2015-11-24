package Ventanas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

/**Esta ventana es la primera ventana del juego. En esta ventana los usuarios tendrán que
 * introducir sus nombres y darle al botón aceptar.
 * @author Endika Salgueiro
 *
 */
public class Ventana_De_Bienvenida extends javax.swing.JFrame implements ActionListener {

    /**
     * Este es el constructor de la clase. Con este constructor podemos crear un objeto
     * del tipo Ventana_De_Bienvenida. Es un constructor que no recibe parámetros.
     */
    public Ventana_De_Bienvenida() {
    	initComponents();
    }

    /**
     * Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

        texto_J1 = new javax.swing.JTextField();
        Texto_J2 = new javax.swing.JTextField();
        b_aceptar = new javax.swing.JButton();
        b_cerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        texto_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_J1ActionPerformed(evt);
            }
        });
        getContentPane().add(texto_J1);
        texto_J1.setBounds(451, 159, 242, 60);
        getContentPane().add(Texto_J2);
        Texto_J2.setBounds(452, 265, 242, 60);
        Texto_J2.setFont(new Font ("Rockwell", 0, 30));
        texto_J1.setFont(new Font ("Rockwell", 0, 30));

        b_aceptar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonNormal.png")));
        b_aceptar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				b_aceptar.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonNormal.png")));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				b_aceptar.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton.gif")));
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        getContentPane().add(b_aceptar);
        b_aceptar.setBounds(310, 380, 200, 40);
        
        b_cerrar.setBackground(new java.awt.Color(102, 153, 255));
        b_cerrar.setIcon(new javax.swing.ImageIcon("src//Fotos//cruz-roja-x-.jpg"));
        getContentPane().add(b_cerrar);
        b_cerrar.setBounds(10, 10, 30, 28);

        fondo.setIcon(new javax.swing.ImageIcon("src\\Fotos\\menu.jpg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 770, 490);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(767, 491));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner titulo.
        this.setTitle("Ventana de bienvenida");
        
        //Ayuda en los botones.
        texto_J1.setToolTipText("Introduce el nombre de usuario del jugador 1.");
        Texto_J2.setToolTipText("Introduce el nombre de usuario del jugador 2.");
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());
        
        //Añadir funcionalidad a los botones.
        b_aceptar.addActionListener(this);
        b_cerrar.addActionListener(this);
        
        //Para que esté visible la ventana.
        this.setVisible(true);
        
        pack();
    }

    private void texto_J1ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    /**Este es el main de la clase, el programa principal donde se contemplan todas las excepciones.
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Bienvenida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_De_Bienvenida().setVisible(true);
            }
        });
    }
    
    /**Este método lo utilizaremos para validar que los usuarios hayan introducido sus nombres. Este método
     * nos devolverá true si los dos campos de texto estan rellenos y false si falta algún campo por rellenar.
     * @return true o false
     */
    public boolean validar()
    {
    	if ((texto_J1.getText().equals(""))||(Texto_J2.getText().equals("")))
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }
    
    // Declaración de variables
    private javax.swing.JTextField Texto_J2;
    private javax.swing.JButton b_aceptar;
    private javax.swing.JButton b_cerrar;
    private javax.swing.JLabel fondo;
    private javax.swing.JTextField texto_J1;
    // Fin de la declaración de variables
	
	public void actionPerformed(ActionEvent arg0) {
		
		if (arg0.getSource() == b_aceptar)
		{
			if (validar() == false)
			{
				JOptionPane.showMessageDialog(this, "Faltan casillas por rellenar.", "Error de introducción de datos", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				//Inicio: Se abre una conexión con la base de datos.
				Connection con=null;
		    	try
		    	{
		    	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    	}
		    	catch(ClassNotFoundException e)
		    	{
		    		System.out.println("Error de la conexión");
		    	}


		    	try
		    	{
		    	 con = DriverManager.getConnection("jdbc:odbc:BaseDeDatosFLTRON","","");
		    	}
		    	catch(Exception e)
		    	{}
		    	//Fin: Se abre una conexión con la base de datos.
		    	
		    	//Inicio: Se realizan operaciones en la base de datos.
		    	try{
		    		
		    		/*Vamos a  hacer la select para comprobar si los usuarios están en la
		    		 * tabla y sino insertarlos*/
		    		
		    		Statement stmt = con.createStatement();

		    		String sentencia = "SELECT * FROM Usuario WHERE Nombre_Us='"+texto_J1.getText().trim()+"'";

		    		ResultSet rs = stmt.executeQuery(sentencia);
		    		if (!rs.next())
		    		{
		    			sentencia = "INSERT INTO Usuario (Nombre_Us) VALUES ('"+texto_J1.getText().trim()+"')";
		    			stmt.executeUpdate(sentencia);
		    			
		    		}
		    		
		    		sentencia = "SELECT * FROM Usuario WHERE Nombre_Us='"+Texto_J2.getText().trim()+"'";

		    		rs = stmt.executeQuery(sentencia);
		    		if (!rs.next())
		    		{
		    			sentencia = "INSERT INTO Usuario (Nombre_Us) VALUES ('"+Texto_J2.getText().trim()+"')";
		    			stmt.executeUpdate(sentencia);
		    			
		    		}
		    		//Fin: Se realizan operaciones en la base de datos.
		    		
		    		//Inicio: Se cierra la conexión con la base de datos.
		    		rs.close();
		    		stmt.close();
		    		con.close();
		    	}
		    	catch(Exception e)
		    	{
		    		System.out.println("Error de inserción de datos");
		    	}
		    	//Fin: Se cierra la conexión con la base de datos.

				Ventana_De_Instrucciones v = new Ventana_De_Instrucciones(texto_J1.getText(), Texto_J2.getText());
				this.dispose();
			}
		}
		else if(arg0.getSource() == b_cerrar)
		{
			this.dispose();
			Ventana_Cierre vc = new Ventana_Cierre("Ventana de bienvenida");
		}
	}
}
