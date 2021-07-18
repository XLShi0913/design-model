package p12.state.state;

import p12.state.Work;

public class AftrernoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println(
                    String.format("当前时间：%.2f点 下午状态还不错，继续努力", work.getHour()));
        } else {
            work.setState(new EveningState());
            work.writePrograme();
        }
    }
}
