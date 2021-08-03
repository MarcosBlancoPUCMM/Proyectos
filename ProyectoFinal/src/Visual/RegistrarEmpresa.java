package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;

import Logico.Bolsa;
import Logico.Empresa;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegistrarEmpresa extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txttelefono;
	private JTextField txtRNC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarEmpresa dialog = new RegistrarEmpresa();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarEmpresa() {
		setTitle("Registrar Empresa");
		setBounds(100, 100, 450, 191);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(12, 13, 58, 16);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(82, 10, 328, 22);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			
			JLabel lblDireccion = new JLabel("Direccion:");
			lblDireccion.setBounds(12, 42, 58, 16);
			panel.add(lblDireccion);
			
			txtDireccion = new JTextField();
			txtDireccion.setBounds(82, 39, 328, 22);
			panel.add(txtDireccion);
			txtDireccion.setColumns(10);
			
			JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
			lblTelefono.setBounds(12, 71, 58, 16);
			panel.add(lblTelefono);
			
			txttelefono = new JTextField();
			txttelefono.setBounds(82, 68, 164, 22);
			panel.add(txttelefono);
			txttelefono.setColumns(10);
			
			JLabel lblRNC = new JLabel("RNC:");
			lblRNC.setBounds(258, 71, 30, 16);
			panel.add(lblRNC);
			
			txtRNC = new JTextField();
			txtRNC.setBounds(300, 68, 110, 22);
			panel.add(txtRNC);
			txtRNC.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Empresa aux = new Empresa(txtNombre.getText(), txttelefono.getText(), txtDireccion.getText(), txtRNC.getText(), null);
						Bolsa.getInstance().registrarEmpreza(aux);
						JOptionPane.showMessageDialog(null, "Empresa Registrada", "Registro de Empresa", JOptionPane.INFORMATION_MESSAGE);
						clean();
					}
				});
				
				
				btnRegistrar.setActionCommand("OK");
				buttonPane.add(btnRegistrar);
				getRootPane().setDefaultButton(btnRegistrar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					dispose();
					}
				});
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
		
		private void clean() {
			txtNombre.setText("");
			txttelefono.setText("");
			txtDireccion.setText("");
			txtRNC.setText("");
			
		
	}
}
