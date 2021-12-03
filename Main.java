package ru.avalon.javapp.devj110.booksdemo;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Company company1 = new Company("Проспект", "Москва");
        Company company2 = new Company("Питер", "Санкт-Петербург");
        Company company3 = new Company("БХВ", "Санкт-Петебург");
        Company company4 = new Company("Диалектика", "Киев");

        Book[] books = new Book[]{
                new Book(new String[]{"Седжвик Роберт", "Уэйн Кевин"}, "Computer Science: основы программирования на Java," +
                  "ООП, алгоритмы и структуры данных", 2018, company2),
                new Book(new String[]{"Вигерс Карл"}, "Разработка требований к программному обеспечению. 3-е издание, дополненное", 2019, company3),
                new Book(new String[]{"Шилдт Герберт"}, "Java. Полное руководство, 10-е издание", 2018, company4),
                new Book(new String[]{"Полубенцева М.И."}, "C/C++. Процедурное программирование", 2017, company3),
                new Book("Конституция РФ", 2020, company1)
        };
        Book.printAll(books);
        if(!Objects.equals(company3.getCompanyCity(), "Санкт-Петербург")){
            System.out.println("*****************Город издательства " + "БХВ" + " был введён с ошибкой и исправлен на Санкт-Петербург*****************");
            company3.setCompanyCity("Санкт-Петербург");
            Book.printAll(books);
        }
    }
}
