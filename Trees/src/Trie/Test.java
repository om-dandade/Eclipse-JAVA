package Trie;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Trie t = new Trie();
		t.insert("mat");
		t.insert("mouse");
		t.insert("house");
		
		Scanner sc = new Scanner(System.in);
		int ch;
		while(true) {
			System.out.print("Choose 1 to search, 0 to end: ");
			ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.print("Enter word to search: ");
				String s = sc.next();
				t.search(s);
				System.out.println();
			}
			else if(ch == 0)break;
			else System.out.println("Shut up!!!... I said 1 or 0");
		}
	}
}
