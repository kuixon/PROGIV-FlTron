package Ventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**Esta clase será el thread del jugador dos. Como es un hilo, la clase heredará de Thread.
 * @author Endika Salgueiro
 *
 */
class Jugador2 extends Thread
{
	int cont = 0;
	
	/**Este es el constructor de la clase que nos permitira crear el hilo para el jugador 2.
	 * Es un constructor que no recibe ningún parámetro. 
	 */
	public Jugador2()
	{
		super();
	}
	
	public void run()
	{
		while (true)
		{
			if (cont == 0)
			{
				Consola.left = true;
				cont++;
			}
			if ((Consola.ralentizador_J2)&&((Consola.ralentizadores_Jug2 >= 0)&&(Consola.ralentizadores_Jug2 <=3)))
			{
				try {
					Jugador2.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if ((Consola.right)&&(!Consola.hab_rig))
			{
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2][Consola.y_j2-1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2][Consola.y_j2-1].setBackground(Color.ORANGE);
						Consola.y_j2 = Consola.y_j2 - 1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}	

			}
			else if ((Consola.right)&&(Consola.hab_rig))
			{
				Consola.hab_dow = true;
				Consola.hab_up = true;
				Consola.hab_lef = false;
				Consola.hab_rig = true;
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2][Consola.y_j2+1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2][Consola.y_j2+1].setBackground(Color.ORANGE);
						Consola.y_j2 = Consola.y_j2 + 1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}
			}
			else if ((Consola.left)&&(!Consola.hab_lef))
			{
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2][Consola.y_j2+1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2][Consola.y_j2+1].setBackground(Color.ORANGE);
						Consola.y_j2 = Consola.y_j2 + 1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}
			}
				
			else if ((Consola.left)&&(Consola.hab_lef))
			{
				Consola.hab_dow = true;
				Consola.hab_up = true;
				Consola.hab_rig = false;
				Consola.hab_lef = true;
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2][Consola.y_j2-1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2][Consola.y_j2-1].setBackground(Color.ORANGE);
						Consola.y_j2 = Consola.y_j2 - 1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}	
			}
			else if ((Consola.up)&&(!Consola.hab_up))
			{
				Consola.hab_lef = true;
				Consola.hab_rig = true;
				Consola.hab_up = false;
				Consola.hab_dow = true;
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2+1][Consola.y_j2].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2+1][Consola.y_j2].setBackground(Color.ORANGE);
						Consola.x_j2 = Consola.x_j2+1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}
			}
			else if ((Consola.up)&&(Consola.hab_up))
			{
				Consola.hab_rig = true;
				Consola.hab_lef = true;
				Consola.hab_dow = false;
				Consola.hab_up = true;
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2-1][Consola.y_j2].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2-1][Consola.y_j2].setBackground(Color.ORANGE);
						Consola.x_j2 = Consola.x_j2 - 1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}
			}
			else if ((Consola.down)&&(!Consola.hab_dow))
			{
				Consola.hab_rig = true;
				Consola.hab_lef = true;
				Consola.hab_dow = false;
				Consola.hab_up = true;
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2-1][Consola.y_j2].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2-1][Consola.y_j2].setBackground(Color.ORANGE);
						Consola.x_j2 = Consola.x_j2 - 1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}
			}
			else if ((Consola.down)&&(Consola.hab_dow))
			{
				Consola.hab_lef = true;
				Consola.hab_rig = true;
				Consola.hab_up = false;
				Consola.hab_dow = true;
				if ((Consola.x_j2 != 0)&&(Consola.x_j2 != 99)&&(Consola.y_j2 != 0)&&(Consola.y_j2 != 99))
				{
					if (Consola.casillas[Consola.x_j2+1][Consola.y_j2].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j2+1][Consola.y_j2].setBackground(Color.ORANGE);
						Consola.x_j2 = Consola.x_j2+1;
						Consola.matarHilosJ2 = false;
						try {
							Jugador2.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ2 = true;
					}
				}
			}
		}
	}
}

