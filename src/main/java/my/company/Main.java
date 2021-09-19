package my.company;

import com.sun.xml.bind.v2.TODO;
import my.company.config.SpringConfig;
import my.company.model.User;
import my.company.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
//
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        User user = new User("sasha", "soroka", 97);
        User user1 = new User("Anton", "Samoilovskiy", 37);
        User user2 = new User("Yzik", "Labeckiy", 34);
        User user3 = new User("Victor", "Korolev", 65);
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
//        userServiceImpl.addUser(user);
//        userServiceImpl.addUser(user1);
//        userServiceImpl.addUser(user2);
//        userServiceImpl.addUser(user3);

//        userServiceImpl.deletedOnId(1);
//        userServiceImpl.deletedAll();
//
//        List<User> listUsers = userServiceImpl.selectAll();
//        System.out.println(listUsers); //todo разве так выводится список???

        User user5 = userServiceImpl.selectedOnId(152);
        System.out.println(user5);

//        User user6 = new User(52,"sashaLOH", "sorokaLOH", 97);
//        userServiceImpl.addUser(user6);


//todo они везде
    }
}
