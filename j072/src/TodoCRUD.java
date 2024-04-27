import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TodoCRUD implements iCRUD {
    private ArrayList<TodoItem> itemList;

    public TodoCRUD() {
        this.itemList = new ArrayList<>();
    }

    @Override
    public void addItem(TodoItem item) {
        itemList.add(item);
    }

    @Override
    public void updateItem(int index, TodoItem item) {
        if (index >= 0 && index < itemList.size()) {
            itemList.set(index, item);
        } else {
            System.out.println("Invalid index");
        }
    }

    @Override
    public void deleteItem(int index) {
        if (index >= 0 && index < itemList.size()) {
            itemList.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    @Override
    public void printItemsSortedByTitle() {
        Collections.sort(itemList, Comparator.comparing(TodoItem::getTitle));
        itemList.forEach(System.out::println);
    }

    @Override
    public void printItemsSortedByDate() {
        Collections.sort(itemList, Comparator.comparing(TodoItem::getRegistrationDate));
        itemList.forEach(System.out::println);
    }
}
