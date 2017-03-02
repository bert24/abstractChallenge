package abstractandinnerclasschalenge;

public abstract class ListItem {
    protected ListItem NextItem;
    protected ListItem PreviousItem;
    
    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }
    
    public Object getValue() {
        return this.value;
    }
    
    public void setValue(Object value) {
        this.value=value;    
    }
    
    abstract ListItem next();
    abstract ListItem setNext();
    abstract ListItem previous();
    abstract ListItem setPrevious();
    
    abstract int compareTo(ListItem item);
    
}
