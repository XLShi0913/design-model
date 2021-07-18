package p12.state.state;

import p12.state.Work;

public class NoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println(
                    String.format("当前时间：%.2f点 饿了，午饭；犯困，午休", work.getHour()));
        } else {
            work.setState(new AftrernoonState());
            work.writePrograme();
        }
    }
}
