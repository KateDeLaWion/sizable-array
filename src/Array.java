public class Array {
    // Declared outside the constructor so other code blocks can use it.
    // Or, private int[];
    private int[] items;

    // count the number of items added to array items
    // count starts as zero, NOT null, in Java.
    // Or, int count = 0;
    private int count;

    // constructor
    public Array(int length) {
        items = new int[length];
    }

    // insert function
    public void insert(int item){
        // if no more space in array to add item, resize it
        if (items.length == count){
            int[] newItems = new int[count * 2];
            for (int i= 0; i<count; i++){
                newItems[i] = items[i];
            }
            //            No need to expand old array items because once it copies a bigger array,
//            it will expand itself to accommodate a bigger array.
//            items = new int[count * 2];
//            items = newItems;
//            or
            items = newItems;
        }
//        items[count] = item;
//        count++;
//        same as
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for (int i = index; i<count; i++){
            items[i] = items[i+1];

        }
        count--;
    }

    public int indexOf(int item){
        for (int i=0; i<count; i++){
            if(items[i] == item) {
                return i;
            }
            }
        return -1;
    }


    // function to print
    public void print(){
        for(int i=0; i< count; i++) {
            System.out.println(items[i]);
        }

    }

}
