package principal;
import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

import handlers.CancelandStopIntentHandler;
import handlers.HelloWorldIntentHandler;
import handlers.HelpIntentHandler;
import handlers.LaunchRequestHandler;
import handlers.SessionEndedRequestHandler;

public class HelloWorldStreamHandler extends SkillStreamHandler{

	private static Skill getSkill () { 
        return Skills.standard () 
        		.addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.17080e15-8fc5-4ab7-9385-644ce4a51124")
                .build();
    }
	
	public HelloWorldStreamHandler() {
		 super(getSkill()); 
	}

}
