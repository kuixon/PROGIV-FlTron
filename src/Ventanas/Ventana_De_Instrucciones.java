package Ventanas;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;

/**Esta clase tiene como objetivo mostrarle a los usuarios las instrucciones. Es una ventana muy sencilla
 * que solo incluye un fondo donde se explican las instrucciones.
 * @author Endika Salgueiro
 *
 */
public class Ventana_De_Instrucciones extends javax.swing.JFrame implements KeyListener {
	
	public static String nom1, nom2;
    
    /**Este es el constructor por parámetros de la clase. Este constructor recibe dos String que serán los
     * nombres de los jugadores. Por lo tanto, al realizar la llamada desde la ventana de bienvenida a ésta
     * le pasaremos los nombres de los jugadores (nom1 y nom2).
     * @param nom1
     * @param nom2
     */
    public Ventana_De_Instrucciones(String nom1, String nom2)
    {
    	this.nom1 = nom1;
    	this.nom2 = nom2;
    	initComponents();
    }

    /**Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

    	fondo = new javax.swing.JLabel();
    	
    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fondo.setIcon(new javax.swing.ImageIcon("src/Fotos/instrucciones.jpg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, -20, 767, 530);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(767, 510));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner titulo.
        this.setTitle("Ventana de instrucciones");
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());

        //Para que esté visible la ventana.
        this.setVisible(true);
        
        //Para poder utilizar el teclado
        this.addKeyListener(this);
        
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
            java.util.logging.Logger.getLogger(Ventana_De_Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_De_Instrucciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_De_Instrucciones("", "").setVisible(true);
            }
        });
    }
    // Declaración de variables.
    private javax.swing.JLabel fondo;
    // Fin de la declaración de variables.
    
    public void keyPressed(KeyEvent arg0) {
		if (Character.isWhitespace(arg0.getKeyCode()))
		{
			this.dispose();
			Consola c = new Consola(nom1, nom2);
		}
	}

	
	public void keyReleased(KeyEvent arg0) {
		
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
}
