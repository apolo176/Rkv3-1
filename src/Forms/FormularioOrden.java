package Forms;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Datos.Cliente;
import Datos.Empleado;
import Datos.GestorData;
import Datos.Material;
import Datos.Materiales;
import Datos.Orden;
import Datos.Vehiculo;
import clases_java.AddLoggerInFile;
import dialogs.InfoArreglo;
import dialogs.InfoCliente;
import dialogs.InfoVehic;
import dialogs.MenuAdmin;
import dialogs.OrdenesTrabajo;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;

import java.awt.event.ItemListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JCheckBox;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class FormularioOrden extends JFrame
		implements ActionListener, ListSelectionListener, ItemListener, ChangeListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	public JButton btnInfoVehiculo;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnVolver;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnInfoCliente;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public static JButton btnAnadirVehiculo;
	/**
	 * JPanel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnAnadirCliente;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JComboBox<String> comboCli;
	/**
	 * comboCli: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public DefaultComboBoxModel<String> comboBoxModelCliente;

	public JComboBox<String> comboVeh;
	public DefaultComboBoxModel<String> comboBoxModelVehiculo;

	/**
	 * comboVeh: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JList<String> lstNombre;
	/**
	 * lstNombre: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public DefaultListModel<String> dlmNombre;
	/**
	 * dlmNombre: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JList<String> lstCant;
	/**
	 * lstCant: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public DefaultListModel<String> dlmCant;
	/**
	 * dlmCant: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JList<String> lstPrecio;
	/**
	 * lstPrecio: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public static DefaultListModel<String> dlmPrecio;
	/**
	 * dlmPrecio: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnOrden;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnInfoArreglo;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public String Conc[];
	/**
	 * String: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public static int NumFact;
	/**
	 * NumFact: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnAnadirArreglo;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblUsuario;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	private JLabel lblAccesoVehiculo;
	private JPanel Factura;
	private JLabel lblAccesoCliente;
	private JLabel lblMateriales;
	private JTextField txtNombre;
	private JLabel lblNombMat;
	private JLabel lblCantMat;
	private JTextField txtCantMat;
	private JLabel lblPrecioMat;
	private JTextField txtPrecioMat;
	public JButton btnInsertarDatos;
	private JButton btnBorrarDatos;
	private JLabel lblNewLabel;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JPanel panel_2;
	public JCheckBox chkValidacion;

	public Cliente Iker;
	public Cliente Unai;
	public Cliente Luka;
	public Cliente Youssef;
	public Cliente Eder;
	public Cliente C;

	public Vehiculo Polo;
	public Vehiculo Leon;
	public Vehiculo Ibiza;
	public Vehiculo A3;

	private ArrayList<Material> arrayMateriales;

	private GestorData gestorData;
	private Orden orden;
	private JTextField txtIdMat;
	private JLabel lblref;
	public int idMat;
	public int IVA;
	private JLabel lblNewLabel_2;
	public JTextField txtCodEmp;
	private JButton btnGuardarDatos;
	private Empleado empleado;

	/**
	 * Crea la frame de la clase.
	 * 
	 * @param gestorData
	 */

	public FormularioOrden(GestorData gestorData, Empleado empleado) {
		initDialogoOrden(gestorData, empleado);
	}

	/**
	 * Inicio el frame
	 * 
	 * @param gestorData
	 * @param empleado
	 */
	public void initDialogoOrden(GestorData gestorData, Empleado empleado) {

		this.gestorData = gestorData;

		setBackground(SystemColor.window);
		setTitle("FormularioOrden");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(100, 100, 657, 580);
		Factura = new JPanel();
		Factura.setForeground(Color.WHITE);
		Factura.setBackground(SystemColor.window);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(new BorderLayout(0, 0));

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / 2, height / 2);

		setLocationRelativeTo(null);
		arrayMateriales = new ArrayList<Material>();

		dlmNombre = new DefaultListModel<String>();
		/**
		 * list implementados con ActionListeners
		 */
		/**
		 * lista implementados con ActionListeners
		 */
		dlmCant = new DefaultListModel<String>();
		/**
		 * lista implementados con ActionListeners
		 */
		dlmPrecio = new DefaultListModel<String>();
		/**
		 * buttones implementados con ActionListeners
		 */

		panel_1 = new JPanel();
		panel_1.setForeground(SystemColor.desktop);
		panel_1.setBackground(SystemColor.window);
		panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
		Factura.add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 30, 0, 109, 20, 20, 0 };
		gbl_panel_1.rowHeights = new int[] { 39, 0, 3, 3, 3, 3, 0, 0, 3, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		lblref = new JLabel("Referencia Orden Trabajo:");
		lblref.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblref = new GridBagConstraints();
		gbc_lblref.insets = new Insets(0, 0, 5, 5);
		gbc_lblref.gridx = 0;
		gbc_lblref.gridy = 0;
		panel_1.add(lblref, gbc_lblref);

		txtIdMat = new JTextField();
		GridBagConstraints gbc_txtIdMat = new GridBagConstraints();
		gbc_txtIdMat.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdMat.gridx = 1;
		gbc_txtIdMat.gridy = 0;
		panel_1.add(txtIdMat, gbc_txtIdMat);
		txtIdMat.setColumns(10);

		btnGuardarDatos = new JButton("Guardar Datos de la Orden");
		btnGuardarDatos.addActionListener(this);
		GridBagConstraints gbc_btnGuardarDatos = new GridBagConstraints();
		gbc_btnGuardarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardarDatos.gridx = 2;
		gbc_btnGuardarDatos.gridy = 0;
		panel_1.add(btnGuardarDatos, gbc_btnGuardarDatos);

		lblNewLabel_1 = new JLabel("Bienvenido");
		lblNewLabel_1.setForeground(SystemColor.desktop);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 3;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblUsuario = new JLabel("user");
		lblUsuario.setForeground(SystemColor.desktop);
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.BOTH;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_lblUsuario.gridx = 4;
		gbc_lblUsuario.gridy = 0;
		panel_1.add(lblUsuario, gbc_lblUsuario);

		lblNewLabel_2 = new JLabel("Codigo Empleado:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		txtCodEmp = new JTextField();
		txtCodEmp.setColumns(10);
		GridBagConstraints gbc_txtCodEmp = new GridBagConstraints();
		gbc_txtCodEmp.insets = new Insets(0, 0, 5, 5);
		gbc_txtCodEmp.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCodEmp.gridx = 1;
		gbc_txtCodEmp.gridy = 1;
		panel_1.add(txtCodEmp, gbc_txtCodEmp);

		lblAccesoCliente = new JLabel("CLIENTES");
		lblAccesoCliente.setForeground(SystemColor.desktop);
		lblAccesoCliente.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblAccesoCliente = new GridBagConstraints();
		gbc_lblAccesoCliente.fill = GridBagConstraints.BOTH;
		gbc_lblAccesoCliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblAccesoCliente.gridx = 0;
		gbc_lblAccesoCliente.gridy = 2;
		panel_1.add(lblAccesoCliente, gbc_lblAccesoCliente);
		lblAccesoCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));

		comboBoxModelCliente = new DefaultComboBoxModel<String>();

		comboBoxModelVehiculo = new DefaultComboBoxModel<String>();

		int Row = 1000;
		// JTable tabla = new JTable(dtm);

		comboCli = new JComboBox<String>();
		comboCli.setForeground(SystemColor.desktop);
		comboCli.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboCli.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_comboCli = new GridBagConstraints();
		gbc_comboCli.fill = GridBagConstraints.BOTH;
		gbc_comboCli.insets = new Insets(0, 0, 5, 5);
		gbc_comboCli.gridx = 2;
		gbc_comboCli.gridy = 2;
		panel_1.add(comboCli, gbc_comboCli);
		comboCli.addItemListener(this);
		comboCli.addActionListener(this);
		comboCli.setModel(comboBoxModelCliente);

		comboVeh = new JComboBox<String>();
		comboVeh.setModel(comboBoxModelVehiculo);
		comboVeh.setForeground(SystemColor.desktop);
		comboVeh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		comboVeh.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_comboVeh = new GridBagConstraints();
		gbc_comboVeh.fill = GridBagConstraints.BOTH;
		gbc_comboVeh.insets = new Insets(0, 0, 5, 5);
		gbc_comboVeh.gridx = 2;
		gbc_comboVeh.gridy = 3;
		panel_1.add(comboVeh, gbc_comboVeh);
		comboVeh.addActionListener(this);
		comboVeh.addItemListener(this);

		btnAnadirCliente = new JButton("Añadir Cliente");
		btnAnadirCliente.setForeground(SystemColor.desktop);
		btnAnadirCliente.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnAnadirCliente = new GridBagConstraints();
		gbc_btnAnadirCliente.fill = GridBagConstraints.BOTH;
		gbc_btnAnadirCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirCliente.gridx = 3;
		gbc_btnAnadirCliente.gridy = 2;
		panel_1.add(btnAnadirCliente, gbc_btnAnadirCliente);
		btnAnadirCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirCliente.addActionListener(this);

		btnInfoCliente = new JButton("INFO");
		btnInfoCliente.setForeground(SystemColor.desktop);
		btnInfoCliente.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnInfoCliente = new GridBagConstraints();
		gbc_btnInfoCliente.fill = GridBagConstraints.BOTH;
		gbc_btnInfoCliente.insets = new Insets(0, 0, 5, 0);
		gbc_btnInfoCliente.gridx = 4;
		gbc_btnInfoCliente.gridy = 2;
		panel_1.add(btnInfoCliente, gbc_btnInfoCliente);
		btnInfoCliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfoCliente.addActionListener(this);

		lblAccesoVehiculo = new JLabel("VEHICULOS");
		lblAccesoVehiculo.setForeground(SystemColor.desktop);
		lblAccesoVehiculo.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblAccesoVehiculo = new GridBagConstraints();
		gbc_lblAccesoVehiculo.fill = GridBagConstraints.BOTH;
		gbc_lblAccesoVehiculo.insets = new Insets(0, 0, 5, 5);
		gbc_lblAccesoVehiculo.gridx = 0;
		gbc_lblAccesoVehiculo.gridy = 3;
		panel_1.add(lblAccesoVehiculo, gbc_lblAccesoVehiculo);
		lblAccesoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnAnadirVehiculo = new JButton("Añadir Vehiculo");
		btnAnadirVehiculo.setForeground(SystemColor.desktop);
		btnAnadirVehiculo.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnAnadirVehiculo = new GridBagConstraints();
		gbc_btnAnadirVehiculo.fill = GridBagConstraints.BOTH;
		gbc_btnAnadirVehiculo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirVehiculo.gridx = 3;
		gbc_btnAnadirVehiculo.gridy = 3;
		panel_1.add(btnAnadirVehiculo, gbc_btnAnadirVehiculo);
		btnAnadirVehiculo.addActionListener(this);
		btnAnadirVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnInfoVehiculo = new JButton("INFO");
		btnInfoVehiculo.setForeground(SystemColor.desktop);
		btnInfoVehiculo.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnInfoVehiculo = new GridBagConstraints();
		gbc_btnInfoVehiculo.fill = GridBagConstraints.BOTH;
		gbc_btnInfoVehiculo.insets = new Insets(0, 0, 5, 0);
		gbc_btnInfoVehiculo.gridx = 4;
		gbc_btnInfoVehiculo.gridy = 3;
		panel_1.add(btnInfoVehiculo, gbc_btnInfoVehiculo);
		btnInfoVehiculo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfoVehiculo.addActionListener(this);

		lblNewLabel = new JLabel("ARREGLO");
		lblNewLabel.setForeground(SystemColor.desktop);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 4;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnAnadirArreglo = new JButton("Añadir Arreglo");
		btnAnadirArreglo.setForeground(SystemColor.desktop);
		btnAnadirArreglo.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_btnAnadirArreglo = new GridBagConstraints();
		gbc_btnAnadirArreglo.fill = GridBagConstraints.BOTH;
		gbc_btnAnadirArreglo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnadirArreglo.gridx = 3;
		gbc_btnAnadirArreglo.gridy = 4;
		panel_1.add(btnAnadirArreglo, gbc_btnAnadirArreglo);
		btnAnadirArreglo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAnadirArreglo.addActionListener(this);
		btnInfoArreglo = new JButton("INFO");
		btnInfoArreglo.setForeground(SystemColor.desktop);
		btnInfoArreglo.setBackground(SystemColor.activeCaption);
		GridBagConstraints gbc_btnInfoArreglo = new GridBagConstraints();
		gbc_btnInfoArreglo.fill = GridBagConstraints.BOTH;
		gbc_btnInfoArreglo.insets = new Insets(0, 0, 5, 0);
		gbc_btnInfoArreglo.gridx = 4;
		gbc_btnInfoArreglo.gridy = 4;
		panel_1.add(btnInfoArreglo, gbc_btnInfoArreglo);
		btnInfoArreglo.setEnabled(false);
		btnInfoArreglo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnInfoArreglo.addActionListener(this);

		panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 5;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 6;
		panel_1.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 30, 30, 30, 0, 0, 80, 30, 30, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 30, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblMateriales = new JLabel("MATERIALES UTILIZADOS");
		GridBagConstraints gbc_lblMateriales = new GridBagConstraints();
		gbc_lblMateriales.gridwidth = 4;
		gbc_lblMateriales.fill = GridBagConstraints.BOTH;
		gbc_lblMateriales.insets = new Insets(0, 0, 5, 5);
		gbc_lblMateriales.gridx = 1;
		gbc_lblMateriales.gridy = 0;
		panel.add(lblMateriales, gbc_lblMateriales);
		lblMateriales.setForeground(SystemColor.desktop);
		lblMateriales.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateriales.setFont(new Font("Tahoma", Font.PLAIN, 15));

		btnInsertarDatos = new JButton("INTRODUCIR");
		btnInsertarDatos.setEnabled(false);
		GridBagConstraints gbc_btnInsertarDatos = new GridBagConstraints();
		gbc_btnInsertarDatos.fill = GridBagConstraints.BOTH;
		gbc_btnInsertarDatos.gridwidth = 2;
		gbc_btnInsertarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btnInsertarDatos.gridx = 6;
		gbc_btnInsertarDatos.gridy = 0;
		panel.add(btnInsertarDatos, gbc_btnInsertarDatos);
		btnInsertarDatos.setForeground(SystemColor.desktop);
		btnInsertarDatos.setBackground(SystemColor.activeCaption);
		btnInsertarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInsertarDatos.addActionListener(this);

		btnBorrarDatos = new JButton("BORRAR");
		GridBagConstraints gbc_btnBorrarDatos = new GridBagConstraints();
		gbc_btnBorrarDatos.fill = GridBagConstraints.BOTH;
		gbc_btnBorrarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btnBorrarDatos.gridx = 8;
		gbc_btnBorrarDatos.gridy = 0;
		panel.add(btnBorrarDatos, gbc_btnBorrarDatos);
		btnBorrarDatos.setForeground(SystemColor.desktop);
		btnBorrarDatos.setBackground(SystemColor.activeCaption);
		btnBorrarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBorrarDatos.addActionListener(this);

		lblNombMat = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombMat = new GridBagConstraints();
		gbc_lblNombMat.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombMat.fill = GridBagConstraints.BOTH;
		gbc_lblNombMat.gridx = 1;
		gbc_lblNombMat.gridy = 1;
		panel.add(lblNombMat, gbc_lblNombMat);
		lblNombMat.setForeground(SystemColor.desktop);
		lblNombMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombMat.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtNombre = new JTextField();
		txtNombre.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtNombre.setColumns(10);

		lblCantMat = new JLabel("Cantidad:");
		GridBagConstraints gbc_lblCantMat = new GridBagConstraints();
		gbc_lblCantMat.gridwidth = 2;
		gbc_lblCantMat.fill = GridBagConstraints.BOTH;
		gbc_lblCantMat.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantMat.gridx = 3;
		gbc_lblCantMat.gridy = 1;
		panel.add(lblCantMat, gbc_lblCantMat);
		lblCantMat.setForeground(SystemColor.desktop);
		lblCantMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblCantMat.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtCantMat = new JTextField();
		txtCantMat.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtCantMat = new GridBagConstraints();
		gbc_txtCantMat.fill = GridBagConstraints.BOTH;
		gbc_txtCantMat.insets = new Insets(0, 0, 5, 5);
		gbc_txtCantMat.gridx = 5;
		gbc_txtCantMat.gridy = 1;
		panel.add(txtCantMat, gbc_txtCantMat);
		txtCantMat.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtCantMat.setColumns(10);

		lblPrecioMat = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecioMat = new GridBagConstraints();
		gbc_lblPrecioMat.fill = GridBagConstraints.BOTH;
		gbc_lblPrecioMat.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioMat.gridx = 6;
		gbc_lblPrecioMat.gridy = 1;
		panel.add(lblPrecioMat, gbc_lblPrecioMat);
		lblPrecioMat.setForeground(SystemColor.desktop);
		lblPrecioMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrecioMat.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtPrecioMat = new JTextField();
		txtPrecioMat.setHorizontalAlignment(SwingConstants.CENTER);
		GridBagConstraints gbc_txtPrecioMat = new GridBagConstraints();
		gbc_txtPrecioMat.fill = GridBagConstraints.BOTH;
		gbc_txtPrecioMat.insets = new Insets(0, 0, 5, 5);
		gbc_txtPrecioMat.gridx = 7;
		gbc_txtPrecioMat.gridy = 1;
		panel.add(txtPrecioMat, gbc_txtPrecioMat);
		txtPrecioMat.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtPrecioMat.setColumns(10);

		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		panel_2.setForeground(SystemColor.window);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridwidth = 8;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 1;
		gbc_panel_2.gridy = 2;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		lstNombre = new JList<String>();
		GridBagConstraints gbc_lstNombre = new GridBagConstraints();
		gbc_lstNombre.fill = GridBagConstraints.VERTICAL;
		gbc_lstNombre.insets = new Insets(0, 0, 0, 5);
		gbc_lstNombre.gridx = 0;
		gbc_lstNombre.gridy = 0;
		panel_2.add(lstNombre, gbc_lstNombre);
		lstNombre.addListSelectionListener(this);
		lstNombre.setModel(dlmNombre);
		lstNombre.setBackground(SystemColor.window);

		lstCant = new JList<String>();
		GridBagConstraints gbc_lstCant = new GridBagConstraints();
		gbc_lstCant.anchor = GridBagConstraints.WEST;
		gbc_lstCant.fill = GridBagConstraints.VERTICAL;
		gbc_lstCant.insets = new Insets(0, 0, 0, 5);
		gbc_lstCant.gridx = 1;
		gbc_lstCant.gridy = 0;
		panel_2.add(lstCant, gbc_lstCant);
		lstCant.addListSelectionListener(this);
		lstCant.setModel(dlmCant);
		lstCant.setBackground(SystemColor.window);

		lstPrecio = new JList<String>();
		GridBagConstraints gbc_lstPrecio = new GridBagConstraints();
		gbc_lstPrecio.anchor = GridBagConstraints.WEST;
		gbc_lstPrecio.fill = GridBagConstraints.VERTICAL;
		gbc_lstPrecio.gridx = 2;
		gbc_lstPrecio.gridy = 0;
		panel_2.add(lstPrecio, gbc_lstPrecio);
		lstPrecio.addListSelectionListener(this);
		lstPrecio.setModel(dlmPrecio);
		lstPrecio.setBackground(SystemColor.window);

		chkValidacion = new JCheckBox("Validar y activar");
		chkValidacion.setEnabled(false);
		chkValidacion.setBackground(SystemColor.window);
		GridBagConstraints gbc_chkValidacion = new GridBagConstraints();
		gbc_chkValidacion.insets = new Insets(0, 0, 5, 5);
		gbc_chkValidacion.gridx = 0;
		gbc_chkValidacion.gridy = 7;
		chkValidacion.addChangeListener(this);
		panel_1.add(chkValidacion, gbc_chkValidacion);

		btnOrden = new JButton("CREAR ORDEN DE TRABAJO");
		btnOrden.setEnabled(false);
		btnOrden.setForeground(SystemColor.window);
		btnOrden.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_btnOrden = new GridBagConstraints();
		gbc_btnOrden.gridwidth = 3;
		gbc_btnOrden.insets = new Insets(0, 0, 0, 5);
		gbc_btnOrden.gridx = 0;
		gbc_btnOrden.gridy = 8;
		panel_1.add(btnOrden, gbc_btnOrden);
		btnOrden.addActionListener(this);
		btnOrden.setFont(new Font("Tahoma", Font.BOLD, 15));

		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(0, 0, 0, 5);
		gbc_btnVolver.gridx = 3;
		gbc_btnVolver.gridy = 8;
		panel_1.add(btnVolver, gbc_btnVolver);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.addActionListener(this);

		// try {
		// LeerObjFich("Cliente.dat");
		// //comboCli.addItem(C.getNombre());
		// // int n= comboCli.getSelectedIndex();
		// }catch (NullPointerException e) {
		// // TODO Auto-generated catch block
		// System.out.println("No hay nada en el fichero Cliente!");
		// }
		try {
			loadCliente();
			loadVehiculo();
			loadEmpleados();

		} catch (NullPointerException ae) {
			System.out.println("No hay nada en el gestor de datos compa");
		}

		/**
		 * buttones implementados con ActionListeners
		 */
		/**
		 * array de arrays que guarda informacion cliente
		 */

	}

	@SuppressWarnings({ "static-access" })

	/**
	 * Método actionPerformed
	 * 
	 * @param Event
	 */
	@Override

	public void actionPerformed(ActionEvent e) {
		/**
		 * definir objeto o que redirige a la fuente
		 */

		Object o = e.getSource();

		if (o == btnInfoCliente) {
			/**
			 * si se pulsa button InfoCliente muestra datos cliente array de arrays que
			 * guarda info cliente
			 */
			InfoCliente IC = new InfoCliente(gestorData, this);

			IC.setVisible(true);
		}
		if (o == btnGuardarDatos) {
			/**
			 * si se pulsa button InfoCliente muestra datos cliente array de arrays que
			 * guarda info cliente
			 */

			if (txtCodEmp.getText().isEmpty() || txtIdMat.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, (String) "Error, introduce datos Validos", "Error",
						JOptionPane.ERROR_MESSAGE);

			} else {

				int codEmp = 0;
				try {
					idMat = Integer.parseInt(txtIdMat.getText());
					codEmp = Integer.parseInt(txtCodEmp.getText());
				} catch (NumberFormatException ae) {
					JOptionPane.showMessageDialog(this, (String) "Error, los códigos deben ser un numero entero", "Error",
							JOptionPane.ERROR_MESSAGE);

				}
				if (codEmp < gestorData.tamañoArrayEmpleados()) {

					empleado = gestorData.getEmpleado(codEmp);
					txtIdMat.setEnabled(false);
					txtCodEmp.setEnabled(false);
					lblref.setEnabled(false);
					lblNewLabel_2.setEnabled(false);
				} else {
					JOptionPane.showMessageDialog(this, (String) "Error, este empleado no existe", "Error",
							JOptionPane.ERROR_MESSAGE);

				}

			}

		} else if (o == btnAnadirCliente) {
			/**
			 * Acceder a ventana cliente
			 */
			AnadirCliente aC = new AnadirCliente(gestorData, this);
			aC.setVisible(true);
		}

		else if (o == btnAnadirVehiculo) {
			/**
			 * Accede a ventana Anadir Vehiculos
			 */

			AnadirVehiculo Av = new AnadirVehiculo(gestorData, this);
			Av.setVisible(true);

		} else if (o == btnInfoVehiculo) {
			/**
			 * Si se pulsa button infoVehiculo nuestra info de vehiculo selecionado
			 */

			InfoVehic Veh = new InfoVehic(gestorData, this);
			Veh.setVisible(true);

		}

		else if (o == btnAnadirArreglo) {
			/**
			 * instanciar AA de la clase arreglos y Accede a arreglos
			 */
			AnadirArreglo anadirArreglo = new AnadirArreglo(gestorData, this);
			anadirArreglo.setVisible(true);

		} else if (o == btnInfoArreglo) {
			/**
			 * instanciar iA de la clase InfoArreglo asigna datos de las variables a campos
			 * de InfoArreglo
			 */
			InfoArreglo iA = new InfoArreglo(gestorData, this);
			iA.setVisible(true);

		} else if (o == btnVolver) {
			/**
			 * instancia MaC de la clase MenuAtCliente cierra la ventana actual y abre la
			 * ventana MenuAtCliente
			 */
			dispose();
			MenuAdmin MaC = new MenuAdmin(gestorData);
			MaC.setVisible(true);

		}

		// BTNINSERTAR
		/**
		 * si se pulsa btn InsetrarDatos si los datos datos son nulos sale mensaje error
		 * y pide insertar datos
		 */

		else if (o == btnInsertarDatos) {
			if (txtNombre.getText().isEmpty() || txtCantMat.getText().isEmpty() || txtPrecioMat.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, (String) "Introduce datos!!", "ERROR", JOptionPane.ERROR_MESSAGE);
			} else {
				try {
					int posicion = 0;
					int numElementos = dlmNombre.getSize();
					String Concepto = txtNombre.getText();
					double precio = Double.parseDouble(txtPrecioMat.getText());

					int cant = Integer.parseInt(txtCantMat.getText());

					while (posicion < numElementos) {
						if (Concepto.compareTo(dlmNombre.get(posicion)) < 0) {
							break;
						}
						posicion++;
					}
					if (dlmNombre.contains(Concepto)) {

						JOptionPane.showMessageDialog(this, (String) "Ya existe este concepto!", "ERROR",
								JOptionPane.ERROR_MESSAGE);
					} else {

						Material m1 = new Material(Concepto, cant, precio, IVA);
						gestorData.guardarMaterial(m1);
						System.out.println("" + m1);

						dlmNombre.add(posicion, m1.getConcepto());
						dlmPrecio.add(posicion, ("" + m1.getPrecio()));
						dlmCant.add(posicion, ("" + m1.getCant()));
						AddLoggerInFile.Log("El material se añadio correctamnte a la lista de Materiales");
						// EscribirFich("Material.dat", m1);
					}

				} catch (NumberFormatException ae) {
					JOptionPane.showMessageDialog(this, (String) "Error, introduce valores numericos", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}

//				boolean isNum = txtCantMat.getText().matches("[+-]?\\d*(\\.\\d+)?");
//				if (isNum == true) {
//					cant = Integer.parseInt(txtCantMat.getText());
//				} else {
//					JOptionPane.showMessageDialog(this, (String) "Error, introduce valores numericos", "ERROR",
//							JOptionPane.ERROR_MESSAGE);
//					cant = 0;
//
//				}

			/**
			 * bucle while que recorre la posicion de dlmnombre si no hay datos sale si los
			 * datos insertados son iguales sale mensaje error con aviso dublicado de datos
			 * si los datos son correctos los añade a los dlms correspondientes
			 */
//				while (posicion < numElementos) {
//					if (Concepto.compareTo(dlmNombre.get(posicion)) < 0) {
//						break;
//					}
//					posicion++;
//				}
//				if (dlmNombre.contains(Concepto)) {
//
//					JOptionPane.showMessageDialog(this, (String) "Ya existe este concepto!", "ERROR", JOptionPane.ERROR_MESSAGE);
//				} else {
//
//					Material m1 = new Material(Concepto, cant, precio, IVA);
//					gestorData.guardarMaterial(m1);
//					System.out.println("" + m1);
//
//					dlmNombre.add(posicion, m1.getConcepto());
//					dlmPrecio.add(posicion, ("" + m1.getPrecio()));
//					dlmCant.add(posicion, ("" + m1.getCant()));
//					AddLoggerInFile.Log("El material se añadio correctamnte a la lista de Materiales");
//					// EscribirFich("Material.dat", m1);
//				}
		} else if (o == btnBorrarDatos)

		{
			/**
			 * si se pulsa button BorrarDatos si la lista seleccionada esta vacia sale
			 * mensaje error si seleciona lista con datos se elemina datos de dlms
			 * correspondientes
			 */

			if (lstNombre.isSelectionEmpty()) {
				JOptionPane.showMessageDialog(this, (String) "Error. No hay elementos selccionados para borrar", "ERROR",
						JOptionPane.ERROR_MESSAGE, null);
			} else {
				int posicion = lstNombre.getSelectedIndex();
				dlmNombre.removeElementAt(posicion);
				dlmCant.removeElementAt(posicion);
				dlmPrecio.removeElementAt(posicion);
				gestorData.removeMaterial(posicion);
				AddLoggerInFile.Log("Se elimino el material seleccionado correctamente");
			}
		} else if (o == btnOrden) {
			if (txtIdMat.isEnabled()) {
				JOptionPane.showMessageDialog(this,
						(String) "Error, debe añadir la referencia de la orden de trabajo y el código de empleado.  Después guarde os datos.",
						"Error", JOptionPane.ERROR_MESSAGE);
			} else {
				/**
				 * instancia OdT de la clase OrdenesTrabajo muestra que usuario accede declara y
				 * difene matrices cliente y vehiculo que contiene datos por defecto
				 * 
				 */
				int codEmp = 0;
				try {
					idMat = Integer.parseInt(txtIdMat.getText());
					codEmp = Integer.parseInt(txtCodEmp.getText());
				} catch (NumberFormatException ae) {
					JOptionPane.showMessageDialog(this, (String) "Error, los códigos deben ser un numero entero", "Error",
							JOptionPane.ERROR_MESSAGE);

				}

				Materiales materiales = new Materiales(idMat, gestorData.getArrayMaterial());

				gestorData.escribirFichTrue("Material.dat", materiales);
				gestorData.guardarMateriales(materiales);
				AddLoggerInFile.Log("La informacion de los materiales se obtuvo correctamente");
				System.out.println("" + materiales);

				Orden orden = new Orden(gestorData.getCliente(comboCli.getSelectedIndex()),
						gestorData.getVehiculo(comboVeh.getSelectedIndex()), gestorData.getArreglo(0), materiales,
						gestorData.getEmpleado(codEmp));
				AddLoggerInFile.Log("Se ha creado una nueva orden");
				gestorData.guardarOrden(orden);
				gestorData.escribirFichTrue("Ordenes.dat", orden);
				System.out.println("" + orden);
				OrdenesTrabajo OdT = new OrdenesTrabajo(gestorData, this);

				// Metemos Vehiculo

				OdT.setVisible(true);

			}
		}
	}

	@SuppressWarnings({ "static-access" })

	@Override
	public void itemStateChanged(ItemEvent e) {
		/**
		 * fase prubas, para implementar mas adelante
		 * 
		 */

		/*
		 * if(e.getStateChange()==ItemEvent.SELECTED) {
		 * if(this.comboCli.getSelectedIndex()>0) { Base_Inicial.comboVeh.setModel(new
		 * DefaultComboBoxModel(this.datos(this.comboCli.getSelectedItem().toString())))
		 * ; } }
		 */
	}

	@SuppressWarnings("unchecked")
	/**
	 * Método para que al seleccionar un objeto de la lista, se seleccione el objeto
	 * que este en la misma fila, en otras listas
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		/**
		 * escucha de eventos instancia o de la clase java Object en cuando se seleciona
		 * una fila muestra datos en la posicion de la lista
		 *
		 */
		Object o = e.getSource();
		int posicion;
		posicion = ((JList<String>) o).getSelectedIndex();
		lstNombre.setSelectedIndex(posicion);
		lstCant.setSelectedIndex(posicion);
		lstPrecio.setSelectedIndex(posicion);
	}

	/**
	 * Método pra eliminar datos de un fichero
	 * 
	 * @param fichero Fichero del que se eliminan los datos
	 */
	public void DeleteContentFich(String fichero) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("" + fichero);
			oos = new ObjectOutputStream(fos);
			// lo borro

			// cierro el fichero
			oos.close();
			fos.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error, no se encuentra fichero");

		} catch (IOException ae) {
			// TODO Auto-generated catch block
			System.out.println("Error de entrada y salida");

		}
	}

	/**
	 * Método para ue cambie un botón de estado (Habilitado o inhabilitado)
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if (chkValidacion.isSelected()) {
			btnOrden.setEnabled(true);
		} else {
			btnOrden.setEnabled(false);
		}
	}

	/**
	 * Método para cargar el cliente
	 */
	private void loadCliente() {
		// TODO Auto-generated method stub
		String nombreCli = "";
		String apellidoCli = "";
		String DNICli = "";
		String EmailCli = "";
		String FechaCli = "";

		for (int i = 0; i < gestorData.tamañoArrayCliente(); i++) {
			nombreCli = gestorData.getCliente(i).getNombre();
			apellidoCli = gestorData.getCliente(i).getApellido1();
			DNICli = gestorData.getCliente(i).getDni();
			EmailCli = gestorData.getCliente(i).getEmail();
			FechaCli = "" + gestorData.getCliente(i).getFechNa();
			String[] rowData = new String[] { nombreCli, apellidoCli, DNICli, EmailCli, FechaCli }

			;
			comboBoxModelCliente.addElement(nombreCli);
		}

	}

	/**
	 * Método para cargar el vehículo
	 */
	private void loadVehiculo() {
		// TODO Auto-generated method stub
		String ModeloMarca = "";
		String numBast = "";
		String matricula = "";
		String fechITV = "";
		String kilometros = "";
		String fechUltimaRevision = "";

		for (int i = 0; i < gestorData.tamañoArrayVehiculos(); i++) {

			ModeloMarca = gestorData.getVehiculo(i).getModelo() + "/" + gestorData.getVehiculo(i).getMarca();
			numBast = gestorData.getVehiculo(i).getNumBast();
			matricula = gestorData.getVehiculo(i).getMatricula();
			fechITV = "" + gestorData.getVehiculo(i).getFechITV();
			kilometros = gestorData.getVehiculo(i).getKM() + "km";
			fechUltimaRevision = "" + gestorData.getVehiculo(i).getFechUltimaRevision();
			String[] rowData = new String[] { ModeloMarca, numBast, matricula, kilometros, fechITV, fechUltimaRevision }

			;
			comboBoxModelVehiculo.addElement(ModeloMarca);
		}
	}

	/**
	 * Método para cargar el empleado
	 */
	public void loadEmpleados() {
		FileInputStream fis;
		ObjectInputStream ois;
		Empleado Empleado = new Empleado();

		try {
			fis = new FileInputStream("Empleado.dat");

			while (fis.available() > 0) {
				ois = new ObjectInputStream(fis);

				Empleado = (Empleado) ois.readObject();

				gestorData.guardarEmpleado(Empleado);

			}
			// convierte los bytes leídos en un objeto de la clase

			fis.close();
		} catch (FileNotFoundException ae) {
			// TODO Auto-generated catch block
			System.out.println("No existe Fichero ");
		} catch (IOException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		} catch (ClassNotFoundException ae) {
			// TODO Auto-generated catch block
			ae.printStackTrace();
		}
	}

}
