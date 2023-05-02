package HW6;
public class Main {
    public static void main(String[] args) {
        NoteBook notebook1 = new NoteBook("HP", "Pavilion", "Windows", 8, 256);
        NoteBook notebook2 = new NoteBook("Lenovo", "IdeaPad", "MacOS", 16, 512);
        NoteBook notebook3 = new NoteBook("Dell", "Inspiron", "Windows", 4, 128);
        NoteBook notebook4 = new NoteBook("Asus", "Vivobook", "Linux", 8, 512);
        NoteBook notebook5 = new NoteBook("Acer", "Vivobook", "MacOS", 32, 512);
        Store store = new Store();
        store.add(notebook1);
        store.add(notebook2);
        store.add(notebook3);
        store.add(notebook4);
        store.add(notebook5);
        store.print();
        store.filter();
    }
}
