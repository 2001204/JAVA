public class Author{
    String name;
    String email;
    char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public void displayAuthorDetails() {
        System.out.println("Author Name: " + name);
        System.out.println("Author Email: " + email);
        System.out.println("Author Gender: " + gender);
    }

    public static void main(String[] args) {
        Author author1 = new Author("D.Y.Wani", "dipakwani@gmail.com", 'M');
        Author author2 = new Author("H.V.Patil", "hvpatil@gmail.com", 'M');

        System.out.println("Author 1 Details:");
        author1.displayAuthorDetails();

        System.out.println("\nAuthor 2 Details:");
        author2.displayAuthorDetails();
    }
}