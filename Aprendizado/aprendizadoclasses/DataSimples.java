package aprendizadoclasses;

public class DataSimples {
	private byte dia, mes;
	private short ano;
	
	public DataSimples(byte dia, byte mes, short ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	private boolean compararData(DataSimples outraDataSimples) {
		return this.dia == outraDataSimples.dia &&
				this.mes == outraDataSimples.mes &&
				this.ano == outraDataSimples.ano;
	}
	
	public byte getDia() {
		return dia;
	}
	public byte getMes() {
		return mes;
	}
	public short getAno() {
		return ano;
	}
	
	public String toString() {
		String data = "";
		data = String.format("%d/%d/%d", dia, mes, ano);
		
		return data;
	}
}
