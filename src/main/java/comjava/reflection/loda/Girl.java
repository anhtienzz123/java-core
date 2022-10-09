package comjava.reflection.loda;

import java.lang.reflect.Field;

public class Girl {

    private String name;

    public Girl() {

    }

    public Girl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" + "name='" + name + '\'' + '}';
    }

    public static void main(String[] args) throws Exception {

        // test field
        Girl girl = new Girl();
        girl.setName("Girl name");

        for (Field field : girl.getClass().getDeclaredFields()) {
            System.out.println();
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType());
        }

        // PHẦN CHÍNH
        Field nameField = girl.getClass().getDeclaredField("name"); // Lấy ra field có tên "name"
        // (nếu không tìm thấy, nó sẽ
        // bắn NoSuchFieldException)
        nameField.setAccessible(true); // Cho phép truy cập tạm thời. (Vì nó đang là Private mà)

        // Bây giờ cái "nameField" đại diện cho thuộc tính "name" của mọi object có class Girl.
        nameField.set(girl, "Bella"); // thay giá trị mới của `girl` bằng nameField.

        System.out.println(girl);


        // test method
        // Class<Girl> girlClass = Girl.class;
        // // Su dung getDeclaredMethods de lay ra nhung method cua class va cha no.
        // Method[] methods = girlClass.getDeclaredMethods();
        // for (Method method : methods) {
        // System.out.println();
        // System.out.println("Method: " + method.getName());
        // System.out.println("Parameters: " + Arrays.toString(method.getParameters()));
        // }
        //
        // // Lay ra method ten la setName va co 1 tham so truyen vao ->
        // // => chính là: setName(String name)
        // Method methodSetName = girlClass.getMethod("setName", String.class);
        // // Bây giờ methodSetName sẽ đại diện cho method setName(String name) của mọi object có
        // class
        // // là Girl
        //
        //
        // Girl girl = new Girl(); // Tạo ra đối tượng Girl
        //
        // // Thực hiện hàm setName() trên đối tượng girl, giá trị truyền vào là "Ngoc Trinh"
        // methodSetName.invoke(girl, "Ngoc Trinh");
        // System.out.println(girl);

        // test constructor
        // Class<Girl> girlClass = Girl.class;
        // System.out.println("Class: " + girlClass.getSimpleName());
        // System.out.println("Constructors: " + Arrays.toString(girlClass.getConstructors()));
        // try {
        // // Tạo ra một object Girl từ class. (Khởi tạo không tham số)
        // Girl girl1 = girlClass.newInstance();
        // System.out.println("Girl1: " + girl1);
        //
        // // Lấy ra hàm constructor với tham số là 1 string
        // // Chính là -> public Girl(String name) {}
        // Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class);
        // Girl girl2 = girlConstructor.newInstance("Hello");
        //
        // System.out.println("Girl2: " + girl2);
        // } catch (Exception e) {
        // // Exception xay ra khi constructor khong ton tai hoac tham so truyen vao khong dung
        // e.printStackTrace();
        // }
    }
}
