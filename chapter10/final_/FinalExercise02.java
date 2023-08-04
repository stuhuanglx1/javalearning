package chapter10.final_;

public class FinalExercise02 {
    public int addOne(final int x){
//        ++x;//final属性不能被修改，错误
        return x + 1;//正确
    }
}
