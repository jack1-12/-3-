package opera;

import book.BookList;

public class ExitOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);//退出系统。0代表正常退出
    }
}
