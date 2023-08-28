package chapter13.stringBuffer_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s= new StringBuffer("hello world");
        //增append
        s.append(',');
        System.out.println(s);
        s.append("我是").append("帅哥").append(100).append(true);
        System.out.println(s);
        //删delete(start,end)  前闭后开
        s.delete(14,16);
        System.out.println(s);
        //改repalce(start,end,string)
        s.replace(14,21,"美女");
        System.out.println(s);

        s.append("美女").append("美女");
        System.out.println(s);
        //查indexOf
        System.out.println(s.indexOf("美女"));

        //插insert
        s.insert(7,"插入");
        System.out.println(s);
        //获取长度length
        System.out.println(s.length());
    }
}
