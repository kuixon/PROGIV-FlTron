package Ventanas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**Esta ventana será la ventana que contiene el menú del juego. Se le ofrece al usuario la posibilidad
 * de iniciar una nueva partida o de consultar las estadísticas de cualquier jugador.
 * @author Endika Salgueiro
 *
 */
public class Menu extends javax.swing.JFrame implements ActionListener {

    /**Este es el constructor de la clase. Es un constructor sin parámetros y lo utilizaremos para
     * crear objetos del tipo Menu.
     * 
     */
    public Menu() {
        initComponents();
    }

    /**Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

        b_estadisticas = new javax.swing.JButton();
        b_nuevaPart1 = new javax.swing.JButton();
        b_cerrar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b_estadisticas.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Estadisticas.png")));
        b_nuevaPart1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				b_estadisticas.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Estadisticas.png")));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				b_estadisticas.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonEstadisticas.gif")));
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});

        getContentPane().add(b_estadisticas);
        b_estadisticas.setBounds(220, 300, 310, 50);

        b_nuevaPart1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Nueva_Partida.png")));
        b_nuevaPart1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				b_nuevaPart1.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Nueva_Partida.png")));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				b_nuevaPart1.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonNuevaPartida.gif")));
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        getContentPane().add(b_nuevaPart1);
        b_nuevaPart1.setBounds(220, 200, 310, 50);

        b_cerrar.setBackground(new java.awt.Color(102, 153, 255));
        b_cerrar.setIcon(new javax.swing.ImageIcon("src//Fotos//cruz-roja-x-.jpg"));
        getContentPane().add(b_cerrar);
        b_cerrar.setBounds(10, 10, 30, 28);
        
        fondo.setIcon(new javax.swing.ImageIcon("src\\Fotos\\MENUPRINCI.jpg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 770, 490);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(767, 510));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner titulo.
        this.setTitle("Menu");
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());
        
        //Añadir funcionalidad a los botones.
        b_nuevaPart1.addActionListener(this);
        b_estadisticas.addActionListener(this);
        b_cerrar.addActionListener(this);
        
        //Para que esté visible la ventana.
        this.setVisible(true);

        
        pack();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    // Declaración de variables.
    private javax.swing.JButton b_estadisticas;
    private javax.swing.JButton b_nuevaPart1;
    private javax.swing.JButton b_cerrar;
    private javax.swing.JLabel fondo;
    // Fin de la declaración de variables.
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == b_cerrar)
		{
			Ventana_Cierre vC = new Ventana_Cierre("Menu");
			this.dispose();
		}
		else if(arg0.getSource() == b_nuevaPart1)
		{
			Ventana_De_Bienvenida vB = new Ventana_De_Bienvenida();
			this.dispose();
		}
		else if(arg0.getSource() == b_estadisticas)
		{
			Estadisticas  e = new Estadisticas();
			this.dispose();
		}
	}
}
