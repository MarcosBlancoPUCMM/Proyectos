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

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarAspirante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private static DefaultTableModel model;
	private static Object rows[];
	private JButton btnListarSolicitudLaboral;
	private JButton btnCrearSolicitudLaboral;
	private Aspirante selected = null;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListarAspirante dialog = new ListarAspirante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListarAspirante() {
		setTitle("Lista de Aspirantes");
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
					String headers[] = {"Cédula", "Nombre", "Apellidos", "Edad", "Estado"};
					
					model = new DefaultTableModel();
					model.setColumnIdentifiers(headers);
					table = new JTable();
					table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							int index = -1;
							index = table.getSelectedRow();
							if(index!=-1) {
								btnListarSolicitudLaboral.setEnabled(true);
								btnCrearSolicitudLaboral.setEnabled(true);
								String cedula = (String)model.getValueAt(index, 0);
								selected = Bolsa.getInstance().findAspiranteByCedula(cedula);
								
							}
						}
					});
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
				btnListarSolicitudLaboral = new JButton("Listar Solicitud Laboral");
				btnListarSolicitudLaboral.setEnabled(false);
				buttonPane.add(btnListarSolicitudLaboral);
			}
			{
				btnCrearSolicitudLaboral = new JButton("Crear Solicitud Laboral");
				btnCrearSolicitudLaboral.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						RegistrarSolicitudLaboral registrarsolicitudlaboral = new RegistrarSolicitudLaboral(selected);
						registrarsolicitudlaboral.setModal(true);
						registrarsolicitudlaboral.setVisible(true);
					}
				});
				btnCrearSolicitudLaboral.setEnabled(false);
				btnCrearSolicitudLaboral.setActionCommand("OK");
				buttonPane.add(btnCrearSolicitudLaboral);
				getRootPane().setDefaultButton(btnCrearSolicitudLaboral);
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
		for(int i = 0; i< Bolsa.getInstance().getAspirantes().size();i++) {
			rows[0] = Bolsa.getInstance().getAspirantes().get(i).getCedula();
			rows[1] = Bolsa.getInstance().getAspirantes().get(i).getNombre();
			rows[2] = Bolsa.getInstance().getAspirantes().get(i).getApellidos();
			rows[3] = Bolsa.getInstance().getAspirantes().get(i).getEdad();
			rows[4] = Bolsa.getInstance().getAspirantes().get(i).isEstado();
					
			model.addRow(rows);
		}
		
	}
	
}