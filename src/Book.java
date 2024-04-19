class Book implements LibraryItem {
    private String author;
    private String title;
    private String inventoryNumber;

    public Book(String author, String title, String inventoryNumber) {
        this.author = author;
        this.title = title;
        this.inventoryNumber = inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }
}