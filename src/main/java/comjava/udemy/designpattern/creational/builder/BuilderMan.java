package comjava.udemy.designpattern.creational.builder;

public class BuilderMan {

    public static void main(String[] args) {
        UserDTO userDTO = UserDTO.builder().id(1).name("user 1").build();

        System.out.println("userDTO: " + userDTO);
    }
}
