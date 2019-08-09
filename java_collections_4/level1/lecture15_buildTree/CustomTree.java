package javarush.java_collections_4.level1.lecture15_buildTree;
/*
package com.javarush.task.task20.task2028;
*/
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
Построй дерево(1)
*/
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;
    private ArrayList<Entry<String>> entries = new ArrayList<>();
    private ArrayList<Entry<String>> entriesToRemove = new ArrayList<>();

    public CustomTree() {
        this.root = new Entry<>("0");
        entries.add(root);
    }

    @Override
    public boolean add(String s) {
        Entry<String> element = new Entry<>(s);
        element.root = root;
        for (int i = 0; i < entries.size(); i++) {
            Entry<String> entry = entries.get(i);
            entry.checkChildren();
            if (!entry.isAvailableToAddChildren()) {
                continue;
            }
            if (entry.availableToAddLeftChildren) {
                element.parent = entry;
                entry.leftChild = element;
                element.lineNumber = element.parent.lineNumber + 1;
                entries.add(element);
            } else if (entry.availableToAddRightChildren) {
                element.parent = entry;
                entry.rightChild = element;
                element.lineNumber = element.parent.lineNumber + 1;
                entries.add(element);
            }
            return true;
        }
        return false;
    }

    public String getParent(String s) {
        for (Entry<String> entry : entries) {
            if (s.equals(entry.elementName)) {
                return entry.parent.elementName;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return entries.size() - 1;
    }

    @Override
    public boolean remove(Object var1) {
        if (var1 instanceof String) {
            String name = (String) var1;
            for (int i = 0; i < entries.size(); i++) {
                Entry<String> leaf = entries.get(i);
                if (name.equals(leaf.elementName)) {
                    addEntriesToRemove(leaf);
                }
            }
        } else {
            throw new UnsupportedOperationException();
        }
        entries.removeAll(entriesToRemove);
        return true;
    }

    private void addEntriesToRemove(Entry<String> leaf) {
        if (leaf == null) return;
        if (leaf.equals(leaf.parent.leftChild)) {
            leaf.parent.leftChild = null;
        } else {
            leaf.parent.availableToAddLeftChildren = true;
            leaf.parent.availableToAddRightChildren = true;
            leaf.parent.rightChild = null;
        }
        entriesToRemove.add(leaf);
        addEntriesToRemove(leaf.leftChild);
        addEntriesToRemove(leaf.rightChild);
    }

    @Override
    public String get(int index){
        //return null;
        throw new UnsupportedOperationException();
    }

    @Override
    public String set(int index, String element){
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element){ throw new UnsupportedOperationException(); }

    @Override
    public String remove(int index){ throw new UnsupportedOperationException(); }

    @Override
    public List<String> subList(int fromIndex, int toIndex){ throw new UnsupportedOperationException(); }

    @Override
    public void removeRange(int fromIndex, int toIndex){ throw new UnsupportedOperationException(); }

    @Override
    public boolean addAll(int index, Collection<? extends String> c){ throw new UnsupportedOperationException(); }

    static class Entry<T> implements Serializable {
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;
        Entry<String> root;

        public Entry(String elementName) {
            this.elementName = elementName;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        public void checkChildren() {
            if (leftChild != null) {
                availableToAddLeftChildren = false;
            }
            if (rightChild != null) {
                availableToAddRightChildren = false;
            }
        }

        public boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}