package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import Model.PhuongTien;

public class Admin extends JFrame {
	String strFind = "";
	private ChartPanel chartPanel;
	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtten;
	private JTextField txtsodienthoai;
	private JTextField txtcmnd;
	private JTextField txtchocutru;
	private JTextField txtphuongtien;
	private JTextField txtbienso;
	private JTextField txtnhanhieu;
	private JTextField txtdungtichsilanh;
	private JTextField txtsochongoi;
	private JTextField txtngaysinh;
	private JTextField txtngaydangki;
	public Object[] col = { "ID", "Phương Tiện", "Biển Số", "Ngày Đăng Ký", "Nhãn Hiệu", "Dung Tích Si Lanh",
			"Số Chỗ Ngồi", "Tên Chủ Sở Hữu", "Ngày Sinh", "Nơi Cư Trú", "CCCD", "Số Điện Thoại", "Tháng" };
	public DefaultTableModel dftb = new DefaultTableModel(col, 0);
	public JTable table = new JTable(dftb);
	ArrayList<PhuongTien> listphuongtien = new ArrayList<>();
	private JTextField txttimkiem;
	private JTextField txtthang;
	

	public Admin() {
		this.setResizable(false);
		showData(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(978, 700);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(10, 69, 723, 331);
		contentPane.add(tabbedPane_1);
//tab 1: chủ phương tiện:
		JPanel panelChuphuongtien = new JPanel();
		panelChuphuongtien.setBackground(new Color(128, 0, 0));
		tabbedPane_1.addTab("Chủ Phương Tiện", null, panelChuphuongtien, null);
		panelChuphuongtien.setLayout(null);

		txtID = new JTextField();
		txtID.setBounds(183, 25, 363, 20);
		panelChuphuongtien.add(txtID);
		txtID.setColumns(10);

		JLabel lblID = new JLabel("ID");
		lblID.setForeground(new Color(255, 250, 205));
		lblID.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblID.setBounds(50, 27, 124, 17);
		panelChuphuongtien.add(lblID);

		txtten = new JTextField();
		txtten.setColumns(10);
		txtten.setBounds(183, 68, 363, 20);
		panelChuphuongtien.add(txtten);

		JLabel lblhovaten = new JLabel("Họ và tên");
		lblhovaten.setForeground(new Color(255, 248, 220));
		lblhovaten.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblhovaten.setBounds(50, 71, 67, 14);
		panelChuphuongtien.add(lblhovaten);

		txtsodienthoai = new JTextField();
		txtsodienthoai.setColumns(10);
		txtsodienthoai.setBounds(183, 107, 363, 20);
		panelChuphuongtien.add(txtsodienthoai);

		JLabel lblsodienthoai = new JLabel("Số điện thoại");
		lblsodienthoai.setForeground(new Color(255, 248, 220));
		lblsodienthoai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblsodienthoai.setBounds(50, 108, 95, 14);
		panelChuphuongtien.add(lblsodienthoai);

		txtcmnd = new JTextField();
		txtcmnd.setColumns(10);
		txtcmnd.setBounds(183, 140, 363, 20);
		panelChuphuongtien.add(txtcmnd);

		JLabel lblcmnd = new JLabel("cmnd");
		lblcmnd.setForeground(new Color(255, 248, 220));
		lblcmnd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblcmnd.setBounds(50, 143, 46, 14);
		panelChuphuongtien.add(lblcmnd);

		JLabel lblngaysinh = new JLabel("Ngày sinh");
		lblngaysinh.setForeground(new Color(255, 248, 220));
		lblngaysinh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblngaysinh.setBounds(50, 181, 81, 17);
		panelChuphuongtien.add(lblngaysinh);

		txtchocutru = new JTextField();
		txtchocutru.setColumns(10);
		txtchocutru.setBounds(183, 222, 363, 20);
		panelChuphuongtien.add(txtchocutru);

		JLabel lblchocutru = new JLabel("Nơi cư trú");
		lblchocutru.setForeground(new Color(255, 248, 220));
		lblchocutru.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblchocutru.setBounds(50, 225, 81, 14);
		panelChuphuongtien.add(lblchocutru);

		txtngaysinh = new JTextField();
		txtngaysinh.setColumns(10);
		txtngaysinh.setBounds(183, 179, 363, 20);
		panelChuphuongtien.add(txtngaysinh);
//tab2 : phương tiện
		JPanel panelPhuongtien = new JPanel();
		panelPhuongtien.setBackground(new Color(128, 0, 0));
		tabbedPane_1.addTab("Phương tiện", null, panelPhuongtien, null);
		panelPhuongtien.setLayout(null);

		txtphuongtien = new JTextField();
		txtphuongtien.setColumns(10);
		txtphuongtien.setBounds(174, 21, 363, 20);
		panelPhuongtien.add(txtphuongtien);

		JLabel lblphuongtien = new JLabel("Phương Tiện");
		lblphuongtien.setForeground(new Color(255, 248, 220));
		lblphuongtien.setBackground(new Color(255, 255, 255));
		lblphuongtien.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblphuongtien.setBounds(34, 22, 105, 14);
		panelPhuongtien.add(lblphuongtien);

		txtbienso = new JTextField();
		txtbienso.setColumns(10);
		txtbienso.setBounds(174, 60, 363, 20);
		panelPhuongtien.add(txtbienso);

		JLabel lblbienso = new JLabel("Biển Số");
		lblbienso.setForeground(new Color(255, 248, 220));
		lblbienso.setBackground(new Color(255, 248, 220));
		lblbienso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblbienso.setBounds(34, 61, 105, 14);
		panelPhuongtien.add(lblbienso);

		JLabel lblngaydangki = new JLabel("Ngày Đăng Kí");
		lblngaydangki.setForeground(new Color(255, 248, 220));
		lblngaydangki.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblngaydangki.setBounds(34, 97, 105, 26);
		panelPhuongtien.add(lblngaydangki);

		txtnhanhieu = new JTextField();
		txtnhanhieu.setColumns(10);
		txtnhanhieu.setBounds(174, 140, 363, 20);
		panelPhuongtien.add(txtnhanhieu);

		JLabel lblnhanhieu = new JLabel("Nhãn Hiệu");
		lblnhanhieu.setForeground(new Color(255, 248, 220));
		lblnhanhieu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblnhanhieu.setBounds(34, 141, 105, 14);
		panelPhuongtien.add(lblnhanhieu);

		txtdungtichsilanh = new JTextField();
		txtdungtichsilanh.setColumns(10);
		txtdungtichsilanh.setBounds(174, 181, 363, 20);
		panelPhuongtien.add(txtdungtichsilanh);

		JLabel lbldungtichsilanh = new JLabel("Dung Tích Si Lanh");
		lbldungtichsilanh.setForeground(new Color(255, 248, 220));
		lbldungtichsilanh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbldungtichsilanh.setBounds(34, 180, 119, 19);
		panelPhuongtien.add(lbldungtichsilanh);

		txtsochongoi = new JTextField();
		txtsochongoi.setColumns(10);
		txtsochongoi.setBounds(174, 219, 363, 20);
		panelPhuongtien.add(txtsochongoi);

		JLabel lblsochongoi = new JLabel("Số Chỗ Ngồi");
		lblsochongoi.setForeground(new Color(255, 248, 220));
		lblsochongoi.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblsochongoi.setBounds(34, 210, 105, 35);
		panelPhuongtien.add(lblsochongoi);

		txtngaydangki = new JTextField();
		txtngaydangki.setColumns(10);
		txtngaydangki.setBounds(174, 102, 363, 20);
		panelPhuongtien.add(txtngaydangki);

		txtthang = new JTextField();
		txtthang.setColumns(10);
		txtthang.setBounds(174, 265, 363, 20);
		panelPhuongtien.add(txtthang);

		JLabel lblthang = new JLabel("Tháng");
		lblthang.setForeground(new Color(255, 248, 220));
		lblthang.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblthang.setBounds(34, 256, 105, 35);
		panelPhuongtien.add(lblthang);
//tab3:thống kê
		JPanel panelThongke = new JPanel();
		tabbedPane_1.addTab("Thống kê", null, panelThongke, null);
		panelThongke.setLayout(null);
		table.setBackground(new Color(255, 255, 255));
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 411, 962, 218);
		table.setModel(dftb);
		contentPane.add(scrollPane);
	
//đưa dữ liệu từ table lên tf
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (table.getSelectedRow() >= 0) {
					txtID.setText(table.getValueAt(table.getSelectedRow(), 0) + "");
					txtphuongtien.setText(table.getValueAt(table.getSelectedRow(), 1) + "");
					txtbienso.setText(table.getValueAt(table.getSelectedRow(), 2) + "");
					txtngaydangki.setText(table.getValueAt(table.getSelectedRow(), 3) + "");
					txtnhanhieu.setText(table.getValueAt(table.getSelectedRow(), 4) + "");
					txtdungtichsilanh.setText(table.getValueAt(table.getSelectedRow(), 5) + "");
					txtsochongoi.setText(table.getValueAt(table.getSelectedRow(), 6) + "");
					txtten.setText(table.getValueAt(table.getSelectedRow(), 7) + "");
					txtngaysinh.setText(table.getValueAt(table.getSelectedRow(), 8) + "");
					txtchocutru.setText(table.getValueAt(table.getSelectedRow(), 9) + "");
					txtcmnd.setText(table.getValueAt(table.getSelectedRow(), 10) + "");
					txtsodienthoai.setText(table.getValueAt(table.getSelectedRow(), 11) + "");
					txtthang.setText(table.getValueAt(table.getSelectedRow(), 12) + "");
				}

			}
		});
