package br.renato.facade;

import java.util.Stack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.renato.composite.contrato.Operacionavel;
import br.renato.proxy.OperandoDivisaoProxy;
import br.renato.proxy.OperandoMultiplicacaoProxy;
import br.renato.proxy.OperandoProxy;
import br.renato.proxy.OperandoSomaProxy;
import br.renato.proxy.OperandoSubtracaoProxy;

/**
 * 
 * @author Renato
 *
 */
public class FacadeInterpretaExpressao {

	private static Logger log = LogManager
			.getLogger(FacadeInterpretaExpressao.class);

	private Stack<Operacionavel> pinhaOperacionavel = null;

	public FacadeInterpretaExpressao() {
	}

	public double calcularExpressao(String expressao) {

		log.info("Calculando: " + expressao);

		pinhaOperacionavel = new Stack<Operacionavel>();

		char[] charArray = expressao.toCharArray();

		for (char caracter : charArray) {

			Operacionavel operacionavel = parseOperacionavel(caracter);

			pinhaOperacionavel.add(operacionavel);

		}

		return pinhaOperacionavel.get(0).getNumero();
	}

	private Operacionavel parseOperacionavel(char caracter) {

		String caracterStr = String.valueOf(caracter);

		if (Character.isDigit(caracter)) {

			return new OperandoProxy(Integer.parseInt(caracterStr));

		} else if ("+-/*".contains(caracterStr)) {

			return parseOperandoOperacao(caracterStr);
		}

		return null;
	}

	private Operacionavel parseOperandoOperacao(String caracterStr) {

		Operacionavel operacionavel2 = desenpacotarUltimoOperacionavelPilha();
		Operacionavel operacionavel1 = desenpacotarUltimoOperacionavelPilha();

		if ("+".equals(caracterStr)) {

			return new OperandoSomaProxy(operacionavel1, operacionavel2);

		} else if ("-".equals(caracterStr)) {

			return new OperandoSubtracaoProxy(operacionavel1, operacionavel2);

		} else if ("/".equals(caracterStr)) {

			return new OperandoDivisaoProxy(operacionavel1, operacionavel2);

		} else if ("*".equals(caracterStr)) {

			return new OperandoMultiplicacaoProxy(operacionavel1,
					operacionavel2);

		}

		return null;
	}

	private Operacionavel desenpacotarUltimoOperacionavelPilha() {

		Operacionavel operacionavel = pinhaOperacionavel.lastElement();

		pinhaOperacionavel.remove(pinhaOperacionavel.size() - 1);

		return operacionavel;
	}
}
