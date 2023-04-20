package Trie;
import java.util.Map;
import java.util.HashMap;
public class TrieNode {
	Map<Character, TrieNode> map;
	boolean end;
	
	TrieNode(){
		map = new HashMap<Character, TrieNode>();
		end = false;
	}
}
