package módulos;

public class Local {
	private String CEP;
	private int id;
	private String Cidade;
	private String Estado;
	
	public Local(String cEP, int id, String cidade, String estado) {
		CEP = cEP;
		this.id = id;
		Cidade = cidade;
		Estado = estado;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Dados do local");
		System.out.println(this.CEP+"\n"+this.Cidade+"\n"this.Estado);
	}
	
}
