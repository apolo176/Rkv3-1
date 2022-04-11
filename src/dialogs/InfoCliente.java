package dialogs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Datos.Cliente;
import Datos.GestorData;
import Forms.FormularioOrden;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.BorderLayout;
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
public class InfoCliente extends JFrame implements ActionListener, ListSelectionListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JButton btnAceptarInfoCli;
	public JLabel lblDireccion;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblTelf;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblEmail;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCod_P;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblFecha_N;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public static JLabel lblNombre;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblDNI;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblApellido1;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblApellido2;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public static DefaultListModel<String> dlm;
	private JSeparator separator;
	private JPanel panel_1;

	private GestorData gestorData;
	private FormularioOrden dialogoOrden;

	/**
	 * DefaultListModel: public se da uso en clases extenas y son modificadas desde
	 * fuera
	 */

	/**
	 * Create the frame.
	 */
	public InfoCliente(GestorData gestorData, FormularioOrden dialogoOrden) {
		this.gestorData = gestorData;
		this.dialogoOrden = dialogoOrden;
		setTitle("INFO_Cliente");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 503, 179);
		Menu = new JPanel();
		Menu.setBackground(Color.WHITE);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		setSize(647, 190);

		setLocationRelativeTo(null);
		setVisible(true);

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Menu.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 86, 76, 147, 26, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblDNI_1 = new JLabel("DNI:");
		lblDNI_1.setBackground(SystemColor.window);
		GridBagConstraints gbc_lblDNI_1 = new GridBagConstraints();
		gbc_lblDNI_1.anchor = GridBagConstraints.WEST;
		gbc_lblDNI_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI_1.gridx = 0;
		gbc_lblDNI_1.gridy = 0;
		panel.add(lblDNI_1, gbc_lblDNI_1);
		lblDNI_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblDNI = new JLabel("");
		lblDNI.setBackground(SystemColor.textText);
		GridBagConstraints gbc_lblDNI = new GridBagConstraints();
		gbc_lblDNI.fill = GridBagConstraints.VERTICAL;
		gbc_lblDNI.anchor = GridBagConstraints.WEST;
		gbc_lblDNI.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNI.gridx = 1;
		gbc_lblDNI.gridy = 0;
		panel.add(lblDNI, gbc_lblDNI);
		lblDNI.setFont(new Font("Tahoma", Font.PLAIN, 15));

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

		JLabel lblDireccion_1 = new JLabel("Direccion:");
		GridBagConstraints gbc_lblDireccion_1 = new GridBagConstraints();
		gbc_lblDireccion_1.anchor = GridBagConstraints.WEST;
		gbc_lblDireccion_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion_1.gridx = 3;
		gbc_lblDireccion_1.gridy = 0;
		panel.add(lblDireccion_1, gbc_lblDireccion_1);
		lblDireccion_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblDireccion = new JLabel("");
		lblDireccion.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.fill = GridBagConstraints.VERTICAL;
		gbc_lblDireccion.anchor = GridBagConstraints.WEST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_lblDireccion.gridx = 4;
		gbc_lblDireccion.gridy = 0;
		panel.add(lblDireccion, gbc_lblDireccion);
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblNombre_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
		gbc_lblNombre_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.gridx = 0;
		gbc_lblNombre_1.gridy = 1;
		panel.add(lblNombre_1, gbc_lblNombre_1);
		lblNombre_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNombre = new JLabel("");
		lblNombre.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panel.add(lblNombre, gbc_lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblEmail_1 = new JLabel("Correo Electronico:");
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.WEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 3;
		gbc_lblEmail_1.gridy = 1;
		panel.add(lblEmail_1, gbc_lblEmail_1);
		lblEmail_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblEmail = new JLabel("");
		lblEmail.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.fill = GridBagConstraints.VERTICAL;
		gbc_lblEmail.anchor = GridBagConstraints.WEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 0);
		gbc_lblEmail.gridx = 4;
		gbc_lblEmail.gridy = 1;
		panel.add(lblEmail, gbc_lblEmail);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblApellido1_1 = new JLabel("Apellido1:");
		GridBagConstraints gbc_lblApellido1_1 = new GridBagConstraints();
		gbc_lblApellido1_1.anchor = GridBagConstraints.WEST;
		gbc_lblApellido1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido1_1.gridx = 0;
		gbc_lblApellido1_1.gridy = 2;
		panel.add(lblApellido1_1, gbc_lblApellido1_1);
		lblApellido1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblApellido1 = new JLabel("");
		lblApellido1.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblApellido1 = new GridBagConstraints();
		gbc_lblApellido1.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellido1.anchor = GridBagConstraints.WEST;
		gbc_lblApellido1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido1.gridx = 1;
		gbc_lblApellido1.gridy = 2;
		panel.add(lblApellido1, gbc_lblApellido1);
		lblApellido1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblCod_P_1 = new JLabel("Codigo Postal:");
		GridBagConstraints gbc_lblCod_P_1 = new GridBagConstraints();
		gbc_lblCod_P_1.anchor = GridBagConstraints.WEST;
		gbc_lblCod_P_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCod_P_1.gridx = 3;
		gbc_lblCod_P_1.gridy = 2;
		panel.add(lblCod_P_1, gbc_lblCod_P_1);
		lblCod_P_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblCod_P = new JLabel("");
		lblCod_P.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblCod_P = new GridBagConstraints();
		gbc_lblCod_P.fill = GridBagConstraints.VERTICAL;
		gbc_lblCod_P.anchor = GridBagConstraints.WEST;
		gbc_lblCod_P.insets = new Insets(0, 0, 5, 0);
		gbc_lblCod_P.gridx = 4;
		gbc_lblCod_P.gridy = 2;
		panel.add(lblCod_P, gbc_lblCod_P);
		lblCod_P.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblApellido2_1 = new JLabel("Apellido2:");
		GridBagConstraints gbc_lblApellido2_1 = new GridBagConstraints();
		gbc_lblApellido2_1.anchor = GridBagConstraints.WEST;
		gbc_lblApellido2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido2_1.gridx = 0;
		gbc_lblApellido2_1.gridy = 3;
		panel.add(lblApellido2_1, gbc_lblApellido2_1);
		lblApellido2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblApellido2 = new JLabel("");
		lblApellido2.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblApellido2 = new GridBagConstraints();
		gbc_lblApellido2.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellido2.anchor = GridBagConstraints.WEST;
		gbc_lblApellido2.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido2.gridx = 1;
		gbc_lblApellido2.gridy = 3;
		panel.add(lblApellido2, gbc_lblApellido2);
		lblApellido2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblFecha_N_1 = new JLabel("Fecha Nacimiento:");
		GridBagConstraints gbc_lblFecha_N_1 = new GridBagConstraints();
		gbc_lblFecha_N_1.anchor = GridBagConstraints.WEST;
		gbc_lblFecha_N_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFecha_N_1.gridx = 3;
		gbc_lblFecha_N_1.gridy = 3;
		panel.add(lblFecha_N_1, gbc_lblFecha_N_1);
		lblFecha_N_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblFecha_N = new JLabel("");
		lblFecha_N.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblFecha_N = new GridBagConstraints();
		gbc_lblFecha_N.fill = GridBagConstraints.VERTICAL;
		gbc_lblFecha_N.anchor = GridBagConstraints.WEST;
		gbc_lblFecha_N.insets = new Insets(0, 0, 5, 0);
		gbc_lblFecha_N.gridx = 4;
		gbc_lblFecha_N.gridy = 3;
		panel.add(lblFecha_N, gbc_lblFecha_N);
		lblFecha_N.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblTelf_1 = new JLabel("Telefono:");
		GridBagConstraints gbc_lblTelf_1 = new GridBagConstraints();
		gbc_lblTelf_1.anchor = GridBagConstraints.WEST;
		gbc_lblTelf_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelf_1.gridx = 0;
		gbc_lblTelf_1.gridy = 4;
		panel.add(lblTelf_1, gbc_lblTelf_1);
		lblTelf_1.setFont(new Font("Dialog", Font.PLAIN, 15));

		lblTelf = new JLabel("");
		lblTelf.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_lblTelf = new GridBagConstraints();
		gbc_lblTelf.anchor = GridBagConstraints.WEST;
		gbc_lblTelf.fill = GridBagConstraints.VERTICAL;
		gbc_lblTelf.insets = new Insets(0, 0, 0, 5);
		gbc_lblTelf.gridx = 1;
		gbc_lblTelf.gridy = 4;
		panel.add(lblTelf, gbc_lblTelf);
		lblTelf.setFont(new Font("Dialog", Font.PLAIN, 15));

		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.window);
		Menu.add(panel_1, BorderLayout.SOUTH);

		btnAceptarInfoCli = new JButton("ACEPTAR");
		panel_1.add(btnAceptarInfoCli);
		btnAceptarInfoCli.setBackground(SystemColor.textHighlight);
		btnAceptarInfoCli.setForeground(SystemColor.window);
		btnAceptarInfoCli.addActionListener(this);
		btnAceptarInfoCli.setFont(new Font("Tahoma", Font.PLAIN, 16));
		dlm = new DefaultListModel<String>();

		CargarClienteSeleccionado();

	}

	/**
	 * instancia o de object para la reaccion del objeto variable int con valor 0
	 * para recorrer dlm mas adelante variable int con valor tama√±o del dlm si se
	 * pulsa button aceptar cierra la acrual ventana futura implementacion de codigo
	 * para la recogida de info de lista
	 */

	@Override

	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();

		if (o == btnAceptarInfoCli) {
			/**
			 * cierra la actual ventana
			 */
			this.setVisible(false);
		} else if (o == btnAceptarInfoCli) {
			/**
			 * cierra la actual ventana
			 */
			this.setVisible(false);
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	/**
	 * MÈtodo para cargar los datos del cliente seleccionado
	 */
	public void CargarClienteSeleccionado() {
		int selectedIndex = dialogoOrden.comboCli.getSelectedIndex();

		Cliente C = new Cliente(gestorData.getCliente(selectedIndex));

		lblDNI.setText(C.getDni());
		lblNombre.setText(C.getNombre());
		lblApellido1.setText(C.getApellido1());
		lblApellido2.setText(C.getApellido2());
		lblTelf.setText(C.getTelf());
		lblEmail.setText(C.getEmail());
		lblCod_P.setText(C.getCodP());
		lblFecha_N.setText("" + C.getFechNa());
		lblDireccion.setText(C.getDir());
	}
}