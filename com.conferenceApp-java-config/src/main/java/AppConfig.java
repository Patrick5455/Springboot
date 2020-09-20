import com.conferecne.repo.SpeakerRepo;
import com.conferecne.repo.speakerRepoImpl;
import com.conferecne.service.SpeakerService;
import com.conferecne.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.conferecne.repo.SpeakerRepo;
@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService(){


        // autowire bean of SpeakerRepo into bean of SpeakerService

        //1. Constructor dependency injection:
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(
                getSpeakerRepo()
        );
        //2. Setter Dependency Injection:
      //  speakerService.setSpeakerRepo(getSpeakerRepo());

        return speakerService;
    }


    @Bean(name = "speakerRepo")
    public SpeakerRepo getSpeakerRepo(){
        return new speakerRepoImpl();
    }

}
