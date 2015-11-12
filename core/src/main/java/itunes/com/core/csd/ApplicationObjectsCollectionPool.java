package itunes.com.core.csd;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ApplicationObjectsCollectionPool {

    private static ApplicationObjectsCollectionPool instance;
    private final ConcurrentHashMap<String, Object> pool;

    private ApplicationObjectsCollectionPool() {
        pool = new ConcurrentHashMap<>();
    }

    public static ApplicationObjectsCollectionPool getInstance() {

        if (instance == null) {
            instance = new ApplicationObjectsCollectionPool();

        }

        return instance;
    }


    public void put(String key, Object value) {
        if (value != null)
            pool.put(key, value);
        else
            removeObject(key);
    }

    public Object get(String key) {
        //Crashlytics #611
        if (key == null) {
            return null;
        }
        return pool.get(key);
    }

    public void removeObject(String key) {

//        if ((pool.get(key)) != null)
        if (key != null && pool.containsKey(key))
            pool.remove(key);

    }

    public Set<String> getKeySet() {
        return pool.keySet();
    }

}
