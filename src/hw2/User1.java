package hw2;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User1 {
    private int id;
    private String name;
    private String username;
    private String email;

    @Data
    @Builder
    public class Address{
        private String street;
        private String suite;
        private String city;
        private String zipcode;

        @Data
        @Builder
        public static class Geo{
            private String lat;
            private String lng;
        }

        private Geo geo;
    }

    private Address address;
    private int phone;
    private String website;

    @Data
    @Builder
    public static class Company{
        private String name;
        private String catchPhrase;
        private String bs;
    }
    private Company company;
}
