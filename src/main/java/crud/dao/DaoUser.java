//package crud.dao;
//
//import crud.model.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.persistence.EntityManager;
//import java.util.List;
//
//@Repository
//public class DaoUser implements DaoInterfaceUser{
//
//    @Autowired
//   private EntityManager entityManager;
//
//
//    public void save (User user){
//        entityManager.persist(user);
//    }
//
//    @Override
//    public void updateUser(User user) {
//
//    }
//
//    @Override
//    public void deleteUser(int id) {
//
//    }
//
//    @Override
//    public User findUser(int id) {
//        return null;
//    }
//
//    @Override
//    public List<User> allUsers() {
//        return null;
//    }
//}
