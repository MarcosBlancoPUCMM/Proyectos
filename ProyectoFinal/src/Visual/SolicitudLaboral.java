package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.Font;

public class SolicitudLaboral extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtPais;
	private JTextField txtCiudad;
	private JTextField txtNacionalidad;
	private JTextField textField_6;
	private JTextField textField_8;
	private JTextField txtOficio1;
	private JTextField txtOficio2;
	private JTextField txtOficio3;
	private JTextField txtOficio4;
	private JTextField txtCorreo;
	private JTextField txtTelefono;
	private JTextField textField_9;
	private JTextField txtCarrera;
	private JTextField txtArea;
	private JTextField txtYearsExperiencia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SolicitudLaboral dialog = new SolicitudLaboral();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SolicitudLaboral() {
		setTitle("Solicitud Laboral");
		setBounds(100, 100, 800, 472);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JPanel panelLeft = new JPanel();
				panelLeft.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelLeft.setBounds(0, 0, 436, 380);
				panel.add(panelLeft);
				panelLeft.setLayout(null);
				{
					JLabel lblDatosPersonales = new JLabel("Datos Personales");
					lblDatosPersonales.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblDatosPersonales.setBounds(12, 13, 412, 16);
					panelLeft.add(lblDatosPersonales);
				}
				{
					JSeparator separator = new JSeparator();
					separator.setBounds(12, 42, 412, 2);
					panelLeft.add(separator);
				}
				{
					JLabel lblNombre = new JLabel("Nombre:");
					lblNombre.setBounds(12, 57, 50, 16);
					panelLeft.add(lblNombre);
				}
				{
					textField = new JTextField();
					textField.setEditable(false);
					textField.setBounds(74, 54, 168, 22);
					panelLeft.add(textField);
					textField.setColumns(10);
				}
				{
					textField_1 = new JTextField();
					textField_1.setEditable(false);
					textField_1.setBounds(254, 54, 170, 22);
					panelLeft.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					JLabel lblEdad = new JLabel("Edad:");
					lblEdad.setBounds(12, 86, 50, 16);
					panelLeft.add(lblEdad);
				}
				{
					textField_2 = new JTextField();
					textField_2.setEditable(false);
					textField_2.setBounds(74, 83, 40, 22);
					panelLeft.add(textField_2);
					textField_2.setColumns(10);
				}
				{
					JLabel lblSexo = new JLabel("Sexo:");
					lblSexo.setBounds(12, 115, 38, 16);
					panelLeft.add(lblSexo);
				}
				{
					textField_3 = new JTextField();
					textField_3.setEditable(false);
					textField_3.setBounds(74, 112, 116, 22);
					panelLeft.add(textField_3);
					textField_3.setColumns(10);
				}
				{
					JLabel lblCedula = new JLabel("C\u00E9dula de Identidad:");
					lblCedula.setBounds(126, 86, 124, 16);
					panelLeft.add(lblCedula);
				}
				{
					textField_4 = new JTextField();
					textField_4.setEditable(false);
					textField_4.setBounds(254, 83, 170, 22);
					panelLeft.add(textField_4);
					textField_4.setColumns(10);
				}
				{
					JLabel lblEstadoCivil = new JLabel("Estado Civil:");
					lblEstadoCivil.setBounds(202, 115, 70, 16);
					panelLeft.add(lblEstadoCivil);
				}
				{
					textField_5 = new JTextField();
					textField_5.setEditable(false);
					textField_5.setBounds(284, 112, 140, 22);
					panelLeft.add(textField_5);
					textField_5.setColumns(10);
				}
				{
					JSeparator separator = new JSeparator();
					separator.setBounds(12, 144, 412, 2);
					panelLeft.add(separator);
				}
				{
					JLabel lblPais = new JLabel("Pais:");
					lblPais.setBounds(12, 159, 50, 16);
					panelLeft.add(lblPais);
				}
				{
					txtPais = new JTextField();
					txtPais.setEditable(false);
					txtPais.setBounds(74, 156, 350, 22);
					panelLeft.add(txtPais);
					txtPais.setColumns(10);
				}
				{
					JLabel lblCiudad = new JLabel("Ciudad:");
					lblCiudad.setBounds(12, 188, 50, 16);
					panelLeft.add(lblCiudad);
				}
				{
					txtCiudad = new JTextField();
					txtCiudad.setEditable(false);
					txtCiudad.setBounds(74, 185, 126, 22);
					panelLeft.add(txtCiudad);
					txtCiudad.setColumns(10);
				}
				{
					txtNacionalidad = new JTextField();
					txtNacionalidad.setEditable(false);
					txtNacionalidad.setBounds(298, 185, 126, 22);
					panelLeft.add(txtNacionalidad);
					txtNacionalidad.setColumns(10);
				}
				{
					JLabel lblNacionalidad = new JLabel("Nacionalidad:");
					lblNacionalidad.setBounds(212, 188, 86, 16);
					panelLeft.add(lblNacionalidad);
				}
				{
					JSeparator separator = new JSeparator();
					separator.setBounds(12, 246, 412, 2);
					panelLeft.add(separator);
				}
				{
					JLabel lblNivelAcademico = new JLabel("Nivel Acad\u00E9mico:");
					lblNivelAcademico.setBounds(12, 261, 98, 16);
					panelLeft.add(lblNivelAcademico);
				}
				{
					textField_6 = new JTextField();
					textField_6.setEditable(false);
					textField_6.setBounds(126, 258, 298, 22);
					panelLeft.add(textField_6);
					textField_6.setColumns(10);
				}
				{
					JPanel panelObrero = new JPanel();
					panelObrero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panelObrero.setBounds(12, 290, 412, 80);
					panelLeft.add(panelObrero);
					panelObrero.setLayout(null);
					{
						JLabel lblOficios = new JLabel("Oficios:");
						lblOficios.setBounds(12, 13, 50, 16);
						panelObrero.add(lblOficios);
					}
					{
						txtOficio1 = new JTextField();
						txtOficio1.setEditable(false);
						txtOficio1.setBounds(74, 10, 150, 22);
						panelObrero.add(txtOficio1);
						txtOficio1.setColumns(10);
					}
					{
						txtOficio2 = new JTextField();
						txtOficio2.setEditable(false);
						txtOficio2.setBounds(236, 10, 150, 22);
						panelObrero.add(txtOficio2);
						txtOficio2.setColumns(10);
					}
					{
						txtOficio3 = new JTextField();
						txtOficio3.setEditable(false);
						txtOficio3.setBounds(74, 45, 150, 22);
						panelObrero.add(txtOficio3);
						txtOficio3.setColumns(10);
					}
					{
						txtOficio4 = new JTextField();
						txtOficio4.setEditable(false);
						txtOficio4.setBounds(236, 45, 150, 22);
						panelObrero.add(txtOficio4);
						txtOficio4.setColumns(10);
					}
				}
				{
					JLabel lblDireccion = new JLabel("Direcci\u00F3n:");
					lblDireccion.setBounds(12, 217, 58, 16);
					panelLeft.add(lblDireccion);
				}
				{
					textField_9 = new JTextField();
					textField_9.setEditable(false);
					textField_9.setBounds(74, 214, 350, 22);
					panelLeft.add(textField_9);
					textField_9.setColumns(10);
				}
				{
					JPanel panelTecnico = new JPanel();
					panelTecnico.setLayout(null);
					panelTecnico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panelTecnico.setBounds(12, 290, 412, 80);
					panelLeft.add(panelTecnico);
					{
						JLabel label = new JLabel("Area:");
						label.setBounds(12, 13, 50, 16);
						panelTecnico.add(label);
					}
					{
						txtArea = new JTextField();
						txtArea.setEditable(false);
						txtArea.setColumns(10);
						txtArea.setBounds(51, 10, 349, 22);
						panelTecnico.add(txtArea);
					}
					{
						JLabel label = new JLabel("A\u00F1os de Experiencia:");
						label.setBounds(12, 42, 129, 16);
						panelTecnico.add(label);
					}
					{
						txtYearsExperiencia = new JTextField();
						txtYearsExperiencia.setEditable(false);
						txtYearsExperiencia.setColumns(10);
						txtYearsExperiencia.setBounds(153, 39, 40, 22);
						panelTecnico.add(txtYearsExperiencia);
					}
				}
				{
					JPanel panelUniversitario = new JPanel();
					panelUniversitario.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
					panelUniversitario.setBounds(12, 290, 412, 80);
					panelLeft.add(panelUniversitario);
					panelUniversitario.setLayout(null);
					{
						JLabel lblCarrera = new JLabel("Carrera:");
						lblCarrera.setBounds(12, 13, 56, 16);
						panelUniversitario.add(lblCarrera);
					}
					{
						txtCarrera = new JTextField();
						txtCarrera.setEditable(false);
						txtCarrera.setBounds(80, 10, 320, 22);
						panelUniversitario.add(txtCarrera);
						txtCarrera.setColumns(10);
					}
				}
			}
			{
				JPanel panelRight = new JPanel();
				panelRight.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				panelRight.setBounds(436, 0, 332, 380);
				panel.add(panelRight);
				panelRight.setLayout(null);
				{
					JLabel lblDatosAdicionales = new JLabel("Datos Adicionales");
					lblDatosAdicionales.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblDatosAdicionales.setBounds(12, 13, 312, 16);
					panelRight.add(lblDatosAdicionales);
				}
				{
					JSeparator separator = new JSeparator();
					separator.setBounds(12, 42, 312, 2);
					panelRight.add(separator);
				}
				{
					JLabel lblIdiomas = new JLabel("Idiomas:");
					lblIdiomas.setBounds(12, 57, 50, 16);
					panelRight.add(lblIdiomas);
				}
				
				JRadioButton rdbtnEspanol = new JRadioButton("Espa\u00F1ol");
				rdbtnEspanol.setBounds(76, 53, 80, 25);
				panelRight.add(rdbtnEspanol);
				
				JRadioButton rdbtnIngles = new JRadioButton("Ingl\u00E9s");
				rdbtnIngles.setBounds(160, 53, 80, 25);
				panelRight.add(rdbtnIngles);
				
				JRadioButton rdbtnFrances = new JRadioButton("Franc\u00E9s");
				rdbtnFrances.setBounds(244, 53, 80, 25);
				panelRight.add(rdbtnFrances);
				
				JSeparator separator = new JSeparator();
				separator.setBounds(12, 86, 312, 2);
				panelRight.add(separator);
				
				JRadioButton rdbtnDispuestoMudarse = new JRadioButton("Dispuesto a mudarse");
				rdbtnDispuestoMudarse.setBounds(12, 97, 149, 25);
				panelRight.add(rdbtnDispuestoMudarse);
				
				JRadioButton rdbtnLicenciaConducir = new JRadioButton("Licencia de Conducir");
				rdbtnLicenciaConducir.setBounds(165, 97, 159, 25);
				panelRight.add(rdbtnLicenciaConducir);
				{
					JRadioButton rdbtnTrabajoParcial = new JRadioButton("Trabajo Parcial");
					rdbtnTrabajoParcial.setBounds(12, 127, 127, 25);
					panelRight.add(rdbtnTrabajoParcial);
				}
				{
					JLabel lblPaga = new JLabel("Sueldo esperado:");
					lblPaga.setBounds(12, 161, 102, 16);
					panelRight.add(lblPaga);
				}
				{
					textField_8 = new JTextField();
					textField_8.setBounds(126, 158, 194, 22);
					panelRight.add(textField_8);
					textField_8.setColumns(10);
				}
				{
					JLabel lblTecnologia = new JLabel("Tecnolog\u00EDa:");
					lblTecnologia.setBounds(12, 205, 68, 16);
					panelRight.add(lblTecnologia);
				}
				{
					JSeparator separator_1 = new JSeparator();
					separator_1.setBounds(12, 190, 312, 2);
					panelRight.add(separator_1);
				}
				{
					JRadioButton rdbtnMicrosoftOffice = new JRadioButton("Microsoft Office");
					rdbtnMicrosoftOffice.setBounds(88, 201, 118, 25);
					panelRight.add(rdbtnMicrosoftOffice);
				}
				{
					JRadioButton rdbtnAdobe = new JRadioButton("Adobe");
					rdbtnAdobe.setBounds(210, 201, 114, 25);
					panelRight.add(rdbtnAdobe);
				}
				{
					JLabel lblContacto = new JLabel("Contacto");
					lblContacto.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblContacto.setBounds(12, 275, 308, 16);
					panelRight.add(lblContacto);
				}
				{
					JSeparator separator_1 = new JSeparator();
					separator_1.setBounds(12, 304, 312, 2);
					panelRight.add(separator_1);
				}
				{
					JLabel lblCorreo = new JLabel("Correo:");
					lblCorreo.setBounds(12, 319, 56, 16);
					panelRight.add(lblCorreo);
				}
				{
					JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
					lblTelefono.setBounds(12, 348, 56, 16);
					panelRight.add(lblTelefono);
				}
				{
					txtCorreo = new JTextField();
					txtCorreo.setEditable(false);
					txtCorreo.setBounds(76, 316, 248, 22);
					panelRight.add(txtCorreo);
					txtCorreo.setColumns(10);
				}
				{
					txtTelefono = new JTextField();
					txtTelefono.setBounds(76, 345, 248, 22);
					panelRight.add(txtTelefono);
					txtTelefono.setColumns(10);
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnEnviar = new JButton("Enviar");
				btnEnviar.setActionCommand("OK");
				buttonPane.add(btnEnviar);
				getRootPane().setDefaultButton(btnEnviar);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}
