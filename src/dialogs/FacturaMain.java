package dialogs;

/**
 * @autor Grupo_4
 */

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import Datos.Arreglo;
import Datos.Cliente;
import Datos.GestorData;
import Datos.Material;
import Datos.Materiales;
import Datos.Vehiculo;

import java.awt.SystemColor;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */
public class FacturaMain extends JFrame implements ActionListener {
	/**
	 * @serial correcto funcionamiento de los calculos JPanel,JButton,JLabel:
	 *         declarados private se da su uso en la misma clase, no necesita
	 *         llamadas externas
	 */
	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial correcto funcionamiento de los calculos
	 */
	private JPanel Menu;
	private JPanel DatosTaller;
	private JPanel AccesoVehiculos;
	private JPanel DatosCliente;
	private JPanel panel_Listas;
	public JLabel lblMatricula;
	private JLabel lblDirr_Taller;
	private JLabel lblNombre_2;
	private JLabel lblDireccin;
	private JLabel lblCod_P_Cliente_1;
	private JLabel lblEmail_Cliente_1;
	private JLabel lblDNI_Cliente_1;
	private JLabel lblTipoDeCoche;
	private JLabel lblCilindrada_2;
	private JLabel lblKmRecorridos;
	private JLabel lblFechaItv;
	private JLabel lblMatrcula;
	private JLabel lblMarca_2;
	private JLabel lblModelo_2;
	private JLabel lblColor_2;
	private JLabel lblNum_Bast_1;
	private JLabel lblNum_Fact_1;
	public JLabel lblUsuario;
	/**
	 * lblUsuario: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblNombre;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblFinalFact;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblBaseFact;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblIVAFact;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public DefaultListModel<String> dlmConceptoFact;
	/**
	 * DefaultListModel: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public JList<String> lstConceptoFact;
	/**
	 * JList: declarados public se da uso en clases externas y son modeficadas desde
	 * otras clases
	 */
	public DefaultListModel<String> dlmCantidadFact;
	/**
	 * DefaultListModel: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public JList<String> lstCantidadFact;
	/**
	 * JList: declarados public se da uso en clases externas y son modeficadas desde
	 * otras clases
	 */
	public DefaultListModel<String> dlmPrecioFact;
	/**
	 * DefaultListModel: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public JList<String> lstPrecioFact;
	/**
	 * JList: declarados public se da uso en clases externas y son modeficadas desde
	 * otras clases
	 */
	public DefaultListModel<String> dlmIVAFact;
	/**
	 * JList: declarados public se da uso en clases externas y son modeficadas desde
	 * otras clases
	 */
	public DefaultListModel<String> dlmBaseTotal;
	/**
	 * dlmBaseTotal: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public JList<String> lstBaseTotal;
	/**
	 * lstBaseTotal: declarados public se da uso en clases externas y son
	 * modeficadas desde otras clases
	 */
	public DefaultListModel<String> dlmBaseFact;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JList<String> lstBaseFact;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblMarca;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblModelo;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblColor;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblNum_Bast;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblFechaitv;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblCilindrada;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblTipocoche;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblKmrecorrido;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblDireccion;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblCod_P_Cliente;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblEmail_Cliente;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblDNI_Cliente;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblNum_Fact;
	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */
	public JLabel lblDescuento;
	private JLabel lblBaseFact_1;
	private JLabel lblFinalFact_1;
	private JLabel lblNewLabel_3;

	/**
	 * JLabel: declarados public se da uso en clases externas y son modeficadas
	 * desde otras clases
	 */

