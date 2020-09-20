import com.conferecne.repo.SpeakerRepo;
import com.conferecne.repo.speakerRepoImpl;
import com.conferecne.service.SpeakerService;
import com.conferecne.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.conferecne.repo.SpeakerRepo;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
   // @Scope(BeanDefinition.SCOPE_SINGLETON)
    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
    public SpeakerService getSpeakerService(){


        // autowire bean of SpeakerRepo into bean of SpeakerService

        //1. Constructor dependency injection:
   //     SpeakerServiceImpl speakerService = new SpeakerServiceImpl(
     //           getSpeakerRepo()
       // );

        //2. Setter Dependency Injection:
      //  speakerService.setSpeakerRepo(getSpeakerRepo());

        SpeakerServiceImpl speakerService = new SpeakerServiceImpl();

        return speakerService;
    }


    @Bean(name = "speakerRepo")
    public SpeakerRepo getSpeakerRepo(){
        return new speakerRepoImpl();
    }

}

// the singleton scope works this way; each time we request an object of a bean,
// it returns the same object (the same object address) of the bean
// each time we make a request of the bean.

// the prototype scope guarantees a unique object per request.
// It is the opposite of the singleton
