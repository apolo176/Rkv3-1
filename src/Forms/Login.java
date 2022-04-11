package Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Datos.Empleado;
import Datos.GestorData;
import Listados.ListadoEmpleados;
import Listados.ListadoOrdenesTrabajo;
import clases_java.AddLoggerInFile;
import dialogs.MenuAdmin;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

/**
 * 
 * @author Grupo_1
 * @version 5.1.2
 *
 */
public class Login extends JFrame implements ActionListener, ListSelectionListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JLabel lblContrasena;
	public JButton btnAceptarLogin;
	private JLabel lblUsuario;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JPanel panel;
	private GestorData gestorData;

	/**
	 * Crea el frame de la clase login.
	 */

	public Login() {

		setResizable(false);
		setIconImage(
				Toolkit.getDefaultToolkit().getImage("C:\\Users\\ik_1dw3\\Desktop\\demoRekorAutoak\\images\\logo.jpg"));

		setBackground(new Color(255, 255, 255));
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 278, 168);
		Menu = new JPanel();
		Menu.setBackground(SystemColor.window);
		Menu.setForeground(Color.WHITE);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / 5, height / 5);

		setLocationRelativeTo(null);
		setVisible(true);

		/**
		 * buttones implementados con ActionListeners
		 */

		btnAceptarLogin = new JButton("ACEPTAR");
		btnAceptarLogin.setForeground(SystemColor.window);
		btnAceptarLogin.setBackground(Color.BLACK);
		btnAceptarLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		Menu.add(btnAceptarLogin, BorderLayout.SOUTH);

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Menu.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 134, 2 };
		gbl_panel.rowHeights = new int[] { 0, 0, 2 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(SystemColor.desktop);
		lblUsuario.setBackground(SystemColor.window);
		lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.BOTH;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 0;
		panel.add(lblUsuario, gbc_lblUsuario);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 17));

		txtUsuario = new JTextField();
		txtUsuario.setBackground(SystemColor.controlHighlight);
		txtUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_txtUsuario.gridx = 1;
		gbc_txtUsuario.gridy = 0;
		panel.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setText("admin");
		txtUsuario.addActionListener(this);
		txtUsuario.setColumns(10);

		lblContrasena = new JLabel("Contraseña:");
		lblContrasena.setForeground(SystemColor.desktop);
		lblContrasena.setBackground(SystemColor.window);
		lblContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
		gbc_lblContrasena.insets = new Insets(0, 0, 0, 5);
		gbc_lblContrasena.gridx = 0;
		gbc_lblContrasena.gridy = 1;
		panel.add(lblContrasena, gbc_lblContrasena);
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 17));

		txtContrasena = new JPasswordField("admin");
		txtContrasena.setBackground(new Color(227, 227, 227));
		txtContrasena.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtContrasena = new GridBagConstraints();
		gbc_txtContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasena.gridx = 1;
		gbc_txtContrasena.gridy = 1;
		panel.add(txtContrasena, gbc_txtContrasena);
		txtContrasena.addActionListener(this);
		btnAceptarLogin.addActionListener(this);

		gestorData = new GestorData();
	}

	/**
	 * Instanciar o del object para la reaccion de buttones si se pulsa button
	 * volver cierra la actual ventana si se pulsa button aceptar si los datos son
	 * encompletos muestra mensaje error y pide introducir restante si los datos son
	 * completos instancia ot de la clase ordenesTrabajo y asigna valores recogidos
	 * a cada campo y cierra la ventana actual
	 * 
	 * 
	 */

	@Override
	public void actionPerformed(ActionEvent ae) {

		String contrasena, usuario;
		usuario = txtUsuario.getText();
		contrasena = new String(txtContrasena.getPassword());
		Object o = ae.getSource();

		if (o == btnAceptarLogin || o == txtContrasena || o == txtUsuario) {

			Empleado mecanico = getEmpleadoPorNombre(usuario, contrasena);
			if (mecanico != null) {
				mecanico = comprobarEmpleado(gestorData, mecanico);
				if (mecanico.getTipo().equals("admin")) {
					MenuAdmin menuAdmin = new MenuAdmin(gestorData, mecanico);
					AddLoggerInFile.Log("Se ha iniciado Sesion como admin");
					this.setVisible(false);

					menuAdmin.setVisible(true);
				} else {
					ListadoOrdenesTrabajo listadoOrdenesTrabajo = new ListadoOrdenesTrabajo(gestorData, mecanico);
					AddLoggerInFile.Log("Se ha iniciado sesion como mecanico");
					this.setVisible(false);
					listadoOrdenesTrabajo.setVisible(true);
				}
			}
		}
	}

	/**
	 * Método que obtiene el empleado con el que se inicia sesión
	 * 
	 * @param usuario    Usuario que introduce el cliente
	 * @param contrasena Contraseña que introduce el cliente
	 * @return Devuelve el empleado si se ha introducido correctamente
	 */
	public Empleado getEmpleadoPorNombre(String usuario, String contrasena) {
		// TODO Auto-generated method stub
		for (Empleado empleadoExistente : gestorData.getEmpleados()) {
			if (empleadoExistente.getNombre().equals(usuario)) {
				if (empleadoExistente.getClaveAcceso().equals(contrasena)) {
					return empleadoExistente;
				} else {
					JOptionPane.showMessageDialog(this, (String) "Error, introduce datos Validos", "Error",
							JOptionPane.ERROR_MESSAGE);

				}
			}

		}

		return null;
	}

	/**
	 * Método que comprueba si el empleado introducido es correcto
	 * 
	 * @param gestorData Clase donde están la mayoría de metodos y donde se guardan
	 *                   los datos
	 * 
	 * @param empleado   Empleado que hay que comprobar
	 * @return Devuelve el empleado si es correcto
	 */
	private Empleado comprobarEmpleado(GestorData gestorData, Empleado empleado) {
		// TODO Auto-generated method stub
		if (empleado == null) {
			JOptionPane.showMessageDialog(this, (String) "Error, introduce datos Validos", "Error",
					JOptionPane.ERROR_MESSAGE);

		} else {

			return empleado;
		}

		return null;

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}
}