/**Esta clase será el thread del jugador uno. Como es un hilo, la clase heredará de Thread.
 * @author Endika Salgueiro
 *
 */
class Jugador1 extends Thread
{
	int cont = 0;
	
	/**Este es el constructor de la clase que nos permitira crear el hilo para el jugador 1.
	 * Es un constructor que no recibe ningún parámetro.
	 */
	public Jugador1()
	{
		super();
	}
	
	public void run()
	{
		while (true)
		{
			if (cont == 0)
			{
				Consola.derecha = true;
				cont++;
			}
			if ((Consola.ralentizador_J1)&&((Consola.ralentizadores_Jug1 >= 0)&&(Consola.ralentizadores_Jug1 <=3)))
			{
				try {
					Jugador1.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			if ((Consola.derecha)&&(!Consola.hab_der))
			{
				Consola.hab_arri = true;
				Consola.hab_aba = true;
				Consola.hab_der = false;
				Consola.hab_izq = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1][Consola.y_j1-1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1][Consola.y_j1-1].setBackground(Color.BLUE);
						Consola.y_j1 = Consola.y_j1 - 1;
						Consola.matarHilosJ1 = false;
					try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
			if ((Consola.derecha)&&(Consola.hab_der))
			{
				Consola.hab_arri = true;
				Consola.hab_aba = true;
				Consola.hab_izq = false;
				Consola.hab_der = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1][Consola.y_j1+1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1][Consola.y_j1+1].setBackground(Color.BLUE);
						Consola.y_j1 = Consola.y_j1 + 1;
						Consola.matarHilosJ1 = false;
						try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
			else if ((Consola.izquierda)&&(!Consola.hab_izq))
			{
				Consola.hab_arri = true;
				Consola.hab_aba = true;
				Consola.hab_izq = false;
				Consola.hab_der = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1][Consola.y_j1+1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1][Consola.y_j1+1].setBackground(Color.BLUE);
						Consola.y_j1 = Consola.y_j1 + 1;
						Consola.matarHilosJ1 = false;
						try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
			else if ((Consola.izquierda)&&(Consola.hab_izq))
			{
				Consola.hab_arri = true;
				Consola.hab_aba = true;
				Consola.hab_der = false;
				Consola.hab_izq = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1][Consola.y_j1-1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1][Consola.y_j1-1].setBackground(Color.BLUE);
						Consola.y_j1 = Consola.y_j1 - 1;
						Consola.matarHilosJ1 = false;
					try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}	
			}
			else if ((Consola.arriba)&&(!Consola.hab_arri))
			{
				Consola.hab_izq = true;
				Consola.hab_der = true;
				Consola.hab_arri = false;
				Consola.hab_aba = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1+1][Consola.y_j1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1+1][Consola.y_j1].setBackground(Color.BLUE);
						Consola.x_j1 = Consola.x_j1+1;
						Consola.matarHilosJ1 = false;
						try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
			else if ((Consola.arriba)&&(Consola.hab_arri))
			{
				Consola.hab_der = true;
				Consola.hab_izq = true;
				Consola.hab_aba = false;
				Consola.hab_arri = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1-1][Consola.y_j1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1-1][Consola.y_j1].setBackground(Color.BLUE);
						Consola.x_j1 = Consola.x_j1 - 1;
						Consola.matarHilosJ1 = false;
						try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
			else if ((Consola.abajo)&&(!Consola.hab_aba))
			{
				Consola.hab_der = true;
				Consola.hab_izq = true;
				Consola.hab_aba = false;
				Consola.hab_arri = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1-1][Consola.y_j1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1-1][Consola.y_j1].setBackground(Color.BLUE);
						Consola.x_j1 = Consola.x_j1 - 1;
						Consola.matarHilosJ1 = false;
						try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
			else if ((Consola.abajo)&&(Consola.hab_aba))
			{
				Consola.hab_izq = true;
				Consola.hab_der = true;
				Consola.hab_arri = false;
				Consola.hab_aba = true;
				if ((Consola.x_j1 != 0)&&(Consola.x_j1 != 99)&&(Consola.y_j1 != 0)&&(Consola.y_j1 != 99))
				{
					if (Consola.casillas[Consola.x_j1+1][Consola.y_j1].getBackground() == Color.GRAY)
					{
						Consola.casillas[Consola.x_j1+1][Consola.y_j1].setBackground(Color.BLUE);
						Consola.x_j1 = Consola.x_j1+1;
						Consola.matarHilosJ1 = false;
						try {
							Jugador1.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					else
					{
						Consola.up = false;
						Consola.right = false;
						Consola.left = false;
						Consola.down = false;
						Consola.izquierda = false;
						Consola.derecha = false;
						Consola.abajo = false;
						Consola.arriba = false;
						Consola.matarHilosJ1 = true;
					}
				}
			}
		}
	}
}

/**Esta es la clase donde se desarrollará toda la jugabilidad del juego. En está clase tendremos dos threads,
 * uno para cada jugador, que podrán manejarlos para jugar y derrotar a su oponente.
 * @author Endika Salgueiro
 *
 */
public class Consola extends javax.swing.JFrame implements ActionListener, KeyListener {
	
	public static JPanel [][] casillas;
	private Jugador1 j1;
	private Jugador2 j2;
	public static boolean izquierda = false, derecha = false, arriba = false, abajo = false;
	public static boolean left = false, right = false, up = false, down = false;
	public static boolean hab_izq = true, hab_der = true, hab_arri = true, hab_aba = true;
	public static boolean hab_lef = true, hab_rig = true, hab_up = true, hab_dow = true;
	public static boolean ralentizador_J1 = false, ralentizador_J2 = false;
	public static int ralentizadores_Jug1 = 3, ralentizadores_Jug2 = 3;
	public static int x_j1;
	public static int y_j1;
	public static int x_j2;
	public static int y_j2;
	public static boolean matarHilosJ1 = false;
	public static boolean matarHilosJ2 = false;
	public static String nom1, nom2;
	
    
    /**Este es el constructor por parámetros de la clase. Con este constructor podremos crear objetos del tipo
     * Consola. Los parámetros que recibe este constructor (nom1 y nom2) son los nombres de los jugadores.
     * @param nom1
     * @param nom2
     */
    public Consola(String nom1, String nom2) {
    	this.nom1 = nom1;
    	this.nom2 = nom2;
        initComponents();
        JOptionPane.showMessageDialog(this, "Pulsa la barra espaciadora para comenzar.", "Información para el jugador", 2);
        
    }

    /**Con este método construimos todos los componentes de la ventana. La llamada a este método
     * irá dentro del constructor de la clase.
     */
    private void initComponents() {

    	iconoJ1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p_J1 = new javax.swing.JTextField();
        t_J1 = new javax.swing.JTextField();
        v_J1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        iconoJ2 = new javax.swing.JLabel();
        p_J2 = new javax.swing.JTextField();
        t_J2 = new javax.swing.JTextField();
        v_J2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelJuego = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t3_J1 = new javax.swing.JLabel();
        t1_J1 = new javax.swing.JLabel();
        t2_J1 = new javax.swing.JLabel();
        t3_J2 = new javax.swing.JLabel();
        t1_J2 = new javax.swing.JLabel();
        t2_J2 = new javax.swing.JLabel();
        b_cerrar = new javax.swing.JButton();
        b_trucoJ1 = new javax.swing.JButton();
        b_trucoJ2 = new javax.swing.JButton();
        casillas = new JPanel[100][100];
        l_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        getContentPane().setLayout(null);

        b_trucoJ1.setBackground(new java.awt.Color(0));
        getContentPane().add(b_trucoJ1);
        b_trucoJ1.setIcon(new javax.swing.ImageIcon("src/Fotos/fondo_negro.png"));
        b_trucoJ1.setBounds(310, 60, 40, 40);
        
        b_trucoJ2.setBackground(new java.awt.Color(0));
        getContentPane().add(b_trucoJ2);
        b_trucoJ2.setIcon(new javax.swing.ImageIcon("src/Fotos/fondo_negro.png"));
        b_trucoJ2.setBounds(840, 60, 40, 40);
        
        iconoJ1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(iconoJ1);
        iconoJ1.setIcon(new javax.swing.ImageIcon("src/Fotos/transformer1.gif"));
        iconoJ1.setBounds(90, 10, 60, 60);

        jLabel2.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(800, 10, 60, 60);

        p_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_J1ActionPerformed(evt);
            }
        });
        p_J1.setFont(new java.awt.Font("Rockwell", 0, 18));
        p_J1.setText("0");
        getContentPane().add(p_J1);
        p_J1.setBounds(250, 120, 40, 30);

