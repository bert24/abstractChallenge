package abstractandinnerclasschalenge;

public abstract class ListItem {
    protected ListItem nextItem = null;
    protected ListItem previousItem = null;
    
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
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    
    abstract int compareTo(ListItem item);
    
}
