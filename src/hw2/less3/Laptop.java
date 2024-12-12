package hw2.less3;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

//@Data
//@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
public class Laptop extends PC{
    private String version;

    @Override
    public String toString() {
        return "Laptop{" +
                "version='" + version + '\'' +
                '}';
    }

    public Laptop(int monitor, String version) {
        super(monitor);
        this.version = version;


    }
}
