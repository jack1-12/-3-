package user;

import book.BookList;
import opera.IOPeration;

public abstract class User {//抽象类
    protected String name;//名字.这边的protect代表的是名字的权限。如果是private,它只能在同一个包的同一类使用。就不能让AdminUser类继承了。写public的话
    //权限太大了，不是很好。
    protected IOPeration[] ioPerations;
    public User(String name) {//构造方法
        this.name = name;
    }
    public abstract int menu();//抽象方法,打印菜单,因为有了choice返回值int类型，所以void改成int
    public void doWork(int choice, BookList bookList){//通过选择的操作，去选择执行数组下的哪个操作
        this.ioPerations[choice].work(bookList);
    }
}
