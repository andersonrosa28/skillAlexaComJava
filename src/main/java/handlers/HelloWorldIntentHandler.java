package handlers;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

public class HelloWorldIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("HelloWorldIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		
		// Implementar logica aqui
		
		String speechText = "Esse foi um teste feito com A.W.S!";
		return input.getResponseBuilder()
				.withSpeech(speechText)
				.withSimpleCard("HelloWorld", speechText)
				.build();
	}

}
