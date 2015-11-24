package Ventanas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**Esta ventana le ofrecera al usuario la posibilidad de consultar estadísticas de cualquier jugador
 * que haya jugador al juego. Solo tendrá que introducir el nombre del jugador del que desea obtener
 * información en un campo de busqueda.
 * @author Endika Salgueiro
 *
 */
public class Estadisticas extends javax.swing.JFrame implements ActionListener {

    /**Este es el constructor de la clase. Es un constructor sin parámetros y lo utilizaremos para
     * crear objetos del tipo Estadisticas.
     */
    public Estadisticas() {
        initComponents();
    }

    /**Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

        panel_Est = new javax.swing.JPanel();
        t_por_vic = new javax.swing.JLabel();
        por_vic = new javax.swing.JTextField();
        t_nom_usuario = new javax.swing.JLabel();
        t_part_jug = new javax.swing.JLabel();
        t_part_gan = new javax.swing.JLabel();
        t_part_per = new javax.swing.JLabel();
        nom_Usuario = new javax.swing.JTextField();
        part_jug = new javax.swing.JTextField();
        part_gan = new javax.swing.JTextField();
        part_per = new javax.swing.JTextField();
        b_busqueda = new javax.swing.JButton();
        b_retroceso = new javax.swing.JButton();
        t_peticion1 = new javax.swing.JLabel();
        nom_Consulta = new javax.swing.JTextField();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel_Est.setBackground(new java.awt.Color(0, 0, 0));
        panel_Est.setLayout(null);

        t_por_vic.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        t_por_vic.setForeground(new java.awt.Color(255, 255, 255));
        t_por_vic.setText("Porcentaje victorias:");
        panel_Est.add(t_por_vic);
        t_por_vic.setBounds(10, 170, 170, 22);

        por_vic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                por_vicActionPerformed(evt);
            }
        });
        panel_Est.add(por_vic);
        por_vic.setFont(new Font ("Rockwell", 0, 18));
        por_vic.setBounds(190, 170, 440, 25);

        t_nom_usuario.setFont(new Font ("Rockwell", 0, 18));
        t_nom_usuario.setForeground(new java.awt.Color(255, 255, 255));
        t_nom_usuario.setText("Nombre de usuario:");
        panel_Est.add(t_nom_usuario);
        t_nom_usuario.setBounds(10, 10, 170, 22);

        t_part_jug.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        t_part_jug.setForeground(new java.awt.Color(255, 255, 255));
        t_part_jug.setText("Partidas jugadas:");
        panel_Est.add(t_part_jug);
        t_part_jug.setBounds(10, 50, 150, 22);

        t_part_gan.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        t_part_gan.setForeground(new java.awt.Color(255, 255, 255));
        t_part_gan.setText("Partidas ganadas:");
        panel_Est.add(t_part_gan);
        t_part_gan.setBounds(10, 90, 150, 22);

        t_part_per.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        t_part_per.setForeground(new java.awt.Color(255, 255, 255));
        t_part_per.setText("Patidas perdidas:");
        panel_Est.add(t_part_per);
        t_part_per.setBounds(10, 130, 150, 22);

        nom_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_UsuarioActionPerformed(evt);
            }
        });
        panel_Est.add(nom_Usuario);
        nom_Usuario.setBounds(190, 10, 440, 25);
        nom_Usuario.setFont(new Font ("Rockwell", 0, 18));

        part_jug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                part_jugActionPerformed(evt);
            }
        });
        panel_Est.add(part_jug);
        part_jug.setBounds(170, 50, 460, 25);
        part_jug.setFont(new Font ("Rockwell", 0, 18));

        part_gan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                part_ganActionPerformed(evt);
            }
        });
        panel_Est.add(part_gan);
        part_gan.setBounds(170, 90, 460, 25);
        part_gan.setFont(new Font ("Rockwell", 0, 18));

        part_per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                part_perActionPerformed(evt);
            }
        });
        panel_Est.add(part_per);
        part_per.setBounds(170, 130, 460, 25);
        part_per.setFont(new Font ("Rockwell", 0, 18));

        getContentPane().add(panel_Est);
        panel_Est.setBounds(40, 230, 680, 210);

        b_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_busquedaActionPerformed(evt);
            }
        });
        b_busqueda.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Buscar.png")));
        b_busqueda.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				b_busqueda.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Buscar.png")));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				b_busqueda.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonBuscar.gif")));
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

        getContentPane().add(b_busqueda);
        b_busqueda.setBounds(630, 150, 110, 40);

        t_peticion1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        t_peticion1.setText("Consultar estadisticas de:");
        getContentPane().add(t_peticion1);
        t_peticion1.setForeground(new java.awt.Color(255, 255, 255));
        t_peticion1.setBounds(50, 150, 220, 40);
        
        b_retroceso.setBackground(new java.awt.Color(102, 153, 255));
        b_retroceso.setIcon(new javax.swing.ImageIcon("src//Fotos//flecha_de_retroceso.gif"));
        getContentPane().add(b_retroceso);
        b_retroceso.setBounds(10, 10, 55, 60);

        nom_Consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_ConsultaActionPerformed(evt);
            }
        });
        getContentPane().add(nom_Consulta);
        nom_Consulta.setBounds(280, 150, 340, 40);
        nom_Consulta.setFont(new Font ("Rockwell", 0, 20));
        
        fondo.setIcon(new javax.swing.ImageIcon("src\\Fotos\\ESTADIS.jpg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 770, 490);
        
        //Poner por defecto algunos componentes.
        panel_Est.setVisible(false);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(767, 518));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Ayuda en los botones.
        nom_Consulta.setToolTipText("Introduce el nombre del usuario del que quieras consultar sus estadísticas.");
        
        //Para poner titulo.
        this.setTitle("Estadisticas");
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());
        
        //Añadir funcionalidad a los botones.
        b_busqueda.addActionListener(this);
        b_retroceso.addActionListener(this);
        //Para que esté visible la ventana.
        this.setVisible(true);

        
        pack();
    }

    private void por_vicActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void b_busquedaActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void nom_ConsultaActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void nom_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void part_jugActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void part_ganActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void part_perActionPerformed(java.awt.event.ActionEvent evt) {
     
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
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estadisticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estadisticas().setVisible(true);
            }
        });
    }
    
    /**Este método nos servirá para saber si el usuario ha introducido algo en el campo de busqueda.
     * Si lo ha introducido nos devolverá true y si no nos devolverá false.
     * @return true o false
     */
    public boolean validar()
    {
    	if (nom_Consulta.getText().equals(""))
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }
        
