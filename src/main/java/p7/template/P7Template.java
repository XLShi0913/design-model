package p7.template;

public class P7Template {
    public static void main(String[] args) {
        TestPaper ta = new TestPaperA();
        TestPaper tb = new TestPaperB();

        System.out.println("学生甲的试卷：");
        ta.testQuestion1();
        System.out.println("学生乙的试卷：");
        tb.testQuestion1();
    }
}
