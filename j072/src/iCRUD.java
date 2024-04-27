public interface iCRUD {
    public void addItem(TodoItem item);
    public void updateItem(int index, TodoItem item);
    public void deleteItem(int index);
    public void printItemsSortedByTitle();
    public void printItemsSortedByDate();
}
