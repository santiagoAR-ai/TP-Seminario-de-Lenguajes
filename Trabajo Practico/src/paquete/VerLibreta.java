package paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VerLibreta extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VerLibreta frame = new VerLibreta();
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
	public VerLibreta() {
		setTitle("Libreta Sanitaria");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 866, 324);
		contentPane.add(scrollPane);
		String[] columnNames = {"fecha de vacunación", "tipo de vacuna", "número de dosis aplicada","cantidad de dosis faltantes","vencimiento de la vacuna/dosis aplicada", "troquel o QR "};
		DefaultTableModel model = new DefaultTableModel(null, columnNames);
		table = new JTable(model);
		scrollPane.setViewportView(table);
	}
}
