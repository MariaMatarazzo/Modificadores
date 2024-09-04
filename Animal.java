package Modificadores_04_09;
class Animal { //foi modificado pra padrao

	//foi modificado pra privado
	private String nome;
	private String cor;
	private String tamanho;
	private String peso;
	private String raca;

    //foi modificado pra Protegido
	protected String setNome () {
		return nome;
	}
	protected void setNome (String nome) {
		this.nome = nome;
	}
	protected String setCor () {
		return cor;
	}
	protected void setCor (String cor) {
		this.cor = cor;
	}
	protected String setTamanho () {
		return tamanho;
	}
	protected void setTamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	protected String setPeso () {
		return peso;
	}
	protected void setPeso (String peso) {
		this.peso = peso;
	}
	protected String setRaca () {
		return raca;
	}
	protected void setRaca (String raca) {
		this.raca = raca;

	}
}
