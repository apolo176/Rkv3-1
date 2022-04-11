package Listados;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Datos.Empleado;
import Datos.GestorData;
import Datos.Orden;
import Forms.FormularioOrden;
import Forms.Login;
import dialogs.MenuAdmin;
import dialogs.OrdenesTrabajo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

/**
 * 
 * @author Grupo_4
 * @version 5.1.2
 *
 */

public class ListadoOrdenesTrabajo extends JFrame implements ActionListener, WindowListener {

	private static final long serialVersionUID = 1531539371445418371L;
	/**
	 * @serial evita fallo en calculo de variables
	 * 
	 */
	public static DefaultListModel<String> dlmOrdenes;
	/**
	 * DefaultListModel: public se da uso en clases extenas y son modificadas desde
	 * fuera
	 */
	public static DefaultListModel<String> dlmNombre;
	/**
	 * DefaultListModel: public se da uso en clases extenas y son modificadas desde
	 * fuera
	 */
	public static DefaultListModel<String> dlmPrecio;
	/**
	 * DefaultListModel: public se da uso en clases extenas y son modificadas desde
	 * fuera
	 */
	public static DefaultListModel<String> dlmCant;
	/**
	 * DefaultListModel: public se da uso en clases extenas y son modificadas desde
	 * fuera
	 */
	private JButton btnVolver;
	private JButton btnInfoOrden;
	/**
	 * JComboBox: public se da uso en clases extenas y son modificadas desde fuera
	 */
	private JPanel Factura;
	private JPanel panelAbajo;
	private JPanel panel;
	private JLabel lblBienvenidoMecanico;
	private JLabel lblNewLabel;
	private GestorData gestorData;
	private FormularioOrden formularioOrden;
	private JScrollPane scrollPane;
	private JTable tableOrdenes;
	private DefaultTableModel dtmOrdenes;
	public Empleado empleado;
	private JButton btnOrdenar;
	private JComboBox<String> comboBoxOrdenar;
	private JButton btnBorrar;

	/**
	 * Launch the application.
	 */

	/**
	 * Se crea el Frame de la clase.
	 * 

	 */
	public ListadoOrdenesTrabajo(GestorData gestorData, FormularioOrden dialogoOrden) {
		initListadoOrdenesTrabajo(gestorData, dialogoOrden, null);
	}

	public ListadoOrdenesTrabajo(GestorData gestorData, Empleado empleado) {
		initListadoOrdenesTrabajo(gestorData, null, empleado);
	}

	public void initListadoOrdenesTrabajo(GestorData gestorData, FormularioOrden formularioOrden, Empleado empleado) {

		setBackground(SystemColor.window);
		setTitle("LISTA_Ordenes");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		addWindowListener(this);
		setBounds(100, 100, 608, 430);
		Factura = new JPanel();
		Factura.setBackground(SystemColor.window);
		Factura.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Factura);
		Factura.setLayout(new BorderLayout(0, 0));

		setSize(789, 531);

		setLocationRelativeTo(null);
		setVisible(true);

		panelAbajo = new JPanel();
		panelAbajo.setBackground(SystemColor.window);
		Factura.add(panelAbajo, BorderLayout.SOUTH);
		btnVolver = new JButton("VOLVER");
		btnVolver.setForeground(SystemColor.window);
		btnVolver.setBackground(SystemColor.textHighlight);
		btnVolver.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnVolver.addActionListener(this);
		panelAbajo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panelAbajo.add(btnVolver);

		btnOrdenar = new JButton("ORDENAR");
		btnOrdenar.addActionListener(this);

		btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(this);

		btnBorrar.setForeground(Color.WHITE);
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBorrar.setBackground(SystemColor.textHighlight);
		panelAbajo.add(btnBorrar);
		btnOrdenar.setForeground(Color.WHITE);
		btnOrdenar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnOrdenar.setBackground(SystemColor.textHighlight);
		panelAbajo.add(btnOrdenar);

