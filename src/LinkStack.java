/**
 * Created by Админ on 24.02.2017.
 */
class LinkStack {

    private LinkList theList;

    public LinkStack(){

        theList = new LinkList();

    }

    public void  push(long j){

        theList.insertFirst(j);

    }

    public long pop(){

        return theList.deleteFirst();

    }

    public boolean isEmpty(){

        return (theList.isEmpty());

    }

    public void displayStack(){

        System.out.print("Стек (Верх-->Низ)");
        theList.displayList();

    }

}
