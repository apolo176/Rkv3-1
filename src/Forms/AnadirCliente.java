package Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Datos.Cliente;
import Datos.Fecha;
import Datos.GestorData;
import Listados.ListadoClientes;
import Listados.ListadoVehiculos;
import clases_java.AddLoggerInFile;
import dialogs.MenuAdmin;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JTextPane;

/**
 * @author Grupo_4
 * @version 5.1.2
 */
public class AnadirCliente extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JSplitPane splitPane;
	private JPanel panel;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JLabel lblCod_P;
	private JTextField txtCod_P;
	private JLabel lblFecha_N;
	private JPanel panel_1;
	private JLabel lblNombre;
	private JLabel lblTelf;
	private JLabel lblDNI;
	private JTextField txtApellido1;
	private JLabel lblApellido1;
	private JTextField txtApellido2;
	private JTextField txtTelf;
	private JTextField txtNombre;
	private JLabel lblApellido2;
	private JTextField txtDNI;
	private JPanel panel_2;
	private JButton btnAceptar;
	private JButton btnVolver;
	public Cliente cliente;

	private FormularioOrden formularioOrden;
	private GestorData gestorData;
	private JTextField txtAno;
	private JTextField txtDia;
	private JTextField txtMes;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	/**
	 * Crea frame de la clase.
	 * @wbp.parser.constructor
	 * 
	 */
	public AnadirCliente(GestorData gestorData, FormularioOrden formularioOrden) {
		initAnadirCliente(gestorData, formularioOrden, null);
	}

	public AnadirCliente(GestorData gestorData, Cliente cliente) {
		initAnadirCliente(gestorData, null, cliente);
	}

	public void initAnadirCliente(GestorData gestorData, FormularioOrden formularioOrden, Cliente cliente) {

		this.gestorData = gestorData;

		setTitle("Añadir_Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 626, 212);
		Menu = new JPanel();
		Menu.setBackground(SystemColor.window);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		setSize(785, 262);

		setLocationRelativeTo(null);
		setVisible(true);

		splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setAutoscrolls(true);
		splitPane.setBackground(SystemColor.window);
		Menu.add(splitPane, BorderLayout.CENTER);

		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		splitPane.setLeftComponent(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 201, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		lblDNI = new JLabel("DNI:");
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 0;
		panel_1.add(lblDNI, gbc_lblDNI);

		txtDNI = new JTextField();
		txtDNI.setBackground(SystemColor.controlHighlight);
		txtDNI.setColumns(10);
		GridBagConstraints gbc_txtDNI = new GridBagConstraints();
		gbc_txtDNI.insets = new Insets(0, 0, 5, 0);
		gbc_txtDNI.fill = GridBagConstraints.BOTH;
		gbc_txtDNI.gridx = 2;
		gbc_txtDNI.gridy = 0;
		panel_1.add(txtDNI, gbc_txtDNI);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panel_1.add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		txtNombre.setBackground(SystemColor.controlHighlight);
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 0);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		panel_1.add(txtNombre, gbc_txtNombre);

		lblApellido1 = new JLabel("Apellido1:");
		lblApellido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblApellido1 = new GridBagConstraints();
		gbc_lblApellido1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido1.gridx = 1;
		gbc_lblApellido1.gridy = 2;
		panel_1.add(lblApellido1, gbc_lblApellido1);

		txtApellido1 = new JTextField();
		txtApellido1.setBackground(SystemColor.controlHighlight);
		txtApellido1.setColumns(10);
		GridBagConstraints gbc_txtApellido1 = new GridBagConstraints();
		gbc_txtApellido1.fill = GridBagConstraints.BOTH;
		gbc_txtApellido1.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellido1.gridx = 2;
		gbc_txtApellido1.gridy = 2;
		panel_1.add(txtApellido1, gbc_txtApellido1);

		lblApellido2 = new JLabel("Apellido2:");
		lblApellido2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblApellido2 = new GridBagConstraints();
		gbc_lblApellido2.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido2.gridx = 1;
		gbc_lblApellido2.gridy = 3;
		panel_1.add(lblApellido2, gbc_lblApellido2);

		txtApellido2 = new JTextField();
		txtApellido2.setBackground(SystemColor.controlHighlight);
		txtApellido2.setColumns(10);
		GridBagConstraints gbc_txtApellido2 = new GridBagConstraints();
		gbc_txtApellido2.fill = GridBagConstraints.BOTH;
		gbc_txtApellido2.insets = new Insets(0, 0, 5, 0);
		gbc_txtApellido2.gridx = 2;
		gbc_txtApellido2.gridy = 3;
		panel_1.add(txtApellido2, gbc_txtApellido2);

		lblTelf = new JLabel("Telefono:");
		lblTelf.setFont(new Font("Dialog", Font.PLAIN, 15));
		GridBagConstraints gbc_lblTelf = new GridBagConstraints();
		gbc_lblTelf.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelf.gridx = 1;
		gbc_lblTelf.gridy = 4;
		panel_1.add(lblTelf, gbc_lblTelf);

		txtTelf = new JTextField();
		txtTelf.setBackground(SystemColor.controlHighlight);
		txtTelf.setColumns(10);
		GridBagConstraints gbc_txtTelf = new GridBagConstraints();
		gbc_txtTelf.fill = GridBagConstraints.BOTH;
		gbc_txtTelf.gridx = 2;
		gbc_txtTelf.gridy = 4;
		panel_1.add(txtTelf, gbc_txtTelf);

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		splitPane.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 56, 0, 0, 0, 0, 53, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblEmail = new JLabel("Correo Electronico:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 0;
		panel.add(lblEmail, gbc_lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBackground(SystemColor.controlHighlight);
		txtEmail.setColumns(10);
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.gridwidth = 5;
		gbc_txtEmail.fill = GridBagConstraints.BOTH;
		gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 0;
		panel.add(txtEmail, gbc_txtEmail);

		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 1;
		panel.add(lblDireccion, gbc_lblDireccion);

		txtDireccion = new JTextField();
		txtDireccion.setBackground(SystemColor.controlHighlight);
		txtDireccion.setColumns(10);
		GridBagConstraints gbc_txtDireccion = new GridBagConstraints();
		gbc_txtDireccion.gridwidth = 5;
		gbc_txtDireccion.fill = GridBagConstraints.BOTH;
		gbc_txtDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_txtDireccion.gridx = 1;
		gbc_txtDireccion.gridy = 1;
		panel.add(txtDireccion, gbc_txtDireccion);

		lblCod_P = new JLabel("Codigo Postal:");
		lblCod_P.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblCod_P = new GridBagConstraints();
		gbc_lblCod_P.insets = new Insets(0, 0, 5, 5);
		gbc_lblCod_P.gridx = 0;
		gbc_lblCod_P.gridy = 2;
		panel.add(lblCod_P, gbc_lblCod_P);

		txtCod_P = new JTextField();
		txtCod_P.setBackground(SystemColor.controlHighlight);
		txtCod_P.setColumns(10);
		GridBagConstraints gbc_txtCod_P = new GridBagConstraints();
		gbc_txtCod_P.gridwidth = 5;
		gbc_txtCod_P.fill = GridBagConstraints.BOTH;
		gbc_txtCod_P.insets = new Insets(0, 0, 5, 0);
		gbc_txtCod_P.gridx = 1;
		gbc_txtCod_P.gridy = 2;
		panel.add(txtCod_P, gbc_txtCod_P);

		lblFecha_N = new JLabel("Fecha Nacimiento:");
		lblFecha_N.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblFecha_N = new GridBagConstraints();
		gbc_lblFecha_N.anchor = GridBagConstraints.EAST;
		gbc_lblFecha_N.insets = new Insets(0, 0, 0, 5);
		gbc_lblFecha_N.gridx = 0;
		gbc_lblFecha_N.gridy = 3;
		panel.add(lblFecha_N, gbc_lblFecha_N);

		txtDia = new JTextField();
		txtDia.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtDia = new GridBagConstraints();
		gbc_txtDia.insets = new Insets(0, 0, 0, 5);
		gbc_txtDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDia.gridx = 1;
		gbc_txtDia.gridy = 3;
		panel.add(txtDia, gbc_txtDia);
		txtDia.setColumns(10);

		lblNewLabel = new JLabel("/");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 3;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		txtMes = new JTextField();
		txtMes.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtMes = new GridBagConstraints();
		gbc_txtMes.insets = new Insets(0, 0, 0, 5);
		gbc_txtMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMes.gridx = 3;
		gbc_txtMes.gridy = 3;
		panel.add(txtMes, gbc_txtMes);
		txtMes.setColumns(10);

		lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 4;
		gbc_lblNewLabel_1.gridy = 3;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		txtAno = new JTextField();
		txtAno.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtAno = new GridBagConstraints();
		gbc_txtAno.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAno.gridx = 5;
		gbc_txtAno.gridy = 3;
		panel.add(txtAno, gbc_txtAno);
		txtAno.setColumns(10);

		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		Menu.add(panel_2, BorderLayout.SOUTH);

		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setForeground(SystemColor.window);
		btnAceptar.setBackground(SystemColor.textHighlight);
		btnAceptar.addActionListener(this);
		btnAceptar.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_2.add(btnAceptar);

		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Dialog", Font.BOLD, 15));
		panel_2.add(btnVolver);

		if (formularioOrden != null) {
			this.formularioOrden = formularioOrden;
		}
		if (cliente != null) {
			this.cliente = cliente;
			txtNombre.setText(cliente.getNombre());
			txtApellido1.setText(cliente.getApellido1());
			txtApellido2.setText(cliente.getApellido2());
			txtDNI.setText(cliente.getDni());
			txtTelf.setText(cliente.getTelf());

			txtDia.setText("" + cliente.getFechNa().getDia());
			txtMes.setText("" + cliente.getFechNa().getMes());
			txtAno.setText("" + cliente.getFechNa().getAno());

			txtEmail.setText(cliente.getEmail());
			txtDireccion.setText(cliente.getDir());
			txtCod_P.setText(cliente.getCodP());

		}

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
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();

		if (o == btnVolver) {
			if (cliente != null) {
				ListadoClientes listadoClientes = new ListadoClientes(gestorData);
				listadoClientes.setVisible(true);
				dispose();
			} else {
				MenuAdmin menuAdmin = new MenuAdmin(gestorData);
				menuAdmin.setVisible(true);
				dispose();
			}
		}
		if (o == btnAceptar) {

			String DNI = (txtDNI.getText());
			String nombre = txtNombre.getText();
			String apellido1 = txtApellido1.getText();
			String apellido2 = (txtApellido2.getText());
			String telf = txtTelf.getText();
			String email = txtEmail.getText();
			String codP = txtCod_P.getText();
			String direccion = txtEmail.getText();
			Fecha fechNa = null;
			int dia;
			int mes;
			int ano;
			try {
				dia = Integer.parseInt(txtDia.getText());
				mes = Integer.parseInt(txtMes.getText());
				ano = Integer.parseInt(txtAno.getText());
				fechNa = new Fecha(dia, mes, ano);
			} catch (NumberFormatException ae) {
				JOptionPane.showMessageDialog(this, (String) "Error, los valores de Fecha tienen que ser númericos", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

			if (DNI.isEmpty() || nombre.isEmpty() || apellido1.isEmpty() || apellido2.isEmpty() || telf.isEmpty()
					|| email.isEmpty() || codP.isEmpty() || direccion.isEmpty() || fechNa == null) {
				JOptionPane.showMessageDialog(this, (String) "Error, introduce datos", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				Cliente cliente1 = new Cliente(DNI, nombre, apellido1, apellido2, telf, email, direccion, codP, fechNa);
				gestorData.guardarCliente(cliente1);
				gestorData.escribirFichTrue("Cliente.dat", cliente1);

				if (formularioOrden != null) {
					formularioOrden.comboBoxModelCliente.addElement(cliente1.getNombre());

				}
				ListadoClientes listadoclientes = new ListadoClientes(gestorData);
				listadoclientes.setVisible(true);
				System.out.println("" + cliente1);
				dispose();
			}
		}
	}

}