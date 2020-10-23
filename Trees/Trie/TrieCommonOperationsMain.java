/*Implement Trie (Prefix Tree)

Add to List

Share
Implement a trie with insert, search, and startsWith methods.

Example:

Trie trie = new Trie();

trie.insert("apple");
trie.search("apple");   // returns true
trie.search("app");     // returns false
trie.startsWith("app"); // returns true
trie.insert("app");   
trie.search("app");     // returns true
Note:

You may assume that all inputs are consist of lowercase letters a-z.
All inputs are guaranteed to be non-empty strings.

*/
package trie;

class Trie {
    
    public static class TrieNode {
    	TrieNode[] childs;
        int WordEnd = 0;
        String wordF = "";

        TrieNode() {
            childs = new TrieNode[26];
            WordEnd = 0;
            wordF = "";
        }
    }
    
    static TrieNode root = null;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
         
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        
    	TrieNode curr = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i); // word[i];
            int idx = ch - 'a';
            if (curr.childs[idx] == null)
                curr.childs[idx] = new TrieNode();
            curr = curr.childs[idx];
        }
        curr.WordEnd++;
        curr.wordF = word;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        
    	TrieNode curr = root;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i); // word[i];
            int idx = ch - 'a';
            curr = curr.childs[idx];
            if (curr == null)
                return false;
        }
        if (curr.WordEnd > 0)
            return true;
        return false;
	
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
    	TrieNode curr = root;
        int n = prefix.length();
        for (int i = 0; i < n; i++) {
            char ch = prefix.charAt(i); // word[i];
            int idx = ch - 'a';
            curr = curr.childs[idx];
            if (curr == null)
                return false;
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */