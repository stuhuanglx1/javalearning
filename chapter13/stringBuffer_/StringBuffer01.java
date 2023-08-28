package chapter13.stringBuffer_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        //父类AbistractStringBuilder的char[] value用于存放字符，不是final类型

        //StringBuffer的构造器
        StringBuffer stringBuffer1 = new StringBuffer();//创建大小为16的char[],用于存放字符内容
        StringBuffer stringBuffer2 = new StringBuffer(100);//指定char[]的大小
        StringBuffer hello = new StringBuffer("hello");//在当前字符串长度上再+16
    }
}
