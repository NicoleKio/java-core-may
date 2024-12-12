package hw2.less3;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter
@Setter
public class PC {
    private int monitor;

    public PC() {}
    public PC(int monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "PC{" +
                "monitor=" + monitor +
                '}';
    }
}
