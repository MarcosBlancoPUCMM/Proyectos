package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class OfertaLaboral extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtEmpresa;
	private JTextField txtSueldo;
	private JTextField txtEdad;
	private JTextField txtOficio1;
	private JTextField txtOficio2;
	private JTextField txtOficio3;
	private JTextField txtOficio4;
	private JTextField txtArea;
	private JTextField txtYearsExperiencia;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			OfertaLaboral dialog = new OfertaLaboral();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public OfertaLaboral() {
		setTitle("Oferta Laboral");
		setBounds(100, 100, 866, 488);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panelLeft = new JPanel();
			panelLeft.setBounds(5, 5, 422, 396);
			panelLeft.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panelLeft);
			panelLeft.setLayout(null);
			{
				JLabel lblNivelAcademico = new JLabel("Nivel Acad\u00E9mico:");
				lblNivelAcademico.setFont(new Font("Tahoma", Font.BOLD, 13));
				lblNivelAcademico.setBounds(12, 42, 398, 16);
				panelLeft.add(lblNivelAcademico);
			}
			
			JRadioButton rdbtnObrero = new JRadioButton("Obrero");
			rdbtnObrero.setBounds(12, 67, 68, 25);
			panelLeft.add(rdbtnObrero);
			
			JLabel lblEmpresa = new JLabel("Empresa:");
			lblEmpresa.setBounds(12, 13, 56, 16);
			panelLeft.add(lblEmpresa);
			
			txtEmpresa = new JTextField();
			txtEmpresa.setEditable(false);
			txtEmpresa.setBounds(80, 10, 330, 22);
			panelLeft.add(txtEmpresa);
			txtEmpresa.setColumns(10);
			
			JRadioButton rdbtnTecnico = new JRadioButton("T\u00E9cnico");
			rdbtnTecnico.setBounds(12, 190, 72, 25);
			panelLeft.add(rdbtnTecnico);
			
			JRadioButton rdbtnUniversitario = new JRadioButton("Universitario");
			rdbtnUniversitario.setBounds(12, 313, 100, 25);
			panelLeft.add(rdbtnUniversitario);
			
			JPanel panelObrero = new JPanel();
			panelObrero.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelObrero.setBounds(12, 101, 398, 80);
			panelLeft.add(panelObrero);
			panelObrero.setLayout(null);
			
			JLabel lblOficios = new JLabel("Oficios:");
			lblOficios.setBounds(12, 13, 50, 16);
			panelObrero.add(lblOficios);
			
			txtOficio1 = new JTextField();
			txtOficio1.setEnabled(false);
			txtOficio1.setBounds(74, 10, 150, 22);
			panelObrero.add(txtOficio1);
			txtOficio1.setColumns(10);
			
			txtOficio2 = new JTextField();
			txtOficio2.setEnabled(false);
			txtOficio2.setBounds(236, 10, 150, 22);
			panelObrero.add(txtOficio2);
			txtOficio2.setColumns(10);
			
			txtOficio3 = new JTextField();
			txtOficio3.setEnabled(false);
			txtOficio3.setBounds(74, 45, 150, 22);
			panelObrero.add(txtOficio3);
			txtOficio3.setColumns(10);
			
			txtOficio4 = new JTextField();
			txtOficio4.setEnabled(false);
			txtOficio4.setBounds(236, 45, 150, 22);
			panelObrero.add(txtOficio4);
			txtOficio4.setColumns(10);
			
			JPanel panelTecnico = new JPanel();
			panelTecnico.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelTecnico.setBounds(12, 224, 398, 80);
			panelLeft.add(panelTecnico);
			panelTecnico.setLayout(null);
			
			JLabel lblArea = new JLabel("Area:");
			lblArea.setBounds(12, 13, 32, 16);
			panelTecnico.add(lblArea);
			
			JLabel lblYearsExperiencia = new JLabel("A\u00F1os de Experiencia:");
			lblYearsExperiencia.setBounds(12, 42, 120, 16);
			panelTecnico.add(lblYearsExperiencia);
			
			txtArea = new JTextField();
			txtArea.setEnabled(false);
			txtArea.setBounds(56, 10, 330, 22);
			panelTecnico.add(txtArea);
			txtArea.setColumns(10);
			
			txtYearsExperiencia = new JTextField();
			txtYearsExperiencia.setEnabled(false);
			txtYearsExperiencia.setBounds(144, 39, 40, 22);
			panelTecnico.add(txtYearsExperiencia);
			txtYearsExperiencia.setColumns(10);
			
			JPanel panelUniversitario = new JPanel();
			panelUniversitario.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panelUniversitario.setBounds(12, 347, 398, 42);
			panelLeft.add(panelUniversitario);
			panelUniversitario.setLayout(null);
			
			JLabel lblCarrera = new JLabel("Carrera:");
			lblCarrera.setBounds(12, 13, 52, 16);
			panelUniversitario.add(lblCarrera);
			
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setBounds(76, 10, 310, 22);
			panelUniversitario.add(textField);
			textField.setColumns(10);
		}
		
		JPanel panelRight = new JPanel();
		panelRight.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelRight.setBounds(422, 5, 422, 396);
		contentPanel.add(panelRight);
		panelRight.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 215, 398, 2);
		panelRight.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 349, 398, 2);
		panelRight.add(separator_1);
		
		JLabel lblTexto = new JLabel("Requerimientos:");
		lblTexto.setBounds(12, 38, 398, 16);
		panelRight.add(lblTexto);
		lblTexto.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel lblEdad = new JLabel("Edad mayor que:");
		lblEdad.setBounds(12, 100, 100, 16);
		panelRight.add(lblEdad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(12, 71, 34, 16);
		panelRight.add(lblSexo);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.setBounds(54, 67, 84, 25);
		panelRight.add(rdbtnMasculino);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.setBounds(146, 67, 84, 25);
		panelRight.add(rdbtnFemenino);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(120, 97, 40, 22);
		panelRight.add(txtEdad);
		txtEdad.setColumns(10);
		
		JLabel lblEstadoCivil = new JLabel("Estado Civil:");
		lblEstadoCivil.setBounds(12, 129, 72, 16);
		panelRight.add(lblEstadoCivil);
		
		JRadioButton rdbtnSoltero = new JRadioButton("Soltero");
		rdbtnSoltero.setBounds(90, 125, 70, 25);
		panelRight.add(rdbtnSoltero);
		
		JRadioButton rdbtnCasado = new JRadioButton("Casado");
		rdbtnCasado.setBounds(166, 125, 70, 25);
		panelRight.add(rdbtnCasado);
		
		JRadioButton rdbtnViudo = new JRadioButton("Viudo");
		rdbtnViudo.setBounds(240, 125, 60, 25);
		panelRight.add(rdbtnViudo);
		
		JRadioButton rdbtnFrances = new JRadioButton("Franc\u00E9s");
		rdbtnFrances.setBounds(212, 153, 74, 25);
		panelRight.add(rdbtnFrances);
		
		JRadioButton rdbtnAdobe = new JRadioButton("Adobe");
		rdbtnAdobe.setBounds(222, 182, 68, 25);
		panelRight.add(rdbtnAdobe);
		
		JRadioButton rdbtnMicrosoftOffice = new JRadioButton("Microsoft Office");
		rdbtnMicrosoftOffice.setBounds(90, 183, 118, 25);
		panelRight.add(rdbtnMicrosoftOffice);
		
		JRadioButton rdbtnIngles = new JRadioButton("Ingl\u00E9s");
		rdbtnIngles.setBounds(146, 153, 62, 25);
		panelRight.add(rdbtnIngles);
		
		JRadioButton rdbtnEspanol = new JRadioButton("Espa\u00F1ol");
		rdbtnEspanol.setBounds(70, 153, 72, 25);
		panelRight.add(rdbtnEspanol);
		
		JLabel lblNacionalidad = new JLabel("Idiomas:");
		lblNacionalidad.setBounds(12, 157, 50, 16);
		panelRight.add(lblNacionalidad);
		
		JLabel lblTecnologia = new JLabel("Tecnolog\u00EDa:");
		lblTecnologia.setBounds(12, 186, 68, 16);
		panelRight.add(lblTecnologia);
		
		JRadioButton rdbtnDispuestoMudarse = new JRadioButton("Dispuesto a Mudarse");
		rdbtnDispuestoMudarse.setBounds(12, 226, 148, 25);
		panelRight.add(rdbtnDispuestoMudarse);
		
		JRadioButton rdbtnLicenciaConducir = new JRadioButton("Licencia de Conducir");
		rdbtnLicenciaConducir.setBounds(12, 256, 146, 25);
		panelRight.add(rdbtnLicenciaConducir);
		
		JRadioButton rdbtnTrabajoParcial = new JRadioButton("Trabajo Parcial");
		rdbtnTrabajoParcial.setBounds(12, 286, 127, 25);
		panelRight.add(rdbtnTrabajoParcial);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(70, 317, 84, 22);
		panelRight.add(txtSueldo);
		txtSueldo.setColumns(10);
		
		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(12, 320, 44, 16);
		panelRight.add(lblSueldo);
		
		JLabel lblCantidadAspirantes = new JLabel("Cantidad de Aspirantes:");
		lblCantidadAspirantes.setBounds(12, 364, 138, 16);
		panelRight.add(lblCantidadAspirantes);
		
		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBounds(166, 361, 40, 22);
		panelRight.add(spnCantidad);
		spnCantidad.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		
		JLabel lblTrabajo = new JLabel("Trabajo:");
		lblTrabajo.setBounds(12, 13, 56, 16);
		panelRight.add(lblTrabajo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(70, 10, 340, 22);
		panelRight.add(textField_1);
		textField_1.setColumns(10);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnCrear = new JButton("Crear");
				btnCrear.setActionCommand("OK");
				buttonPane.add(btnCrear);
				getRootPane().setDefaultButton(btnCrear);
			}
			{
				JButton btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}
}