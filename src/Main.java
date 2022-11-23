public class Main {
    public static void main(String[] args) {
        Author harper = new Author("Harper", "Lee");
        Author harper1=new Author("Harper", "Lee");
        System.out.println("имя автора - " + harper.getAuthorName()+", фамилия автора - " + harper.getLastName());
        Author kim = new Author("Kim", "Eun Sook");
        Author kim1 = new Author("Kim", "Eun Sook");
        System.out.println("имя автора - " + kim.getAuthorName()+", фамилия автора - " + kim.getLastName());

        Book mockingbird=new Book("Mockingbird",harper, 1960);
        Book mockingbird1=new Book("Mockingbird",harper, 1960);
        System.out.println("название книги - " + mockingbird.getBookNames()+", год выпуска - " + mockingbird.getYearPublishing());
        Book dokkaebi= new Book("Dokkaebi", kim, 2016);
        Book dokkaebi1= new Book("Dokkaebi", kim, 2016);
               System.out.println("название книги - " + dokkaebi.getBookNames()+", год выпуска - " + dokkaebi.getYearPublishing());


        mockingbird.setYearPublishing(1987);
        System.out.println("измененый год книги Mockingbird - " + mockingbird.getYearPublishing());
        dokkaebi.setYearPublishing(1238);
        System.out.println("измененый год книги Dokkaebi - " + dokkaebi.getYearPublishing());
        ///Новое ДЗ
        System.out.println("------------------");
        System.out.println(harper);
        System.out.println(kim);
        System.out.println(mockingbird);
        System.out.println(dokkaebi);
        System.out.println(harper.equals(harper1));
        System.out.println(kim.equals(kim1));
        System.out.println(mockingbird.equals(mockingbird1));
        System.out.println(dokkaebi.equals(dokkaebi1));
        System.out.println(mockingbird.hashCode());
        System.out.println(dokkaebi.hashCode());


    }

}