//refresh lại tất cả dữ liệu
		JButton btnrefresh = new JButton("Refresh");
		btnrefresh.setBackground(new Color(176, 196, 222));
		btnrefresh.setHorizontalAlignment(SwingConstants.LEADING);
		btnrefresh.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\1x\\twotone_refresh_black_24dp.png"));
		btnrefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dftb = (DefaultTableModel) table.getModel();
				dftb.setRowCount(0);
				loadChart();
			
				showData();
			}
		});
		btnrefresh.setBounds(800, 155, 121, 40);
		contentPane.add(btnrefresh);
//xóa
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(176, 196, 222));
		btnDelete.setHorizontalAlignment(SwingConstants.LEADING);
		btnDelete
				.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\1x\\twotone_delete_sweep_black_24dp.png"));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PhuongTien pt = new PhuongTien();
				pt.setID(Integer.parseInt(txtID.getText()));
				loadChart();
			
				showData();
			}
		});

		btnDelete.setBounds(800, 312, 121, 40);
		contentPane.add(btnDelete);
//add dữ liệu
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(176, 196, 222));
		btnSave.setHorizontalAlignment(SwingConstants.LEADING);
		btnSave.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\1x\\twotone_save_black_24dp.png"));

		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				if (txtID.getText().equals("")) {
					sb.append("ID không được để trống");
					txtID.setBackground(Color.RED);// nếu id bỏ trống tfid sẽ hiện đỏ
				} else {
					txtID.setBackground(Color.WHITE);
					;
				}
				if (sb.length() > 0) {
					JOptionPane.showMessageDialog(btnSave, sb);
					return;
				}
				try {

					int ID = Integer.parseInt(txtID.getText());
					String phuongtien = txtphuongtien.getText();
					String bienso = txtbienso.getText();
					String ngaydangki = txtngaydangki.getText();
					String nhanhieu = txtnhanhieu.getText();
					String dungtichsilanh = txtdungtichsilanh.getText();
					String sochongoi = txtsochongoi.getText();
					String hovaten = txtten.getText();
					String ngaysinh = txtngaysinh.getText();
					String noicutru = txtchocutru.getText();
					String cccd = txtcmnd.getText();
					String sodienthoai = txtsodienthoai.getText();
					int thang = Integer.parseInt(txtthang.getText());
					PhuongTien pt = new PhuongTien(ID, phuongtien, bienso, ngaydangki, nhanhieu, dungtichsilanh,
							sochongoi, hovaten, ngaysinh, noicutru, cccd, sodienthoai, thang);

				
					JOptionPane.showMessageDialog(btnSave, "save successfull");
					loadChart();
				
					showData();

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnSave, "ERROR" + ex.getMessage());
					ex.printStackTrace();
				}

			}
		});
		btnSave.setBounds(800, 236, 121, 40);
		contentPane.add(btnSave);
