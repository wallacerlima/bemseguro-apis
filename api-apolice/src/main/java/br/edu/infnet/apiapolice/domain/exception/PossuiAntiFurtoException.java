package br.edu.infnet.apiapolice.domain.exception;

public class PossuiAntiFurtoException extends NegocioException {
	
	private static final long serialVersionUID = 1L;

	public PossuiAntiFurtoException(String mensagem) {
		super(mensagem);
	}
}
