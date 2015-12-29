package br.com.trab.cinco.modelo.venda.pagamento;

public class CartaoInfoDTO {

	private String digitoBin = null;

	public CartaoInfoDTO() {
	}

	public CartaoInfoDTO(String digitoBin) {
		super();
		this.digitoBin = digitoBin;
	}

	public String getDigitoBin() {
		return digitoBin;
	}

	public void setDigitoBin(String digitoBin) {
		this.digitoBin = digitoBin;
	}
}
