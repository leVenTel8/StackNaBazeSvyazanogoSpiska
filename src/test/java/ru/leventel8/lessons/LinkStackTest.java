package ru.leventel8.lessons;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkStackTest {

    /**
     * проверка вставки
     */
    @Test
    public void testPush() {
        LinkStack theList = new LinkStack();        // создание проверяемого объекта
        theList.push(60);                         // вставка элемента
        assertEquals(60,theList.pop());     // сравнение ожидаемого результата и то что вернул метод

    }//end testPush()

    /**
     * проверка удаления
     */
    @Test
    public void testPop() {
        LinkStack theList = new LinkStack();
        theList.push(60);
        theList.push(70);
        assertEquals(70,theList.pop());

    }//end testPop()

    @Test
    public void testIsEmpty() {
        LinkStack theList = new LinkStack();
        assertEquals(true, theList.isEmpty());

    }//end testIsEmpty()

}