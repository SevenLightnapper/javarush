package javarush.java_collections_4.level7.lecture6.task4.retrievers;
/*
package com.javarush.task.task37.task3708.retrievers;
*/

import javarush.java_collections_4.level7.lecture6.task4.storage.Storage;

public class OriginalRetriever implements Retriever {
    Storage storage;

    public OriginalRetriever(Storage storage) {
        this.storage = storage;
    }

    @Override
    public Object retrieve(long id) {
        return storage.get(id);
    }
}

