import com.conferecne.repo.SpeakerRepo;
import com.conferecne.repo.speakerRepoImpl;
import com.conferecne.service.SpeakerService;
import com.conferecne.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();

        // autowire bean of SpeakerRepo into bean of SpeakerService
        speakerService.setSpeakerRepo(getSpeakerRepo());

        return speakerService;
    }


    @Bean(name = "speakerRepo")
    public SpeakerRepo getSpeakerRepo(){
        return new speakerRepoImpl();
    }

}
