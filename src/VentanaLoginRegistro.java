import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.Window;

import com.toedter.calendar.JDateChooser;

public class VentanaLoginRegistro {

	private JFrame frame;
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		            UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");

					VentanaLoginRegistro window = new VentanaLoginRegistro();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaLoginRegistro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panelLogin = new JPanel();
		frame.getContentPane().add(panelLogin, "Panel Login");
		panelLogin.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panelLogin.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnLogin = new JButton("Login");
		panel.add(btnLogin);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout card = (CardLayout) frame.getContentPane().getLayout();
				card.show(frame.getContentPane(), "Panel Registro");
			}
		});
		panel.add(btnRegistrar);
		
		JPanel panelRegistro = new JPanel();
		frame.getContentPane().add(panelRegistro, "Panel Registro");
		GridBagLayout gbl_panelRegistro = new GridBagLayout();
		gbl_panelRegistro.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelRegistro.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelRegistro.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelRegistro.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelRegistro.setLayout(gbl_panelRegistro);
		
		JLabel labelUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_labelUsuario = new GridBagConstraints();
		gbc_labelUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_labelUsuario.anchor = GridBagConstraints.EAST;
		gbc_labelUsuario.gridx = 1;
		gbc_labelUsuario.gridy = 1;
		panelRegistro.add(labelUsuario, gbc_labelUsuario);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		panelRegistro.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel labelClave = new JLabel("Clave");
		GridBagConstraints gbc_labelClave = new GridBagConstraints();
		gbc_labelClave.insets = new Insets(0, 0, 5, 5);
		gbc_labelClave.anchor = GridBagConstraints.EAST;
		gbc_labelClave.gridx = 4;
		gbc_labelClave.gridy = 1;
		panelRegistro.add(labelClave, gbc_labelClave);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 1;
		panelRegistro.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel labelNombre = new JLabel("Nombre:");
		GridBagConstraints gbc_labelNombre = new GridBagConstraints();
		gbc_labelNombre.anchor = GridBagConstraints.EAST;
		gbc_labelNombre.insets = new Insets(0, 0, 5, 5);
		gbc_labelNombre.gridx = 1;
		gbc_labelNombre.gridy = 3;
		panelRegistro.add(labelNombre, gbc_labelNombre);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 3;
		panelRegistro.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel labelFecha = new JLabel("Fecha nacimiento:");
		GridBagConstraints gbc_labelFecha = new GridBagConstraints();
		gbc_labelFecha.insets = new Insets(0, 0, 5, 5);
		gbc_labelFecha.gridx = 3;
		gbc_labelFecha.gridy = 5;
		panelRegistro.add(labelFecha, gbc_labelFecha);
		
		JDateChooser dateChooser = new JDateChooser();
		GridBagConstraints gbc_dateChooser = new GridBagConstraints();
		gbc_dateChooser.insets = new Insets(0, 0, 5, 5);
		gbc_dateChooser.fill = GridBagConstraints.BOTH;
		gbc_dateChooser.gridx = 4;
		gbc_dateChooser.gridy = 5;
		panelRegistro.add(dateChooser, gbc_dateChooser);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 6;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 7;
		panelRegistro.add(panel_1, gbc_panel_1);
		
		JButton btnRegistroRegistrar = new JButton("Registrar");
		btnRegistroRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMain main = new VentanaMain();
				main.setVisible(true);
				//frame.setVisible(false);
			}
		});
		panel_1.add(btnRegistroRegistrar);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