    // Declaración de variables.
    private javax.swing.JButton b_busqueda;
    private javax.swing.JButton b_retroceso;
    private javax.swing.JTextField nom_Consulta;
    private javax.swing.JTextField nom_Usuario;
    private javax.swing.JPanel panel_Est;
    private javax.swing.JTextField part_gan;
    private javax.swing.JTextField part_jug;
    private javax.swing.JTextField part_per;
    private javax.swing.JTextField por_vic;
    private javax.swing.JLabel t_nom_usuario;
    private javax.swing.JLabel t_part_gan;
    private javax.swing.JLabel t_part_jug;
    private javax.swing.JLabel t_part_per;
    private javax.swing.JLabel t_peticion1;
    private javax.swing.JLabel t_por_vic;
    private javax.swing.JLabel fondo;
    // Fin de la declaración de variables.
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == b_retroceso)
		{
			Menu m = new Menu();
			this.dispose();
		}
		else if(arg0.getSource() == b_busqueda)
		{
			int total=0,ganadas=0,perdidas=0;
			if (validar() == false)
			{
				JOptionPane.showMessageDialog(this, "No has introducido nada en el campo de busqueda", "Error de introducción de datos", JOptionPane.ERROR_MESSAGE);
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
		    		
		    		Statement stmt = con.createStatement();

		    		String sentencia = "SELECT * FROM Usuario WHERE Nombre_Us='"+nom_Consulta.getText().trim()+"'";

		    		ResultSet rs = stmt.executeQuery(sentencia);
		    		if (!rs.next())
		    		{
		    			JOptionPane.showMessageDialog(this, "Este jugador no ha jugado al juego", "Error jugador no existente", 2);
					}
		    		else
		    		{
		    			panel_Est.setVisible(true);
		    			nom_Usuario.setText(nom_Consulta.getText());
		    			total=0;
		    			sentencia = "SELECT COUNT(*) AS TOTAL FROM Partida WHERE Nombre_Jug1='"+nom_Consulta.getText().trim()+"' OR Nombre_Jug2='"+nom_Consulta.getText().trim()+"'";
		    			rs=stmt.executeQuery(sentencia);
		    			if (rs.next())
		    			{
		    				total=rs.getInt("TOTAL");
		    			}
		    			part_jug.setText(String.valueOf(total));
		    			
		    			ganadas=0;
		    			sentencia = "SELECT COUNT(*) AS TOTAL FROM Partida WHERE Nombre_Jug1='"+nom_Consulta.getText().trim()+"' AND Puntos_Jug1=3";
		    			rs=stmt.executeQuery(sentencia);
		    			if (rs.next())
		    			{
		    				ganadas+=rs.getInt("TOTAL");
		    			}
		    			sentencia = "SELECT COUNT(*) AS TOTAL FROM Partida WHERE Nombre_Jug2='"+nom_Consulta.getText().trim()+"' AND Puntos_Jug2=3";
		    			rs=stmt.executeQuery(sentencia);
		    			if (rs.next())
		    			{
		    				ganadas+=rs.getInt("TOTAL");
		    			}
		    			
		    			part_gan.setText(String.valueOf(ganadas));
		    			
		    			perdidas=0;
		    			sentencia = "SELECT COUNT(*) AS TOTAL FROM Partida WHERE Nombre_Jug1='"+nom_Consulta.getText().trim()+"' AND Puntos_Jug1<>3";
		    			rs=stmt.executeQuery(sentencia);
		    			if (rs.next())
		    			{
		    				perdidas+=rs.getInt("TOTAL");
		    			}
		    			sentencia = "SELECT COUNT(*) AS TOTAL FROM Partida WHERE Nombre_Jug2='"+nom_Consulta.getText().trim()+"' AND Puntos_Jug2<>3";
		    			rs=stmt.executeQuery(sentencia);
		    			if (rs.next())
		    			{
		    				perdidas+=rs.getInt("TOTAL");
		    			}
		    			
		    			
		    		}
		    		
		    		part_per.setText(String.valueOf(perdidas));
	    			por_vic.setText(String.valueOf(ganadas*100/total)+"%");
	    			//Fin: Se realizan operaciones en la base de datos.
	    	
		    		//Inicio: Se cierra la conexión con la base de datos.
		    		rs.close();
		    		stmt.close();
		    		con.close();
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
		    	//Fin: Se cierra la conexión con la base de datos.

		    
			}
		}
	}
}
