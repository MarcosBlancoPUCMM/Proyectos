package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Logico.Aspirante;
import Logico.Bolsa;
import Logico.SolicitudLaboral;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarSolicitudLaboral extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private static DefaultTableModel model;
	private static Object rows[];
	private SolicitudLaboral selected = null;
	private Aspirante aux = null;
	private JButton btnSalir;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 * @param aspirante 
	 */
	public ListarSolicitudLaboral(Aspirante aspirante) {
		aux = aspirante;
		setTitle("Lista de Solicitud Laboral");
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
					String headers[] = {"No.", "Ocupación", "Dispuesto a Mudarse", "Licencia de Conducir", "Trabajo Parcial", "Idiomas"};
					model = new DefaultTableModel();
					model.setColumnIdentifiers(headers);
					table = new JTable();
					table.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent arg0) {
							int index = -1;
							index = table.getSelectedRow();
							if (index!= -1) {
								btnCancelar.setEnabled(true);
								String id = (String)model.getValueAt(index, 0);
								selected = aspirante.buscarSolicitud(id);
								
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
				btnCancelar = new JButton("Cancelar Solicitud");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int option = JOptionPane.showConfirmDialog(null,  "¿Desea cancelar la solicitud?");
						if(option == JOptionPane.YES_OPTION) {
							
						}
					}
				});
				btnCancelar.setEnabled(false);
				btnCancelar.setActionCommand("OK");
				buttonPane.add(btnCancelar);
				getRootPane().setDefaultButton(btnCancelar);
			}
			{
				btnSalir = new JButton("Salir");
				btnSalir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnSalir.setActionCommand("Cancel");
				buttonPane.add(btnSalir);
			}
			loadtable();
		}
	}

	private void loadtable() {
		rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		
		for(int i = 0; i< aux.getSolicitud().size();i++) {
			rows[0] = aux.getSolicitud().get(i).getId();
			rows[1] = aux.getSolicitud().get(i).getOcipacion();
			if(aux.getSolicitud().get(i).isDispuestoMudarse()) {
				rows[2] = "Si";
			}else {
				rows[2] = "No";
			}
			if(aux.getSolicitud().get(i).isLicenciaConducir()) {
				rows[3] = "Si";
			}else {
				rows[3] = "No";
			}if(aux.getSolicitud().get(i).isTrabajoParcial()) {
				rows[4] = "Si";
			}else {
				rows[4] = "No";
			}
			if(aux.getSolicitud().get(i).isFrances() && aux.getSolicitud().get(i).isIngles() && aux.getSolicitud().get(i).isEspanol()) {
				rows[5] = "Francés, Inglés y Español";
			}else if(!aux.getSolicitud().get(i).isFrances() && aux.getSolicitud().get(i).isIngles() && aux.getSolicitud().get(i).isEspanol()){
				rows[5] = "Inglés y Español";
			}else if(!aux.getSolicitud().get(i).isFrances() && !aux.getSolicitud().get(i).isIngles() && aux.getSolicitud().get(i).isEspanol()){
				rows[5] = "Español";
			}else if(aux.getSolicitud().get(i).isFrances() && aux.getSolicitud().get(i).isIngles() && !aux.getSolicitud().get(i).isEspanol()){
				rows[5] = "Inglés y Francés";
			}
					
			model.addRow(rows);
		}
		
	}

}