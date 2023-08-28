package chapter13.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author H lx
 * @vision 1.0
 */
public class ArraysExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦1234",100);
        books[1] = new Book("水浒传",90);
        books[2] = new Book("三国演绎",110);
        books[3] = new Book("西游记",85);

        //按价格排序
        Book.bubble(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceDif = book1.getPrice() - book2.getPrice();
                //从小到大和从大到小可以对return的1he-1进行调换
                if (priceDif > 0){
                    return -1;
                } else if (priceDif < 0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        //按照书名长度排序
        Book.bubble(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double nameLenDif = book1.getName().length() - book2.getName().length();
                //从小到大和从大到小可以对return的1he-1进行调换
                if (nameLenDif > 0){
                    return -1;
                } else if (nameLenDif < 0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void bubble(Book[] books, Comparator c){
        Book temp;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                //数组的排序，由compare方法的返回值决定
                if (c.compare(books[j],books[j + 1]) <= 0){
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}
