package javarush.java_core_2.level7.lecture10.task1;
/*
package com.javarush.task.task17.task1713;
*/
/*
import org.jetbrains.annotations.NotNull;
*/
import java.util.*;

/*
Общий список
*/
/*
1. Изменить класс Solution так, чтобы он стал списком. (Необходимо реализовать интерфейс java.util.List).
2. Список Solution должен работать только с целыми числами Long.
3. Воспользуйтесь полем original.
4. Список будет использоваться нитями, поэтому позаботьтесь, чтобы все методы были синхронизированы.

Требования:
    •
    Класс Solution должен реализовывать интерфейс List<Long>.
    •
    Класс Solution должен содержать private поле original типа ArrayList<Long>.
    •
    Все переопределенные методы интерфейса List должны делегировать полномочия методам объекта original.
    •
    Все методы класса Solution, кроме метода main, должны быть синхронизированы.
    */

public class Solution implements List<Long> {

    @Override
    public synchronized int size() {
        return original.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator() {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
    }

    @Override
    public synchronized <Long> Long[] toArray(Long[] my) {
        return original.toArray(my);
    }

    @Override
    public synchronized boolean add(Long myLong) {
        return original.add(myLong);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
    }

    @Override
    public synchronized boolean containsAll( Collection<?> c) {
        return original.containsAll(c);
    }

    @Override
    public synchronized boolean addAll( Collection<? extends Long> CeL) {
        return original.addAll(CeL);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> iiCeL) {
        return original.addAll(index, iiCeL);
    }

    @Override
    public synchronized boolean removeAll( Collection<?> c) {
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll( Collection<?> c) {
        return original.retainAll(c);
    }

    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long l) {
        return original.set(index, l);
    }

    @Override
    public synchronized void add(int index, Long l) {
        original.add(index, l);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
    }

    @Override
    public synchronized ListIterator<Long> listIterator() {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index) {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
    }

    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }
}

