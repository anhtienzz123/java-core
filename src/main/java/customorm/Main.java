package customorm;

import customorm.entity.User;
import customorm.repository.Repository;
import customorm.repository.RepositoryImpl;

public class Main {

    public static void main(String[] args) throws Exception {
        Repository<User, Integer> userRepository = new RepositoryImpl(User.class, Integer.class);

        // User user = new User(2, "Jim", 10, 2.5f);
        // userRepository.save(user);

        System.out.println(userRepository.findAll());


        // UserOrder userOrder = new UserOrder(20l, "Piyush", 23.2, true, 2);
        //
        // Repository<UserOrder, Long> orderRepository = new RepositoryImpl(UserOrder.class,
        // Long.class);
        // System.out.println(orderRepository.findAll());
        // System.out.println(orderRepository.findById(10l));
        // orderRepository.save(userOrder);
        // System.out.println(orderRepository.findById(10l));
        // System.out.println(orderRepository.findAll());
        // orderRepository.deleteById(10l);
    }
}
