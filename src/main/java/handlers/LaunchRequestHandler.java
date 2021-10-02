package handlers;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import static com.amazon.ask.request.Predicates.requestType;

/**
 * Classe com handler responsavel por iniciar 
 * 
 * @author Anderson rosa
 *
 */
public class LaunchRequestHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Olá, esse é o nosso Meet Up sobre Alexa, ou melhor dizendo, eu mesma."
				+ " Espero que gostem do que iremos apresentar."
				+ " Sente na poltrona e se prepare para nossa imersão."
				+ " Primeiramente, iremos entender, como é o funcionamento do meu código."
				+ " Depois, como você poderá criar sua própria Skill."
				+ " Por fim mas não menos importante."
				+ " O que é o nome de invocação, os Intents, e também Slot types."
				+ " Seja bem-vindo. A GENTE É TUDO ISSO! ";
		
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("HelloWorld", speechText)
				.withReprompt(speechText)
				.build();
	}

}
