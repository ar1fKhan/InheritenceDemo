package dev.arif.inheritencetabledemo;

import dev.arif.inheritencetabledemo.joinedTable.Mentor;
//import dev.arif.inheritencetabledemo.MappedSuperClass.MentorRepository;
import dev.arif.inheritencetabledemo.joinedTable.User;
//import dev.arif.inheritencetabledemo.MappedSuperClass.UserRepository;
//import dev.arif.inheritencetabledemo.tableperclass.MentorRepository;
//import dev.arif.inheritencetabledemo.tableperclass.UserRepository;
import dev.arif.inheritencetabledemo.joinedTable.MentorRepository;
import dev.arif.inheritencetabledemo.joinedTable.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritenceTableDemoApplication implements CommandLineRunner {

    private UserRepository userRepository;
    private MentorRepository mentorRepository;
    /*public InheritenceTableDemoApplication(UserRepository userRepository, MentorRepository mentorRepository) {
        this.userRepository = userRepository;
        this.mentorRepository = mentorRepository;
    }*/
    /*public InheritenceTableDemoApplication(@Qualifier("tpc_ur") UserRepository userRepository, @Qualifier("tpc_mr") MentorRepository mentorRepository) {
        this.userRepository = userRepository;
        this.mentorRepository = mentorRepository;
    }*/

    public InheritenceTableDemoApplication(@Qualifier("jt_ur") UserRepository userRepository, @Qualifier("jt_mr") MentorRepository mentorRepository) {
        this.userRepository = userRepository;
        this.mentorRepository = mentorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        // Create a user
       /* User user = new User();
        user.setName("Arif");
        user.setEmail("Arif@Yahoo.com");
        userRepository.save(user);

        // Create a mentor
        Mentor mentor = new Mentor();
        mentor.setName("khan");
        mentor.setEmail("khan@Yahoo");
        mentor.setAverageRating(4.5);
        mentorRepository.save(mentor);*/

        // Create a user
      /*  User user = new User();
        user.setName("Arif");
        user.setEmail("arif@mail.com");
        userRepository.save(user);
*/
        // Create a mentor
       /* Mentor mentor = new Mentor();
        mentor.setName("khan");
        mentor.setEmail("khan@mail.com");
        mentor.setAverageRating(4.5);
        mentorRepository.save(mentor);*/

        // Create a user
        User user = new User();
        user.setName("Arif");
        user.setEmail("arif@mail.com");
        userRepository.save(user);

        // Create a mentor
        Mentor mentor = new Mentor();
        mentor.setName("khan");
        mentor.setEmail("khan@mail.com");
        mentor.setAverageRating(4.5);
        mentorRepository.save(mentor);

    }

    public static void main(String[] args) {
        SpringApplication.run(InheritenceTableDemoApplication.class, args);
    }

}
