
public class Ata extends Persona{
	private String inquadr;
	private String cogn;
	private String nome;
	private String cod_fis;
	private String data;
	public Ata (String cogn, String nome, String cod_fis, String data, String inquadr) {
		super(cogn, nome,cod_fis, data);
		this.inquadr= inquadr;
	}
	public String getInquadr() {
		return inquadr;
	}
	public void setInquadr(String inquadr) {
		this.inquadr = inquadr;
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
