package Visual;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import Logico.Aspirante;
import Logico.Bolsa;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class RegistrarAspirante extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtCedula;
	private JTextField txtEdad;
	private JTextField txtPais;
	private JTextField txtCiudad;
	private JTextField txtNacionalidad;
	private JTextField txtCorreo;
	private JTextField txtOficio1;
	private JTextField txtOficio2;
	private JTextField txtOficio3;
	private JTextField txtOficio4;
	private JTextField txtArea;
	private JTextField txtYearsExperiencia;
	private JTextField txtCarrera;
	private JRadioButton rdbtnTecnico;
	private JRadioButton rdbtnUniversitario;
	private JRadioButton rdbtnObrero;
	private JPanel panelObrero;
	private JPanel panelTecnico;
	private JPanel panelUniversitario;
	private JRadioButton rdbtnCasado;
	private JRadioButton rdbtnSoltero;
	private JRadioButton rdbtnViudo;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnHombre;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	ImageIcon mainImage = new ImageIcon("Imagenes/userIcon.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarAspirante dialog = new RegistrarAspirante();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarAspirante() {
		setTitle("Registrar Aspirante");
		setBounds(100, 100, 450, 515);
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
			{
				JLabel lblUserIcon = new JLabel("");
				lblUserIcon.setBounds(12, 13, 100, 100);
				panel.add(lblUserIcon);
				lblUserIcon.setIcon(mainImage);
			}
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(124, 13, 56, 16);
			panel.add(lblNombre);
			
			txtNombre = new JTextField();
			txtNombre.setBounds(192, 10, 218, 22);
			panel.add(txtNombre);
			txtNombre.setColumns(10);
			{
				JLabel lblApellidos = new JLabel("Apellidos:");
				lblApellidos.setBounds(124, 42, 56, 16);
				panel.add(lblApellidos);
			}
			{
				txtApellidos = new JTextField();
				txtApellidos.setBounds(192, 39, 218, 22);
				panel.add(txtApellidos);
				txtApellidos.setColumns(10);
			}
			{
				JLabel lblCedula = new JLabel("C\u00E9dula de Identidad:");
				lblCedula.setBounds(124, 97, 120, 16);
				panel.add(lblCedula);
			}
			{
				txtCedula = new JTextField();
				txtCedula.setBounds(256, 94, 154, 22);
				panel.add(txtCedula);
				txtCedula.setColumns(10);
			}
			
			rdbtnHombre = new JRadioButton("Hombre");
			rdbtnHombre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnHombre.setSelected(true);
					rdbtnMujer.setSelected(false);
					
				}
			});
			
			rdbtnHombre.setSelected(true);
			rdbtnHombre.setBounds(270, 67, 74, 25);
			panel.add(rdbtnHombre);
			
			rdbtnMujer = new JRadioButton("Mujer");
			rdbtnMujer.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					rdbtnHombre.setSelected(false);
					rdbtnMujer.setSelected(true);
				}
			});
			rdbtnMujer.setBounds(348, 67, 62, 25);
			panel.add(rdbtnMujer);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(12, 126, 398, 1);
			panel.add(separator);
			
			JLabel lblEdad = new JLabel("Edad:");
			lblEdad.setBounds(124, 71, 34, 16);
			panel.add(lblEdad);
			
			txtEdad = new JTextField();
			txtEdad.setBounds(192, 68, 40, 22);
			panel.add(txtEdad);
			txtEdad.setColumns(10);
			{
				JLabel lblPais = new JLabel("Pais:");
				lblPais.setBounds(12, 140, 30, 16);
				panel.add(lblPais);
			}
			{
				txtPais = new JTextField();
				txtPais.setBounds(74, 137, 336, 22);
				panel.add(txtPais);
				txtPais.setColumns(10);
			}
			{
				JLabel lblCiudad = new JLabel("Ciudad:");
				lblCiudad.setBounds(12, 169, 50, 16);
				panel.add(lblCiudad);
			}
			{
				txtCiudad = new JTextField();
				txtCiudad.setBounds(74, 166, 116, 22);
				panel.add(txtCiudad);
				txtCiudad.setColumns(10);
			}
			
			JLabel lblNacionalidad = new JLabel("Nacionalidad:");
			lblNacionalidad.setBounds(202, 169, 80, 16);
			panel.add(lblNacionalidad);
			
			txtNacionalidad = new JTextField();
			txtNacionalidad.setBounds(284, 166, 126, 22);
			panel.add(txtNacionalidad);
			txtNacionalidad.setColumns(10);
			{
				JLabel lblEstadoCivil = new JLabel("Estado Civil:");
				lblEstadoCivil.setBounds(12, 230, 72, 16);
				panel.add(lblEstadoCivil);
			}
			{
				rdbtnSoltero = new JRadioButton("Soltero");
				rdbtnSoltero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rdbtnSoltero.setSelected(true);
						rdbtnCasado.setSelected(false);
						rdbtnViudo.setSelected(false);
					}
				});
				rdbtnSoltero.setSelected(true);
				rdbtnSoltero.setBounds(92, 226, 70, 25);
				panel.add(rdbtnSoltero);
			}
			{
				rdbtnCasado = new JRadioButton("Casado");
				rdbtnCasado.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rdbtnSoltero.setSelected(false);
						rdbtnCasado.setSelected(true);
						rdbtnViudo.setSelected(false);
					
					}
				});
				rdbtnCasado.setBounds(212, 226, 70, 25);
				panel.add(rdbtnCasado);
			}
			{
				rdbtnViudo = new JRadioButton("Viudo");
				rdbtnViudo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rdbtnSoltero.setSelected(false);
						rdbtnCasado.setSelected(false);
						rdbtnViudo.setSelected(true);
					}
				});
				rdbtnViudo.setBounds(333, 226, 60, 25);
				panel.add(rdbtnViudo);
			}
			{
				JLabel lblCorreo = new JLabel("Correo Electr\u00F3nico:");
				lblCorreo.setBounds(12, 262, 114, 16);
				panel.add(lblCorreo);
			}
			{
				txtCorreo = new JTextField();
				txtCorreo.setBounds(138, 259, 272, 22);
				panel.add(txtCorreo);
				txtCorreo.setColumns(10);
			}
			{
				JSeparator separator_1 = new JSeparator();
				separator_1.setBounds(12, 291, 398, 1);
				panel.add(separator_1);
			}
			{
				rdbtnObrero = new JRadioButton("Obrero");
				rdbtnObrero.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rdbtnObrero.setSelected(true);
						rdbtnTecnico.setSelected(false);
						rdbtnUniversitario.setSelected(false);
						
						panelObrero.setVisible(true);
						panelTecnico.setVisible(false);
						panelUniversitario.setVisible(false);
					}
				});
				rdbtnObrero.setSelected(true);
				rdbtnObrero.setBounds(12, 301, 70, 25);
				panel.add(rdbtnObrero);
			}
			{
				rdbtnTecnico = new JRadioButton("T\u00E9cnico");
				rdbtnTecnico.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rdbtnObrero.setSelected(false);
						rdbtnTecnico.setSelected(true);
						rdbtnUniversitario.setSelected(false);
						
						panelObrero.setVisible(false);
						panelTecnico.setVisible(true);
						panelUniversitario.setVisible(false);
					}
				});
				rdbtnTecnico.setBounds(156, 301, 72, 25);
				panel.add(rdbtnTecnico);
			}
			{
				rdbtnUniversitario = new JRadioButton("Universitario");
				rdbtnUniversitario.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						rdbtnObrero.setSelected(false);
						rdbtnTecnico.setSelected(false);
						rdbtnUniversitario.setSelected(true);
						
						panelObrero.setVisible(false);
						panelTecnico.setVisible(false);
						panelUniversitario.setVisible(true);
					}
				});
				rdbtnUniversitario.setBounds(293, 301, 100, 25);
				panel.add(rdbtnUniversitario);
			}
			{
				panelObrero = new JPanel();
				panelObrero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelObrero.setBounds(12, 335, 398, 70);
				panel.add(panelObrero);
				panelObrero.setLayout(null);
				{
					JLabel lblOficios = new JLabel("Oficios:");
					lblOficios.setBounds(12, 13, 50, 16);
					panelObrero.add(lblOficios);
				}
				{
					txtOficio1 = new JTextField();
					txtOficio1.setBounds(74, 10, 150, 22);
					panelObrero.add(txtOficio1);
					txtOficio1.setColumns(10);
				}
				{
					txtOficio2 = new JTextField();
					txtOficio2.setBounds(236, 10, 150, 22);
					panelObrero.add(txtOficio2);
					txtOficio2.setColumns(10);
				}
				{
					txtOficio3 = new JTextField();
					txtOficio3.setBounds(74, 39, 150, 22);
					panelObrero.add(txtOficio3);
					txtOficio3.setColumns(10);
				}
				{
					txtOficio4 = new JTextField();
					txtOficio4.setBounds(236, 39, 150, 22);
					panelObrero.add(txtOficio4);
					txtOficio4.setColumns(10);
				}
			}
			{
				panelTecnico = new JPanel();
				panelTecnico.setBounds(12, 335, 398, 70);
				panel.add(panelTecnico);
				panelTecnico.setLayout(null);
				{
					JLabel lblArea = new JLabel("Area:");
					lblArea.setBounds(12, 13, 50, 16);
					panelTecnico.add(lblArea);
				}
				{
					txtArea = new JTextField();
					txtArea.setBounds(51, 10, 335, 22);
					panelTecnico.add(txtArea);
					txtArea.setColumns(10);
				}
				{
					JLabel lblYearsExperiencia = new JLabel("A\u00F1os de Experiencia:");
					lblYearsExperiencia.setBounds(12, 42, 120, 16);
					panelTecnico.add(lblYearsExperiencia);
				}
				{
					txtYearsExperiencia = new JTextField();
					txtYearsExperiencia.setBounds(144, 39, 40, 22);
					panelTecnico.add(txtYearsExperiencia);
					txtYearsExperiencia.setColumns(10);
				}
			}
			{
				panelUniversitario = new JPanel();
				panelUniversitario.setBounds(12, 335, 398, 70);
				panel.add(panelUniversitario);
				panelUniversitario.setLayout(null);
				{
					JLabel lblCarrera = new JLabel("Carrera:");
					lblCarrera.setBounds(12, 13, 56, 16);
					panelUniversitario.add(lblCarrera);
				}
				{
					txtCarrera = new JTextField();
					txtCarrera.setBounds(80, 10, 306, 22);
					panelUniversitario.add(txtCarrera);
					txtCarrera.setColumns(10);
				}
			}
			{
				lblDireccion = new JLabel("Direcci\u00F3n:");
				lblDireccion.setBounds(12, 201, 62, 16);
				panel.add(lblDireccion);
			}
			{
				txtDireccion = new JTextField();
				txtDireccion.setBounds(74, 198, 336, 22);
				panel.add(txtDireccion);
				txtDireccion.setColumns(10);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegistrar = new JButton("Registrar");
				btnRegistrar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String sexo = "Hombre";
						String estadocivil = "Soltero";
						if(rdbtnMujer.isSelected()) {
							sexo = "Mujer";
						}
						if(rdbtnCasado.isSelected()) {
							estadocivil = "Casado";
						}else if (rdbtnViudo.isSelected()) {
							estadocivil = "Viudo";
						}
						
						if (rdbtnObrero.isSelected()) {
							Aspirante aux = new Aspirante(null, txtNombre.getText(), txtApellidos.getText(), txtCiudad.getText(), txtCedula.getText(), "N/A", txtDireccion.getText(), txtNacionalidad.getText(),  txtPais.getText(), txtCorreo.getText(), sexo, estadocivil, "Obrero", txtOficio1.getText(), txtOficio2.getText(), txtOficio3.getText(), txtOficio4.getText(), "N/A", "N/A", false, Integer.valueOf(txtEdad.getText()), 0);
							Bolsa.getInstance().registrarAspirante(aux);
						} else if (rdbtnTecnico.isSelected()) {
							Aspirante aux = new Aspirante(null, txtNombre.getText(), txtApellidos.getText(), txtCiudad.getText(), txtCedula.getText(), "N/A", txtDireccion.getText(), txtNacionalidad.getText(),  txtPais.getText(), txtCorreo.getText(), sexo, estadocivil, "Técnico", "N/A", "N/A", "N/A", "N/A", txtArea.getText(), "N/A", false, Integer.valueOf(txtEdad.getText()), Integer.valueOf(txtYearsExperiencia.getText()));
							Bolsa.getInstance().registrarAspirante(aux);
						} else if (rdbtnUniversitario.isSelected()) {
							Aspirante aux = new Aspirante(null, txtNombre.getText(), txtApellidos.getText(), txtCiudad.getText(), txtCedula.getText(), "N/A", txtDireccion.getText(), txtNacionalidad.getText(),  txtPais.getText(), txtCorreo.getText(), sexo, estadocivil, "Universitario", "N/A", "N/A", "N/A", "N/A", "N/A", txtCarrera.getText(), false, Integer.valueOf(txtEdad.getText()), 0);
							Bolsa.getInstance().registrarAspirante(aux);
						}
						
				     	JOptionPane.showMessageDialog(null, "Aspirante Registrado", "Registro de Aspirante", JOptionPane.INFORMATION_MESSAGE);
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
		txtApellidos.setText("");
		txtCiudad.setText("");
		txtCedula.setText("");
		txtPais.setText("");
		txtCorreo.setText("");
		txtEdad.setText("");
		txtNacionalidad.setText("");
		txtOficio1.setText("");
		txtOficio2.setText("");
		txtOficio3.setText("");
		txtOficio4.setText("");
		txtArea.setText("");
		txtYearsExperiencia.setText("");
		txtCarrera.setText("");
	}
}
