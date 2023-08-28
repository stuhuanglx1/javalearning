package chapter13.homework_;

/**
 * @author H lx
 * @vision 1.0
 */
public class Homework02 {
    public static void userRegster(String name,String pwd,String email){
        if (name == null || pwd == null || email == null){
            throw new RuntimeException("输入不能为空");
        }

        if (!(name.length() > 1 && name.length() < 5)){
            throw new RuntimeException("用户名长度应该为2、3、4");
        }

        if (!(pwd.length() == 6 && isDigital(pwd))){
            throw new RuntimeException("密码长度要为6，且全为数字");
        }

        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)){
            throw new RuntimeException("邮箱中要包含@和.");
        }
    }
    public static boolean isDigital(String str){
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isDigit(chars[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String name = "hl";
        String passward = "666666";
        String email = "398@kk.s";
        try {
            userRegster(name,passward,email);
            System.out.println("恭喜你，注册成功！");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

