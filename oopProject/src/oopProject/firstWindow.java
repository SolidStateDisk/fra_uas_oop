package oopProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class firstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfVorname;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField tSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstWindow frame = new firstWindow();
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
	ArrayList<ticket> ticketList = new ArrayList();

	public firstWindow() {

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 423);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JButton btnNewButton = new JButton("Add");
		
		
		JButton btnRemove = new JButton("Remove");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnRemove)
					.addGap(394))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnRemove))
					.addContainerGap())
		);
		panel.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		JTable table= new JTable(new Object[][] { {"",""},{"",""}},new Object []  {"Vorname","Nachname"}); 

		
		JScrollPane scrollPane_1 = new JScrollPane(table);
		scrollPane.setViewportView(scrollPane_1);
		
		JSplitPane splitPane = new JSplitPane();
		panel.add(splitPane, BorderLayout.NORTH);
		
		tSearch = new JTextField();
		splitPane.setRightComponent(tSearch);
		tSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		splitPane.setLeftComponent(btnSearch);
		panel_1.setLayout(null);
		
		JLabel lbName = new JLabel("Name");
		lbName.setBounds(10, 2, 84, 17);
		panel_1.add(lbName);
		
		JLabel lbVorname = new JLabel("Vorname");
		lbVorname.setBounds(10, 30, 84, 24);
		panel_1.add(lbVorname);
		
		JLabel lbProduktnummer = new JLabel("Produktnummer");
		lbProduktnummer.setBounds(10, 65, 84, 20);
		panel_1.add(lbProduktnummer);
		
		tfName = new JTextField();
		tfName.setBounds(104, 2, 142, 20);
		panel_1.add(tfName);
		tfName.setColumns(10);
		
		tfVorname = new JTextField();
		tfVorname.setBounds(104, 33, 142, 20);
		panel_1.add(tfVorname);
		tfVorname.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 65, 142, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lbFehlerart = new JLabel("Fehlertart");
		lbFehlerart.setBounds(10, 96, 84, 20);
		panel_1.add(lbFehlerart);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 96, 142, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		String [] list1 = {"ein1","ein2","ein3"};

		JComboBox cbKategorie = new JComboBox(list1);
		cbKategorie.setBounds(467, 2, 101, 22);
		
		panel_1.add(cbKategorie);
		JComboBox cbEintrag = new JComboBox(list1);
		cbKategorie.setSelectedIndex(0);
		cbEintrag.setBounds(340, -1, 106, 22);
		panel_1.add(cbEintrag);
		contentPane.setLayout(gl_contentPane);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ticket ticketI = new ticket(tfName.getText(),tfVorname.getText());
				ticketList.add(ticketI);
			}
		});
	}
}
