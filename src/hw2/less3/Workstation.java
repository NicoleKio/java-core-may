package hw2.less3;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Builder
public class Workstation extends Laptop {
    private String owner;

    public Workstation(int monitor, String version, String owner) {
        super(monitor, version);
        this.owner = owner;
    }
}
