
public abstract class Persona {
	protected String cogn;
	protected String nome;
	protected String cod_fis;
	protected String data;
	public Persona (String cogn, String nome, String cod_fis, String data) {
		this.cogn=cogn;
		this.nome=nome;
		this.cod_fis=cod_fis;
		this.data=data;
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