	/**
	 * Crea la frame de la clase.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })

	public FacturaMain(GestorData gestorData, OrdenesTrabajo ordenesTrabajo) {
		initFactura(gestorData, ordenesTrabajo);
	}

	public void initFactura(GestorData gestorData, OrdenesTrabajo ordenesTrabajo) {
		setBackground(Color.WHITE);
		setAlwaysOnTop(true);
		setResizable(false);
		setTitle("Factura");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 843, 739);

		setSize(856, 717);

		setLocationRelativeTo(null);
		setVisible(true);

		Menu = new JPanel();
		Menu.setBackground(Color.WHITE);
		Menu.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Menu);
		Menu.setLayout(null);

		DatosTaller = new JPanel();
		DatosTaller.setForeground(SystemColor.inactiveCaption);
		DatosTaller.setBorder(new LineBorder(SystemColor.textHighlight, 2, true));
		DatosTaller.setBackground(Color.WHITE);
		DatosTaller.setBounds(10, 10, 809, 89);
		Menu.add(DatosTaller);
		DatosTaller.setLayout(null);

		lblDirr_Taller = new JLabel("Poligono Lezama, Araba Kalea, Pabellon 15, A, ");
		lblDirr_Taller.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDirr_Taller.setBounds(10, 10, 322, 13);
		DatosTaller.add(lblDirr_Taller);

		JLabel lblCod_P_Taller = new JLabel("48450");
		lblCod_P_Taller.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCod_P_Taller.setBounds(10, 29, 65, 12);
		DatosTaller.add(lblCod_P_Taller);

		JLabel lblTelf_Taller = new JLabel("+34 946946946");
		lblTelf_Taller.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTelf_Taller.setBounds(10, 47, 165, 21);
		DatosTaller.add(lblTelf_Taller);

		JLabel lblEmail_Taller = new JLabel("contact@recordautoak.com");
		lblEmail_Taller.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail_Taller.setBounds(10, 66, 322, 21);
		DatosTaller.add(lblEmail_Taller);

		lblNum_Fact_1 = new JLabel("Num factura:");
		lblNum_Fact_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum_Fact_1.setBounds(508, 4, 150, 25);
		DatosTaller.add(lblNum_Fact_1);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsuario.setBounds(508, 29, 163, 25);
		DatosTaller.add(lblUsuario);

		AccesoVehiculos = new JPanel();
		AccesoVehiculos.setBorder(new MatteBorder(2, 0, 2, 2, (Color) SystemColor.textHighlight));
		AccesoVehiculos.setBackground(Color.WHITE);
		AccesoVehiculos.setLayout(null);
		AccesoVehiculos.setBounds(334, 101, 485, 139);
		Menu.add(AccesoVehiculos);

		lblMatricula = new JLabel("");
		lblMatricula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatricula.setBounds(98, 10, 140, 13);
		AccesoVehiculos.add(lblMatricula);

		lblMarca = new JLabel("");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca.setBounds(98, 33, 114, 13);
		AccesoVehiculos.add(lblMarca);

		lblModelo = new JLabel("");
		lblModelo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo.setBounds(98, 57, 100, 13);
		AccesoVehiculos.add(lblModelo);

		lblColor = new JLabel("");
		lblColor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColor.setBounds(98, 83, 81, 13);
		AccesoVehiculos.add(lblColor);

		lblNum_Bast = new JLabel("");
		lblNum_Bast.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum_Bast.setBounds(109, 116, 172, 13);
		AccesoVehiculos.add(lblNum_Bast);

		lblFechaitv = new JLabel("");
		lblFechaitv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaitv.setBounds(378, 10, 94, 13);
		AccesoVehiculos.add(lblFechaitv);

		lblKmrecorrido = new JLabel("");
		lblKmrecorrido.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKmrecorrido.setBounds(378, 33, 94, 13);
		AccesoVehiculos.add(lblKmrecorrido);

		lblCilindrada = new JLabel("");
		lblCilindrada.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCilindrada.setBounds(355, 57, 81, 13);
		AccesoVehiculos.add(lblCilindrada);

		lblTipocoche = new JLabel("");
		lblTipocoche.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipocoche.setBounds(318, 80, 134, 19);
		AccesoVehiculos.add(lblTipocoche);

		lblTipoDeCoche = new JLabel("Tipo:");
		lblTipoDeCoche.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTipoDeCoche.setBounds(264, 80, 44, 19);
		AccesoVehiculos.add(lblTipoDeCoche);

		lblCilindrada_2 = new JLabel("Cilindrada:");
		lblCilindrada_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCilindrada_2.setBounds(264, 56, 81, 13);
		AccesoVehiculos.add(lblCilindrada_2);

		lblKmRecorridos = new JLabel("KM recorridos:");
		lblKmRecorridos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblKmRecorridos.setBounds(264, 33, 114, 13);
		AccesoVehiculos.add(lblKmRecorridos);

		lblFechaItv = new JLabel("Fecha ITV:");
		lblFechaItv.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFechaItv.setBounds(264, 10, 94, 13);
		AccesoVehiculos.add(lblFechaItv);

		lblMatrcula = new JLabel("Matricula:");
		lblMatrcula.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMatrcula.setBounds(0, 10, 70, 13);
		AccesoVehiculos.add(lblMatrcula);

		lblMarca_2 = new JLabel("Marca:");
		lblMarca_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMarca_2.setBounds(0, 33, 50, 13);
		AccesoVehiculos.add(lblMarca_2);

		lblModelo_2 = new JLabel("Modelo:");
		lblModelo_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblModelo_2.setBounds(0, 57, 70, 13);
		AccesoVehiculos.add(lblModelo_2);

		lblColor_2 = new JLabel("Color:");
		lblColor_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblColor_2.setBounds(0, 86, 44, 13);
		AccesoVehiculos.add(lblColor_2);

		lblNum_Bast_1 = new JLabel("Num bastidor:");
		lblNum_Bast_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNum_Bast_1.setBounds(0, 116, 119, 13);
		AccesoVehiculos.add(lblNum_Bast_1);

		DatosCliente = new JPanel();
		DatosCliente.setBorder(new MatteBorder(2, 2, 2, 0, (Color) SystemColor.textHighlight));
		DatosCliente.setBackground(Color.WHITE);
		DatosCliente.setLayout(null);
		DatosCliente.setBounds(10, 101, 325, 139);
		Menu.add(DatosCliente);

		lblNombre = new JLabel("");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre.setBounds(81, 11, 119, 19);
		DatosCliente.add(lblNombre);

		lblDireccion = new JLabel("");
		lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDireccion.setBounds(81, 41, 198, 19);
		DatosCliente.add(lblDireccion);

		lblCod_P_Cliente = new JLabel("");
		lblCod_P_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCod_P_Cliente.setBounds(105, 55, 119, 31);
		DatosCliente.add(lblCod_P_Cliente);

		lblEmail_Cliente = new JLabel("");
		lblEmail_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail_Cliente.setBounds(61, 84, 198, 31);
		DatosCliente.add(lblEmail_Cliente);

		lblDNI_Cliente = new JLabel("");
		lblDNI_Cliente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI_Cliente.setBounds(48, 115, 173, 15);
		DatosCliente.add(lblDNI_Cliente);

		lblNombre_2 = new JLabel("Nombre:");
		lblNombre_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombre_2.setBounds(10, 11, 87, 19);
		DatosCliente.add(lblNombre_2);

		lblDireccin = new JLabel("Direccion:");
		lblDireccin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDireccin.setBounds(10, 36, 87, 19);
		DatosCliente.add(lblDireccin);

		lblCod_P_Cliente_1 = new JLabel("Codigo postal:");
		lblCod_P_Cliente_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCod_P_Cliente_1.setBounds(10, 55, 98, 31);
		DatosCliente.add(lblCod_P_Cliente_1);

		lblEmail_Cliente_1 = new JLabel("Email:");
		lblEmail_Cliente_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEmail_Cliente_1.setBounds(10, 84, 54, 31);
		DatosCliente.add(lblEmail_Cliente_1);

		lblDNI_Cliente_1 = new JLabel("DNI:");
		lblDNI_Cliente_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDNI_Cliente_1.setBounds(10, 115, 54, 15);
		DatosCliente.add(lblDNI_Cliente_1);

		panel_Listas = new JPanel();
		panel_Listas.setBorder(new MatteBorder(3, 0, 3, 0, (Color) SystemColor.textHighlight));
		panel_Listas.setForeground(new Color(244, 164, 96));
		panel_Listas.setBackground(Color.WHITE);
		panel_Listas.setBounds(10, 250, 809, 293);
		Menu.add(panel_Listas);
		panel_Listas.setLayout(null);

		lstConceptoFact = new JList<String>();
		dlmConceptoFact = new DefaultListModel<String>();

		lstConceptoFact.setModel(dlmConceptoFact);

		lstConceptoFact.setEnabled(false);
		lstConceptoFact.setBounds(10, 54, 222, 229);
		panel_Listas.add(lstConceptoFact);

		lstCantidadFact = new JList<String>();
		dlmCantidadFact = new DefaultListModel<String>();
		lstCantidadFact.setModel(dlmCantidadFact);
		lstCantidadFact.setEnabled(false);
		lstCantidadFact.setBounds(323, 54, 63, 229);
		lstCantidadFact.setBackground(Color.WHITE);
		panel_Listas.add(lstCantidadFact);

		lstPrecioFact = new JList<String>();
		dlmPrecioFact = new DefaultListModel<String>();
		lstPrecioFact.setModel(dlmPrecioFact);
		lstPrecioFact.setEnabled(false);
		lstPrecioFact.setBounds(392, 54, 63, 229);
		lstPrecioFact.setValueIsAdjusting(true);
		lstPrecioFact.setBackground(Color.WHITE);
		lstPrecioFact.setForeground(Color.WHITE);
		panel_Listas.add(lstPrecioFact);
		dlmIVAFact = new DefaultListModel<String>();

		lstBaseTotal = new JList<String>();
		dlmBaseTotal = new DefaultListModel<String>();
		lstBaseTotal.setModel(dlmBaseTotal);
		lstBaseTotal.setBounds(538, 54, 71, 229);
		panel_Listas.add(lstBaseTotal);

		lstBaseFact = new JList<String>();
		dlmBaseFact = new DefaultListModel<String>();
		lstBaseFact.setModel(dlmBaseFact);
		lstBaseFact.setEnabled(false);
		lstBaseFact.setBounds(654, 54, 84, 229);
		panel_Listas.add(lstBaseFact);

		JLabel lblCONCEPTO = new JLabel("Concepto:");
		lblCONCEPTO.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCONCEPTO.setBounds(10, 21, 99, 23);
		panel_Listas.add(lblCONCEPTO);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCantidad.setBounds(323, 24, 71, 17);
		panel_Listas.add(lblCantidad);

		JLabel lblPRECIO = new JLabel("Precio:");
		lblPRECIO.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPRECIO.setBounds(404, 21, 63, 23);
		panel_Listas.add(lblPRECIO);

		JLabel lblPrecioBase = new JLabel("Precio Base:");
		lblPrecioBase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrecioBase.setBounds(658, 21, 105, 23);
		panel_Listas.add(lblPrecioBase);

		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblBase.setBounds(538, 26, 45, 13);
		panel_Listas.add(lblBase);

		JPanel panel = new JPanel();
		panel.setBounds(283, 553, 536, 127);
		Menu.add(panel);
		panel.setBackground(Color.WHITE);
		panel.setLayout(null);

		lblFinalFact = new JLabel("TOTAL");
		lblFinalFact.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFinalFact.setBounds(378, 43, 91, 26);
		panel.add(lblFinalFact);

		lblIVAFact = new JLabel("%IVA");
		lblIVAFact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIVAFact.setBounds(219, 51, 52, 13);
		panel.add(lblIVAFact);

		lblBaseFact = new JLabel("BASE");
		lblBaseFact.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBaseFact.setBounds(281, 43, 76, 26);
		panel.add(lblBaseFact);

		lblDescuento = new JLabel("");
		lblDescuento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDescuento.setBounds(28, 44, 147, 26);
		panel.add(lblDescuento);

		lblBaseFact_1 = new JLabel("BASE");
		lblBaseFact_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblBaseFact_1.setBounds(281, 10, 76, 26);
		panel.add(lblBaseFact_1);

		lblFinalFact_1 = new JLabel("TOTAL");
		lblFinalFact_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblFinalFact_1.setBounds(378, 10, 120, 26);
		panel.add(lblFinalFact_1);

		lblNewLabel_3 = new JLabel("I.V.A.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(219, 13, 49, 23);
		panel.add(lblNewLabel_3);

		Vehiculo vehiculo = new Vehiculo(ordenesTrabajo.V);
		/**
		 * asigna datos a los campos de vehiculo segun caso seleccionado
		 */
		lblMatricula.setText(vehiculo.getMatricula());
		lblMarca.setText(vehiculo.getMarca());
		lblModelo.setText(vehiculo.getModelo());
		lblColor.setText(vehiculo.getColor());
		lblNum_Bast.setText(vehiculo.getNumBast());
		lblFechaitv.setText("" + vehiculo.getFechITV());
		lblKmrecorrido.setText("" + vehiculo.getKM());
		lblCilindrada.setText(vehiculo.getCilindrada());
		lblTipocoche.setText(vehiculo.getTipo());

