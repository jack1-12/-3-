package opera;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOPeration{//继承
    @Override
    public void work(BookList bookList) {//重写IOPeration类中的work方法
        System.out.println("查找图书！");
        System.out.println("请输入要查找的图书名字");
        Scanner scanner=new Scanner(System.in);
       String name=scanner.nextLine();
       int currentSize= bookList.getUsedSize();
       for (int i=0;i<currentSize;i++){
           Book book=bookList.getBook(i);
           if(book.getName().equals(name)){//判断查找图书名字是否相同
               System.out.println("查到了：");
               System.out.println(book);//输出图书信息
               return;
           }
       }
        System.out.println("没有这本书！");
    }

}
