package my.company.service;

import my.company.model.User;
import my.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deletedOnId(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> selectAll() {
        return userRepository.findAll();
    }

    @Override
    public User selectedOnId(Integer id) {
       return userRepository.findById(id).orElse(new User());
    }

    @Override
    public void deletedAll() {
        userRepository.deleteAll();
    }


}
