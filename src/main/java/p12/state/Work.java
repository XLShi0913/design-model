package p12.state;

import lombok.Getter;
import lombok.Setter;
import p12.state.state.State;

@Getter
@Setter
public class Work {
    private double hour;
    private boolean finish;

    private State state;

    public void writePrograme() {
        state.writeProgram(this);
    }
}
