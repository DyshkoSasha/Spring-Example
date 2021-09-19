package my.company.service;

import my.company.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserService {
    void addUser(User user);

    void deletedOnId(Integer id);

    List<User> selectAll();

    User selectedOnId(Integer id);

    void deletedAll();
}