		/**
		 * asigna datos a los campos de cliente segun caso seleccionado
		 */

		Cliente C = new Cliente(ordenesTrabajo.C);

		lblDNI_Cliente.setText(C.getDni());
		lblNombre.setText(C.getNombre());
		lblEmail_Cliente.setText(C.getEmail());
		lblCod_P_Cliente.setText(C.getCodP());
		lblDireccion.setText(C.getDir());

		// Arreglo

		Arreglo A = new Arreglo(ordenesTrabajo.A);

		dlmPrecioFact.addElement(A.getPMO() + "€");
		dlmCantidadFact.addElement(A.getHMO() + " hora/s");
		dlmConceptoFact.addElement("Mano de Obra");
		lblDescuento.setText("Descuento: " + A.getDesc() + "%");
		dlmBaseTotal.add(0, A.getBaseMO() + "€");
		dlmBaseFact.addElement(A.getPrecioIVAMO() + "€");
		lblIVAFact.setText("" + A.getIva());
		
		Materiales MS = ordenesTrabajo.MS;

		for (int posicion = 0; posicion < MS.getSize(); posicion++) {
			Material M = new Material(MS.getMaterial(posicion));
			dlmConceptoFact.addElement(M.getConcepto());
			dlmCantidadFact.addElement("" + M.getCant());
			dlmPrecioFact.addElement("" + M.getPrecio());
			dlmBaseTotal.addElement("" + M.getPrecioTot());
			dlmBaseFact.addElement("" + M.getPrecioTotIVA());
		}
		lblBaseFact.setText("" + ordenesTrabajo.lblBaseFact.getText() + "");
		lblFinalFact.setText("" + ordenesTrabajo.lblTOTALfact.getText() + "");

		// Empleados

		lblUsuario.setText("Usuario: " + ordenesTrabajo.lblUsuario.getText());

		lblNum_Fact_1.setText("Numero factura: " + ordenesTrabajo.lblIdRef.getText());

		double baseIva = MS.getPrecioTotIva() + A.getPrecioIVAMO();
		baseIva = baseIva - ((baseIva * A.getDesc()) / 100);

	}

	/**
	 * Método actionerformed
	 * 
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * fase de pruebas, para implementar mas adelante escucha de eventos
		 */
		@SuppressWarnings("unused")
		Object o = e.getSource();
	}
}
