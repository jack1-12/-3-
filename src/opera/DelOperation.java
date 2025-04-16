package opera;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOPeration{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书！");
        System.out.println("请输入要删除图书的名称");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        int currentSize= bookList.getUsedSize();
        int index=-1;
        int z=0;
        for (int i=0;i<currentSize;i++){
            Book temp=bookList.getBook(i);
            if(temp.getName().equals(name)){//判断查找图书名字是否相同
                index=i;
                z=1;
                break;
            }
        }
        if(z==0){
            System.out.println("没有这本书！");
            return;
        }
        //删除图书，把后面的图书往前面挪
        for (int j=index;j<currentSize-1;j++){
            Book book=bookList.getBook(j+1);//拿到j下标后面的书
            bookList.setBooks(j,book);//放到j下标的位置
        }
        bookList.setUsedSize(currentSize-1);//修改size值
        bookList.setBooks(currentSize-1,null);//因为删除的是对象,所以把地址置为null，就没有人引用了
        System.out.println("删除成功！");
    }

}
