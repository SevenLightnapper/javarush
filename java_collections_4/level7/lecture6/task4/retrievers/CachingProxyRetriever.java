package javarush.java_collections_4.level7.lecture6.task4.retrievers;

import javarush.java_collections_4.level7.lecture6.task4.cache.LRUCache;
import javarush.java_collections_4.level7.lecture6.task4.storage.Storage;

public class CachingProxyRetriever implements Retriever {
    private Storage storage;
    private OriginalRetriever originalRetriever;
    private LRUCache<Long, Object> lruCache;

    public CachingProxyRetriever(Storage storage) {
        this.storage = storage;
        this.originalRetriever = new OriginalRetriever(storage);
        lruCache = new LRUCache<>(16);
    }

    @Override
    public Object retrieve(long id) {
        Object obj = lruCache.find(id);
        if (obj == null) {
            obj = originalRetriever.retrieve(id);
            lruCache.set(id, obj);
        }
        return obj;
    }
}
