package p12.state;

import p12.state.state.ForenoonState;

public class P12State {
    public static void main(String[] args) {
        Work work = new Work();
        work.setState(new ForenoonState());

        work.setFinish(true);

        for (int i = 8; i <= 22; i+=2) {
            work.setHour(i);
            work.writePrograme();
        }
    }
}
