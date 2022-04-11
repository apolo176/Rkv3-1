package dialogs;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;

import Datos.Arreglo;
import Datos.Cliente;
import Datos.Empleado;
import Datos.GestorData;
import Datos.Material;
import Datos.Materiales;
import Datos.Orden;
import Datos.Vehiculo;
import Forms.AnadirArreglo;
import Forms.FormularioOrden;
import Listados.ListadoOrdenesTrabajo;
import clases_java.AddLoggerInFile;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import java.awt.SystemColor;

import javax.swing.border.BevelBorder;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class OrdenesTrabajo extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */

	private JButton btnVolver;
	/**
	 * JButton: declarados private no se modifica fuera de la clase
	 */
	public JButton btnFinalizar;
	/**
	 * JButton: declarados private no se modifica fuera de la clase
	 */
	public DefaultListModel<String> dlmConcepto;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JList<String> lstConcepto;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public DefaultListModel<String> dlmCantidad;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JList<String> lstCantidad;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public DefaultListModel<String> dlmPrecio;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JList<String> lstPrecio;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public DefaultListModel<String> dlmBaseTotal;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JList<String> lstBaseTotal;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public DefaultListModel<String> dlmIVAx100;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public DefaultListModel<String> dlmHorasMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JList<String> lstHorasMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public DefaultListModel<String> dlmBaseTotalIVA;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JList<String> lstBaseTotalIVA;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public static DefaultListModel<String> dlmNombre;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblNumFact;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblPrecioMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblHorasMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblBaseTotalMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblIVAFact;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblTOTALfact;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblBaseFact;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblMatricula;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblNombreCli;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblTOTALIVAMO;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblUsuario;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblMarca;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblModelo;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblColor;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblNum_Bast;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblFechaitv;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCilindrada;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblTipocoche;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblKmrecorrido;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblDireccionOdt;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblCod_P_Cliente;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblEmail_Cliente;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	public JLabel lblDNI_Cliente;
	/**
	 * JLabel: public se da uso en clases extenas y son modificadas desde fuera
	 */
	private JPanel Menu;
	private JLabel lblPrecio;
	private JLabel lblHoras;
	private JLabel lblBaseTotalMO_1;
	private JLabel lblBaseTotalMO_2;
	private JLabel lblBaseFact_1;
	private JLabel lblIVAFact_1;
	private JLabel lblTOTALfact_1;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JLabel lblMateriales;
	private JLabel lblPrecioTOTAL;
	public JLabel lblCantidadTOTAL;
	public JLabel lblBAseTotal;
	public JLabel lblTotalIVAINFO;
	private JPanel panel_3;
	private JSeparator separator;
	private JLabel lblMO;
	private JSeparator separator_1;
	public JLabel lblSinIVA;
	public JLabel lblBaseTotalMat;
	private JPanel panel_4;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JLabel lblDESCUENTO;
	public JLabel lblDescuento;
	private JSeparator separator_5;

	public Vehiculo V;
	public Cliente C;
	public Arreglo A;
	public Materiales MS;
	public Material M;
	private GestorData gestorData;
	private FormularioOrden formularioOrden;
	private ListadoOrdenesTrabajo listOT;
	public JLabel lblIdRef;
	private JLabel lblUsuario_1;
	private Orden orden;

	/**
	 * Crea el frame de la clase.
	 * 
	 */

	public OrdenesTrabajo(GestorData gestorData, FormularioOrden dialogoOrden) {
		/**
		 * @param constructor encargado de crear frame de la ventana
		 */
		initOrdenesTrabajo(gestorData, null, dialogoOrden, null);
	}

	public OrdenesTrabajo(GestorData gestorData, ListadoOrdenesTrabajo listOT, Orden orden) {
		/**
		 * @param constructor encargado de crear frame de la ventana
		 */

		initOrdenesTrabajo(gestorData, listOT, null, orden);

	}

	public void initOrdenesTrabajo(GestorData gestorData, ListadoOrdenesTrabajo listOT, FormularioOrden formularioOrden,
			Orden orden) {
		this.gestorData = gestorData;
		this.formularioOrden = formularioOrden;
		setBackground(SystemColor.window);
		setTitle("OrdenesTrabajo");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 957, 742);

		setSize(838, 627);

		setLocationRelativeTo(null);
		setVisible(true);

		Menu = new JPanel();
		Menu.setBackground(SystemColor.window);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(new BorderLayout(0, 0));
		dlmConcepto = new DefaultListModel<String>();
		dlmCantidad = new DefaultListModel<String>();
		dlmPrecio = new DefaultListModel<String>();
		dlmIVAx100 = new DefaultListModel<String>();
		dlmBaseTotal = new DefaultListModel<String>();
		dlmBaseTotalIVA = new DefaultListModel<String>();
		/**
		 * Boton implementado con Action Listener
		 */
		/**
		 * Boton implementado con Action Listener
		 */

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Menu.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 30, 0, 0, 30, 27, 30, 0, 30, 30, 0, 30, 0 };
		gbl_panel.rowHeights = new int[] { 56, 30, 0, 27, 0, 30, 0, 47, 0, 0, 0, 88, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 6;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		panel.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panel_2.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_2.columnWeights = new double[] { 1.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel_2.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel_2.setLayout(gbl_panel_2);

		lblNombreCli = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombreCli = new GridBagConstraints();
		gbc_lblNombreCli.fill = GridBagConstraints.BOTH;
		gbc_lblNombreCli.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCli.gridx = 0;
		gbc_lblNombreCli.gridy = 0;
		panel_2.add(lblNombreCli, gbc_lblNombreCli);
		lblNombreCli.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNumFact = new JLabel("NumeroFactura: ");
		GridBagConstraints gbc_lblNumFact = new GridBagConstraints();
		gbc_lblNumFact.anchor = GridBagConstraints.WEST;
		gbc_lblNumFact.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumFact.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumFact.gridx = 1;
		gbc_lblNumFact.gridy = 0;
		panel_2.add(lblNumFact, gbc_lblNumFact);
		lblNumFact.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblIdRef = new JLabel("New label");
		lblIdRef.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblIdRef = new GridBagConstraints();
		gbc_lblIdRef.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIdRef.insets = new Insets(0, 0, 5, 0);
		gbc_lblIdRef.gridx = 2;
		gbc_lblIdRef.gridy = 0;
		panel_2.add(lblIdRef, gbc_lblIdRef);

		lblDireccionOdt = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccionOdt = new GridBagConstraints();
		gbc_lblDireccionOdt.fill = GridBagConstraints.BOTH;
		gbc_lblDireccionOdt.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccionOdt.gridx = 0;
		gbc_lblDireccionOdt.gridy = 1;
		panel_2.add(lblDireccionOdt, gbc_lblDireccionOdt);
		lblDireccionOdt.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.gridx = 1;
		gbc_lblUsuario_1.gridy = 1;
		panel_2.add(lblUsuario_1, gbc_lblUsuario_1);

		lblUsuario = new JLabel("new Label");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.BOTH;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 0);
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 1;
		panel_2.add(lblUsuario, gbc_lblUsuario);
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblCod_P_Cliente = new JLabel("CodigoPostal");
		GridBagConstraints gbc_lblCod_P_Cliente = new GridBagConstraints();
		gbc_lblCod_P_Cliente.fill = GridBagConstraints.BOTH;
		gbc_lblCod_P_Cliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblCod_P_Cliente.gridx = 0;
		gbc_lblCod_P_Cliente.gridy = 2;
		panel_2.add(lblCod_P_Cliente, gbc_lblCod_P_Cliente);
		lblCod_P_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblEmail_Cliente = new JLabel("Email_cliente");
		GridBagConstraints gbc_lblEmail_Cliente = new GridBagConstraints();
		gbc_lblEmail_Cliente.fill = GridBagConstraints.BOTH;
		gbc_lblEmail_Cliente.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_Cliente.gridx = 0;
		gbc_lblEmail_Cliente.gridy = 3;
		panel_2.add(lblEmail_Cliente, gbc_lblEmail_Cliente);
		lblEmail_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblDNI_Cliente = new JLabel("DNI_Cliente");
		GridBagConstraints gbc_lblDNI_Cliente = new GridBagConstraints();
		gbc_lblDNI_Cliente.fill = GridBagConstraints.BOTH;
		gbc_lblDNI_Cliente.insets = new Insets(0, 0, 0, 5);
		gbc_lblDNI_Cliente.gridx = 0;
		gbc_lblDNI_Cliente.gridy = 4;
		panel_2.add(lblDNI_Cliente, gbc_lblDNI_Cliente);
		lblDNI_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 15));

		panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 4;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 7;
		gbc_panel_1.gridy = 0;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel_1.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_1.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		lblMatricula = new JLabel("Matricula");
		GridBagConstraints gbc_lblMatricula = new GridBagConstraints();
		gbc_lblMatricula.fill = GridBagConstraints.BOTH;
		gbc_lblMatricula.insets = new Insets(0, 0, 5, 5);
		gbc_lblMatricula.gridx = 0;
		gbc_lblMatricula.gridy = 0;
		panel_1.add(lblMatricula, gbc_lblMatricula);
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblFechaitv = new JLabel("Fecha_ITV");
		GridBagConstraints gbc_lblFechaitv = new GridBagConstraints();
		gbc_lblFechaitv.fill = GridBagConstraints.BOTH;
		gbc_lblFechaitv.insets = new Insets(0, 0, 5, 0);
		gbc_lblFechaitv.gridx = 1;
		gbc_lblFechaitv.gridy = 0;
		panel_1.add(lblFechaitv, gbc_lblFechaitv);
		lblFechaitv.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblMarca = new JLabel("Marca");
		GridBagConstraints gbc_lblMarca = new GridBagConstraints();
		gbc_lblMarca.fill = GridBagConstraints.BOTH;
		gbc_lblMarca.insets = new Insets(0, 0, 5, 5);
		gbc_lblMarca.gridx = 0;
		gbc_lblMarca.gridy = 1;
		panel_1.add(lblMarca, gbc_lblMarca);
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblKmrecorrido = new JLabel("KM_Recorrido");
		GridBagConstraints gbc_lblKmrecorrido = new GridBagConstraints();
		gbc_lblKmrecorrido.fill = GridBagConstraints.BOTH;
		gbc_lblKmrecorrido.insets = new Insets(0, 0, 5, 0);
		gbc_lblKmrecorrido.gridx = 1;
		gbc_lblKmrecorrido.gridy = 1;
		panel_1.add(lblKmrecorrido, gbc_lblKmrecorrido);
		lblKmrecorrido.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblModelo = new JLabel("Modelo");
		GridBagConstraints gbc_lblModelo = new GridBagConstraints();
		gbc_lblModelo.fill = GridBagConstraints.BOTH;
		gbc_lblModelo.insets = new Insets(0, 0, 5, 5);
		gbc_lblModelo.gridx = 0;
		gbc_lblModelo.gridy = 2;
		panel_1.add(lblModelo, gbc_lblModelo);
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblCilindrada = new JLabel("Cilindrada");
		GridBagConstraints gbc_lblCilindrada = new GridBagConstraints();
		gbc_lblCilindrada.fill = GridBagConstraints.BOTH;
		gbc_lblCilindrada.insets = new Insets(0, 0, 5, 0);
		gbc_lblCilindrada.gridx = 1;
		gbc_lblCilindrada.gridy = 2;
		panel_1.add(lblCilindrada, gbc_lblCilindrada);
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblColor = new JLabel("Color");
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.fill = GridBagConstraints.BOTH;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 0;
		gbc_lblColor.gridy = 3;
		panel_1.add(lblColor, gbc_lblColor);
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblTipocoche = new JLabel("Tipo_Coche");
		GridBagConstraints gbc_lblTipocoche = new GridBagConstraints();
		gbc_lblTipocoche.fill = GridBagConstraints.BOTH;
		gbc_lblTipocoche.insets = new Insets(0, 0, 5, 0);
		gbc_lblTipocoche.gridx = 1;
		gbc_lblTipocoche.gridy = 3;
		panel_1.add(lblTipocoche, gbc_lblTipocoche);
		lblTipocoche.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblNum_Bast = new JLabel("NumeroDeBastidor");
		GridBagConstraints gbc_lblNum_Bast = new GridBagConstraints();
		gbc_lblNum_Bast.fill = GridBagConstraints.BOTH;
		gbc_lblNum_Bast.insets = new Insets(0, 0, 0, 5);
		gbc_lblNum_Bast.gridx = 0;
		gbc_lblNum_Bast.gridy = 4;
		panel_1.add(lblNum_Bast, gbc_lblNum_Bast);
		lblNum_Bast.setFont(new Font("Tahoma", Font.PLAIN, 15));

		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridwidth = 11;
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		panel.add(separator, gbc_separator);

		lblMateriales = new JLabel("Materiales");
		lblMateriales.setHorizontalAlignment(SwingConstants.CENTER);
		lblMateriales.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblMateriales = new GridBagConstraints();
		gbc_lblMateriales.fill = GridBagConstraints.BOTH;
		gbc_lblMateriales.insets = new Insets(0, 0, 5, 5);
		gbc_lblMateriales.gridx = 0;
		gbc_lblMateriales.gridy = 2;
		panel.add(lblMateriales, gbc_lblMateriales);

		lblCantidadTOTAL = new JLabel("Cantidad:");
		lblCantidadTOTAL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblCantidadTOTAL = new GridBagConstraints();
		gbc_lblCantidadTOTAL.gridwidth = 2;
		gbc_lblCantidadTOTAL.fill = GridBagConstraints.VERTICAL;
		gbc_lblCantidadTOTAL.insets = new Insets(0, 0, 5, 5);
		gbc_lblCantidadTOTAL.gridx = 1;
		gbc_lblCantidadTOTAL.gridy = 2;
		panel.add(lblCantidadTOTAL, gbc_lblCantidadTOTAL);

		lblPrecioTOTAL = new JLabel("Precio(\u20AC):");
		lblPrecioTOTAL.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblPrecioTOTAL = new GridBagConstraints();
		gbc_lblPrecioTOTAL.fill = GridBagConstraints.VERTICAL;
		gbc_lblPrecioTOTAL.insets = new Insets(0, 0, 5, 5);
		gbc_lblPrecioTOTAL.gridx = 4;
		gbc_lblPrecioTOTAL.gridy = 2;
		panel.add(lblPrecioTOTAL, gbc_lblPrecioTOTAL);

		lblBAseTotal = new JLabel("Base Total:");
		lblBAseTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblBAseTotal = new GridBagConstraints();
		gbc_lblBAseTotal.fill = GridBagConstraints.VERTICAL;
		gbc_lblBAseTotal.insets = new Insets(0, 0, 5, 5);
		gbc_lblBAseTotal.gridx = 8;
		gbc_lblBAseTotal.gridy = 2;
		panel.add(lblBAseTotal, gbc_lblBAseTotal);

		lblTotalIVAINFO = new JLabel("Total:");
		lblTotalIVAINFO.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblTotalIVAINFO = new GridBagConstraints();
		gbc_lblTotalIVAINFO.gridwidth = 2;
		gbc_lblTotalIVAINFO.fill = GridBagConstraints.VERTICAL;
		gbc_lblTotalIVAINFO.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalIVAINFO.gridx = 9;
		gbc_lblTotalIVAINFO.gridy = 2;
		panel.add(lblTotalIVAINFO, gbc_lblTotalIVAINFO);

		panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(2, 2, 2, 2, (Color) SystemColor.textHighlight));
		panel_3.setBackground(SystemColor.window);
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridwidth = 11;
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 3;
		panel.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 30, 0, 15, 30, 41, 30, 30, 30, 30, 0 };
		gbl_panel_3.rowHeights = new int[] { 38, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 1.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		lstConcepto = new JList<String>();
		lstConcepto.setAlignmentX(1.0f);
		lstConcepto.setBackground(SystemColor.window);
		GridBagConstraints gbc_lstConcepto = new GridBagConstraints();
		gbc_lstConcepto.gridwidth = 3;
		gbc_lstConcepto.fill = GridBagConstraints.VERTICAL;
		gbc_lstConcepto.insets = new Insets(0, 0, 0, 5);
		gbc_lstConcepto.gridx = 0;
		gbc_lstConcepto.gridy = 0;
		panel_3.add(lstConcepto, gbc_lstConcepto);
		lstConcepto.setBorder(null);

		lstConcepto.setModel(dlmConcepto);

		lstCantidad = new JList<String>();
		lstCantidad.setAlignmentX(0.7f);
		GridBagConstraints gbc_lstCantidad = new GridBagConstraints();
		gbc_lstCantidad.fill = GridBagConstraints.VERTICAL;
		gbc_lstCantidad.insets = new Insets(0, 0, 0, 5);
		gbc_lstCantidad.gridx = 3;
		gbc_lstCantidad.gridy = 0;
		panel_3.add(lstCantidad, gbc_lstCantidad);
		lstCantidad.setBorder(null);
		lstCantidad.setModel(dlmCantidad);
		lstCantidad.setBackground(SystemColor.window);

		separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 0, 5);
		gbc_separator_5.gridx = 4;
		gbc_separator_5.gridy = 0;
		panel_3.add(separator_5, gbc_separator_5);

		lstPrecio = new JList<String>();
		lstPrecio.setAlignmentX(2.0f);
		GridBagConstraints gbc_lstPrecio = new GridBagConstraints();
		gbc_lstPrecio.anchor = GridBagConstraints.WEST;
		gbc_lstPrecio.insets = new Insets(0, 0, 0, 5);
		gbc_lstPrecio.fill = GridBagConstraints.VERTICAL;
		gbc_lstPrecio.gridx = 5;
		gbc_lstPrecio.gridy = 0;
		panel_3.add(lstPrecio, gbc_lstPrecio);
		lstPrecio.setBorder(null);

		lstPrecio.setModel(dlmPrecio);

		lstPrecio.setBackground(SystemColor.window);
		lstPrecio.setForeground(new Color(0, 0, 0));

		lstBaseTotal = new JList<String>();
		lstBaseTotal.setBackground(SystemColor.window);
		GridBagConstraints gbc_lstBaseTotal = new GridBagConstraints();
		gbc_lstBaseTotal.fill = GridBagConstraints.VERTICAL;
		gbc_lstBaseTotal.insets = new Insets(0, 0, 0, 5);
		gbc_lstBaseTotal.gridx = 7;
		gbc_lstBaseTotal.gridy = 0;
		panel_3.add(lstBaseTotal, gbc_lstBaseTotal);
		lstBaseTotal.setBorder(null);

		lstBaseTotal.setModel(dlmBaseTotal);

		lstBaseTotalIVA = new JList<String>();
		lstBaseTotalIVA.setBackground(SystemColor.window);
		GridBagConstraints gbc_lstBaseTotalIVA = new GridBagConstraints();
		gbc_lstBaseTotalIVA.fill = GridBagConstraints.VERTICAL;
		gbc_lstBaseTotalIVA.gridx = 8;
		gbc_lstBaseTotalIVA.gridy = 0;
		panel_3.add(lstBaseTotalIVA, gbc_lstBaseTotalIVA);
		lstBaseTotalIVA.setBorder(null);
		lstBaseTotalIVA.setModel(dlmBaseTotalIVA);

		lblSinIVA = new JLabel("BaseTotal");
		GridBagConstraints gbc_lblSinIVA = new GridBagConstraints();
		gbc_lblSinIVA.insets = new Insets(0, 0, 5, 5);
		gbc_lblSinIVA.gridx = 8;
		gbc_lblSinIVA.gridy = 4;
		panel.add(lblSinIVA, gbc_lblSinIVA);

		lblBaseTotalMat = new JLabel("BaseTotalMat");
		GridBagConstraints gbc_lblBaseTotalMat = new GridBagConstraints();
		gbc_lblBaseTotalMat.gridwidth = 2;
		gbc_lblBaseTotalMat.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaseTotalMat.gridx = 9;
		gbc_lblBaseTotalMat.gridy = 4;
		panel.add(lblBaseTotalMat, gbc_lblBaseTotalMat);

		separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 0;
		gbc_separator_1.gridy = 5;
		panel.add(separator_1, gbc_separator_1);

		lblMO = new JLabel("Mano de Obra");
		lblMO.setHorizontalAlignment(SwingConstants.CENTER);
		lblMO.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_lblMO = new GridBagConstraints();
		gbc_lblMO.insets = new Insets(0, 0, 5, 5);
		gbc_lblMO.gridx = 0;
		gbc_lblMO.gridy = 6;
		panel.add(lblMO, gbc_lblMO);

		panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, SystemColor.textHighlight, SystemColor.textHighlight,
				SystemColor.textHighlight, SystemColor.textHighlight));
		panel_4.setBackground(SystemColor.inactiveCaption);
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 11;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 7;
		panel.add(panel_4, gbc_panel_4);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[] { 105, 0, 80, 0, 0, 80, 0, 0, 80, 0, 0, 0, 0 };
		gbl_panel_4.rowHeights = new int[] { 0, 0 };
		gbl_panel_4.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		gbl_panel_4.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_4.setLayout(gbl_panel_4);

		lblPrecio = new JLabel("Precio:");
		GridBagConstraints gbc_lblPrecio = new GridBagConstraints();
		gbc_lblPrecio.anchor = GridBagConstraints.EAST;
		gbc_lblPrecio.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecio.gridx = 0;
		gbc_lblPrecio.gridy = 0;
		panel_4.add(lblPrecio, gbc_lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBackground(Color.WHITE);

		lblPrecioMO = new JLabel("0.0");
		GridBagConstraints gbc_lblPrecioMO = new GridBagConstraints();
		gbc_lblPrecioMO.insets = new Insets(0, 0, 0, 5);
		gbc_lblPrecioMO.gridx = 1;
		gbc_lblPrecioMO.gridy = 0;
		panel_4.add(lblPrecioMO, gbc_lblPrecioMO);
		lblPrecioMO.setBackground(new Color(255, 255, 255));
		lblPrecioMO.setFont(new Font("Tahoma", Font.PLAIN, 15));

		separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 0, 5);
		gbc_separator_2.gridx = 2;
		gbc_separator_2.gridy = 0;
		panel_4.add(separator_2, gbc_separator_2);

		lblHoras = new JLabel("Horas:");
		GridBagConstraints gbc_lblHoras = new GridBagConstraints();
		gbc_lblHoras.insets = new Insets(0, 0, 0, 5);
		gbc_lblHoras.gridx = 3;
		gbc_lblHoras.gridy = 0;
		panel_4.add(lblHoras, gbc_lblHoras);
		lblHoras.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblHorasMO = new JLabel("0");
		GridBagConstraints gbc_lblHorasMO = new GridBagConstraints();
		gbc_lblHorasMO.insets = new Insets(0, 0, 0, 5);
		gbc_lblHorasMO.gridx = 4;
		gbc_lblHorasMO.gridy = 0;
		panel_4.add(lblHorasMO, gbc_lblHorasMO);
		lblHorasMO.setFont(new Font("Tahoma", Font.PLAIN, 15));

		separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 0, 5);
		gbc_separator_3.gridx = 5;
		gbc_separator_3.gridy = 0;
		panel_4.add(separator_3, gbc_separator_3);

		lblBaseTotalMO_1 = new JLabel("Total:");
		GridBagConstraints gbc_lblBaseTotalMO_1 = new GridBagConstraints();
		gbc_lblBaseTotalMO_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblBaseTotalMO_1.gridx = 6;
		gbc_lblBaseTotalMO_1.gridy = 0;
		panel_4.add(lblBaseTotalMO_1, gbc_lblBaseTotalMO_1);
		lblBaseTotalMO_1.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblBaseTotalMO = new JLabel("0.0");
		GridBagConstraints gbc_lblBaseTotalMO = new GridBagConstraints();
		gbc_lblBaseTotalMO.insets = new Insets(0, 0, 0, 5);
		gbc_lblBaseTotalMO.gridx = 7;
		gbc_lblBaseTotalMO.gridy = 0;
		panel_4.add(lblBaseTotalMO, gbc_lblBaseTotalMO);
		lblBaseTotalMO.setFont(new Font("Tahoma", Font.PLAIN, 15));

		separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 0, 5);
		gbc_separator_4.gridx = 8;
		gbc_separator_4.gridy = 0;
		panel_4.add(separator_4, gbc_separator_4);

		lblBaseTotalMO_2 = new JLabel("Total con IVA:");
		GridBagConstraints gbc_lblBaseTotalMO_2 = new GridBagConstraints();
		gbc_lblBaseTotalMO_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblBaseTotalMO_2.gridx = 9;
		gbc_lblBaseTotalMO_2.gridy = 0;
		panel_4.add(lblBaseTotalMO_2, gbc_lblBaseTotalMO_2);
		lblBaseTotalMO_2.setFont(new Font("Tahoma", Font.PLAIN, 15));

		lblTOTALIVAMO = new JLabel("0.0");
		GridBagConstraints gbc_lblTOTALIVAMO = new GridBagConstraints();
		gbc_lblTOTALIVAMO.insets = new Insets(0, 0, 0, 5);
		gbc_lblTOTALIVAMO.gridx = 10;
		gbc_lblTOTALIVAMO.gridy = 0;
		panel_4.add(lblTOTALIVAMO, gbc_lblTOTALIVAMO);
		lblTOTALIVAMO.setFont(new Font("Tahoma", Font.BOLD, 15));

		JLabel lblNewLabel = new JLabel("€");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridx = 11;
		gbc_lblNewLabel.gridy = 0;
		panel_4.add(lblNewLabel, gbc_lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnFinalizar = new JButton("GENERAR FACTURA");
		if(formularioOrden==null) {
			btnFinalizar.setEnabled(false);
		}
		GridBagConstraints gbc_btnFinalizar = new GridBagConstraints();
		gbc_btnFinalizar.gridheight = 2;
		gbc_btnFinalizar.insets = new Insets(0, 0, 5, 5);
		gbc_btnFinalizar.gridx = 0;
		gbc_btnFinalizar.gridy = 8;
		panel.add(btnFinalizar, gbc_btnFinalizar);
		btnFinalizar.setForeground(SystemColor.window);
		btnFinalizar.setBackground(SystemColor.textHighlight);
		btnFinalizar.addActionListener(this);
		btnFinalizar.setFont(new Font("Tahoma", Font.BOLD, 15));

		JPanel panelfact = new JPanel();
		GridBagConstraints gbc_panelfact = new GridBagConstraints();
		gbc_panelfact.gridheight = 3;
		gbc_panelfact.insets = new Insets(0, 0, 5, 0);
		gbc_panelfact.gridwidth = 6;
		gbc_panelfact.gridx = 7;
		gbc_panelfact.gridy = 8;
		panel.add(panelfact, gbc_panelfact);
		panelfact.setBackground(SystemColor.window);
		GridBagLayout gbl_panelfact = new GridBagLayout();
		gbl_panelfact.columnWidths = new int[] { 76, 52, 87, 0 };
		gbl_panelfact.rowHeights = new int[] { 26, 26, 0 };
		gbl_panelfact.columnWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panelfact.rowWeights = new double[] { 0.0, 0.0, Double.MIN_VALUE };
		panelfact.setLayout(gbl_panelfact);

		lblBaseFact_1 = new JLabel("BASE");
		lblBaseFact_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblBaseFact_1 = new GridBagConstraints();
		gbc_lblBaseFact_1.fill = GridBagConstraints.BOTH;
		gbc_lblBaseFact_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblBaseFact_1.gridx = 0;
		gbc_lblBaseFact_1.gridy = 0;
		panelfact.add(lblBaseFact_1, gbc_lblBaseFact_1);

		lblIVAFact_1 = new JLabel("I.V.A%");
		lblIVAFact_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIVAFact_1 = new GridBagConstraints();
		gbc_lblIVAFact_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIVAFact_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblIVAFact_1.gridx = 1;
		gbc_lblIVAFact_1.gridy = 0;
		panelfact.add(lblIVAFact_1, gbc_lblIVAFact_1);

		lblTOTALfact_1 = new JLabel("TOTAL");
		lblTOTALfact_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblTOTALfact_1 = new GridBagConstraints();
		gbc_lblTOTALfact_1.fill = GridBagConstraints.BOTH;
		gbc_lblTOTALfact_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblTOTALfact_1.gridx = 2;
		gbc_lblTOTALfact_1.gridy = 0;
		panelfact.add(lblTOTALfact_1, gbc_lblTOTALfact_1);

		lblBaseFact = new JLabel("0.0");
		lblBaseFact.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_lblBaseFact = new GridBagConstraints();
		gbc_lblBaseFact.fill = GridBagConstraints.BOTH;
		gbc_lblBaseFact.insets = new Insets(0, 0, 0, 5);
		gbc_lblBaseFact.gridx = 0;
		gbc_lblBaseFact.gridy = 1;
		panelfact.add(lblBaseFact, gbc_lblBaseFact);

		lblIVAFact = new JLabel("0");
		lblIVAFact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_lblIVAFact = new GridBagConstraints();
		gbc_lblIVAFact.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIVAFact.insets = new Insets(0, 0, 0, 5);
		gbc_lblIVAFact.gridx = 1;
		gbc_lblIVAFact.gridy = 1;
		panelfact.add(lblIVAFact, gbc_lblIVAFact);

		lblTOTALfact = new JLabel("0.0");
		lblTOTALfact.setFont(new Font("Tahoma", Font.BOLD, 18));
		GridBagConstraints gbc_lblTOTALfact = new GridBagConstraints();
		gbc_lblTOTALfact.fill = GridBagConstraints.BOTH;
		gbc_lblTOTALfact.gridx = 2;
		gbc_lblTOTALfact.gridy = 1;
		panelfact.add(lblTOTALfact, gbc_lblTOTALfact);

		lblDESCUENTO = new JLabel("Descuento:");
		lblDESCUENTO.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDESCUENTO.setBackground(Color.WHITE);
		GridBagConstraints gbc_lblDESCUENTO = new GridBagConstraints();
		gbc_lblDESCUENTO.gridwidth = 2;
		gbc_lblDESCUENTO.insets = new Insets(0, 0, 5, 5);
		gbc_lblDESCUENTO.gridx = 2;
		gbc_lblDESCUENTO.gridy = 9;
		panel.add(lblDESCUENTO, gbc_lblDESCUENTO);

		lblDescuento = new JLabel("");
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDescuento.setBackground(Color.WHITE);
		GridBagConstraints gbc_lblDescuento = new GridBagConstraints();
		gbc_lblDescuento.anchor = GridBagConstraints.WEST;
		gbc_lblDescuento.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescuento.gridx = 4;
		gbc_lblDescuento.gridy = 9;
		panel.add(lblDescuento, gbc_lblDescuento);

		lblNewLabel_1 = new JLabel("%");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 5;
		gbc_lblNewLabel_1.gridy = 9;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setBackground(SystemColor.window);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnVolver = new JButton("VOLVER");
		GridBagConstraints gbc_btnVolver = new GridBagConstraints();
		gbc_btnVolver.insets = new Insets(0, 0, 5, 5);
		gbc_btnVolver.gridx = 0;
		gbc_btnVolver.gridy = 10;
		panel.add(btnVolver, gbc_btnVolver);
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.addActionListener(this);

		if (orden != null) {
			// Cargar Vehiculo Seleccionado
			this.orden = orden;
			this.listOT = listOT;
			V = new Vehiculo(orden.getVehiculo());
			/**
			 * asigna datos a los campos de vehiculo segun caso seleccionado
			 */
			lblMatricula.setText(V.getMatricula());
			lblMarca.setText(V.getMarca());
			lblModelo.setText(V.getModelo());
			lblColor.setText(V.getColor());
			lblNum_Bast.setText(V.getNumBast());
			lblFechaitv.setText("ITV: " + V.getFechITV());
			lblKmrecorrido.setText("Kilometraje: " + V.getKM());
			lblCilindrada.setText("Cilindrada: " + V.getCilindrada());
			lblTipocoche.setText("Combustible: " + V.getTipo());

			/**
			 * asigna datos a los campos de cliente segun caso seleccionado
			 */

			C = new Cliente(orden.getCliente());

			lblDNI_Cliente.setText(C.getDni());
			lblNombreCli.setText(C.getNombre());
			lblEmail_Cliente.setText(C.getEmail());
			lblCod_P_Cliente.setText(C.getCodP());
			lblDireccionOdt.setText(C.getDir());

			// Arreglo

			A = new Arreglo(orden.getArreglo());

			lblPrecioMO.setText(A.getPMO() + "€");
			lblHorasMO.setText(A.getHMO() + " hora/s");
			lblDescuento.setText("" + A.getDesc());
			lblBaseTotalMO.setText(redondearDecimales(A.getBaseMO(), 2) + "€");
			lblTOTALIVAMO.setText("" + redondearDecimales((A.getPrecioIVAMO()), 2));
			lblIVAFact.setText("" + A.getIva());
			// Materiales
			int idMat;
			try {
				idMat = formularioOrden.idMat;
			} catch (NullPointerException ae) {
				idMat = orden.getIdRef();
			}
			MS = orden.getMateriales();
			lblSinIVA.setText("" + MS.getPrecioTot());
			lblBaseTotalMat.setText("" + redondearDecimales(MS.getPrecioTotIva(), 2));
			for (int posicion = 0; posicion < orden.getMateriales().getSize(); posicion++) {
				M = new Material(orden.getMaterial(posicion));
				dlmConcepto.addElement(M.getConcepto());
				dlmCantidad.addElement("" + M.getCant());
				dlmPrecio.addElement("" + M.getPrecio());
				dlmBaseTotal.addElement("" + M.getPrecioTot());
				dlmBaseTotalIVA.addElement("" + M.getPrecioTotIVA());

			}
			// Empleados
			lblIdRef.setText("" + orden.getIdRef());
			lblUsuario.setText("" + orden.getEmpleado().getCodEmp());

			try {
				double base = redondearDecimales(M.getPrecioTot() + A.getBaseMO(), 2);
				lblBaseFact.setText("" + base + "€");
				double baseIva = MS.getPrecioTotIva() + A.getPrecioIVAMO();

				baseIva = baseIva - ((baseIva * A.getDesc()) / 100);
				lblTOTALfact.setText("" + redondearDecimales(baseIva, 2) + "€");
			} catch (NullPointerException ae) {
				double base = redondearDecimales(A.getBaseMO(), 2);
				lblBaseFact.setText("" + base + "€");
				double baseIva = A.getPrecioIVAMO();

				baseIva = baseIva - ((baseIva * A.getDesc()) / 100);
				lblTOTALfact.setText("" + redondearDecimales(baseIva, 2) + "€");
			}

		} else {

			// Cargar Vehiculo Seleccionado
			int VehSeleted = formularioOrden.comboVeh.getSelectedIndex();
			V = new Vehiculo((Vehiculo) gestorData.getVehiculo(VehSeleted));
			/**
			 * asigna datos a los campos de vehiculo segun caso seleccionado
			 */
			lblMatricula.setText(V.getMatricula());
			lblMarca.setText(V.getMarca());
			lblModelo.setText(V.getModelo());
			lblColor.setText(V.getColor());
			lblNum_Bast.setText(V.getNumBast());
			lblFechaitv.setText(" " + V.getFechITV());
			lblKmrecorrido.setText("" + V.getKM());
			lblCilindrada.setText("" + V.getCilindrada());
			lblTipocoche.setText("" + V.getTipo());

			/**
			 * asigna datos a los campos de cliente segun caso seleccionado
			 */

			int CliSelected = formularioOrden.comboCli.getSelectedIndex();
			C = new Cliente((Cliente) gestorData.getCliente(CliSelected));

			lblDNI_Cliente.setText(C.getDni());
			lblNombreCli.setText(C.getNombre());
			lblEmail_Cliente.setText(C.getEmail());
			lblCod_P_Cliente.setText(C.getCodP());
			lblDireccionOdt.setText(C.getDir());

			A = new Arreglo((Arreglo) gestorData.getArreglo(0));

			lblPrecioMO.setText(A.getPMO() + "€");
			lblHorasMO.setText(A.getHMO() + " hora/s");
			lblDescuento.setText("" + A.getDesc());
			lblBaseTotalMO.setText(A.getBaseMO() + "€");
			lblTOTALIVAMO.setText(A.getPrecioIVAMO() + "€");
			lblIVAFact.setText("" + A.getIva());
//Materiales
			int idMat = formularioOrden.idMat;
			MS = gestorData.getMateriales(idMat);
			lblSinIVA.setText("" + MS.getPrecioTot());
			lblBaseTotalMat.setText("" + MS.getPrecioTotIva());
			for (int posicion = 0; posicion < gestorData.tamañoArrayMaterial(); posicion++) {
				Material material = new Material(gestorData.getMaterial(posicion));
				dlmConcepto.addElement(material.getConcepto());
				dlmCantidad.addElement("" + material.getCant());
				dlmPrecio.addElement("" + material.getPrecio());
				dlmBaseTotal.addElement("" + material.getPrecioTot());
				dlmBaseTotalIVA.addElement("" + material.getPrecioTotIVA());
			}
			// dlmIVAx100;
			double base = MS.getPrecioTot() + A.getBaseMO();
			lblBaseFact.setText("" + base + "€");
			double baseIva = (MS.getPrecioTotIva() + A.getPrecioIVAMO());
			baseIva = baseIva - ((baseIva * A.getDesc()) / 100);
			lblTOTALfact.setText("" + redondearDecimales(baseIva, 2) + "€");

			int codEmp = Integer.parseInt(formularioOrden.txtCodEmp.getText());
			Empleado empleado = new Empleado(gestorData.getEmpleado(codEmp));
			lblIdRef.setText("" + formularioOrden.idMat);
			lblUsuario.setText("" + empleado.getCodEmp());

			this.orden = new Orden(C, V, A, MS, empleado);
		}

	}

	/**
	 * Método para redondear los decimales de un núero double
	 * 
	 * @param valorInicial    Numero que se introduce inicialmente
	 * @param numeroDecimales Numeros de decimales que quiero que tenga
	 * @return Devueve el resultado redondeado con los decimales correctos
	 */
	public static double redondearDecimales(double valorInicial, int numeroDecimales) {
		double parteEntera, resultado;
		resultado = valorInicial;
		parteEntera = Math.floor(resultado);
		resultado = (resultado - parteEntera) * Math.pow(10, numeroDecimales);
		resultado = Math.round(resultado);
		resultado = (resultado / Math.pow(10, numeroDecimales)) + parteEntera;
		return resultado;
	}

	/**
	 * instancia o de object para la reaccion del objeto variable int con valor 0
	 * para recorrer dlm mas adelante variable int con valor tamaÃ±o del dlm si se
	 * pulsa button aceptar cierra la acrual ventana futura implementacion de codigo
	 * para la recogida de info de lista
	 */
	@Override
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		Object o = ae.getSource();
		/**
		 * Si pulsa el boton finalizar, abrir la clase Factura
		 */
		if (o == btnFinalizar) {
			/**
			 * Instanciar fact como Factura
			 */
			FacturaMain fact = new FacturaMain(gestorData, this);
			fact.setVisible(true);
			AddLoggerInFile.Log("La Orden de trabajo ha sido facturada");
			orden.setFactura(fact);
			gestorData.guardarOrden(orden);
			/**
			 * Asigna los datos de usuario, cliente, vehiculo y arreglo a los de Factura
			 */
		}
		/**
		 * Si pulsa el boton volver, abre la clase MenuAtClientes y cierra esta clase
		 */
		else if (o == btnVolver) {
			if (formularioOrden != null) {
				dispose();
			} else {
				listOT = new ListadoOrdenesTrabajo(gestorData, listOT.empleado);
				dispose();
			}

		}

	}

}
