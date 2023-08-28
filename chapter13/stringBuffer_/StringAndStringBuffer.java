package chapter13.stringBuffer_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        //String -> StringBUffer
        String str = "hello world!";
        //方式1--构造器（String str）
        StringBuffer stringBuffer = new StringBuffer(str);
        //这种方式返回的是StringBuffer，但str仍然是String类型
        //方式2--append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //StringBuffer -> String
        StringBuffer stringBuffer2 = new StringBuffer("java learning");
        //方式1--toString方法
        String s = stringBuffer2.toString();
        //方式2--构造器（StringBuffer strb）
        String s1 = new String(stringBuffer2);
    }
}
