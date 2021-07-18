package p12.state.state;

import p12.state.Work;

public class EveningState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writePrograme();
        } else {
            if (work.getHour() < 21) {
                System.out.println(
                        String.format("当前时间：%.2f点 加班哦，疲惫至极", work.getHour()));
            } else {
                work.setState(new SleepState());
                work.writePrograme();
            }
        }
    }
}
