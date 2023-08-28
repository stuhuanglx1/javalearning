package chapter13.stringBuilder_;

/**
 * @author H lx
 * @vision 1.0
 */
public class String_VS_StringBuffer_VS_StringBuilder {
    public static void main(String[] args) {
        //记录时间
        long startTime = 0L;
        long endTime = 0L;
        //创建一个空串
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");

        //测试StringBuffer
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间(200w)： " + (endTime - startTime));

        //测试StringBuilder
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 2000000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间(200w)： " + (endTime - startTime));

        //测试String
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间(2w)： " + (endTime - startTime));
    }
}
