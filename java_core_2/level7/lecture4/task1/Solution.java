package javarush.java_core_2.level7.lecture4.task1;
/*
package com.javarush.task.task17.task1703;
*/
import java.util.ArrayList;
import java.util.List;

/*
Синхронизированные заметки
*/
/*
1. Класс Note будет использоваться нитями. Поэтому сделай так, чтобы обращения к листу notes блокировали мьютекс notes, не this
2. Все System.out.println не должны быть заблокированы (синхронизированы), т.е. не должны находиться в блоке synchronized
Требования:

    •
    Метод addNote() должен добавлять записки в список notes.
    •
    Метод removeNote() должен удалять записку из списка notes.
    •
    В методе addNote() должен находиться synchronized блок.
    •
    В методе removeNote() должен находиться synchronized блок.
    •
    Synchronized блок в методе addNote() должен блокировать мьютекс notes.
    •
    Synchronized блок в методе removeNote() должен блокировать мьютекс notes.
    •
    В synchronized блоке метода addNote() должен находится вызов метода add у notes.
    •
    В synchronized блоке метода removeNote() должен находится вызов метода remove у notes.
    •
    Все команды вывода на экран не должны находиться в блоке synchronized.
    */

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note;
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }

}

