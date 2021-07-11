package p7.template;

/**
 * 试卷
 */
public abstract class TestPaper {
    public void testQuestion1() {
        System.out.println("杨过得到，后来给了郭靖，炼成倚天剑、屠龙刀的玄铁可能是[] \n" +
                "a.球墨铸铁 b.马口铁 c.高速合金钢 d.碳素钢");
        System.out.println("答案：" + answer1());
    }

    protected abstract String answer1();
}
