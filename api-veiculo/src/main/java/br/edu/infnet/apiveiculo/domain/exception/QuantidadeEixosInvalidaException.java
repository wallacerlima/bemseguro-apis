package br.edu.infnet.apiveiculo.domain.exception;

public class QuantidadeEixosInvalidaException extends NegocioException {
	
	private static final long serialVersionUID = 1L;

	public QuantidadeEixosInvalidaException(String mensagem) {
		super(mensagem);
	}
}
