package API;

import com.google.gson.Gson;

public class GsonTest {
    public static void main(String[] args) {
        Address address = new Address("인천","대한민국");
        Person member = new Person("홍길동",30,"hong@naver.com",address);

        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println(json);

        Person member1 = gson.fromJson(json,Person.class);
        System.out.println(member1);
    }
}
