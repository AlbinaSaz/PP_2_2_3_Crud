package crud.Service;

import crud.dao.DaoUser;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceUser implements ServiceInterface {
    @Autowired
    private DaoUser daoUser;

    @Transactional
    @Override
    public void save(User user) {
        daoUser.save(user);
    }

    @Transactional
    @Override
    public void updateUser(User user, int id) {
        daoUser.updateUser(user, id);

    }

    @Transactional
    @Override
    public void deleteUser(int id) {
        daoUser.deleteUser(id);

    }

    @Transactional
    @Override
    public User findUser(int id) {
        User user = daoUser.findUser(id);
        return user;
    }

    @Transactional
    @Override
    public List<User> allUsers() {
        return daoUser.allUsers();
    }
}
