package ru.avalon.javapp.devj110.booksdemo;

public class Book {
    private String bookName;
    private int bookYear;
    private String[] authors;
    private Company company;
    public Book (String bookName, int bookYear, Company company){
        setCompany(company);
        setBookName(bookName);
        setBookYear(bookYear);
    }
     public Book(String[] authors, String bookName, int bookYear, Company company){
        this(bookName,bookYear, company);
        setAuthors(authors);
     }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        if(company == null)
            throw new IllegalArgumentException("The book must have a company!");
        this.company = company;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] authors) {
        if(authors == null)
            throw new IllegalArgumentException("The book must have an authors!");
        this.authors = authors;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        if(bookName == null)
            throw new IllegalArgumentException("The book must have a name!");
        this.bookName = bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        if(bookYear <= 0)
            throw new IllegalArgumentException("The book birthday should be more then zero!");
        this.bookYear = bookYear;
    }
    public int getAuthorsNums(){
        if(authors == null) {
            System.out.println("This book has no authors!");
        }
            return authors.length;
    }

    public String getAuthorByNum(int number){
        if(number > authors.length-1 || number < 0)
            throw new IllegalArgumentException("Wrong author number!");
        return authors[number];
    }

    public void print(){
        if (authors != null){
            for (String a:authors){
                System.out.print(a + ", ");
            }
            System.out.println("; " + bookName + "; Издательство " + company.getCompanyName() + "; Год издания " + bookYear + "; " + company.getCompanyCity() + ".");
        }

        else {
            System.out.println(bookName + "; Издательство " + company.getCompanyName() + "; Год издания " + bookYear + "; " + company.getCompanyCity() + ".");
        }
    }

    public static void printAll(Book[] books){
        for (Book b:books){
            b.print();
        }
    }
}
