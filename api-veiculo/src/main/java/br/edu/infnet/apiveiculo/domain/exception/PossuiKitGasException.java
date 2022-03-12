package br.edu.infnet.apiveiculo.domain.exception;

public class PossuiKitGasException extends NegocioException {
	
	private static final long serialVersionUID = 1L;

	public PossuiKitGasException(String mensagem) {
		super(mensagem);
	}
}
