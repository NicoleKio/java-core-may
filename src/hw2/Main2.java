package hw2;

public class Main2 {
    public static void main(String[] args) {

        User1 user1 = User1.builder()
                .id(1)
                .name("yuu")
                .username("yuu-chan")
                .email("yuu@gmail.com")
                .build();
        User1.Address address = user1.new Address(
                "y1",
                "i1",
                "Odessa",
                "44454",
                new User1.Address.Geo("ooo", "ppp")
                );

        //        User1.Address.Geo geo = User1.Address.Geo.builder()
        //                .lat("40.7128")
        //                .lng("-74.0060")
        //                .build()
        user1.setAddress(address);

        User1.Company company = User1.Company.builder()
                .name("Nana")
                .catchPhrase("Just Do")
                .bs("444")
                .build();
        user1.setCompany(company);

        System.out.println(user1);


    }
}
