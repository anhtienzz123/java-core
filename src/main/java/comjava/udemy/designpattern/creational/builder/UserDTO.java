package comjava.udemy.designpattern.creational.builder;

import lombok.Data;

@Data
public class UserDTO {

    private int id;

    private String name;

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {

        private int id;

        private String name;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public UserDTO build() {
            UserDTO userDTO = new UserDTO();
            userDTO.id = this.id;
            userDTO.name = name;
            return userDTO;
        }
    }


}
