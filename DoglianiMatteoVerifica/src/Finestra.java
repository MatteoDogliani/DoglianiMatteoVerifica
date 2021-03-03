import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class Finestra extends JFrame implements ActionListener{
	private JMenu file, aggiungi;
	private JMenuBar jb;
	private JMenuItem salva, impo, agg, modif;
	private JComboBox cb;
	private DefaultTableModel dft;
	private JTable table;
	private JDialogue dalunno, ddocente,d_ata;
	
	public void initcomp() {
		file=new JMenu();
		aggiungi= new JMenu();
		jb=new JMenuBar();
		salva= new JMenuItem();
		salva.addActionListener(this);
		impo= new JMenuItem();
		impo.addActionListener(this);
		agg= new JMenuItem();
		agg.addActionListener(this);
		modif= new JMenuItem();
		modif.addActionListener(this);
		dft=new DefaultTableModel ();
		table=new JTable();
		Object[][] col
		String[] dft = {data, coloumNames};
		table.add(dft);
		this.add(table);
		
		
		cb=new JComboBox();
		this.add(cb);
		
		
		file.add(salva);
		file.add(impo);
		aggiungi.add(agg);
		aggiungi.add(modif);
		jb.add(file);
		jb.add(aggiungi);
		this.add(jb);
		
		
		
		String[] option= {"docente", "ata","alunno"};
		cb.add(option);
		
	}
	public Finestra() {
		initcomp();
	}
	
	public static void main(String[] arg) {
		Finestra f= new Finestra();
		f.setSize(500,500);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(salva)) {
			
		}
		if(e.getSource().equals(impo)) {
			
			
		}
		if(e.getSource().equals(agg)) {
			
		}
		if(e.getSource().equals(modif)) {
			
		}
		
	}
	

}
