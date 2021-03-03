
public class Alunno extends Persona{
	private String classe;
	private String sezione;
	private String cogn;
	private String nome;
	private String cod_fis;
	private String data;
	public Alunno (String cogn, String nome, String cod_fis, String data, String classe, String sezione) {
		super(cogn, nome,cod_fis, data);
		this.classe=classe;
		this.sezione=sezione;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public String getSezione() {
		return sezione;
	}
	public void setSezione(String sezione) {
		this.sezione = sezione;
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
