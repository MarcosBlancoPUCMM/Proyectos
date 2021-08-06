package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.sun.xml.internal.txw2.output.IndentingXMLStreamWriter;

import Logico.Aspirante;
import Logico.Bolsa;
import Logico.OfertaLaboral;
import Logico.SolicitudLaboral;
import sun.util.locale.provider.AuxLocaleProviderAdapter;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarAspiranteAdecuado extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	private static DefaultTableModel model;
	private static Object rows[];
	private SolicitudLaboral selected = null;
	private JButton btnContratar;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public ListarAspiranteAdecuado(ArrayList<SolicitudLaboral> mejoresSolicitudes) {
		
		setTitle("Lista de Solicitudes mejores Adecuados para la Oferta");
		setBounds(100, 100, 675, 450);
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
						public void mouseClicked(MouseEvent e) {
							int index = -1;
							index = table.getSelectedRow();
							if (index != -1) {
								index = table.getSelectedRow();
								if (index != -1) {
									btnContratar.setEnabled(true);
									String id = (String)model.getValueAt(index, 0);
									//selected = 
								}
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
				btnContratar = new JButton("Contratar");
				btnContratar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						loadtable();
					}
				});
				btnContratar.setEnabled(false);
				btnContratar.setActionCommand("OK");
				buttonPane.add(btnContratar);
				getRootPane().setDefaultButton(btnContratar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
		loadtable();
	}

	private void loadtable() {
/*
		rows = new Object[model.getColumnCount()];
		model.setRowCount(0);
		for(int i = 0; i < ;i++) {
			rows[0] = 
				
			model.addRow(rows);
		}
		*/
	}
}
