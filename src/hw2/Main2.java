package hw2;

import hw1.Car;

public class Main2 {
    public static void main(String[] args) {

//        створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
//        https://jsonplaceholder.typicode.com/users/1


        User1 user1 = User1.builder()
                .id(1)
                .name("yuu")
                .username("yuu-chan")
                .email("yuu@gmail.com")
                .build();

        User1.Address address = User1.Address.builder()
                .street("Rokko")
                .suite("Sia")
                .city("SiaNor")
                .zipcode("iiii21")
                .build();

        User1.Address.Geo geo = User1.Address.Geo.builder()
                .lat("kkk")
                .lng("ttt")
                .build();
        address.setGeo(geo);

        user1.setAddress(address);

        User1.Company company = User1.Company.builder()
                .name("Nana")
                .catchPhrase("Just Do")
                .bs("444")
                .build();
        user1.setCompany(company);

        System.out.println(user1);

        // Створити клас котрий відповідає наступній моделі
        //{
        //    id: 1,
        //    name: 'vasya',
        //    surname: 'pupkin',
        //    email: 'asd@asd.com',
        //    age: 31,
        //    gender: 'MALE',
        //    skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
        //    car: {model: 'toyota', year: 2021, power: 250}
        //}
        //Використати композицію/агрегацію та енуми в потрібному місці.

        System.out.println("-------------------------------------");
        User2.Skill[] skillsArray = new User2.Skill[]{
                User2.Skill.builder().title("java").exp(10).build(),
                User2.Skill.builder().title("js").exp(10).build()
        };
        User2 Dalia = User2.builder()
                .id(2)
                .name("Dalia")
                .surname("Dalian")
                .email("dalian@gmail.com")
                .age(22)
                .gender(Gender.MALE)
                .skills(skillsArray)
                .car(new Car("tesla", "555", 65, true))
                .build();

        System.out.println(Dalia);
    }



}





