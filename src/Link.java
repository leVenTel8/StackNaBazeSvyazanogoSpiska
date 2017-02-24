/**
 * Created by Админ on 24.02.2017.
 */
class Link {

    public long dData;
    public Link next;

    public  Link(long dd){

        dData = dd;

    }

    public void displayLink(){
        System.out.print(dData + " ");
    }

}
