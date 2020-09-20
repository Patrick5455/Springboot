import com.conferecne.model.Speaker;
import com.conferecne.service.SpeakerService;
import com.conferecne.service.SpeakerServiceImpl;

import java.util.List;

public class ConferenceApplication {

    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());



        }
    }

