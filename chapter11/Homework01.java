package chapter11;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        Color color = Color.GREEN;
        color.show();
        //switch能和枚举对象进行使用
        //在switch()中放枚举对象
        //在每个case后，直接写枚举类中定义的枚举对象即可
        switch (color){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            case YELLOW:
                System.out.println("匹配到黄色");
                break;
            case BLACK:
                System.out.println("匹配到黑色");
                break;
            case GREEN:
                System.out.println("匹配到绿色");
                break;
            default:
                System.out.println("未成功匹配");
        }
    }
}
enum Color implements IC{
    RED(255,0,0),
    BLACK(0,0,0),
    BLUE(0,0,225),
    YELLOW(225,225,0),
    GREEN(0,225,0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(name() + "\tred value:" + redValue +
                "\tgreen value:" + greenValue + "\tblue value:" + blueValue);
    }
}
interface IC{
    public void show();
}
