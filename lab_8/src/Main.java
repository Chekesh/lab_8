import java.util.Scanner;
class Reader{
    String full_name;
    int number_ticket;
    String faculty;
    String date_birth;
    String telephon;
    Reader(String full_name, int number_ticket, String faculty, String date_birth, String telephone){
        this.full_name=full_name;
        this.number_ticket=number_ticket;
        this.faculty=faculty;
        this.date_birth=date_birth;
        this.telephon=telephone;
    }
    //void result(){System.out.println(full_name +" "+number_ticket +" "+faculty +" "+date_birth +" "+telephon);}
    void takeBook(int kol){System.out.println(this.full_name+" взял "+kol+" книги");}
    void takeBook(String[] name){
        String books = String.join(",",name);
        System.out.println(this.full_name+" взял книги:"+books);
    }
    void returnBook(int kol){System.out.println(this.full_name+" вернул "+kol+" книги");}
    void returnBook(String[] name){
        String books = String.join(",",name);
        System.out.println(this.full_name+" вернул книги:"+books);
    }
}
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Reader artem=new Reader("Доброхотов Артем Николаевич", 231, "Программирование", "13.02.2006", "+79365820476");
        Reader nikita=new Reader("Чекушин Никита Сергеевич", 324, "Программирование", "20.09.2005", "+79273885180");
        Reader dima=new Reader("Вапилин Дмитрий Дмитриевич", 201, "Программирование", "27.12.2004", "+79357040843");
        Reader kirill=new Reader("Баландин Кирилл Михайлович", 111, "Программирование", "18.04.2005", "+79257406509");
        Reader maxim=new Reader("Марков Максим Антонович", 89, "Программирование", "13.07.2005", "+79456783290");
        Reader[] sp={artem,nikita,dima,kirill,maxim};
        for(int i = 0;i<sp.length; i++){
            Reader ob = sp[i];
            //ob.result();
            int kol = in.nextInt();
            ob.takeBook(kol);
            String[] book = new String[kol];
            for (int y=0;y<kol;y++){
                System.out.print(y+"");
                String namebook = in.next();
                book[y]=namebook;
            }
            ob.takeBook(book);
        }
    }
}