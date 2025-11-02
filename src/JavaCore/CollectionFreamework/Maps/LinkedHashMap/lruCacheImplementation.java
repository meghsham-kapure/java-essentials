package JavaCore.CollectionFreamework.Maps.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class lruCacheImplementation{
    public static void main(String[] args) {
        LeastRecentlyUsedCache<Integer, String> lruCache = new LeastRecentlyUsedCache<>(5);
        lruCache.put(1, "Added");//Capacity = 5, Size = 1
        System.out.println(lruCache); //{1=Cache1}
        lruCache.put(2, "Added");//Capacity = 5, Size = 2
        System.out.println(lruCache); //{1=Cache1, 2=Cache2}
        lruCache.put(3, "Added");//Capacity = 5, Size = 3
        System.out.println(lruCache); //{1=Cache1, 2=Cache2, 3=Cache3}
        lruCache.put(4, "Added");//Capacity = 5, Size = 4
        System.out.println(lruCache); //{1=Cache1, 2=Cache2, 3=Cache3, 4=Cache4}
        lruCache.put(1, "Updated");//Capacity = 5, Size = 4
        System.out.println(lruCache); //{2=Cache2, 3=Cache3, 4=Cache4, 1=Cache1.2}
        lruCache.put(3, "Updated");//Capacity = 5, Size = 4
        System.out.println(lruCache); //{2=Cache2, 4=Cache4, 1=Cache1.2, 3=Cache3.1}
        lruCache.put(5, "Added");//Capacity = 5, Size = 5
        System.out.println(lruCache); //{2=Cache2, 4=Cache4, 1=Cache1.2, 3=Cache3.1, 5=Cache5}
        lruCache.put(6, "Added");//Capacity = 5, Size = 6       //removeEldestEntry() gets called and remove the oldest entry       //Capacity = 5, Size = 5
        System.out.println(lruCache); //{2=Cache2, 4=Cache4, 1=Cache1.2, 3=Cache3.1, 5=Cache5}
        lruCache.put(7, "Added");//Capacity = 5, Size = 6       //removeEldestEntry() gets called and remove the oldest entry       //Capacity = 5, Size = 5
        System.out.println(lruCache); //{2=Cache2, 4=Cache4, 1=Cache1.2, 3=Cache3.1, 5=Cache5}
        lruCache.put(8, "Added");//Capacity = 5, Size = 6       //removeEldestEntry() gets called and remove the oldest entry       //Capacity = 5, Size = 5
        System.out.println(lruCache); //{3=Cache3.1, 5=Cache5, 6=Cache6, 7=Cache7, 8=Cache8}
    }
}


// Implementation of a Least Recently Used (LRU) Cache.
// The cache removes the least recently used entry when it reaches its maximum capacity.
// This functionality is achieved using LinkedHashMap, which maintains the order of entries
// based on insertion or access (when accessOrder is true).
class LeastRecentlyUsedCache<K, V> extends LinkedHashMap<K, V> {
    // The maximum number of entries allowed in the cache.
    private final int capacity;

    /*
     * Constructor for creating an LRU Cache.
     * @param capacity The maximum number of entries allowed in the cache. When the cache size exceeds this capacity, the least recently used entry will be removed.
     */
    LeastRecentlyUsedCache(int capacity) {
        // Initialize LinkedHashMap with:
        // - capacity: the initial capacity of the map (matches LRU cache capacity).
        // - loadFactor: 0.75f is the default value used in HashMap to balance memory and performance.
        // - accessOrder: true means entries are reordered based on access (get/put operations), enabling LRU behavior.
        super(capacity, 1.0f, true);
        this.capacity = capacity;
    }

    /**
     * Determines when to remove the eldest entry.
     * This method is called automatically by LinkedHashMap after every insertion.
     * @param eldest The eldest entry in the map.
     * @return true if the size of the map exceeds the specified capacity, causing the eldest entry
     *         to be removed; false otherwise.
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    /*
     * Final Verdict:
     * - The load factor (set to 0.75) ensures efficient internal resizing of the hash table.
     * - If the load factor were set to 1.0, resizing would occur less frequently, potentially saving memory.
     * - In an LRU cache, resizing is rare because the capacity is usually small and fixed.
     * - Thus, the default load factor of 0.75 is sufficient and doesn't need to be changed for most cases.
     */
}
