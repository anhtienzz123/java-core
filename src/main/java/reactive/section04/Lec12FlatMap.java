package reactive.section04;

import reactive.Utils;

public class Lec12FlatMap {

    public static void main(String[] args) {
        UserService.getUsers().flatMap(user -> OrderService.getOrders(user.getId()))
                .subscribe(Utils.defaultSubscriber());
    }



}
