package opera;

import book.BookList;

public interface IOPeration {//创建接口
    void work(BookList bookList);//抽象方法
    //功能主要是针对图书的，也就是针对书架。
}
