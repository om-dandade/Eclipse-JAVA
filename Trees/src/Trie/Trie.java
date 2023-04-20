package Trie;

public class Trie {
	TrieNode root;
	
	Trie(){
		root = new TrieNode();
	}
	
	//insert
	public void insert(String word) {
		TrieNode current = root;
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode nextNode = current.map.get(ch);
			
			if(nextNode == null) {
				nextNode = new TrieNode();
				current.map.put(ch, nextNode);
			}
			
			current = nextNode;
		}
		
		current.end = true;
		System.out.println("Word \""+word+"\" was succesfully add to trie :)");
	}
	
	//search 
	public boolean search(String word) {
		TrieNode current = root;
		
		for(int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode nextNode = current.map.get(ch);
			
			if(nextNode == null) {
				System.out.println("Word \""+word+"\" does not exists in the trie :(");
				return false;
			}
			
			current = nextNode;
		}
		
		if(current.end) {
			System.out.println("Word \""+word+"\" exists in the trie :)");
			return true;
		}
		System.out.println("Word \""+word+"\" does not exists in the trie,\nBut can a prifix of the other words that exits");
		return false;
	}
}
