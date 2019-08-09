package javarush.java_collections_4.level4.lecture7_tests.test2;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public class Test {

    /**
     * Это класс, унаследованный от PhantomReference, у него есть метод close()
     */
    static class PhantomInteger extends PhantomReference<Integer>
    {
        PhantomInteger(Integer referent, ReferenceQueue<? super Integer> queue)
        {
            super(referent, queue);
        }

        private void close()
        {
            System.out.println("Bad Integer totally destroyed!");
        }
    }

    public static void main(String[] args) {
        //специальная очередь для призрачных объектов
        ReferenceQueue<Integer> queue = new ReferenceQueue<Integer>();

        //список призрачных ссылок
        ArrayList<PhantomInteger> list = new ArrayList<PhantomInteger>();

        //создаем 10 объектов и добавляем их в список через призрачные ссылки
        for ( int i = 0; i < 10; i++) {
            Integer x = new Integer(i);
            list.add(new PhantomInteger (x, queue));
        }

        // Эта нить будет следить за призрачной очередью и удалять оттуда объекты
        Thread referenceThread = new Thread() {
            public void run() {
                while (true) {
                    try {
                        //получаем новый объект из очереди, если объекта нет - ждем!
                        PhantomInteger ref = (PhantomInteger)queue.remove();
                        //вызвваем у него метод close
                        ref.close();
                        ref.clear();
                    }
                    catch (Exception ex) {
                        // пишем в лог ошибки
                    }
                }
            }
        };
        //запускаем поток в служебном режиме.
        referenceThread.setDaemon(true);
        referenceThread.start();
    }
}
