package hw2.less2;

import hw1.Car;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User2 {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private Skill[] skills;

    @Data
    @Builder
    public static class Skill {
        private String title;
        private int exp;
    }

    private Car car;
}
