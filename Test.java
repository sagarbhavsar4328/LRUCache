package cache;

public class Test {

	public static void main(String[] args) {
		
		LRUCacheUsingDoubleLinkList cache = new LRUCacheUsingDoubleLinkList(4);
		cache.add(1, 2);
		cache.add(3, 2);
		cache.add(6, 2);
		System.out.println(cache.map);
		cache.add(9, 2);
		cache.add(8, 2);
		cache.add(9, 6);
		System.out.println(cache.map);
		cache.add(8, 5);
		cache.add(1, 2);
		
		
		System.out.println(cache.map);

	}

}
