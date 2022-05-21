package crud.Service;

import crud.model.User;
import crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceUser implements ServiceInterfaceUser {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Transactional
    @Override
    public void updateUser(User user, int id) {
        User user1 = userRepository.findById(id).get();
        user1.setName(user.getName());
        user1.setAge(user.getAge());
        user1.setHobby(user.getHobby());

    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);

    }

    @Transactional
    @Override
    public User findUser(int id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Transactional
    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }
}
