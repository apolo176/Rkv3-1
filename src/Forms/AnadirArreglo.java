package Forms;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Datos.Arreglo;
import Datos.GestorData;
import clases_java.AddLoggerInFile;

import javax.swing.JTextField;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import java.awt.Color;
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
 * @author Grupo_4
 * @version 5.1.2
 */
public class AnadirArreglo extends JFrame implements ActionListener, ListSelectionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	/**
	 * Jlabel: declarados public,se les asigna valor desde * otras clases
	 */
	public JButton btnVolver;
	/**
	 * JButton : declarados public,se les asigna valor desde * otras clases
	 */

	public JButton btnAceptar;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	public static JTextField txtIVAx100;
	/**
	 * JTextField: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	public static JTextField txtDescuento;
	/**
	 * JTextField: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	public static JTextField txtPrecioMO;
	/**
	 * JTextField: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	public static JTextField txtHorasMO;
	private JPanel panel;

	/**
	 * JTextField: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	public Arreglo arreglo;
	private FormularioOrden dialogoOrden;
	private GestorData gestorData;
	private JLabel lblManoObraPrecio;

	/**
	 * Crea frame de la clase.
	 */
	public AnadirArreglo(GestorData gestorData, FormularioOrden dialogoOrden) {
		this.gestorData = gestorData;
		this.dialogoOrden = dialogoOrden;

		setBackground(new Color(255, 255, 255));
		setTitle("A\u00D1ADIR_Arreglo");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 661, 221);
		Menu = new JPanel();
		Menu.setBackground(SystemColor.window);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));

		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / (5 / 2), height / 4);

		setLocationRelativeTo(null);
		setVisible(true);

		Panel panel_Datos_2 = new Panel();
		panel_Datos_2.setBackground(SystemColor.window);
		Menu.add(panel_Datos_2, BorderLayout.CENTER);
		GridBagLayout gbl_panel_Datos_2 = new GridBagLayout();
		gbl_panel_Datos_2.columnWidths = new int[] { 132, 142, 0 };
		gbl_panel_Datos_2.rowHeights = new int[] { 30, 30, 30, 30, 0 };
		gbl_panel_Datos_2.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_Datos_2.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_Datos_2.setLayout(gbl_panel_Datos_2);

		JLabel lblIVA = new JLabel("I.V.A.(%) :");
		lblIVA.setHorizontalAlignment(SwingConstants.LEFT);
		lblIVA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIVA = new GridBagConstraints();
		gbc_lblIVA.fill = GridBagConstraints.BOTH;
		gbc_lblIVA.insets = new Insets(0, 0, 5, 5);
		gbc_lblIVA.gridx = 0;
		gbc_lblIVA.gridy = 0;
		panel_Datos_2.add(lblIVA, gbc_lblIVA);

		txtIVAx100 = new JTextField();
		txtIVAx100.setBackground(SystemColor.controlHighlight);
		GridBagConstraints gbc_txtIVAx100 = new GridBagConstraints();
		gbc_txtIVAx100.fill = GridBagConstraints.BOTH;
		gbc_txtIVAx100.insets = new Insets(0, 0, 5, 0);
		gbc_txtIVAx100.gridx = 1;
		gbc_txtIVAx100.gridy = 0;
		panel_Datos_2.add(txtIVAx100, gbc_txtIVAx100);
		txtIVAx100.setColumns(10);

		JLabel lblDescuento = new JLabel("Descuento(%) :");
		lblDescuento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
		gbc_lblDescuento.fill = GridBagConstraints.BOTH;
		gbc_lblDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescuento.gridx = 0;
		gbc_lblDescuento.gridy = 1;
		panel_Datos_2.add(lblDescuento, gbc_lblDescuento);

		txtDescuento = new JTextField();
		txtDescuento.setBackground(SystemColor.controlHighlight);
		txtDescuento.setColumns(10);
		GridBagConstraints gbc_txtDescuento = new GridBagConstraints();
		gbc_txtDescuento.fill = GridBagConstraints.BOTH;
		gbc_txtDescuento.insets = new Insets(0, 0, 5, 0);
		gbc_txtDescuento.gridx = 1;
		gbc_txtDescuento.gridy = 1;
		panel_Datos_2.add(txtDescuento, gbc_txtDescuento);

		lblManoObraPrecio = new JLabel("Mano de Obra($):");
		lblManoObraPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblManoObraPrecio = new GridBagConstraints();
		gbc_lblManoObraPrecio.insets = new Insets(0, 0, 5, 5);
		gbc_lblManoObraPrecio.anchor = GridBagConstraints.WEST;
		gbc_lblManoObraPrecio.gridx = 0;
		gbc_lblManoObraPrecio.gridy = 2;
		panel_Datos_2.add(lblManoObraPrecio, gbc_lblManoObraPrecio);

		txtPrecioMO = new JTextField();
		txtPrecioMO.setBackground(SystemColor.controlHighlight);
		txtPrecioMO.setColumns(10);
		GridBagConstraints gbc_txtPrecioMO = new GridBagConstraints();
		gbc_txtPrecioMO.fill = GridBagConstraints.BOTH;
		gbc_txtPrecioMO.insets = new Insets(0, 0, 5, 0);
		gbc_txtPrecioMO.gridx = 1;
		gbc_txtPrecioMO.gridy = 2;
		panel_Datos_2.add(txtPrecioMO, gbc_txtPrecioMO);

		JLabel lblManoObraHoras = new JLabel("Mano de Obra(h):");
		lblManoObraHoras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblManoObraHoras = new GridBagConstraints();
		gbc_lblManoObraHoras.insets = new Insets(0, 0, 0, 5);
		gbc_lblManoObraHoras.fill = GridBagConstraints.BOTH;
		gbc_lblManoObraHoras.gridx = 0;
		gbc_lblManoObraHoras.gridy = 3;
		panel_Datos_2.add(lblManoObraHoras, gbc_lblManoObraHoras);

		txtHorasMO = new JTextField();
		txtHorasMO.setBackground(SystemColor.controlHighlight);
		txtHorasMO.setColumns(10);
		GridBagConstraints gbc_txtHorasMO = new GridBagConstraints();
		gbc_txtHorasMO.fill = GridBagConstraints.BOTH;
		gbc_txtHorasMO.gridx = 1;
		gbc_txtHorasMO.gridy = 3;
		panel_Datos_2.add(txtHorasMO, gbc_txtHorasMO);

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Menu.add(panel, BorderLayout.SOUTH);
		btnAceptar = new JButton("ACEPTAR");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setForeground(SystemColor.window);
		panel.add(btnAceptar);
		btnAceptar.setBackground(SystemColor.textHighlight);
		btnVolver = new JButton("VOLVER");
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		panel.add(btnVolver);
		btnVolver.addActionListener(this);
		btnAceptar.addActionListener(this);
		/**
		 * buttones implementados con ActionListeners
		 */
		/**
		 * lista modelo por defecto
		 */
		new DefaultListModel<String>();
		new DefaultListModel<String>();
	}

