package my.company.service;

import lombok.RequiredArgsConstructor;
import my.company.model.User;
import my.company.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class UserServiceImpl implements UserService{        //todo почитай про кодстайл, он у тебя хромает
    private final UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional(readOnly = true)
    public void deletedById(Integer id) {
        userRepository.deleteById(id);
    }

    @Override
    public List<User> selectAll() {
        return userRepository.findAll();
    }

    @Override
    public User selectedById(Integer id) throws NoEntityException {
       return userRepository.findById(id).orElseThrow(() -> new NoEntityException("GAMNISCHE"));
    }

    @Override
    @Transactional(readOnly = true)
    public void deletedAll() {
        userRepository.deleteAll();
    }
}
