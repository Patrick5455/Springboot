import com.conference.service.SpeakerService;
import com.conference.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConferenceApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        SpeakerService service =
                applicationContext.getBean("speakerServiceBean",SpeakerServiceImpl.class);


        System.out.println(service.findAll().get(0).getFirstName());



        }
    }

