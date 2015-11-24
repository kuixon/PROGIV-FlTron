package Ventanas;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

/**Esta ventana nos servira para darle la felicitación al jugador ganador. Además, esta ventana
 * será el punto intermedio entre la ventana Consola y la ventana Menu.
 * @author Endika Salgueiro
 *
 */
public class Ventana_Felicitacion extends javax.swing.JFrame implements ActionListener {

	String g;
    
    /**Este es el constructor de la clase por parámetros. Recibe como parámetro el nombre del
     * ganador de la partida. Conociendo el nombre del ganador, podemos mostrarlo en la ventana
     * para darle la enhorabuena.
     * @param ganador
     */
    public Ventana_Felicitacion(String ganador) {
        g=ganador;
    	initComponents();
    }

    /**Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

        Ganador = new javax.swing.JTextField();
        b_aceptar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        Ganador.setText(g);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Ganador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GanadorActionPerformed(evt);
            }
        });
        getContentPane().add(Ganador);
        Ganador.setBounds(190, 140, 360, 40);
        Ganador.setFont(new Font ("Rockwell", 0, 20));

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
        b_aceptar.setBounds(270, 220, 200, 40);
        
        fondo.setIcon(new javax.swing.ImageIcon("src\\Fotos\\FELICIDADES.jpg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 770, 490);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(767, 510));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner titulo.
        this.setTitle("Ventana de felicitación");
       
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());
        
        //Añadir funcionalidad a los botones.
        b_aceptar.addActionListener(this);
        
        //Para que esté visible la ventana.
        this.setVisible(true);


        pack();
    }

    private void GanadorActionPerformed(java.awt.event.ActionEvent evt) {
     
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
            java.util.logging.Logger.getLogger(Ventana_Felicitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Felicitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Felicitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Felicitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Felicitacion("").setVisible(true);
            }
        });
    }
    // Declaración de variables.
    private javax.swing.JTextField Ganador;
    private javax.swing.JButton b_aceptar;
    private javax.swing.JLabel fondo;
    // Fin de la declaración de variables.
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == b_aceptar)
		{
			Menu m = new Menu();
			this.dispose();
		}
	}
}
