package Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.JTextComponent;

import Datos.Fecha;
import Datos.GestorData;
import Datos.Vehiculo;
import Listados.ListadoVehiculos;
import clases_java.AddLoggerInFile;
import dialogs.MenuAdmin;

import javax.swing.JTextField;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Toolkit;

/**
 * @author Grupo_4
 * @version 5.1.2
 */
public class AnadirVehiculo extends JFrame implements ActionListener, ListSelectionListener {
	/**
	 * JLabel,JPanel,JButton,JTextField: privados solo estan llamados desde la
	 * propia clase
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JTextField txtNumBast;
	private JTextField txtModelo;
	private JTextField txtTipo;
	private JTextField txtKM;
	private JLabel lblKmRecorridos;
	private JLabel lblCilindrada;
	private JLabel lblFechaITV;
	private JLabel lblColor;
	private JTextField txtCilindrada;
	private JTextField txtColor;
	private JTextField txtMarca;
	public Vehiculo vehiculo;
	/**
	 * ComboBox, JButton,String Jlabel: declarados public,se les asigna valor desde
	 * otras clases
	 */
	public JButton btnVolver;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JButton btnAceptar;
	/**
	 * JButton: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JTextField txtMatricula;
	private JSplitPane splitPane;
	private JPanel panel_2;
	private JPanel panel;
	private JPanel panel_1;
	private FormularioOrden formularioOrden;
	private GestorData gestorData;

	private JLabel lblNewLabel;
	private JTextField txtAnoItv;
	private JTextField txtMesItv;
	private JTextField txtDiaItv;
	private JTextField txtDiaUR;
	private JTextField txtMesUR;
	private JTextField txtAnoUR;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;

	/**
	 * JTextField: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 * 
	 */
	public AnadirVehiculo(GestorData gestorData, FormularioOrden dialogoOrden) {

		initAnadirVehiculo(gestorData, formularioOrden, null);
	}

	/**
	 * crea frame de la clase.
	 */

	public AnadirVehiculo(GestorData gestorData, Vehiculo vehiculo) {
		// TODO Auto-generated constructor stub
		initAnadirVehiculo(gestorData, null, vehiculo);
	}

