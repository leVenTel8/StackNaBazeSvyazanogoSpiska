package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;  // импорт статического класса

public class LinkListTest {

    /**
     * проверка вставки
     */
    @Test
    public void testInsertFirst() {

        LinkList theList = new LinkList();
        theList.insertFirst(50);
        assertEquals(50, theList.deleteFirst());

    }//end testInsertFirst()

    /**
     * проверка удаления
     */
    @Test
    public void testDeleteFirst() {
        LinkList theList = new LinkList();
        theList.insertFirst(50);
        theList.insertFirst(40);

        assertEquals(40, theList.deleteFirst());


    }//end testDeleteFirst()

    /**
     * проверка метода isEmpty()
     */
    @Test
    public void testIsEmpty() {
        LinkList theList = new LinkList();
        assertEquals(true, theList.isEmpty());   // вводим ожидаемое значение и принимаемый параметр
    }//end testIsEmpty()






}//end class LinkListTest