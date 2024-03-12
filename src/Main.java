public class Main {
    public static void main(String[] args) {
//        Kieu khai bao        Kieu doi tuong
//        Kieu khai bao: bao cho trinh bien dich biet day la loai gi
//        Kieu doi tuong la kieu thuc te cua no
        Book f1 = new FictionBook("Sach lang man");
//        ep kieu tu kieu con -> Kieu cha
//        f1: Kieu khai bao la kieu Book
//        f1: Kieu thuc te la FB
//        f1.getCategory();
        FictionBook f2 = new FictionBook();
        FictionBook f3 = new FictionBook("01", "Sach ngon tinh 1", 120, "TG1", " Tieu thuyet");

        Book[] books = new Book[6];
//        Duyet 1 mang cung kieu cha
        books[0] =f1;
        books[1] = f2;
        books[2] = f3;
        books[3] = new ProgrammingBook("02", "Java 1", 100, "TG2", "Java");
        books[4] = new ProgrammingBook("05", "PHP 2", 100, "TG2", "PHP");
        books[5] = new ProgrammingBook("06", "C#", 100, "TG2", "C#");
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            sum+= books[i].getAmount();
        }
        System.out.println(sum);

        for (int i = 0; i < books.length; i++) {
//            dau la PB
            if (books[i] instanceof ProgrammingBook)
            {
//                ep kieu tu cha xuong con
//                muon lay thuoc tinh rieng cua lop con
               ProgrammingBook b =  (ProgrammingBook)books[i];
                System.out.println(b.getLanguage());
            }
//                System.out.println(i + " la sach lap trinh");
//            else
//                System.out.println(i + " la sach vien tuong");
        }

    }
}