		comboBoxOrdenar = new JComboBox<String>();
		comboBoxOrdenar.setModel(new DefaultComboBoxModel<String>(new String[] { "ID.REF", "COD.EMP" }));
		panelAbajo.add(comboBoxOrdenar);
		comboBoxOrdenar.addActionListener(this);

		btnInfoOrden = new JButton("ACCEDER");
		btnInfoOrden.setForeground(SystemColor.window);
		btnInfoOrden.setBackground(SystemColor.textHighlight);
		btnInfoOrden.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelAbajo.add(btnInfoOrden);
		btnInfoOrden.addActionListener(this);
		dlmOrdenes = new DefaultListModel<String>();

		panel = new JPanel();
		panel.setBackground(SystemColor.window);
		Factura.add(panel, BorderLayout.CENTER);

		lblBienvenidoMecanico = new JLabel("Bienvenido");
		lblBienvenidoMecanico.setFont(new Font("Tahoma", Font.BOLD, 17));

		lblNewLabel = new JLabel("Listado de Ordenes de trabajo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 21));

		String[] columnNames = new String[] { "idRef", "Cliente", "Vehiculo", "Terminada", "Codigo Empleado" };
		String[][] data = null;
		dtmOrdenes = obtenerModelSoloLectura(data, columnNames);

		tableOrdenes = new JTable(dtmOrdenes);
		tableOrdenes.setModel(dtmOrdenes);
		scrollPane = new JScrollPane(tableOrdenes);
		scrollPane.setViewportBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(30, 144, 255),
				new Color(30, 144, 255), new Color(30, 144, 255), new Color(30, 144, 255)));
		scrollPane.setToolTipText("");
		scrollPane.setEnabled(false);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(337).addComponent(lblBienvenidoMecanico))
				.addGroup(gl_panel.createSequentialGroup().addGap(226).addComponent(lblNewLabel))
				.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 765, GroupLayout.PREFERRED_SIZE));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(
				gl_panel.createSequentialGroup().addComponent(lblBienvenidoMecanico).addGap(5).addComponent(lblNewLabel)
						.addGap(5).addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)));
		panel.setLayout(gl_panel);

		this.empleado = empleado;
		this.gestorData = gestorData;
		leerOrdenes();

		if (formularioOrden != null) {
			this.formularioOrden = formularioOrden;
		} else if (empleado != null) {

			if (empleado.getTipo().equals("admin")) {

				loadOrdenes();
			} else {
				loadOrdenesEmpleado(empleado.getCodEmp());

			}
		} else {
			loadOrdenes();
		}
	}

	/**
	 * Método para que cuando se desea salir de la aplicación aparezca un mensaje
	 * con las opciones "guardar", "no guardar" y "cancelar". Si decide guardar se
	 * guardan los datos en el fichero. Si decide no guardar, sale sin guardar. Si
	 * decide cancelar, vuelve al listado.
	 */

	private void close() {
		// Si han sido modificados

		String[] opciones = { "Guardar", "No Guardar", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(this, "¿Desea Guardar?", "Cuadro de Diálogo Cerrar",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		switch (opcion) {
		case 0:
			// Si se pulsa guardar
			// ESCRITURA
			// gestorData.deleteFich("Ordenes.dat");

			for (int i = dtmOrdenes.getRowCount() - 1; i > 0; i--) {
				dtmOrdenes.removeRow(i);
				Orden orden = new Orden(gestorData.getOrden(i));
				gestorData.escribirFichTrue("Ordenes.dat", orden);
			}
			System.exit(0);

			break;

		case 1:
			// Si se pulsa No Guardar
			System.exit(0);
			break;

		case 2:
			return;
		}

	}

	/**
	 * Método para que cuando se desea volver a la ventana anterior aparezca un
	 * mensaje con las opciones "guardar", "no guardar" y "cancelar". Si decide
	 * guardar se guardan los datos en el fichero. Si decide no guardar, sale sin
	 * guardar. Si decide cancelar, vuelve al listado.
	 */

	private void volver() {
		// Si han sido modificados

		String[] opciones = { "Guardar", "No Guardar", "Cancelar" };
		int opcion = JOptionPane.showOptionDialog(this, "¿Desea Guardar?", "Cuadro de Diálogo Volver",
				JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		switch (opcion) {
		case 0:
			// Si se pulsa guardar
			// ESCRITURA
			// gestorData.deleteFich("Ordenes.dat");
			if (empleado == null || empleado.getTipo().equals("admin")) {
				for (int i = gestorData.tamañoArrayOrdenes() - 1; i > 0; i--) {
					dtmOrdenes.removeRow(i);
					Orden orden = new Orden(gestorData.getOrden(i));
					gestorData.escribirFichTrue("Ordenes.dat", orden);
				}
			} else {
				for (int i = dtmOrdenes.getRowCount() - 1; i >= 0; i--) {

					Orden orden = new Orden(gestorData.getOrden(i));
					gestorData.escribirFichTrue("Ordenes.dat", orden);
					dtmOrdenes.removeRow(i);
				}
			}

			break;

		case 1:
			// Si se pulsa No Guardar

			break;

		case 2:
			return;
		}

	}

	/**
	 * Método para cargar cada orden de trabajo del empleado correcto del array
	 * creado y poder pasarlo a la tabla
	 * 
	 * @param codEmp
	 */

	private void loadOrdenesEmpleado(int codEmp) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		String numBast = "";
		String dniCli = "";

		String idOrden = "";
		boolean terminada;

		for (int i = 0; i < gestorData.tamañoArrayOrdenes(); i++) {

			dniCli = gestorData.getOrden(i).getCliente().getDni();
			numBast = gestorData.getOrden(i).getVehiculo().getNumBast();

			idOrden = "" + gestorData.getOrden(i).getIdRef();

			if (gestorData.getOrden(i).getFactura() != null) {
				terminada = true;
			} else {
				terminada = false;
			}

			if (codEmp == gestorData.getOrden(i).getEmpleado().getCodEmp()) {
				String[] rowData = new String[] { idOrden, dniCli, numBast, "" + terminada, "" + codEmp };

				dtmOrdenes.addRow(rowData);
			}

		}
	}

	/**
	 * Método para definir un modelo de tabla personalizado
	 * 
	 * @param data    Datos que se cargan a la tabla
	 * @param columns Columnas de la tabla
	 * @return DefautTableModel notEditable
	 */
	private DefaultTableModel obtenerModelSoloLectura(Object[][] data, String[] columns) {
		return new DefaultTableModel(data, columns) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
	}

	/**
	 * Método para cargar todas las ordenes de trabajo del array creado y poder
	 * pasarlo a la tabla
	 */

	private void loadOrdenes() {
		// TODO Auto-generated method stub

		String numBast = "";
		String dniCli = "";
		String materiales = "";
		String idOrden = "";
		boolean terminada;
		int codEmp = 0;

		for (int i = 0; i < gestorData.tamañoArrayOrdenes(); i++) {
			codEmp = gestorData.getOrden(i).getEmpleado().getCodEmp();
			dniCli = gestorData.getOrden(i).getCliente().getDni();
			numBast = gestorData.getOrden(i).getVehiculo().getNumBast();

			materiales = "" + gestorData.getOrden(i).getMateriales().getIdMat();
			idOrden = "" + gestorData.getOrden(i).getIdRef();
			if (gestorData.getOrden(i).getFactura() != null) {
				terminada = true;
			} else {
				terminada = false;
			}

			String[] rowData = new String[] { idOrden, dniCli, numBast, "" + terminada, "" + codEmp };

			dtmOrdenes.addRow(rowData);
		}

	}

	/**
	 * Método para cargar el fichero y pasar los datos a un array
	 */

	public void leerOrdenes() {
		if (gestorData.getOrdenes().isEmpty()) {

			FileInputStream fis;
			ObjectInputStream ois;
			Orden orden = new Orden();

			try {
				fis = new FileInputStream("Ordenes.dat");

				while (fis.available() > 0) {
					ois = new ObjectInputStream(fis);
					orden = (Orden) ois.readObject();

					gestorData.guardarOrden(orden);

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

	/**
	 * Metodo ActionPerformed. @Param event
	 */
//	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * @param ActionEvent
		 */
		Object o = e.getSource();
		if (o == btnVolver) {
			if (empleado != null) {
				if (empleado.getTipo().equals("admin")) {
					volver();
					MenuAdmin aL = new MenuAdmin(gestorData, empleado);
					aL.setVisible(true);
					dispose();
				} else {
					volver();
					Login login = new Login();
					login.setVisible(true);
					dispose();
				}
			} else {
				volver();
				MenuAdmin aL = new MenuAdmin(gestorData);
				aL.setVisible(true);
				dispose();
			}
		}
		if (o == btnBorrar) {
			int orden = tableOrdenes.getSelectedRow();
			if (orden == -1) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione una orden", "ERROR", JOptionPane.ERROR_MESSAGE);

			} else {
				gestorData.removeOrden(orden);
				dtmOrdenes.removeRow(orden);

			}
		}
		if (o == btnOrdenar) {
			// selecciono el indice 0 del combobox
			if (comboBoxOrdenar.getSelectedIndex() == 0) {
				ArrayList<Orden> arrayOrdenes = new ArrayList<Orden>();

				arrayOrdenes = gestorData.getOrdenes();
				Orden orden = new Orden();

				Collections.sort(gestorData.getOrdenes());
				for (int posicion = dtmOrdenes.getRowCount() - 1; posicion >= 0; posicion--) {
					orden = gestorData.getOrdenes().get(posicion);
					orden.getIdRef();
					dtmOrdenes.removeRow(posicion);

				}
				if (empleado.getTipo().equals("admin")) {
					loadOrdenes();
					
				} else {
					loadOrdenesEmpleado(orden.getEmpleado().getCodEmp());
				}
			}
			if (comboBoxOrdenar.getSelectedIndex() == 1) {
				ArrayList<Orden> arrayOrdenes = new ArrayList<Orden>();

				arrayOrdenes = gestorData.getOrdenes();
				Orden orden = new Orden();

				Collections.sort(gestorData.getOrdenes(), new Comparator<Orden>() {
					@Override
					public int compare(Orden o1, Orden o2) {

						if (o1.getEmpleado().getCodEmp() == o2.getEmpleado().getCodEmp()) {
							return 0;
						}
						if (o1.getEmpleado().getCodEmp() > o2.getEmpleado().getCodEmp()) {
							return 1;
						}

						if (o1.getEmpleado().getCodEmp() < o2.getEmpleado().getCodEmp()) {
							return -1;
						}
						return 2;
					}
				});
				for (int posicion = dtmOrdenes.getRowCount() - 1; posicion >= 0; posicion--) {
					orden = gestorData.getOrdenes().get(posicion);
					orden.getIdRef();
					dtmOrdenes.removeRow(posicion);

				}
				if (empleado.getTipo().equals("admin")) {
					loadOrdenes();
					
				} else {
					loadOrdenesEmpleado(orden.getEmpleado().getCodEmp());
				}

			}

		}

//		/**
//		 * Si se pulsa el boton btnInfoCliente
//		 */
//
		if (o == btnInfoOrden) {
			/* Acceder a cliente */
			Orden orden = new Orden();
			try {

				orden = new Orden(gestorData.getOrdenes().get(tableOrdenes.getSelectedRow()));
				OrdenesTrabajo ordenTrabajo = new OrdenesTrabajo(gestorData, this, orden);
				if (empleado.getTipo().equals("admin")) {
					ordenTrabajo.btnFinalizar.setEnabled(true);
				}
				ordenTrabajo.lblUsuario.setText("" + orden.getEmpleado().getCodEmp());
				ordenTrabajo.setVisible(true);
			} catch (IndexOutOfBoundsException ae) {
				JOptionPane.showMessageDialog(this, (String) "Seleccione una Orden", "Error", JOptionPane.ERROR_MESSAGE);

			}
			dispose();

		}
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	/**
	 * Método windowClosing Para utilizar el método close() al cerrar la ventana
	 */
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		close();
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}
}
