package abstractandinnerclasschalenge;

public class AbstractAndInnerClassChalenge {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        list.tranverse(list.getRoot());
        
        String stringData = "0 3 6 7 1 9 2 5 8 4";
        
        String[] data = stringData.split(" ");
        
        for(String s : data){
            list.addItem(new Node(s));
        }
        
        System.out.println("List: ");
        list.tranverse(list.getRoot());
        System.out.println("");
        
        list.removeItem(new Node("3"));
        list.tranverse(list.getRoot());
        
        list.removeItem(new Node("2"));
        list.tranverse(list.getRoot());
        
        list.removeItem(new Node("7"));
        list.removeItem(new Node("1"));
        list.removeItem(new Node("6"));
        list.tranverse(list.getRoot());
        
        list.removeItem(new Node("4"));
        list.tranverse(list.getRoot());

        list.removeItem(new Node("8"));
        list.tranverse(list.getRoot());
    }
}
