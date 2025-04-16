package opera;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class BrrowOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书！");
        System.out.println("请输入要借阅的图书名字:");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int curentSize= bookList.getUsedSize();
        int x=1;
        for(int i=0;i<curentSize;i++){
            Book temp=bookList.getBook(i);
            if((temp.getName().equals(name))&&!temp.isBorrowed()){
               {

                    temp.setBorrowed(true);
                    x=0;
                   System.out.println("借阅成功！");
                   return;
                }
            }
        }
        if(x==1){
            System.out.println("没有该图书");
        }
    }
}
