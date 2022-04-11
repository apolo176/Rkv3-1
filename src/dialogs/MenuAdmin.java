package dialogs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Empleado;
import Datos.GestorData;
import Forms.AnadirCliente;
import Forms.AnadirVehiculo;
import Forms.FormularioOrden;
import Forms.Login;
import Listados.ListadoClientes;
import Listados.ListadoEmpleados;
import Listados.ListadoOrdenesTrabajo;
import Listados.ListadoVehiculos;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.BorderLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */

public class MenuAdmin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial evita fallos de calculo
	 * 
	 */
	private JPanel Factura;
	private JButton btnOrdenesTrabajo;
	private JButton btnNuevaOrden;
	private JButton btnVolver;

	public JLabel lblBienvenido;
	/**
	 * Jlabel: declarados private no se modifica fuera de la clase
	 */
	public JLabel lblUsuario;
	private JButton btnNuevoCliente;
	private JButton btnListadoClientes;
	private JButton btnNuevoVehiculo;
	private JButton btnListadoVehiculos;
	/**
	 * Jlabel: declarados private no se modifica fuera de la clase
	 */
	private FormularioOrden dialogoOrden;
	private Empleado empleado;
	private GestorData gestorData;
	private JButton btnListadoEmpleados;

	/**
	 * Se crea el frame de la clase.
	 * 
	 * @param gestorData Clase  donde se encuenytran todos los datos
	 */
	public MenuAdmin(GestorData gestorData, Empleado empleado) {
		initMenuAdmin(gestorData, empleado);
	}

	/**
	 * @wbp.parser.constructor
	 */
	public MenuAdmin(GestorData gestorData) {
		initMenuAdmin(gestorData, null);
	}

	public void initMenuAdmin(GestorData gestorData, Empleado empleado) {
		this.gestorData = gestorData;
		if (empleado != null) {
			this.empleado = empleado;
		}
		setBackground(new Color(255, 255, 255));
		setTitle("MENU_AtClientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 226);
		Factura = new JPanel();
		Factura.setBackground(SystemColor.window);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(new BorderLayout(0, 0));

		setSize(512, 351);

		setLocationRelativeTo(null);
		setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Factura.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 3 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 3 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblBienvenido = new JLabel("Hola,");
		GridBagConstraints gbc_lblBienvenido = new GridBagConstraints();
		gbc_lblBienvenido.anchor = GridBagConstraints.EAST;
		gbc_lblBienvenido.insets = new Insets(0, 0, 5, 5);
		gbc_lblBienvenido.gridx = 0;
		gbc_lblBienvenido.gridy = 0;
		panel.add(lblBienvenido, gbc_lblBienvenido);
		lblBienvenido.setForeground(SystemColor.desktop);
		lblBienvenido.setBackground(SystemColor.window);
		lblBienvenido.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(SystemColor.desktop);
		lblUsuario.setBackground(SystemColor.window);
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.NORTH;
		gbc_lblUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 0;
		panel.add(lblUsuario, gbc_lblUsuario);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnNuevaOrden = new JButton("Nueva Orden de Trabajo");
		btnNuevaOrden.setForeground(SystemColor.desktop);
		btnNuevaOrden.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnNuevaOrden = new GridBagConstraints();
		gbc_btnNuevaOrden.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNuevaOrden.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevaOrden.gridx = 0;
		gbc_btnNuevaOrden.gridy = 2;
		panel.add(btnNuevaOrden, gbc_btnNuevaOrden);
		btnNuevaOrden.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNuevaOrden.addActionListener(this);

		btnOrdenesTrabajo = new JButton("Listado Ordenes de Trabajo");
		btnOrdenesTrabajo.setForeground(SystemColor.desktop);
		btnOrdenesTrabajo.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnOrdenesTrabajo = new GridBagConstraints();
		gbc_btnOrdenesTrabajo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOrdenesTrabajo.insets = new Insets(0, 0, 5, 0);
		gbc_btnOrdenesTrabajo.gridx = 1;
		gbc_btnOrdenesTrabajo.gridy = 2;
		panel.add(btnOrdenesTrabajo, gbc_btnOrdenesTrabajo);
		btnOrdenesTrabajo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnOrdenesTrabajo.addActionListener(this);

		btnNuevoCliente = new JButton("Nuevo Cliente");
		btnNuevoCliente.setForeground(SystemColor.desktop);
		btnNuevoCliente.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNuevoCliente.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnNuevoCliente = new GridBagConstraints();
		gbc_btnNuevoCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNuevoCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevoCliente.gridx = 0;
		gbc_btnNuevoCliente.gridy = 3;
		panel.add(btnNuevoCliente, gbc_btnNuevoCliente);
		btnNuevoCliente.addActionListener(this);

		btnListadoClientes = new JButton("Listado Clientes");
		btnListadoClientes.addActionListener(this);

		btnListadoClientes.setForeground(Color.BLACK);
		btnListadoClientes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnListadoClientes.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnListadoClientes = new GridBagConstraints();
		gbc_btnListadoClientes.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListadoClientes.insets = new Insets(0, 0, 5, 0);
		gbc_btnListadoClientes.gridx = 1;
		gbc_btnListadoClientes.gridy = 3;
		panel.add(btnListadoClientes, gbc_btnListadoClientes);

		btnNuevoVehiculo = new JButton("Nuevo Vehiculo");
		btnNuevoVehiculo.addActionListener(this);

		btnNuevoVehiculo.setForeground(Color.BLACK);
		btnNuevoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNuevoVehiculo.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnNuevoVehiculo = new GridBagConstraints();
		gbc_btnNuevoVehiculo.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNuevoVehiculo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevoVehiculo.gridx = 0;
		gbc_btnNuevoVehiculo.gridy = 4;
		panel.add(btnNuevoVehiculo, gbc_btnNuevoVehiculo);

		btnListadoVehiculos = new JButton("Listado Vehiculos");
		btnListadoVehiculos.addActionListener(this);
		btnListadoVehiculos.setForeground(Color.BLACK);
		btnListadoVehiculos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnListadoVehiculos.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnListadoVehiculos = new GridBagConstraints();
		gbc_btnListadoVehiculos.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListadoVehiculos.insets = new Insets(0, 0, 5, 0);
		gbc_btnListadoVehiculos.gridx = 1;
		gbc_btnListadoVehiculos.gridy = 4;
		panel.add(btnListadoVehiculos, gbc_btnListadoVehiculos);

		btnListadoEmpleados = new JButton("Listado Empleados");
		btnListadoEmpleados.addActionListener(this);
		btnListadoEmpleados.setForeground(Color.BLACK);
		btnListadoEmpleados.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnListadoEmpleados.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnListadoEmpleados = new GridBagConstraints();
		gbc_btnListadoEmpleados.gridwidth = 2;
		gbc_btnListadoEmpleados.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnListadoEmpleados.insets = new Insets(0, 0, 5, 5);
		gbc_btnListadoEmpleados.gridx = 0;
		gbc_btnListadoEmpleados.gridy = 5;
		panel.add(btnListadoEmpleados, gbc_btnListadoEmpleados);
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.gridwidth = 2;
		gbc_btnVolver.gridx = 0;
		gbc_btnVolver.gridy = 6;
		panel.add(btnVolver, gbc_btnVolver);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.addActionListener(this);
		/**
		 * Boton implementado con Action Listeer
		 */

	}

	/**
	 * instancia o de object para la reaccion del objeto variable int con valor 0
	 * para recorrer dlm mas adelante variable int con valor tamaño del dlm si se
	 * pulsa button aceptar cierra la acrual ventana futura implementacion de codigo
	 * para la recogida de info de lista
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		/**
		 * Si se pulsa el boton btnOrdenesTrabajo, instanciar LaC de la clase
		 * ListaAtClientes
		 */
		if (o == btnOrdenesTrabajo) {

			ListadoOrdenesTrabajo LaC = new ListadoOrdenesTrabajo(gestorData, empleado);
			LaC.setVisible(true);

			this.setVisible(false);

		}
		/**
		 * Si se pulsa el boton btnNuevaOrden, instanciar BI de la clase Base_Inicial
		 */
		else if (o == btnNuevaOrden) {

			dialogoOrden = new FormularioOrden(gestorData, empleado);

			setVisible(false);
			dialogoOrden.setVisible(true);
			// setVisible (true);
		} else if (o == btnNuevoCliente) {

			AnadirCliente Ac = new AnadirCliente(gestorData, dialogoOrden);

			Ac.setVisible(true);
			dispose();

		} else if (o == btnListadoClientes) {

			ListadoClientes listcliente = new ListadoClientes(gestorData);
			listcliente.setVisible(true);
			dispose();

		} else if (o == btnNuevoVehiculo) {

			AnadirVehiculo Ac = new AnadirVehiculo(gestorData, dialogoOrden);

			Ac.setVisible(true);
			dispose();

		} else if (o == btnListadoVehiculos) {

			ListadoVehiculos listvehiculo = new ListadoVehiculos(gestorData);

			listvehiculo.setVisible(true);
			dispose();

		} else if (o == btnListadoEmpleados) {

			ListadoEmpleados listempleados = new ListadoEmpleados(gestorData);
			listempleados.lblEmpleado.setText(lblUsuario.getText());

			listempleados.setVisible(true);
			setVisible(false);

		}
		/**
		 * Si se pulsa el boton btnVolver, instanciar LaC de ListaAtClientes
		 */
		else if (o == btnVolver) {
			Login aL = new Login();
			aL.setVisible(true);
			dispose();
		}
	}
}