        t_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_J1ActionPerformed(evt);
            }
        });
        t_J1.setFont(new java.awt.Font("Rockwell", 0, 18));
        t_J1.setText(nom1);
        getContentPane().add(t_J1);
        t_J1.setBounds(170, 30, 180, 30);

        v_J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_J1ActionPerformed(evt);
            }
        });
        v_J1.setFont(new java.awt.Font("Rockwell", 0, 18));
        v_J1.setText("3");
        getContentPane().add(v_J1);
        v_J1.setBounds(150, 80, 40, 30);

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vidas:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 80, 60, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ralentizadores:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(557, 150, 165, 30);

        iconoJ2.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(iconoJ2);
        iconoJ2.setIcon(new javax.swing.ImageIcon("src/Fotos/transformer2.gif"));
        iconoJ2.setBounds(620, 10, 60, 60);

        p_J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_J2ActionPerformed(evt);
            }
        });
        p_J2.setFont(new java.awt.Font("Rockwell", 0, 18));
        p_J2.setText("0");
        getContentPane().add(p_J2);
        p_J2.setBounds(780, 120, 40, 30);

        t_J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_J2ActionPerformed(evt);
            }
        });
        t_J2.setFont(new java.awt.Font("Rockwell", 0, 18));
        t_J2.setText(nom2);
        getContentPane().add(t_J2);
        t_J2.setBounds(700, 30, 180, 30);

        v_J2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v_J2ActionPerformed(evt);
            }
        });
        v_J2.setFont(new java.awt.Font("Rockwell", 0, 18));
        v_J2.setText("3");
        getContentPane().add(v_J2);
        v_J2.setBounds(680, 80, 40, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Vidas:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(620, 80, 60, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Partidas ganadas:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(620, 120, 150, 30);
        
        panelJuego.setLayout(new GridLayout(100, 100));
        inicializarPanel();
        getContentPane().add(panelJuego);
        panelJuego.setBounds(20, 190, 850, 420);

        jLabel6.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Partidas ganadas:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 120, 150, 30);

        jLabel7.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ralentizadores:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(27, 150, 165, 30);
        
        getContentPane().add(jLabel9);
        jLabel9.setBounds(110, 160, 0, 0);

        t3_J1.setIcon(new javax.swing.ImageIcon("src/Fotos/turboJ1.jpg"));
        getContentPane().add(t3_J1);
        t3_J1.setBounds(230, 160, 10, 14);

        t1_J1.setIcon(new javax.swing.ImageIcon("src/Fotos/turboJ1.jpg"));
        getContentPane().add(t1_J1);
        t1_J1.setBounds(170, 160, 10, 14);

        t2_J1.setIcon(new javax.swing.ImageIcon("src/Fotos/turboJ1.jpg"));
        getContentPane().add(t2_J1);
        t2_J1.setBounds(200, 160, 10, 14);

        t3_J2.setIcon(new javax.swing.ImageIcon("src/Fotos/turboJ2.jpg"));
        getContentPane().add(t3_J2);
        t3_J2.setBounds(760, 160, 10, 14);

        t1_J2.setIcon(new javax.swing.ImageIcon("src/Fotos/turboJ2.jpg"));
        getContentPane().add(t1_J2);
        t1_J2.setBounds(700, 160, 10, 14);

        t2_J2.setIcon(new javax.swing.ImageIcon("src/Fotos/turboJ2.jpg"));
        getContentPane().add(t2_J2);
        t2_J2.setBounds(730, 160, 10, 14);
        
        b_cerrar.setBackground(new java.awt.Color(102, 153, 255));
        b_cerrar.setIcon(new javax.swing.ImageIcon("src//Fotos//cruz-roja-x-.jpg"));
        getContentPane().add(b_cerrar);
        b_cerrar.setBounds(10, 10, 30, 28);
        
        
        l_fondo.setIcon(new javax.swing.ImageIcon("src/Fotos/consolaajustadaprobar3.jpg"));
        getContentPane().add(l_fondo);
        l_fondo.setBounds(0, 0, 890, 650);
        
        //Para que se habra con este tamaño como mínimo.
        this.setMinimumSize(new Dimension(895, 648));

        //Para que no se pueda agrandar la ventana, que sea de tamaño fijo.
        this.setResizable(false);
        
        //Para que la ventana salga centrada.
        this.setLocationRelativeTo(null);
        
        //Para poner titulo.
        this.setTitle("Consola");
        
        //Para poner icono en la ventana.
        this.setIconImage(new ImageIcon("src/Fotos/Icono_Juego.jpg").getImage());

        //Para que esté visible la ventana.
        this.setVisible(true);
        
        //Añadir funcionalidad a los botones.
        b_cerrar.addActionListener(this);
        b_trucoJ1.addActionListener(this);
        b_trucoJ2.addActionListener(this);
        
        //Para que vaya el hilo
        this.setFocusable(true);
        this.requestFocus();
        
        //Para poder utilizar el teclado
        this.addKeyListener(this);

        pack();
    }
    
    /**Con este método lo que hacemos es inicializar el panel de juego. Nuestro panel sera un array
     * bidimensional de JPanel que hiremos coloreando a medida que vayamos jugando. Por eso mismo,
     * con este método lo que hacemos es inicializarlo en cuanto a aspecto gráfico se refiere.
     */
    public void inicializarPanel()
    {
    	for (int fila = 0; fila < 100; fila++)
    	{
    		for (int columna = 0; columna < 100; columna++)
    		{
				casillas[fila][columna] = new JPanel();
    			casillas[fila][columna].setBackground(Color.GRAY);
    			if (fila == 0)
    			{
    				casillas[fila][columna].setBackground(Color.BLACK);
    			}
    			if (columna == 0)
    			{
    				casillas[fila][columna].setBackground(Color.BLACK);
    			}
    			if (fila == 99)
    			{
    				casillas[fila][columna].setBackground(Color.BLACK);
    			}
    			if(columna == 99)
    			{
    				casillas[fila][columna].setBackground(Color.BLACK);
    			}
    			if ((fila == 44)&&(columna == 24))
    			{
    				casillas[fila][columna].setBackground(Color.BLUE);
    			}
    			if ((fila == 44)&&(columna == 74))
    			{
    				casillas[fila][columna].setBackground(Color.ORANGE);
    			}
    			panelJuego.add(casillas[fila][columna]);
    			x_j1 = 44;
    			y_j1 = 24;
    			x_j2 = 44;
    			y_j2 = 74;
    		}
    	}
    }
    
    /**Este método lo utilizaremos para actualizar el número de ralentizadores de cada jugador. A medida que
     * los vayan utilizando se les irán gastando. Por eso mismo es necesario actualizarlo en la ventana porque
     * cada jugador solo dispone de 3 ralentizadores (no tiene un número de ralentizadores indenfinido).
     * @param numR
     */
    public void actualizaRalentizadores(int numR)
    {
    	if (numR == 3)
    	{
    		if (ralentizador_J1)
    		{
    			t3_J1.setVisible(false);
    		}
    		else if(ralentizador_J2)
    		{
    			t3_J2.setVisible(false);
    		}
    	}
    	else if(numR == 2)
    	{
    		if (ralentizador_J1)
    		{
    			t2_J1.setVisible(false);
    		}
    		else if(ralentizador_J2)
    		{
    			t2_J2.setVisible(false);
    		}
    	}
    	else if(numR == 1)
    	{
    		if (ralentizador_J1)
    		{
    			t1_J1.setVisible(false);
    		}
    		else if(ralentizador_J2)
    		{
    			t1_J2.setVisible(false);
    		}
    	}
    }
    
    /**Este método es de los más importantes de la clase. Con este método controlamos la creación y la
     * destrucción de los hilos. En base a cuando se muere un hilo podemos saber que jugador ha perdido,
     * por lo tanto, con este método también vamos actualizando los datos de la ventana (num_vidas ,
     * turbos...). Además, los datos de cada partida los hiremos almacenando en la base de datos para,
     * posteriormente, poder realizar las estadísticas de los jugadores.
     */
    public void actualizaHilos()
    {
       	String n1=null,n2=null,v1=null,v2=null,p1=null,p2=null;
       	Consola c2=null;
    	if ((Consola.matarHilosJ1)||(Consola.matarHilosJ2))
		{
			if (Consola.matarHilosJ1)
			{
				j1.stop();
				j2.stop();
				this.dispose();
				JOptionPane.showMessageDialog(this, "Fin de la partida ", "Información partidas.", 1);
				
				v_J1.setText(String.valueOf(Integer.valueOf(v_J1.getText().trim()).intValue()-1));
		    	n1=t_J1.getText().trim();
		    	n2=t_J2.getText().trim();
		    	v1=v_J1.getText().trim();
		    	v2=v_J2.getText().trim();
		    	p1=p_J1.getText().trim();
		    	p2=p_J2.getText().trim();
		    	
			}
			else
			{
				j1.stop();
				j2.stop();
				this.dispose();
				JOptionPane.showMessageDialog(this, "Fin de la partida ", "Información partidas.", 1);
				
				v_J2.setText(String.valueOf(Integer.valueOf(v_J2.getText().trim()).intValue()-1));
		    	n1=t_J1.getText().trim();
		    	n2=t_J2.getText().trim();
		    	v1=v_J1.getText().trim();
		    	v2=v_J2.getText().trim();
		    	p1=p_J1.getText().trim();
		    	p2=p_J2.getText().trim();
			}
			if(!v_J1.getText().trim().equals("0") && !v_J2.getText().trim().equals("0"))
			{
				c2 = new Consola("", "");
				c2.t_J1.setText(n1);
				c2.t_J2.setText(n2);
				c2.v_J1.setText(v1);
				c2.v_J2.setText(v2);
				c2.p_J1.setText(p1);
				c2.p_J2.setText(p2);
			}
			else //Si alguno ha llegado a cero vidas
			{
				if(v_J1.getText().trim().equals("0")) //Si el J1 tiene 0 vidas
		    	{
		    		p2=String.valueOf(Integer.parseInt(p2)+1);
		    		
		    	}
		    	else
		    	{
		    		p1=String.valueOf(Integer.parseInt(p1)+1);
		    	}
		    	c2 = new Consola("", "");
				c2.v_J1.setText("3");
				c2.v_J2.setText("3");
				c2.p_J1.setText(p1);
				c2.p_J2.setText(p2);
				c2.t_J1.setText(n1);
				c2.t_J2.setText(n2);
				
			}
			
			if(p1.equals("3") || p2.equals("3"))
			{
				String ganador=null;
				
				if(p1.equals("3"))
					ganador=n1;
				else if (p2.equals("3"))
					ganador=n2;
	
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
	
		    		String sentencia = "INSERT INTO Partida (Nombre_Jug1,Nombre_Jug2,Puntos_Jug1,Puntos_Jug2) VALUES ('"+n1+"','"+n2+"',"+Integer.parseInt(p1)+","+Integer.parseInt(p2)+")";
		    		stmt.executeUpdate(sentencia);
		    	//Fin: Se realizan operaciones en la base de datos.
		    		
	    		//Inicio: Se cierra la conexión con la base de datos.
		    		stmt.close();
		    		con.close();
		    	}
		    	catch(Exception e)
		    	{
		    		
		    	}
		    	//Fin: Se cierra la conexión con la base de datos.
		    	c2.dispose();
		    	Ventana_Felicitacion vf = new Ventana_Felicitacion(ganador);
			}
		}		
    }
    private void p_J1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void t_J1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void v_J1ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void p_J2ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void t_J2ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void v_J2ActionPerformed(java.awt.event.ActionEvent evt) {
       
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
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consola("", "").setVisible(true);
            }
        });
    }
    // Declaración de variables.
    private javax.swing.JLabel iconoJ1;
    private javax.swing.JLabel iconoJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelJuego;
    private javax.swing.JTextField p_J1;
    private javax.swing.JTextField p_J2;
    private javax.swing.JLabel t1_J1;
    private javax.swing.JLabel t1_J2;
    private javax.swing.JLabel t2_J1;
    private javax.swing.JLabel t2_J2;
    private javax.swing.JLabel t3_J1;
    private javax.swing.JLabel t3_J2;
    private javax.swing.JTextField t_J1;
    private javax.swing.JTextField t_J2;
    private javax.swing.JTextField v_J1;
    private javax.swing.JTextField v_J2;
    private javax.swing.JButton b_cerrar;
    private javax.swing.JButton b_trucoJ1;
    private javax.swing.JButton b_trucoJ2;
    private javax.swing.JLabel l_fondo;
    // Fin de la declaración de variables.
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == b_cerrar)
		{
			Ventana_Cierre v = new Ventana_Cierre("Consola");
			this.dispose();
		}
		else if(arg0.getSource() == b_trucoJ1)
		{
			Ventana_Felicitacion vF = new Ventana_Felicitacion(t_J1.getText());
			this.dispose();
		}
		else if(arg0.getSource() == b_trucoJ2)
		{
			Ventana_Felicitacion vF = new Ventana_Felicitacion(t_J2.getText());
			this.dispose();
		}
	}
    
	public void keyPressed(KeyEvent arg0) {
    	if (Character.isWhitespace(arg0.getKeyCode()))
    	{
    		if (j1 == null)
    		{
    			j1 = new Jugador1();
    			j1.start();
    		}
    		if (j2 == null)
    		{
    			j2 = new Jugador2();
    			j2.start();
    		}
    	}
    	else
		{
    		actualizaHilos();
    		actualiza (arg0.getKeyCode(), true);
		}
	}
    
    /**Este método lo utilizaremos para saber que tecla se está pulsando. Según que tecla se pulse (keyCode),
     * el método pondrá a true (b) unas variables staticas de la clase. Esto nos servirá de grandisima 
     * ayuda para el manejo de los hilos.
     * @param keyCode
     * @param b
     */
    private void actualiza(int keyCode, boolean b) {
    	switch (keyCode)
		{
		case KeyEvent.VK_LEFT:
			izquierda = b;
			derecha = false;
			abajo = false;
			arriba = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_RIGHT:
			derecha = b;
			izquierda = false;
			abajo = false;
			arriba = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_UP:
			arriba = b;
			derecha = false;
			izquierda = false;
			abajo = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_DOWN:
			abajo = b;
			izquierda = false;
			derecha = false;
			arriba = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_0: 
			ralentizador_J1 = b;
			actualizaRalentizadores(ralentizadores_Jug1);
			ralentizadores_Jug1--;
			break;
		case KeyEvent.VK_W:
			up = b;
			right = false;
			left = false;
			down = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_A:
			left = b;
			right = false;
			up = false;
			down = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_S:
			down = b;
			up = false;
			left = false;
			right = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_D:
			right = b;
			left = false;
			up = false;
			down = false;
			ralentizador_J1 = false;
			ralentizador_J2 = false;
			break;
		case KeyEvent.VK_1:
			ralentizador_J2 = b;
			actualizaRalentizadores(ralentizadores_Jug2);
			ralentizadores_Jug2--;
			break;
		default:
			izquierda=false;derecha=false;arriba=false;abajo=false;ralentizador_J1 = false;
			ralentizador_J2 = false;
		}
	}
    
	public void keyReleased(KeyEvent arg0) {
	
	}

	public void keyTyped(KeyEvent arg0) {
		
	}
}
