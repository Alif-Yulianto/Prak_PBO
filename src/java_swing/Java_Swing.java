package java_swing;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

class MyFrame extends JFrame implements ActionListener
{ 
    private Container c; 
    private JLabel title; 
    private JLabel nama; 
    private JTextField tnama;
    private JLabel nim; 
    private JTextField tnim; 
    private JLabel prd; 
    private JComboBox tprd;
    private JLabel gender; 
    private JRadioButton male; 
    private JRadioButton female; 
    private ButtonGroup gengp; 
    private JLabel dob; 
    private JComboBox tgl; 
    private JComboBox bln; 
    private JComboBox thn;
    private JLabel nhp; 
    private JTextField tnhp;
    private JLabel add; 
    private JTextArea tadd; 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 

    private String tanggal[] 
    = { "", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", 
	"11", "12", "13", "14", "15", "16", "17", "18", "19", "20", 
	"21", "22", "23", "24", "25", "26", "27", "28", "29", "30", 
	"31" }; 
	
    private String bulan[] 
    = { "", "Januari", "Februari", "Maret", "April", 
	"Mei", "Juni", "Juli", "Agustus", 
	"September", "Oktober", "November", "Desember" }; 
	
    private String tahun[] 
    = { "", "1995", "1996", "1997", "1998", 
	"1999", "2000", "2001", "2002", 
	"2003", "2004", "2005", "2006", 
	"2007", "2008", "2009", "2010", 
	"2011", "2012", "2013", "2014", 
	"2015", "2016", "2017", "2018", 
	"2019" }; 
        
    private String prodi[] 
    = { " ", "Sistem Informasi","Informatika",
        "Teknik Industri", "Teknik Kimia" };

    public MyFrame() 
    { 
	setTitle("Registration Form"); 
        setBounds(300, 90, 900, 600); 
	setDefaultCloseOperation(EXIT_ON_CLOSE); 
	setResizable(false); 

	c = getContentPane(); 
	c.setLayout(null); 

	title = new JLabel("Registration Form"); 
	title.setFont(new Font("Arial", Font.PLAIN, 30)); 
	title.setSize(300, 30); 
	title.setLocation(325, 30); 
	c.add(title); 

	nama = new JLabel("Nama"); 
	nama.setFont(new Font("Arial", Font.PLAIN, 20)); 
	nama.setSize(100, 20); 
	nama.setLocation(50, 100); 
	c.add(nama); 

	tnama = new JTextField(); 
	tnama.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tnama.setSize(190, 20); 
	tnama.setLocation(200, 100); 
	c.add(tnama); 

        nim = new JLabel("NIM"); 
	nim.setFont(new Font("Arial", Font.PLAIN, 20)); 
	nim.setSize(100, 20); 
	nim.setLocation(50, 130); 
	c.add(nim); 

	tnim = new JTextField(); 
	tnim.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tnim.setSize(190, 20); 
	tnim.setLocation(200, 130); 
	c.add(tnim);
        
        gender = new JLabel("Jenis Kelamin"); 
	gender.setFont(new Font("Arial", Font.PLAIN, 20)); 
	gender.setSize(150, 20); 
	gender.setLocation(50, 160); 
	c.add(gender); 

	male = new JRadioButton("Laki-Laki"); 
	male.setFont(new Font("Arial", Font.PLAIN, 15)); 
	male.setSelected(false); 
	male.setSize(150, 20); 
	male.setLocation(200, 160); 
	c.add(male); 

	female = new JRadioButton("Perempuan"); 
	female.setFont(new Font("Arial", Font.PLAIN, 15)); 
	female.setSelected(false); 
	female.setSize(150, 20); 
	female.setLocation(200, 180); 
	c.add(female); 

	gengp = new ButtonGroup(); 
	gengp.add(male); 
	gengp.add(female);
        
	prd = new JLabel("Prodi"); 
	prd.setFont(new Font("Arial", Font.PLAIN, 20)); 
	prd.setSize(100, 20); 
	prd.setLocation(50, 210); 
	c.add(prd); 

	tprd = new JComboBox(prodi); 
	tprd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tprd.setSize(150, 20); 
	tprd.setLocation(200, 210); 
	c.add(tprd); 

	dob = new JLabel("Tanggal Lahir"); 
	dob.setFont(new Font("Arial", Font.PLAIN, 20)); 
	dob.setSize(150, 20); 
	dob.setLocation(50, 240); 
	c.add(dob); 

	tgl = new JComboBox(tanggal); 
	tgl.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tgl.setSize(50, 20); 
	tgl.setLocation(200, 240); 
	c.add(tgl); 

	bln = new JComboBox(bulan); 
	bln.setFont(new Font("Arial", Font.PLAIN, 15)); 
	bln.setSize(100, 20); 
	bln.setLocation(255, 240); 
	c.add(bln); 

	thn = new JComboBox(tahun); 
	thn.setFont(new Font("Arial", Font.PLAIN, 15)); 
	thn.setSize(60, 20); 
	thn.setLocation(360, 240); 
	c.add(thn); 

        nhp = new JLabel("No. Handphone"); 
	nhp.setFont(new Font("Arial", Font.PLAIN, 20)); 
	nhp.setSize(200, 20); 
	nhp.setLocation(50, 270); 
	c.add(nhp); 

	tnhp = new JTextField(); 
	tnhp.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tnhp.setSize(190, 20); 
	tnhp.setLocation(200, 270); 
	c.add(tnhp);
        
	add = new JLabel("Alamat"); 
	add.setFont(new Font("Arial", Font.PLAIN, 20)); 
	add.setSize(100, 20); 
	add.setLocation(50, 300); 
	c.add(add); 

	tadd = new JTextArea(); 
	tadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tadd.setSize(200, 75); 
	tadd.setLocation(200, 300); 
	tadd.setLineWrap(true); 
	c.add(tadd); 

	term = new JCheckBox("Accept Terms And Conditions."); 
	term.setFont(new Font("Arial", Font.PLAIN, 15)); 
	term.setSize(250, 20); 
	term.setLocation(100, 400); 
	c.add(term); 

	sub = new JButton("Submit"); 
	sub.setFont(new Font("Arial", Font.PLAIN, 15)); 
	sub.setSize(100, 20); 
	sub.setLocation(100, 450); 
	sub.addActionListener(this); 
	c.add(sub); 

	reset = new JButton("Reset"); 
	reset.setFont(new Font("Arial", Font.PLAIN, 15)); 
	reset.setSize(100, 20); 
	reset.setLocation(220, 450); 
	reset.addActionListener(this); 
	c.add(reset); 

	tout = new JTextArea(); 
	tout.setFont(new Font("Arial", Font.PLAIN, 15)); 
	tout.setSize(300, 400); 
	tout.setLocation(500, 100); 
	tout.setLineWrap(true); 
	tout.setEditable(false); 
	c.add(tout); 

	res = new JLabel(""); 
	res.setFont(new Font("Arial", Font.PLAIN, 20)); 
	res.setSize(500, 25); 
	res.setLocation(100, 500); 
	c.add(res); 

	resadd = new JTextArea(); 
	resadd.setFont(new Font("Arial", Font.PLAIN, 15)); 
	resadd.setSize(200, 75); 
	resadd.setLocation(580, 175); 
	resadd.setLineWrap(true); 
	c.add(resadd); 

	setVisible(true); 
    } 

