package crud.Service;

import crud.model.User;


import java.util.List;


public interface ServiceInterfaceUser {
    public void save(User user);

    public void updateUser(User user, int id);

    public void deleteUser(int id);

    public User findUser(int id);

    public List<User> allUsers();

}
