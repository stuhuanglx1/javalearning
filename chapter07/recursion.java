package chapter07;

public class recursion {
    public static void main(String[] args){

        T t = new T();
        t.test1(5);// n=2 n=3 n=4 n=5

        int r = t.factorial(6);
        System.out.println(r);//720

        /*
        递归重要规则
        1、执行一个方法时会开辟一个独立空间
        2、方法的局部变量是独立的，不会互相影响
        3、若形式参数传递的是引用类型（数组、对象），就会共享该引用类型数据
        4、递归必须向退出递归条件逼近-->设置递归出口
        5、当方法执行完毕或者遇到return就会返回，遵循谁调用就将结果返回给谁
         */

        //练习1--斐波那契数
        System.out.println("练习1：斐波那契数===========================");
        int result_f = t.fibonacci(7);
        if (result_f != -1){
            System.out.println("结果为：" + result_f);
        }

        //练习2--猴子吃桃
        System.out.println("练习2：猴子吃桃===========================");
        int peachNum = t.eatPeaches(10);
        System.out.println("最初有" + peachNum + "个桃子");//1534个桃子

        //练习3--迷宫
        System.out.println("练习2：迷宫===========================");
        /*
        思路：
        1、先创建迷宫，用二维数组map表示
        2、规定map中的元素值：0可以通过，1表示障碍物
         */
        int[][] map = new int[8][7];
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                if (i == 0 || i == map.length - 1 || j == 0 || j == map[i].length - 1){
                    map[i][j] = 1;
                }
            }
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[4][4] = 1;
        map[5][3] = 1;
        map[2][2] = 1;
        int[][] map2 = new int[8][7];
        for (int i = 0;i < map2.length;i++){
            for (int j = 0;j < map2[i].length;j++){
                map2[i][j] = map[i][j];
            }
        }
        System.out.println("===========当前地图=========");
        for (int i = 0;i < map.length;i++){
            for (int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("===========迷宫寻路地图:找路策略1=========");
        if (t.findPath(map,1,1)){
            for (int i = 0;i < map.length;i++){
                for (int j = 0;j < map[i].length;j++){
                    System.out.print(map[i][j] + "\t");
                }
                System.out.println();
            }
        }

        System.out.println("===========迷宫寻路地图:找路策略2=========");
        if (t.findPath2(map2,1,1)){
            for (int i = 0;i < map2.length;i++){
                for (int j = 0;j < map2[i].length;j++){
                    System.out.print(map2[i][j] + "\t");
                }
                System.out.println();
            }
        }

        //练习3--汉诺塔
        System.out.println("练习3：汉诺塔===========================");
        t.move(3,'a','b','c');

        //练习4--八皇后
        System.out.println("练习4：八皇后===========================");
        int[] eightQueen = new int[8];
        t.put(eightQueen,0);


    }
}

class T{
    public void test1(int n){
        if (n > 2){
            test1(n - 1);
        }
        System.out.println("n=" + n);
    }

    //阶乘
    public int factorial(int n){
        if (n == 1){//递归出口
            return 1;
        }else {
            return factorial(n-1) * n;
        }
    }

    //斐波那契数
    public int fibonacci(int n){
        if (n >= 1){
            if (n == 1 || n == 2){
                return 1;
            }else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        }else {
            System.out.println("要求输入大于1的整数");
            return -1;
        }
    }

    //猴子吃桃 -- 反着考虑，把第十天作为当前天，然后第九天就是前一天（day相当于2），第八天就是前两天（day为3）
    public int eatPeaches(int day){
        if (day == 1){
            return 1;
        }else {
            return (eatPeaches(day - 1) + 1) * 2;
        }
    }

    //迷宫
    /*
    1、设置的路径和设置的找路策略有关（与找路的上下左右顺序有关）
    2、在得到路径后可以更改找路策略进行验证
    3、测试回溯现象
    注释：
    ①如果findPath找到出口，则返回true，否则返回false
    ②i和j是位置，初始化位置在（1，1）
    ③0可以通过，1表示障碍物，2表示走过且可以走，3表示走过但是死路
    ④找路策略：下->右->上->左
     */
    public boolean findPath(int[][] map,int i,int j){
        if (map[6][5] == 2){//说明已经找到路
            return true;
        }else {
            if (map[i][j] == 0){
                //假定可以走通-->是否真的能走通还得看下面的路径
                map[i][j] = 2;
                //使用找路策略，来确定是否真的可以走通
                if (findPath(map,i + 1,j)){  //下
                    return true;
                }else if (findPath(map,i,j + 1)){  //右
                    return true;
                }else if (findPath(map,i - 1,j)){  //上
                    return true;
                }else if (findPath(map,i,j - 1)){  //左
                    return true;
                }else {
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }

    //找路策略：右->下->左->上
    public boolean findPath2(int[][] map,int i,int j){
        if (map[6][5] == 2){//说明已经找到路
            return true;
        }else {
            if (map[i][j] == 0){
                //假定可以走通-->是否真的能走通还得看下面的路径
                map[i][j] = 2;
                //使用找路策略，来确定是否真的可以走通
                if (findPath2(map,i,j + 1)){  //右
                    return true;
                }else if (findPath2(map,i + 1,j)){  //下
                    return true;
                }else if (findPath2(map,i ,j - 1)){  //左
                    return true;
                }else if (findPath2(map,i - 1,j)){  //上
                    return true;
                }else {  //当四个方向都走不通时，会赋值3，然后重新返回上一个位置的往下一个方向走
                    map[i][j] = 3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }

    //汉诺塔--???
    public void move(int num,char a,char b,char c){
        //如果只有一个盘
        if(num == 1){
            System.out.println(a + "->" + c);
        }else {
            /*
            如果有两个盘，可以看成两个盘，最下面的盘和上面所有盘
            1、先移动上面所有的盘到b，借助c
            2、把最下面的盘移动到c
            3、把b所有盘移动到c，借助a
             */
            move(num - 1,a,c,b);
            System.out.println(a + "->" + c);
            move(num - 1,b,a,c);

        }
    }

    //八皇后
    //放置
    public void put(int[] map,int index){
        if (index == map.length){
            for (int i = 0;i < map.length;i++){
                System.out.print(map[i] + "\t");
            }
            System.out.println();
        }else {
            for (int i = 0;i < map.length;i++){
                map[index] = i;
                if (judge(map,index)){
                    put(map,index + 1);
                }
            }
        }
    }
    //判断是否冲突
    public boolean judge(int[] map,int index){
        for (int i = 0;i < index;i++){
            if (map[i] == map[index] || Math.abs(map[i] - map[index]) == Math.abs(i - index)){
                return false;
            }
        }
        return true;
    }


}
