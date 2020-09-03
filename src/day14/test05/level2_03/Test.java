package day14.test05.level2_03;

public class Test {
    public static void main(String[] args) {
        try {
            login("tom","123456");
           // login("jack","123456");
            login("tom","12345");
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
    public static void login(String name,String pwd) throws LoginException {
        if (!name.equals("tom")){
                throw new LoginException("用户名不存在");
        }
        if (!pwd.equals("123456")){
          throw new LoginException("密码错误");
        }
        System.out.println("欢迎您回来"+name);
    }
}
