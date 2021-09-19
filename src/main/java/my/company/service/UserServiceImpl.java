package my.company.service;

import my.company.model.User;
import my.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //todo  у этой транзакции есть параметра, и для методов чтения его нужно поставить
@Service
public class UserServiceImpl implements UserService{//todo почитай про кодстайл, он у тебя хромает
    private final UserRepository userRepository;
//todo сейчас на всех почти проектах есть ломбок, исправь все с ломбоком
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deletedOnId(Integer id) {// todo про названия написал в интерфейсе
        userRepository.deleteById(id);
    }

    @Override
    public List<User> selectAll() {
        return userRepository.findAll();
    }

    @Override
    public User selectedOnId(Integer id) {
       return userRepository.findById(id).orElse(new User());//todo прочитай про optional и посмотри что он тебе вернет если юзера не будет с таким айди и поймешь что это гамно
    }

    @Override
    public void deletedAll() {
        userRepository.deleteAll();
    }
//todo посмотри пробелы везде, сделай по-людски а не на скорую руку

}
