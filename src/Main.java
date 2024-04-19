//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        // Инициализация библиотечного фонда
        LibraryItem[] libraryItems = {
                new Book("Александр Пушкин", "Евгений Онегин", "001"),
                new Book("Лев Толстой", "Война и мир", "002"),
                new Magazine("National Geographic", "101")
        };

        // Инициализация сервиса поиска
        LibrarySearchService searchService = new LibrarySearchService();

        // Поиск по инвентарному номеру
        searchService.searchByInventoryNumber("101", libraryItems);

        // Поиск по автору
        searchService.searchByAuthor("Лев Толстой", libraryItems);
    }
}