import java.io.FileWriter;

import javax.swing.JFileChooser;

public class Elenco extends ArrayList <Persona>{
	public Elenco () {
		super();
	}
	public void salva(Finestra f) {
		File file =new JFileChooser();
		int a= file.showsaveDialogue();
		if(a==file.Approve_option) {
			FileWriter fw= new FileWriter(f);
			
			
			fw.close;
			fw.flush
			
		}
	}
	public void importa(Finestra f) {
		ObjectOutputStream o=new
		
	}
			
}
