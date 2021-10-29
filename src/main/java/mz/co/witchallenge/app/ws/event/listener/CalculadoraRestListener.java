package mz.co.witchallenge.app.ws.event.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import mz.co.witchallenge.app.ws.mq.config.MQConfig;
import mz.co.witchallenge.app.ws.ui.response.CalculadoraRest;

@Component
public class CalculadoraRestListener {
	
	@RabbitListener(queues = MQConfig.QUEUE)
	public void listener(CalculadoraRest calculadora) {
		System.out.println(calculadora);
	}

}
