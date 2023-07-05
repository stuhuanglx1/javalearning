package chapter03;

public class homework01_04 {

    public static void main(String[] args) {
        //homework01--程序阅读题，求输出
        int n1;
        n1 = 13;
        int n2;
        n2 = 17;
        int n3;
        n3 = n1 + n2;
        System.out.println("n3=" + n3);
        int n4 = 38;
        int n5 = n4 - n3;
        System.out.println("n5=" + n5);
        //答案：n3=30  n5=8

        System.out.println("=======================================");
        //homework02--char类型
        char c1 = '\n';//换行
        char c2 = '\t';//制表位
        char c3 = '\r';//回车
        char c4 = '\\';//转义，输出\
        char c5 = '1';//1
        char c6 = '2';//2
        char c7 = '3';//3
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
        System.out.println("c5 = " + c5);
        System.out.println("c6 = " + c6);
        System.out.println("c7 = " + c7);

        System.out.println("=======================================");
        //homework03--数据类型拼接
        String book1 = "语文书";
        String book2 = "数学书";
        System.out.println(book1 + book2);//语文书数学书
        char sex1 = '男';
        char sex2 = '女';
        System.out.println(sex1 + sex2);//两个字符编码和的值 -->  52906
        float price1 = 12.34f;
        float price2 = 24.34f;
        System.out.println(price1 + price2);//36.68

        System.out.println("=======================================");
        //homework04--综合(姓名、年龄、成绩、性别、爱好)
        String name01 = "黄一";
        int age01 = 20;
        double score01 = 98.5;
        char sex01 = '女';
        String habit01 = "跑步";
        System.out.println("姓名\t\t年龄\t\t成绩\t\t性别\t\t爱好\n" + name01 + "\t\t" +
                age01 + "\t\t" + score01 + "\t" + sex01 + "\t\t" +habit01);


    }

}
