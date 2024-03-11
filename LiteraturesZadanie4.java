import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Создание списка литературы
        ArrayList<Literature> literatureList = new ArrayList<>();
        literatureList.add(new Literature("001", "Книга", "Программирование на Java", 2020, "Издательство A", 300, "Джон Смит"));
        literatureList.add(new Literature("002", "Журнал", "Тенденции машинного обучения", 2021, "Издательство B", 150, "Алиса Джонсон"));
        literatureList.add(new Literature("003", "Журнал", "Искусство в эпоху цифровизации", 2019, "Издательство C", 50, "Дэвид Браун"));

        // Вывод списка литературы до сортировки
        System.out.println("Список литературы до сортировки:");
        for (Literature literature : literatureList) {
            System.out.println(literature);
        }

        // Сортировка по наименованию
        Collections.sort(literatureList, Literature.NameComparator);
        System.out.println("\nСписок литературы после сортировки по наименованию:");
        for (Literature literature : literatureList) {
            System.out.println(literature);
        }

        // Сортировка по году издательства
        Collections.sort(literatureList, Literature.YearComparator);
        System.out.println("\nСписок литературы после сортировки по году издания:");
        for (Literature literature : literatureList) {
            System.out.println(literature);
        }
    }
}

class Literature {
    private String sourceCode;
    private String literatureType;
    private String title;
    private int publicationYear;
    private String publisher;
    private int pageCount;
    private String author;

    public Literature(String sourceCode, String literatureType, String title, int publicationYear, String publisher, int pageCount, String author) {
        this.sourceCode = sourceCode;
        this.literatureType = literatureType;
        this.title = title;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.author = author;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getLiteratureType() {
        return literatureType;
    }

    public void setLiteratureType(String literatureType) {
        this.literatureType = literatureType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("Источник: %s\nТип: %s\nНазвание: %s\nГод издания: %d\nИздательство: %s\nКоличество страниц: %d\nАвтор: %s\n",
                sourceCode, literatureType, title, publicationYear, publisher, pageCount, author);
    }

    public static Comparator<Literature> NameComparator = new Comparator<Literature>() {
        @Override
        public int compare(Literature l1, Literature l2) {
            return l1.getTitle().compareTo(l2.getTitle());
        }
    };

    public static Comparator<Literature> YearComparator = new Comparator<Literature>() {
        @Override
        public int compare(Literature l1, Literature l2) {
            return l1.getPublicationYear() - l2.getPublicationYear();
        }
    };
}
