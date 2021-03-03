
public class Docente extends Persona {
	private String classi;
	private String cogn;
	private String nome;
	private String cod_fis;
	private String data;
	public Docente (String cogn, String nome, String cod_fis, String data, String classi) {
		super(cogn, nome,cod_fis, data);
		this.classi=classi;
	}
	public String getClassi() {
		return classi;
	}
	public void setClassi(String classi) {
		this.classi = classi;
	}
	public String getCogn() {
		return cogn;
	}
	public void setCogn(String cogn) {
		this.cogn = cogn;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCod_fis() {
		return cod_fis;
	}
	public void setCod_fis(String cod_fis) {
		this.cod_fis = cod_fis;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
