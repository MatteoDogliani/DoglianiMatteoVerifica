import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Diagata {
	public class Diagata extends JDialogue implements ActionListener{
		private JTextField nome,cognome,cod_fis,data,sez,classe;
		private JLabel n,c,cod,dat,s,clas;
		private JButton jb;
		public void initcomp() {
			nome=new JTextField(20);
			n=new JLabel("Nome");
			cognome=new JTextField(20);
			c=new JLabel("cognome");
			cod_fis=new JTextField(20);
			cod=new JLabel("codice fiscale");
			data=new JTextField(20);
			dat=new JLabel("data di nascita");
			classe=new JTextField(20);
			clas=new JLabel("sezione");
			sez=new JTextField(20);
			s=new JLabel("classe");
			
			jb=new JButton("Aggiungi");
			jb.addActionListener(this);
			
			
}
