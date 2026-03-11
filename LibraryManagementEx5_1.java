import LibraryManagement.*;

class LibraryManagementEx5_1
{
    public static void main(String[] args)
    {
        Book b = new Book("Java Programming","James Gosling","12345");
        Member m = new Member("Mahesh",101);

        b.displayBook();
        m.displayMember();
    }
}
