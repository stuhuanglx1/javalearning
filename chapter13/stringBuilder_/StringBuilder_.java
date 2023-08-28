package chapter13.stringBuilder_;

/**
 * @author H lx
 * @vision 1.0
 */
public class StringBuilder_ {
    /**
     * StringBuilder
     1、一个可变字符序列。此类提供一个与StringBuffer兼容的API，但不保证同步（不是线程安全）
     该类被设计用作StringBuffer的一个简易替换，用在字符缓冲区被单个线程使用的情况下，大多数实现中，比StringbBuffer快
     2、在StringBUlider上的主要操作是append和insert方法，可重载，以接收任意类型数据
     3、父类、接口：直接父类是AbstractStringBuilder（接口Appendable, CharSequence），接口Serializable、CharSequence
     继承关系和StringBuffer一致
     4、StringBuilder是final类，不能被继承
     5、对象的字符序列仍然存在其父类AbistractStringBuilder的char[] value中，存放在堆中
     6、StringBuild的方法，没有做互斥的处理，即没有synchronized，因此推荐在单线程情况下使用它
     【String VS StringBuffer VS StringBuilder】
     1）StringBuffer 和 StringBuilder类似，均代表可变数列，且方法一样
     2）String是不可变字符序列，效率低，但是复用率高
     3）StringBuffer是可变字符序列，效率高（增加和删除尤其），线程安全
     4）StringBuilder是可变字符序列，效率最高，线程不安全
     5）String的注意说明：String类型如果多次执行改变串内容的操作，会导致大量副本字符串留在内存中，降低效率 ==> 在循环中会极大影响性能
     如果需要对字符串做大量修改，不要使用String
     效率：StringBuilder > StringBuffer > String
     【使用原则】
     1、如果字符串存在大量修改，使用StringBuffer或StringBuilder
     2、如果字符串存在大量修改，并单线程的情况，使用StringBuilder
     3、如果字符串存在大量修改，并多线程的情况，使用StringBuffer
     4、如果字符串很少修改，被多个对象引用，使用String，如配置对象信息等
     * */
}