//clear tất cả dữ liệu trên tf và nhập dữ liệu mới vào
		JButton btnclear = new JButton("Clear");
		btnclear.setBackground(new Color(176, 196, 222));
		btnclear.setHorizontalAlignment(SwingConstants.LEADING);
		btnclear.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\1x\\twotone_clear_black_24dp.png"));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText("");
				txtbienso.setText("");
				txtchocutru.setText("");
				txtcmnd.setText("");
				txtdungtichsilanh.setText("");
				txtphuongtien.setText("");
				txtnhanhieu.setText("");
				txtsochongoi.setText("");
				txtsodienthoai.setText("");
				txtten.setText("");
				txtngaydangki.setText("");
				txtngaysinh.setText("");
				txtthang.setText("");
				txttimkiem.setText("");
			}
		});
		btnclear.setBounds(800, 350, 121, 40);
		contentPane.add(btnclear);
//thoát chương trình
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(176, 196, 222));
		btnExit.setHorizontalAlignment(SwingConstants.LEADING);
		btnExit.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\1x\\twotone_exit_to_app_black_24dp.png"));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setBounds(800, 273, 121, 40);
		contentPane.add(btnExit);
//tiêu đề
		JLabel lblNewLabel = new JLabel("QUẢN LÝ ĐĂNG KÝ OTO XE MÁY");
		lblNewLabel.setForeground(new Color(250, 250, 210));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(281, 13, 546, 45);
		contentPane.add(lblNewLabel);
