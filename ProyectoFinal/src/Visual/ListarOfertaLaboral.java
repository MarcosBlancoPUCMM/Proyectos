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

public class ListarOfertaLaboral extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private static DefaultTableModel model;
	private static Object rows[];
	private JButton btnListarSolicitudLaboral;
	private JButton btnCrearSolicitudLaboral;
	private Empresa selected = null;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 * @param empresa 
	 */
	public ListarOfertaLaboral(Empresa empresa) {
		setTitle("Lista de Ofertas Laborales");
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
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
					String headers[] = {"Nombre", "Edad mínima", "Microsoft Office", "Adobe", "Cantidad de aspirantes"};
					model = new DefaultTableModel();
					model.setColumnIdentifiers(headers);
					table = new JTable();
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.setModel(model);
					scrollPane.setViewportView(table);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnContratar = new JButton("Contratar");
				btnContratar.setEnabled(false);
				buttonPane.add(btnContratar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setEnabled(false);
				btnCancelar.setActionCommand("OK");
				buttonPane.add(btnCancelar);
				getRootPane().setDefaultButton(btnCancelar);
			}
			{
				JButton btnSalir = new JButton("Salir");
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
		}
		loadtable();
	}

	private void loadtable() {
		rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		for(int i = 0; i < Bolsa.getInstance().getEmpresas().get(i).getOfertas().size();i++) {
			
				rows[0] = Bolsa.getInstance().getEmpresas().get(i).getOfertas().get(i).getNombre();
			//	rows[1]
		}
		
	}

}