class Magazine implements LibraryItem {
    private String title;
    private String inventoryNumber;

    public Magazine(String title, String inventoryNumber) {
        this.title = title;
        this.inventoryNumber = inventoryNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }
}