//cập nhật dữ liệu
		JButton btnUpdate = new JButton("UpDate");
		btnUpdate.setBackground(new Color(176, 196, 222));
		btnUpdate.setHorizontalAlignment(SwingConstants.LEADING);
		btnUpdate.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\1x\\twotone_update_black_24dp.png"));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int ID = Integer.parseInt(txtID.getText());
					String phuongtien = txtphuongtien.getText();
					String bienso = txtbienso.getText();
					String ngaydangki = txtngaydangki.getText();
					String nhanhieu = txtnhanhieu.getText();
					String dungtichsilanh = txtdungtichsilanh.getText();
					String sochongoi = txtsochongoi.getText();
					String hovaten = txtten.getText();
					String ngaysinh = txtngaysinh.getText();
					String noicutru = txtchocutru.getText();
					String cccd = txtcmnd.getText();
					String sodienthoai = txtsodienthoai.getText();
					int thang = Integer.parseInt(txtthang.getText());
					PhuongTien pt = new PhuongTien(ID, phuongtien, bienso, ngaydangki, nhanhieu, dungtichsilanh,
							sochongoi, hovaten, ngaysinh, noicutru, cccd, sodienthoai, thang);

				
					JOptionPane.showMessageDialog(btnUpdate, "UpDate successfull");
					loadChart();
			
					showData();

				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnUpdate, "ERROR" + ex.getMessage());
					ex.printStackTrace();
				}
			}
		});
		btnUpdate.setBounds(800, 196, 121, 40);
		contentPane.add(btnUpdate);
//tìm kiếm trên tf	
		txttimkiem = new JTextField();
		txttimkiem.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				strFind = txttimkiem.getText();
				showFind();
			}
		});

		txttimkiem.setBounds(761, 95, 191, 29);
		contentPane.add(txttimkiem);
		txttimkiem.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("nhập ID để tìm kiếm");
		lblNewLabel_1.setForeground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(807, 130, 114, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2
				.setIcon(new ImageIcon("C:\\Users\\Administrator\\Downloads\\6f8b54156776bc3d91f577ad17fb4ec8.jpg"));
		lblNewLabel_2.setBounds(0, -30, 962, 691);
		contentPane.add(lblNewLabel_2);

	}

// đổ dữ liệu vào table
	public void showData() {

	
	}

// hàm tìm kiếm
	public void showFind() {

	
	}
//thongke
	public void loadChart() {
	
	}
	public static void main(String[] args) {
		new Admin().setVisible(true);
	}
}
