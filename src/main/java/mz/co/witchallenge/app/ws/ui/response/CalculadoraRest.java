package mz.co.witchallenge.app.ws.ui.response;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CalculadoraRest {

	private BigDecimal numero1;
	private BigDecimal numero2;
	private BigDecimal resultado;
	private TipoOperacao operacao;
}
