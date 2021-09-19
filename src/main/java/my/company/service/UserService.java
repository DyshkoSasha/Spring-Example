package my.company.service;

import my.company.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;//todo это что за импорт?

@Repository//todo це шо?
public interface UserService {
    void addUser(User user);

    void deletedOnId(Integer id);//todo что за On?

    List<User> selectAll();

    User selectedOnId(Integer id);//todo некае не очень название и что за On?

    void deletedAll();
}
