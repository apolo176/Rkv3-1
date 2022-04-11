package dialogs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Datos.GestorData;
import Datos.Vehiculo;
import Forms.FormularioOrden;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class InfoVehic extends JFrame implements ActionListener, ListSelectionListener {
	/**
	 *
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel panel_Botones;

	private JLabel lblKmRecorridos_1;
	private JLabel lblCilindrada_1;
	private JLabel lblFechaITV_1;
	private JLabel lblColor_1;
	private JLabel lblMarca_1;
	/**
	 *
	 */
	private JButton btnAceptarVehiculos;
	public JLabel lblMatricula;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblNumBastidor;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblModelo;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblMarca;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblKmRecorridos;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCilindrada;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblFechaITV;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblColor;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */

	public JLabel lblTipo;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */

	private GestorData gestorData;
	private FormularioOrden dialogoOrden;
	private JSeparator separator;

	/**
	 * Create the frame.
	 */
	public InfoVehic(GestorData gestorData, FormularioOrden dialogoOrden) {
		this.gestorData = gestorData;
		this.dialogoOrden = dialogoOrden;

		setTitle("INFO_Veh\u00EDculo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 684, 222);

		setSize(647, 236);

		setLocationRelativeTo(null);
		setVisible(true);

		Menu = new JPanel();
		Menu.setBackground(new Color(255, 255, 255));
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		panel_Botones = new JPanel();
		panel_Botones.setForeground(SystemColor.window);
		panel_Botones.setBackground(SystemColor.window);
		Menu.add(panel_Botones, BorderLayout.SOUTH);

		btnAceptarVehiculos = new JButton("ACEPTAR");
		btnAceptarVehiculos.setBackground(SystemColor.textHighlight);
		btnAceptarVehiculos.setForeground(SystemColor.window);
		btnAceptarVehiculos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptarVehiculos.addActionListener(this);
		panel_Botones.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_Botones.add(btnAceptarVehiculos);

		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.window);
		panel.setBackground(SystemColor.window);
		Menu.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 43, 85, 194, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 0.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNumBastidor_1 = new JLabel("Num. Bastidor:");
		GridBagConstraints gbc_lblNumBastidor_1 = new GridBagConstraints();
		gbc_lblNumBastidor_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumBastidor_1.anchor = GridBagConstraints.WEST;
		gbc_lblNumBastidor_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumBastidor_1.gridx = 0;
		gbc_lblNumBastidor_1.gridy = 0;
		panel.add(lblNumBastidor_1, gbc_lblNumBastidor_1);
		lblNumBastidor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNumBastidor = new JLabel("");
		GridBagConstraints gbc_lblNumBastidor = new GridBagConstraints();
		gbc_lblNumBastidor.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumBastidor.anchor = GridBagConstraints.WEST;
		gbc_lblNumBastidor.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumBastidor.gridx = 1;
		gbc_lblNumBastidor.gridy = 0;
		panel.add(lblNumBastidor, gbc_lblNumBastidor);
		lblNumBastidor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblCilindrada_1 = new JLabel("Cilindrada:");
		GridBagConstraints gbc_lblCilindrada_1 = new GridBagConstraints();
		gbc_lblCilindrada_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblCilindrada_1.anchor = GridBagConstraints.WEST;
		gbc_lblCilindrada_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCilindrada_1.gridx = 3;
		gbc_lblCilindrada_1.gridy = 0;
		panel.add(lblCilindrada_1, gbc_lblCilindrada_1);
		lblCilindrada_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblCilindrada = new JLabel("");
		GridBagConstraints gbc_lblCilindrada = new GridBagConstraints();
		gbc_lblCilindrada.fill = GridBagConstraints.VERTICAL;
		gbc_lblCilindrada.anchor = GridBagConstraints.WEST;
		gbc_lblCilindrada.insets = new Insets(0, 0, 5, 0);
		gbc_lblCilindrada.gridx = 4;
		gbc_lblCilindrada.gridy = 0;
		panel.add(lblCilindrada, gbc_lblCilindrada);
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblMatricula_1 = new JLabel("Matricula:");
		GridBagConstraints gbc_lblMatricula_1 = new GridBagConstraints();
		gbc_lblMatricula_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblMatricula_1.anchor = GridBagConstraints.WEST;
		gbc_lblMatricula_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula_1.gridx = 0;
		gbc_lblMatricula_1.gridy = 1;
		panel.add(lblMatricula_1, gbc_lblMatricula_1);
		lblMatricula_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblMatricula = new JLabel("");
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.fill = GridBagConstraints.VERTICAL;
		gbc_lblMatricula.anchor = GridBagConstraints.WEST;
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 1;
		gbc_lblMatricula.gridy = 1;
		panel.add(lblMatricula, gbc_lblMatricula);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));

		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setForeground(SystemColor.controlHighlight);
		separator.setBackground(SystemColor.window);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.fill = GridBagConstraints.BOTH;
		gbc_separator.gridheight = 5;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 2;
		gbc_separator.gridy = 0;
		panel.add(separator, gbc_separator);

		lblFechaITV_1 = new JLabel("Fecha ITV:");
		GridBagConstraints gbc_lblFechaITV_1 = new GridBagConstraints();
		gbc_lblFechaITV_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblFechaITV_1.anchor = GridBagConstraints.WEST;
		gbc_lblFechaITV_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFechaITV_1.gridx = 3;
		gbc_lblFechaITV_1.gridy = 1;
		panel.add(lblFechaITV_1, gbc_lblFechaITV_1);
		lblFechaITV_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblFechaITV = new JLabel("");
		GridBagConstraints gbc_lblFechaITV = new GridBagConstraints();
		gbc_lblFechaITV.fill = GridBagConstraints.VERTICAL;
		gbc_lblFechaITV.anchor = GridBagConstraints.WEST;
		gbc_lblFechaITV.insets = new Insets(0, 0, 5, 0);
		gbc_lblFechaITV.gridx = 4;
		gbc_lblFechaITV.gridy = 1;
		panel.add(lblFechaITV, gbc_lblFechaITV);
		lblFechaITV.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblMarca_1 = new JLabel("Marca:");
		GridBagConstraints gbc_lblMarca_1 = new GridBagConstraints();
		gbc_lblMarca_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblMarca_1.anchor = GridBagConstraints.WEST;
		gbc_lblMarca_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca_1.gridx = 0;
		gbc_lblMarca_1.gridy = 2;
		panel.add(lblMarca_1, gbc_lblMarca_1);
		lblMarca_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblMarca = new JLabel("");
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.fill = GridBagConstraints.VERTICAL;
		gbc_lblMarca.anchor = GridBagConstraints.WEST;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 1;
		gbc_lblMarca.gridy = 2;
		panel.add(lblMarca, gbc_lblMarca);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblColor_1 = new JLabel("Color:");
		GridBagConstraints gbc_lblColor_1 = new GridBagConstraints();
		gbc_lblColor_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblColor_1.anchor = GridBagConstraints.WEST;
		gbc_lblColor_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor_1.gridx = 3;
		gbc_lblColor_1.gridy = 2;
		panel.add(lblColor_1, gbc_lblColor_1);
		lblColor_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblColor = new JLabel("");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.fill = GridBagConstraints.VERTICAL;
		gbc_lblColor.anchor = GridBagConstraints.WEST;
		gbc_lblColor.insets = new Insets(0, 0, 5, 0);
		gbc_lblColor.gridx = 4;
		gbc_lblColor.gridy = 2;
		panel.add(lblColor, gbc_lblColor);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblModelo_1 = new JLabel("Modelo:");
		GridBagConstraints gbc_lblModelo_1 = new GridBagConstraints();
		gbc_lblModelo_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblModelo_1.anchor = GridBagConstraints.WEST;
		gbc_lblModelo_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo_1.gridx = 0;
		gbc_lblModelo_1.gridy = 3;
		panel.add(lblModelo_1, gbc_lblModelo_1);
		lblModelo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblModelo = new JLabel("");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.fill = GridBagConstraints.VERTICAL;
		gbc_lblModelo.anchor = GridBagConstraints.WEST;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 1;
		gbc_lblModelo.gridy = 3;
		panel.add(lblModelo, gbc_lblModelo);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblKmRecorridos_1 = new JLabel("KM recorridos:");
		GridBagConstraints gbc_lblKmRecorridos_1 = new GridBagConstraints();
		gbc_lblKmRecorridos_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblKmRecorridos_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblKmRecorridos_1.anchor = GridBagConstraints.WEST;
		gbc_lblKmRecorridos_1.gridx = 3;
		gbc_lblKmRecorridos_1.gridy = 3;
		panel.add(lblKmRecorridos_1, gbc_lblKmRecorridos_1);
		lblKmRecorridos_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblKmRecorridos = new JLabel("");
		GridBagConstraints gbc_lblKmRecorridos = new GridBagConstraints();
		gbc_lblKmRecorridos.fill = GridBagConstraints.VERTICAL;
		gbc_lblKmRecorridos.anchor = GridBagConstraints.WEST;
		gbc_lblKmRecorridos.insets = new Insets(0, 0, 5, 0);
		gbc_lblKmRecorridos.gridx = 4;
		gbc_lblKmRecorridos.gridy = 3;
		panel.add(lblKmRecorridos, gbc_lblKmRecorridos);
		lblKmRecorridos.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblTipo_1 = new JLabel("Tipo:");
		GridBagConstraints gbc_lblTipo_1 = new GridBagConstraints();
		gbc_lblTipo_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblTipo_1.anchor = GridBagConstraints.WEST;
		gbc_lblTipo_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblTipo_1.gridx = 0;
		gbc_lblTipo_1.gridy = 4;
		panel.add(lblTipo_1, gbc_lblTipo_1);
		lblTipo_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblTipo = new JLabel("");
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.fill = GridBagConstraints.VERTICAL;
		gbc_lblTipo.anchor = GridBagConstraints.WEST;
		gbc_lblTipo.insets = new Insets(0, 0, 0, 5);
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 4;
		panel.add(lblTipo, gbc_lblTipo);
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		CargarVehiculoSeleccionado();
	}

	/**
	 * instancia o de object para la reaccion del objeto variable int con valor 0
	 * para recorrer dlm mas adelante variable int con valor tamaÃ±o del dlm si se
	 * pulsa button aceptar cierra la acrual ventana futura implementacion de codigo
	 * para la recogida de info de lista
	 */

	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 *
		 */
		Object o = e.getSource();
		// int posicion=0;
		// int numeroElementos=dlm.getSize();

		if (o == btnAceptarVehiculos) {
			this.setVisible(false);
		}
	}

	/**
	 * Método para cargar los datos del vehículo seleccionado
	 */
	public void CargarVehiculoSeleccionado() {
		int selectedIndex = dialogoOrden.comboVeh.getSelectedIndex();
		Vehiculo V = new Vehiculo(gestorData.getVehiculo(selectedIndex));
		setVisible(true);
		lblMatricula.setText(V.getMatricula());
		lblNumBastidor.setText(V.getNumBast());
		lblModelo.setText(V.getModelo());
		lblMarca.setText(V.getMarca());
		lblTipo.setText(V.getTipo());
		lblFechaITV.setText("" + V.getFechITV());
		lblColor.setText(V.getColor());
		lblKmRecorridos.setText(V.getKM());
		lblCilindrada.setText(V.getCilindrada());
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}
}