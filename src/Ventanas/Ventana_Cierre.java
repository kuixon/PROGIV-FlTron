package Ventanas;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

/**Esta clase nos servirá para preguntarle al usuario si realmente desea abandonar el juego. Esta clase
 * recibe como parámetro un String que le indicará desde que ventana se ha realizado la llamada a ésta.
 * De esta forma, en caso de que el usuario no desee salir de la aplicación, podremos devolverle a la
 * ventana desde la que ha echo la llamada a ésta.
 * @author Endika Salgueiro
 *
 */
public class Ventana_Cierre extends javax.swing.JFrame implements ActionListener {

	private String opc;
	
    /**Este es el constructor por parámetro de la clase. Recibe como parámetro un String (opc) que le indicará
     * desde que ventana se ha realizado la llamada a ésta. De esta forma, en caso de que el usuario no
     * desee salir de la aplicación, podremos devolverle a la ventana desde la que ha echo la llamada a ésta.
     * @param opc
     */
    public Ventana_Cierre(String opc) {
    	initComponents();
    	this.opc = opc;
    }

    /**Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

        b_no = new javax.swing.JButton();
        b_si = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        b_no.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_No.png")));
        b_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_noActionPerformed(evt);
            }
        });
        b_no.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				b_no.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_No.png")));
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				b_no.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonNo.gif")));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
        getContentPane().add(b_no);
        b_no.setBounds(300, 200, 100, 50);

        b_si.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Si.png")));
        b_si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texto_siActionPerformed(evt);
            }
        });
        b_si.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				b_si.setIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//boton_Si.png")));
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				b_si.setRolloverIcon(new ImageIcon(getClass().getClassLoader().getResource("Fotos//botonSi.gif")));
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
        getContentPane().add(b_si);
        b_si.setBounds(100, 200, 100, 50);

        fondo.setIcon(new javax.swing.ImageIcon("src/Fotos/salir.jpg")); // NOI18N
        getContentPane().add(fondo);
        fondo.setBounds(0, 0, 500, 400);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(500, 400));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner titulo.
        this.setTitle("Ventana de cierre");
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());

        //Para que esté visible la ventana.
        this.setVisible(true);
        
        //Para añadir funcionalidad a los botones.
        b_si.addActionListener(this);
        b_no.addActionListener(this);

        

        pack();
    }

    private void texto_noActionPerformed(java.awt.event.ActionEvent evt) {
     
    }

    private void texto_siActionPerformed(java.awt.event.ActionEvent evt) {
     
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
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Cierre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Cierre("").setVisible(true);
            }
        });
    }
    // Declaración de variables.
    private javax.swing.JLabel fondo;
    private javax.swing.JButton b_no;
    private javax.swing.JButton b_si;
    // Fin de la declaración de variables.
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == b_si)
		{
			this.dispose();
		}
		else if((arg0.getSource() == b_no)&&(opc.equals("Ventana de bienvenida")))
		{
			this.dispose();
			Ventana_De_Bienvenida v = new Ventana_De_Bienvenida();
		}
		else if((arg0.getSource() == b_no)&&(opc.equals("Consola")))
		{
			this.dispose();
			Consola c = new Consola("", "");
		}
		else if((arg0.getSource() == b_no)&&(opc.equals("Menu")))
		{
			this.dispose();
			Menu m = new Menu();
		}
	}
}
