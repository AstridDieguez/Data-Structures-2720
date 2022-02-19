package CSC2720_Lab7P2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;

public class CSC2720_Lab7P2 {
	public static int findUniqueIndex(String str) {
		return 0;
	}
	public static String getMostCommonWord(String str, ArrayList<String> toIgnore) {
		HashMap<String, Integer> freq = new HashMap<String, Integer>();
		ArrayList<String> words = new ArrayList<String>(Arrays.asList(str.split(" ")));
		
		// Remove words that match toIgnore
		for(int i = 0; i < words.size(); i++) {
			for(int j = 0; j < toIgnore.size(); j++) {
				if((words.get(i)).equalsIgnoreCase(toIgnore.get(j))) {
					words.remove(i);
					break;
				}
			} // end for
		} // end for

		// Error checkpoint
		if(words.size() == 0) {
			return null;
		}		

		// Get frequency of remaining words, store in hashMap
		for(int i = 0; i < words.size(); i++) {
			if(freq.containsKey(words.get(i))) {
				int f = freq.get(words.get(i)) + 1;
				freq.put(words.get(i), f);
			} else {
				freq.put(words.get(i), 1);
			}
		} // end for
		
		// Get word with the max frequency
		String frequent = words.get(0);
		for(int i = 1; i < freq.size(); i++) {
			if(freq.get(words.get(i)) > freq.get(frequent)) {
				frequent = words.get(i);
			}
		}
		return frequent;
	}
	public static void main(String[] args) {
		System.out.println("Shiraj really gives us too many labs. He is seriously annoying.");
		String str = "I like queues but queues do not like me";
		ArrayList<String> toIgnore = new ArrayList<String>();
		toIgnore.add("stacks");
		toIgnore.add("queues");
		System.out.println("Most frequent word: \"" + getMostCommonWord(str, toIgnore) + "\"");
	}

}