	public void initAnadirVehiculo(GestorData gestorData, FormularioOrden formularioOrden, Vehiculo vehiculo) {

		this.gestorData = gestorData;
		setBackground(SystemColor.window);
		setResizable(false);
		setTitle("A\u00D1ADIR_Veh\u00EDculo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 667, 242);
		Menu = new JPanel();
		Menu.setBackground(SystemColor.window);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		setSize(960, 353);

		setLocationRelativeTo(null);
		setVisible(true);

		/**
		 * buttones implementados con ActionListeners
		 */

		splitPane = new JSplitPane();
		splitPane.setEnabled(false);
		splitPane.setBackground(SystemColor.window);
		Menu.add(splitPane, BorderLayout.CENTER);

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		splitPane.setLeftComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 220, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblMatricula = new JLabel("Matricula:");
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.fill = GridBagConstraints.BOTH;
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 0;
		gbc_lblMatricula.gridy = 0;
		panel.add(lblMatricula, gbc_lblMatricula);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtMatricula = new JTextField();
		txtMatricula.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtMatricula = new GridBagConstraints();
		gbc_txtMatricula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMatricula.insets = new Insets(0, 0, 5, 0);
		gbc_txtMatricula.gridx = 1;
		gbc_txtMatricula.gridy = 0;
		panel.add(txtMatricula, gbc_txtMatricula);
		txtMatricula.setColumns(10);

		JLabel lblNumBastidor = new JLabel("Num. Bastidor:");
		GridBagConstraints gbc_lblNumBastidor = new GridBagConstraints();
		gbc_lblNumBastidor.fill = GridBagConstraints.BOTH;
		gbc_lblNumBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumBastidor.gridx = 0;
		gbc_lblNumBastidor.gridy = 1;
		panel.add(lblNumBastidor, gbc_lblNumBastidor);
		lblNumBastidor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtNumBast = new JTextField();
		txtNumBast.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtNumBast = new GridBagConstraints();
		gbc_txtNumBast.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNumBast.insets = new Insets(0, 0, 5, 0);
		gbc_txtNumBast.gridx = 1;
		gbc_txtNumBast.gridy = 1;
		panel.add(txtNumBast, gbc_txtNumBast);
		txtNumBast.setColumns(10);

		JLabel lblMarca = new JLabel("Marca:");
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.fill = GridBagConstraints.BOTH;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 0;
		gbc_lblMarca.gridy = 2;
		panel.add(lblMarca, gbc_lblMarca);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtMarca = new JTextField();
		txtMarca.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtMarca = new GridBagConstraints();
		gbc_txtMarca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMarca.insets = new Insets(0, 0, 5, 0);
		gbc_txtMarca.gridx = 1;
		gbc_txtMarca.gridy = 2;
		panel.add(txtMarca, gbc_txtMarca);
		txtMarca.setColumns(10);

		JLabel lblModelo = new JLabel("Modelo:");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.fill = GridBagConstraints.BOTH;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 3;
		panel.add(lblModelo, gbc_lblModelo);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtModelo = new JTextField();
		txtModelo.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtModelo = new GridBagConstraints();
		gbc_txtModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtModelo.insets = new Insets(0, 0, 5, 0);
		gbc_txtModelo.gridx = 1;
		gbc_txtModelo.gridy = 3;
		panel.add(txtModelo, gbc_txtModelo);
		txtModelo.setColumns(10);

		lblKmRecorridos = new JLabel("KM recorridos:");
		GridBagConstraints gbc_lblKmRecorridos = new GridBagConstraints();
		gbc_lblKmRecorridos.fill = GridBagConstraints.BOTH;
		gbc_lblKmRecorridos.insets = new Insets(0, 0, 0, 5);
		gbc_lblKmRecorridos.gridx = 0;
		gbc_lblKmRecorridos.gridy = 4;
		panel.add(lblKmRecorridos, gbc_lblKmRecorridos);
		lblKmRecorridos.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtKM = new JTextField();
		txtKM.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtKM = new GridBagConstraints();
		gbc_txtKM.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtKM.gridx = 1;
		gbc_txtKM.gridy = 4;
		panel.add(txtKM, gbc_txtKM);
		txtKM.setColumns(10);

		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		splitPane.setRightComponent(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 213, 117, 13, 120, 12, 130, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		lblFechaITV = new JLabel("Fecha ITV:");
		GridBagConstraints gbc_lblFechaITV = new GridBagConstraints();
		gbc_lblFechaITV.fill = GridBagConstraints.BOTH;
		gbc_lblFechaITV.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaITV.gridx = 0;
		gbc_lblFechaITV.gridy = 0;
		panel_1.add(lblFechaITV, gbc_lblFechaITV);
		lblFechaITV.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtDiaItv = new JTextField();
		txtDiaItv.setColumns(10);
		txtDiaItv.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtDiaItv = new GridBagConstraints();
		gbc_txtDiaItv.insets = new Insets(0, 0, 5, 5);
		gbc_txtDiaItv.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDiaItv.gridx = 1;
		gbc_txtDiaItv.gridy = 0;
		panel_1.add(txtDiaItv, gbc_txtDiaItv);

		lblNewLabel_1 = new JLabel("/");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.gridx = 2;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);

		txtMesItv = new JTextField();
		txtMesItv.setColumns(10);
		txtMesItv.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtMesItv = new GridBagConstraints();
		gbc_txtMesItv.insets = new Insets(0, 0, 5, 5);
		gbc_txtMesItv.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMesItv.gridx = 3;
		gbc_txtMesItv.gridy = 0;
		panel_1.add(txtMesItv, gbc_txtMesItv);

		lblNewLabel_2 = new JLabel("/");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 0;
		panel_1.add(lblNewLabel_2, gbc_lblNewLabel_2);

		txtAnoItv = new JTextField();
		txtAnoItv.setColumns(10);
		txtAnoItv.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtAnoItv = new GridBagConstraints();
		gbc_txtAnoItv.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAnoItv.insets = new Insets(0, 0, 5, 0);
		gbc_txtAnoItv.gridx = 5;
		gbc_txtAnoItv.gridy = 0;
		panel_1.add(txtAnoItv, gbc_txtAnoItv);

		lblNewLabel = new JLabel("Fecha Ultima Revision: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_1.add(lblNewLabel, gbc_lblNewLabel);

		txtDiaUR = new JTextField();
		txtDiaUR.setColumns(10);
		txtDiaUR.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtDiaUR = new GridBagConstraints();
		gbc_txtDiaUR.insets = new Insets(0, 0, 5, 5);
		gbc_txtDiaUR.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDiaUR.gridx = 1;
		gbc_txtDiaUR.gridy = 1;
		panel_1.add(txtDiaUR, gbc_txtDiaUR);

		lblNewLabel_3 = new JLabel("/");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 1;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);

		txtMesUR = new JTextField();
		txtMesUR.setColumns(10);
		txtMesUR.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtMesUR = new GridBagConstraints();
		gbc_txtMesUR.insets = new Insets(0, 0, 5, 5);
		gbc_txtMesUR.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMesUR.gridx = 3;
		gbc_txtMesUR.gridy = 1;
		panel_1.add(txtMesUR, gbc_txtMesUR);

		lblNewLabel_4 = new JLabel("/");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.gridx = 4;
		gbc_lblNewLabel_4.gridy = 1;
		panel_1.add(lblNewLabel_4, gbc_lblNewLabel_4);

		txtAnoUR = new JTextField();
		txtAnoUR.setColumns(10);
		txtAnoUR.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtAnoUR = new GridBagConstraints();
		gbc_txtAnoUR.insets = new Insets(0, 0, 5, 0);
		gbc_txtAnoUR.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAnoUR.gridx = 5;
		gbc_txtAnoUR.gridy = 1;
		panel_1.add(txtAnoUR, gbc_txtAnoUR);

		lblCilindrada = new JLabel("Cilindrada:");
		GridBagConstraints gbc_lblCilindrada = new GridBagConstraints();
		gbc_lblCilindrada.fill = GridBagConstraints.BOTH;
		gbc_lblCilindrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblCilindrada.gridx = 0;
		gbc_lblCilindrada.gridy = 2;
		panel_1.add(lblCilindrada, gbc_lblCilindrada);
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtCilindrada = new JTextField();
		txtCilindrada.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtCilindrada = new GridBagConstraints();
		gbc_txtCilindrada.gridwidth = 5;
		gbc_txtCilindrada.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCilindrada.insets = new Insets(0, 0, 5, 0);
		gbc_txtCilindrada.gridx = 1;
		gbc_txtCilindrada.gridy = 2;
		panel_1.add(txtCilindrada, gbc_txtCilindrada);
		txtCilindrada.setColumns(10);

		lblColor = new JLabel("Color:");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.fill = GridBagConstraints.BOTH;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 3;
		panel_1.add(lblColor, gbc_lblColor);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtColor = new JTextField();
		txtColor.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtColor = new GridBagConstraints();
		gbc_txtColor.gridwidth = 5;
		gbc_txtColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtColor.insets = new Insets(0, 0, 5, 0);
		gbc_txtColor.gridx = 1;
		gbc_txtColor.gridy = 3;
		panel_1.add(txtColor, gbc_txtColor);
		txtColor.setColumns(10);

		JLabel lblTipo = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.fill = GridBagConstraints.BOTH;
		gbc_lblTipo.insets = new Insets(0, 0, 0, 5);
		gbc_lblTipo.gridx = 0;
		gbc_lblTipo.gridy = 4;
		panel_1.add(lblTipo, gbc_lblTipo);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		txtTipo = new JTextField();
		txtTipo.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtTipo = new GridBagConstraints();
		gbc_txtTipo.gridwidth = 5;
		gbc_txtTipo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTipo.gridx = 1;
		gbc_txtTipo.gridy = 4;
		panel_1.add(txtTipo, gbc_txtTipo);
		txtTipo.setColumns(10);

		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.window);
		Menu.add(panel_2, BorderLayout.SOUTH);
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setForeground(SystemColor.window);
		btnAceptar.setBackground(SystemColor.textHighlight);
		panel_2.add(btnAceptar);
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		panel_2.add(btnVolver);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.addActionListener(this);
		btnAceptar.addActionListener(this);

		if (formularioOrden != null) {
			this.formularioOrden = formularioOrden;
		}
		if (vehiculo != null) {
			this.vehiculo = vehiculo;
			txtMatricula.setText(vehiculo.getMatricula());
			txtNumBast.setText(vehiculo.getNumBast());
			txtMarca.setText(vehiculo.getMarca());
			txtModelo.setText(vehiculo.getModelo());
			txtKM.setText(vehiculo.getKM());
			txtDiaItv.setText("" + vehiculo.getFechITV().getDia());
			txtMesItv.setText("" + vehiculo.getFechITV().getMes());
			txtAnoItv.setText("" + vehiculo.getFechITV().getAno());
			txtDiaUR.setText("" + vehiculo.getFechUltimaRevision().getDia());
			txtMesUR.setText("" + vehiculo.getFechUltimaRevision().getMes());
			txtAnoUR.setText("" + vehiculo.getFechUltimaRevision().getAno());
			txtCilindrada.setText(vehiculo.getCilindrada());
			txtColor.setText(vehiculo.getColor());
			txtTipo.setText(vehiculo.getTipo());

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

		ListadoVehiculos listadoVehiculos = new ListadoVehiculos(gestorData);
		Object o = e.getSource();
		if (o == btnVolver) {
			if (vehiculo != null) {
				listadoVehiculos.setVisible(true);
				dispose();
			} else {
				MenuAdmin menuAdmin = new MenuAdmin(gestorData);
				menuAdmin.setVisible(true);
				dispose();
			}
		} else if (o == btnAceptar) {

			String numbast = (txtNumBast.getText());
			String matricula = txtMatricula.getText();
			String modelo = txtModelo.getText();
			String marca = (txtMarca.getText());
			String tipo = txtTipo.getText();
			String cilindrada = txtCilindrada.getText();
			String color = txtColor.getText();
			String km = txtKM.getText();
			Fecha fechITV = null;
			Fecha fechUR = null;
			int diaItv;
			int mesItv;
			int anoItv;
			int diaUR;
			int mesUR;
			int anoUR;
			try {
				diaItv = Integer.parseInt(txtDiaItv.getText());
				mesItv = Integer.parseInt(txtMesItv.getText());
				anoItv = Integer.parseInt(txtAnoItv.getText());
				diaUR = Integer.parseInt(txtDiaUR.getText());
				mesUR = Integer.parseInt(txtMesUR.getText());
				anoUR = Integer.parseInt(txtAnoUR.getText());
				fechITV = new Fecha(diaItv, mesItv, anoItv);
				fechUR = new Fecha(diaUR, mesUR, anoUR);
			} catch (NumberFormatException ae) {
				JOptionPane.showMessageDialog(this, (String) "Error, los valores de Fecha tienen que ser númericos", "Error",
						JOptionPane.ERROR_MESSAGE);

			}

			if (numbast.isEmpty() || matricula.isEmpty() || marca.isEmpty() || modelo.isEmpty() || tipo.isEmpty()
					|| color.isEmpty() || km.isEmpty() || cilindrada.isEmpty() || fechITV == null || fechUR == null) {
				JOptionPane.showMessageDialog(this, (String) "Error, introduce datos", "Error", JOptionPane.ERROR_MESSAGE);

			} else {
				vehiculo = new Vehiculo(numbast, matricula, modelo, marca, tipo, cilindrada, color, km, fechITV, fechUR);

				gestorData.guardarVehiculo(vehiculo);
				gestorData.escribirFichTrue("Vehiculo.dat", vehiculo);

				if (formularioOrden != null) {
					formularioOrden.comboBoxModelVehiculo.addElement(vehiculo.getModelo() + "/" + vehiculo.getMarca());

				}
				ListadoVehiculos listadovehiculos = new ListadoVehiculos(gestorData);
				listadovehiculos.setVisible(true);
				System.out.println("" + vehiculo);
				dispose();

			}
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}
}