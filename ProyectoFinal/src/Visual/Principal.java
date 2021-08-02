package Visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Bolsa de Trabajo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEmpresa = new JMenu("Empresa");
		menuBar.add(mnEmpresa);
		
		JMenuItem mntmRegistrarEmpresa = new JMenuItem("Registrar");
		mntmRegistrarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarEmpresa registrarempresa = new RegistrarEmpresa();
				registrarempresa.setModal(true);
				registrarempresa.setVisible(true);
			}
		});
		mnEmpresa.add(mntmRegistrarEmpresa);
		
		JMenuItem mntmListarEmpresa = new JMenuItem("Listar");
		mntmListarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarEmpresa listarempresa = new ListarEmpresa();
				listarempresa.setModal(true);
				listarempresa.setVisible(true);
			}
		});
		mnEmpresa.add(mntmListarEmpresa);
		
		JMenu mnAspirante = new JMenu("Aspirante");
		menuBar.add(mnAspirante);
		
		JMenuItem mntmRegistrarAspirante = new JMenuItem("Registrar");
		mntmRegistrarAspirante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarAspirante registraraspirante = new RegistrarAspirante();
				registraraspirante.setModal(true);
				registraraspirante.setVisible(true);
			}
		});
		mnAspirante.add(mntmRegistrarAspirante);
		
		JMenuItem mntmListarAspirante = new JMenuItem("Listar");
		mntmListarAspirante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarAspirante listaraspirante = new ListarAspirante();
				listaraspirante.setModal(true);
				listaraspirante.setVisible(true);
			}
		});
		mnAspirante.add(mntmListarAspirante);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}