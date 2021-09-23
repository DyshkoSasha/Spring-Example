package my.company;

import my.company.config.SpringConfig;
import my.company.model.Adress;
import my.company.model.User;
import my.company.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class
        );
//
//        String[] beanDefinitionNames = context.getBeanDefinitionNames();
//        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
        User user1 = new User("Yuzik", "Labeckiy", 33,
                new Adress("Minsk", "Nezavisimosti", 27));

        User user2 = new User("Arkadiy", "Petyshinskiy", 33,
                new Adress("Minsk", "Nezavisimosti", 28));

        User user3 = new User("Andrei", "Kynin", 33,
                new Adress("Minsk", "Nezavisimosti", 29));

        User user4 = new User("Sasha", "Soroka", 33,
                new Adress("Minsk", "Nezavisimosti", 87));

        User user5 = new User("Enakentiy", "Mokronosov", 44,
                new Adress("Minsk", "Nezavisimosti", 27));

        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
//
//        userServiceImpl.addUser(user1);
//        userServiceImpl.addUser(user2);
//        userServiceImpl.addUser(user3);
//        userServiceImpl.addUser(user4);

        userServiceImpl.deletedById(252);
//        userServiceImpl.deletedAll();
//
//        List<User> listUsers = userServiceImpl.selectAll();
//        listUsers.forEach(System.out::println);

//        User user5 = userServiceImpl.selectedById(15);
//        System.out.println(user5);

//        User user6 = new User(202,"sashaLOH", "sorokaLOH", 97);
//        userServiceImpl.addUser(user6);
    }
}
