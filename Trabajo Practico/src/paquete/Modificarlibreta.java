package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Modificarlibreta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificarlibreta frame = new Modificarlibreta();
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
	public Modificarlibreta() {
		setTitle("Modificar Libreta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 866, 607);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 10, 852, 263);
		contentPane.add(scrollPane);
		String[] columnNames = {"fecha de vacunación", "tipo de vacuna", "número de dosis aplicada","cantidad de dosis faltantes","vencimiento de la vacuna/dosis aplicada", "troquel o QR "};
		DefaultTableModel model = new DefaultTableModel(null, columnNames);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		

		JLabel lblNewLabel = new JLabel("Fecha de vacunación");
		lblNewLabel.setBounds(10, 295, 96, 13);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(161, 292, 96, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de vacuna");
		lblNewLabel_1.setBounds(10, 324, 96, 13);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(161, 321, 96, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("número de dosis aplicada");
		lblNewLabel_2.setBounds(10, 350, 125, 19);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 350, 96, 19);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("cantidad de dosis faltantes");
		lblNewLabel_3.setBounds(10, 379, 125, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(161, 376, 96, 19);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("vencimiento de la vacuna");
		lblNewLabel_4.setBounds(10, 405, 125, 13);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(161, 402, 96, 19);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 431, 96, 19);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("troquel o QR");
		lblNewLabel_5.setBounds(10, 434, 96, 13);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Añadir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addRow(new Object[] {
						textField.getText(),
						textField_1.getText(),
						textField_2.getText(),
						textField_3.getText(),
						textField_4.getText(),
						textField_5.getText()
	                });
				textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
                textField_5.setText("");
			}
		});
		btnNewButton.setBounds(10, 483, 115, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Modificar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) { 
                    model.setValueAt(textField.getText(), selectedRow, 0);
                    model.setValueAt(textField_1.getText(), selectedRow, 1);
                    model.setValueAt(textField_2.getText(), selectedRow, 2);
                    model.setValueAt(textField_3.getText(), selectedRow, 3);
                    model.setValueAt(textField_4.getText(), selectedRow, 4);
                    model.setValueAt(textField_5.getText(), selectedRow, 5); 
                }
                textField.setText("");
                textField_1.setText("");
                textField_2.setText("");
                textField_3.setText("");
                textField_4.setText("");
                textField_5.setText("");
			}
		});
		btnNewButton_1.setBounds(161, 483, 125, 21);
		contentPane.add(btnNewButton_1);
		
	}
}
