package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.Aspirante;
import Logico.Bolsa;
import Logico.Empresa;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListarEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private static DefaultTableModel model;
	private static Object rows[];
	private JButton btnListarOfertaLaboral;
	private JButton btnCrearOfertaLaboral;
	private Empresa selected = null;
	private JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarEmpresa dialog = new ListarEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarEmpresa() {
		setTitle("Lista de Empresas");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(new BorderLayout(0, 0));
			{
				JScrollPane scrollPane = new JScrollPane();
				panel.add(scrollPane, BorderLayout.CENTER);
				{
					String headers[] = {"RNC", "Nombre", "Dirección", "Telefono"};
					model = new DefaultTableModel();
					model.setColumnIdentifiers(headers);
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							int index = -1;
							index = table.getSelectedRow();
							if(index !=-1) {
								btnCrearOfertaLaboral.setEnabled(true);
								btnListarOfertaLaboral.setEnabled(true);
								String rnc = (String)model.getValueAt(index, 0);
								selected = Bolsa.getInstance().buscarEmpresa(rnc);
							}
						}
					});
					table.setModel(model);
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnListarOfertaLaboral = new JButton("Listar Oferta Laboral");
				btnListarOfertaLaboral.setEnabled(false);
				buttonPane.add(btnListarOfertaLaboral);
			}
			{
				btnCrearOfertaLaboral = new JButton("Crear Oferta Laboral");
				btnCrearOfertaLaboral.setEnabled(false);
				btnCrearOfertaLaboral.setActionCommand("OK");
				buttonPane.add(btnCrearOfertaLaboral);
				getRootPane().setDefaultButton(btnCrearOfertaLaboral);
			}
			{
				btnSalir = new JButton("Salir");
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
		loadtable();
	}

	private void loadtable() {
		rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		for(int i =0; i<Bolsa.getInstance().getEmpresas().size();i++) {
			rows[0] = Bolsa.getInstance().getEmpresas().get(i).getRNC();
			rows[1] = Bolsa.getInstance().getEmpresas().get(i).getNombre();
			rows[2] = Bolsa.getInstance().getEmpresas().get(i).getTelefono();
			rows[3] = Bolsa.getInstance().getEmpresas().get(i).getDireccion();
			
			model.addRow(rows);
		}
		
	}

}