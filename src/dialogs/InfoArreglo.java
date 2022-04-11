package dialogs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Datos.Arreglo;
import Datos.GestorData;
import Forms.FormularioOrden;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Panel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.Toolkit;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */

public class InfoArreglo extends JFrame implements ActionListener, ListSelectionListener {
	/**
	 * @serial correcto funcionamiento de los calculos de las variables Jpanel
	 *         private su uso es exclusivo en la misma clase
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private DefaultListModel<String> dlm;
	@SuppressWarnings("unused")
	private DefaultListModel<String> dlmNomb;
	private JButton btnAceptar;
	public JLabel lblIVA;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblDescuento;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblPrecioMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblHorasMO;
	private JPanel panel;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */

	private GestorData gestorData;
	private FormularioOrden dialogoOrden;

	/**
	 * Create the frame.
	 */
	public InfoArreglo(GestorData gestorData, FormularioOrden dialogoOrden) {
		this.gestorData = gestorData;
		this.dialogoOrden = dialogoOrden;
		setBackground(SystemColor.window);
		setTitle("INFO_Arreglo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 305, 195);
		Menu = new JPanel();
		Menu.setBackground(SystemColor.window);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / 5, height / 4);

		setLocationRelativeTo(null);
		setVisible(true);

		Panel panel_Datos_2 = new Panel();
		panel_Datos_2.setBackground(SystemColor.window);
		Menu.add(panel_Datos_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Datos_2 = new GridBagLayout();
		gbl_panel_Datos_2.columnWidths = new int[] { 142, 99, 0 };
		gbl_panel_Datos_2.rowHeights = new int[] { 30, 30, 30, 30, 0 };
		gbl_panel_Datos_2.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_Datos_2.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_Datos_2.setLayout(gbl_panel_Datos_2);

		JLabel lblIVA_1 = new JLabel("I.V.A.(%) :");
		lblIVA_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblIVA_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIVA_1 = new GridBagConstraints();
		gbc_lblIVA_1.fill = GridBagConstraints.BOTH;
		gbc_lblIVA_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblIVA_1.gridx = 0;
		gbc_lblIVA_1.gridy = 0;
		panel_Datos_2.add(lblIVA_1, gbc_lblIVA_1);

		lblIVA = new JLabel("");
		lblIVA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblIVA = new GridBagConstraints();
		gbc_lblIVA.fill = GridBagConstraints.BOTH;
		gbc_lblIVA.insets = new Insets(0, 0, 5, 0);
		gbc_lblIVA.gridx = 1;
		gbc_lblIVA.gridy = 0;
		panel_Datos_2.add(lblIVA, gbc_lblIVA);

		JLabel lblDescuento_1 = new JLabel("Descuento(%) :");
		lblDescuento_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDescuento_1 = new GridBagConstraints();
		gbc_lblDescuento_1.fill = GridBagConstraints.BOTH;
		gbc_lblDescuento_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescuento_1.gridx = 0;
		gbc_lblDescuento_1.gridy = 1;
		panel_Datos_2.add(lblDescuento_1, gbc_lblDescuento_1);

		lblDescuento = new JLabel("");
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
		gbc_lblDescuento.fill = GridBagConstraints.BOTH;
		gbc_lblDescuento.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescuento.gridx = 1;
		gbc_lblDescuento.gridy = 1;
		panel_Datos_2.add(lblDescuento, gbc_lblDescuento);

		JLabel lblHorasMO_1 = new JLabel("Horas realizadas(h):");
		lblHorasMO_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblHorasMO_1 = new GridBagConstraints();
		gbc_lblHorasMO_1.fill = GridBagConstraints.BOTH;
		gbc_lblHorasMO_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblHorasMO_1.gridx = 0;
		gbc_lblHorasMO_1.gridy = 3;
		panel_Datos_2.add(lblHorasMO_1, gbc_lblHorasMO_1);

		JLabel lblPrecioMO_1 = new JLabel("Precio Mano de Obra(\u20AC):");
		lblPrecioMO_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblPrecioMO_1 = new GridBagConstraints();
		gbc_lblPrecioMO_1.fill = GridBagConstraints.BOTH;
		gbc_lblPrecioMO_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioMO_1.gridx = 0;
		gbc_lblPrecioMO_1.gridy = 2;
		panel_Datos_2.add(lblPrecioMO_1, gbc_lblPrecioMO_1);

		lblPrecioMO = new JLabel("");
		lblPrecioMO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblPrecioMO = new GridBagConstraints();
		gbc_lblPrecioMO.fill = GridBagConstraints.BOTH;
		gbc_lblPrecioMO.insets = new Insets(0, 0, 5, 0);
		gbc_lblPrecioMO.gridx = 1;
		gbc_lblPrecioMO.gridy = 2;
		panel_Datos_2.add(lblPrecioMO, gbc_lblPrecioMO);

		lblHorasMO = new JLabel("");
		lblHorasMO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblHorasMO = new GridBagConstraints();
		gbc_lblHorasMO.fill = GridBagConstraints.BOTH;
		gbc_lblHorasMO.gridx = 1;
		gbc_lblHorasMO.gridy = 3;
		panel_Datos_2.add(lblHorasMO, gbc_lblHorasMO);

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Menu.add(panel, BorderLayout.SOUTH);
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setForeground(SystemColor.window);
		btnAceptar.setBackground(SystemColor.textHighlight);
		panel.add(btnAceptar);
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.addActionListener(this);
		/**
		 * buttones implementados con ActionListeners
		 */

		/**
		 * lista modelo por defecto
		 */
		dlm = new DefaultListModel<String>();
		dlmNomb = new DefaultListModel<String>();
		cargarArreglo();
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
		@SuppressWarnings("unused")
		int posicion = 0;
		@SuppressWarnings("unused")
		int numeroElementos = dlm.getSize();

		if (o == btnAceptar) {
			this.setVisible(false);
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}

	/**
	 * MÈtodo para cargar los Arreglos
	 */
	public void cargarArreglo() {

		Arreglo A = new Arreglo((Arreglo) gestorData.getArreglo(0));

		lblIVA.setText("" + A.getIva());
		lblDescuento.setText("" + A.getDesc());
		lblPrecioMO.setText("" + A.getPMO());
		lblHorasMO.setText("" + A.getHMO());
	}
}