//	public void EscribirFich(String fichero, Object o )	
//	{
//		FileOutputStream fos;
//		ObjectOutputStream oos;
//		try {
//			fos = new FileOutputStream("" + fichero, true);
//			 oos = new ObjectOutputStream (fos);
//			// lo grabo
//		
//			oos.writeObject(o);
//
//			
//			// cierro el fichero
//			oos.close();
//			fos.close();
//	} catch (FileNotFoundException ae) {
//		// TODO Auto-generated catch block
//		System.out.println("Error, no se encuentra fichero");
//
//	}catch (IOException ae) {
//		// TODO Auto-generated catch block
//		System.out.println("Error de entrada y salida");
//
//	}
//	}

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

			this.setVisible(false);
		}

		else if (o == btnAceptar) {
			if (txtIVAx100.getText().isEmpty() || txtDescuento.getText().isEmpty() || txtPrecioMO.getText().isEmpty()
					|| txtHorasMO.getText().isEmpty()) {
				JOptionPane.showMessageDialog(this, (String) "Introduce los valores restantes!", "ERROR",
						JOptionPane.ERROR_MESSAGE);
			} else {

				try {
					int idArreglo = 0;
					int precioMO = Integer.parseInt(txtPrecioMO.getText());
					int horasMO = Integer.parseInt(txtHorasMO.getText());
					int iva = Integer.parseInt(txtIVAx100.getText());
					int desc = Integer.parseInt(txtDescuento.getText());

					dialogoOrden.btnInfoArreglo.setEnabled(true);
					dialogoOrden.chkValidacion.setEnabled(true);
					dialogoOrden.btnInsertarDatos.setEnabled(true);
					arreglo = new Arreglo(idArreglo, precioMO, horasMO, iva, desc);
					dialogoOrden.IVA = arreglo.getIva();
					gestorData.guardarArreglo(arreglo);

					gestorData.escribirFichTrue("Arreglo.dat", arreglo);
					AddLoggerInFile.Log("Los datos del arreglo se han introducido correctamente");

					System.out.println("" + arreglo);
					idArreglo++;
					/*
					 * int precioMO = Integer.parseInt(txtPrecioMO.getText()); int horasMO =
					 * Integer.parseInt(txtHorasMO.getText());
					 * 
					 * int basetotalMO = (precioMO) * (horasMO);
					 */

					this.setVisible(false);
				} catch (NumberFormatException ae) {
					JOptionPane.showMessageDialog(this, (String) "Introduce los valores validos! Solo números", "ERROR",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

	}
}