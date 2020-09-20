import com.conference.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConferenceApplication {

    public static void main(String[] args) {

        // add java configuration to the Spring Application context
        ApplicationContext applicationContext = new
                AnnotationConfigApplicationContext(AppConfig.class);

        // when we run the main application, spring will startup and create
        // a registry of the configured beans viz
        // speakerService beans and speakerRepo beans
        // (also injects the speakerRepo bean into the SpeakerService bean as configured in the
        // app config class)


        // get a bean of speakerService form the spring application contet
        SpeakerService service = applicationContext.getBean(
                "speakerService", SpeakerService.class);

        System.out.println(service);

        System.out.println(service.findAll().get(0).getFirstName());

        SpeakerService service2 = applicationContext.getBean(
                "speakerService", SpeakerService.class);

        System.out.println(service);


        }
    }

