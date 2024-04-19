class LibrarySearchService {
    public void searchByInventoryNumber(String inventoryNumber, LibraryItem[] items) {
        for (LibraryItem item : items) {
            if (item.getInventoryNumber().equals(inventoryNumber)) {
                System.out.println("Найден объект с инвентарным номером " + inventoryNumber + ": " + item);
            }
        }
    }

    public void searchByAuthor(String author, LibraryItem[] items) {
        for (LibraryItem item : items) {
            if (item instanceof Book) {
                Book book = (Book) item;
                if (book.getAuthor().equals(author)) {
                    System.out.println("Найдена книга автора " + author + ": " + book.getTitle());
                }
            }
        }
    }
}