    public void actionPerformed(ActionEvent e) 
    { 
	if (e.getSource() == sub)
        { 
            if (term.isSelected())
            { 
		String data1; 
		String data 
		= "Nama \t : "
		+ tnama.getText() + "\n"
		+ "NIM \t : "
		+ tnim.getText() + "\n";
		if (male.isSelected()) 
                    data1 = "Jenis Kelamin \t : Laki-laki"
                + "\n"; 
		else
                    data1 = "Gender \t : Perempuan"
                + "\n"; 
                String data2
                = "Prodi \t : "
		+ (String)tprd.getSelectedItem()
                + "\n";
		String data3
		= "Tanggal Lahir \t : "
		+ (String)tgl.getSelectedItem() 
		+ " " + (String)bln.getSelectedItem() 
		+ " " + (String)thn.getSelectedItem() 
		+ "\n"; 

                String data4
                = "No. Handphone  : "
		+ tnhp.getText() + "\n";
                
		String data5 
                = "Alamat \t : " + tadd.getText(); 
		tout.setText(data + data1 + data2 + data3 + data4 + data5); 
		tout.setEditable(false); 
		res.setText("Registration Successfully.."); 
            }
            else
            { 
		tout.setText(""); 
		resadd.setText(""); 
		res.setText("Please accept the"
		+ " terms & conditions.."); 
            } 
        } 
        else if (e.getSource() == reset)
        { 
            String def = ""; 
            tnama.setText(def);
            tnim.setText(def);
            tprd.setSelectedIndex(0);
            tadd.setText(def);
            tnhp.setText(def);
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            tgl.setSelectedIndex(0); 
            bln.setSelectedIndex(0); 
            thn.setSelectedIndex(0); 
            resadd.setText(def); 
        } 
    } 
}

public class Java_Swing
{
    public static void main(String[] args) throws Exception
    {
        MyFrame f = new MyFrame();
    }
}