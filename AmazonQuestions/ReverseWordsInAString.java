import java.util.*;

public class ReverseWordsInAString {

	static Node head = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = next;
		}
	}

	public static void printList(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void print2dArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j] + " ");
		}
		System.out.println();
	}
	
	public static void printArray(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		  
		/*
		 * String J="z"; String S="ZZ";
		 * 
		 * System.out.println(numJewelsInStones1(J,S));
		 */
		 

		/*
		 * String ransom = "aa"; String magazine = "baa";
		 * 
		 * System.out.println(canConstruct(ransom,magazine));
		 */

		/*
		 * String s = "cc"; System.out.println(firstUniquecharacter1(s));
		 */

		/*
		 * String s1 ="aec"; String s2="abcde";
		 * 
		 * System.out.println(isSubsequence(s1,s2));
		 */

		/*
		 * int[] nums = {1,3,5,6}; int target=0; System.out.println(searchInsert(nums,
		 * target));
		 */

		/*
		 * int[] arr = {2,2,1,1,1,2,2}; System.out.println(majorityElement(arr));
		 */

		/*
		 * char[] arr = {'h','e','l','l','o'}; reverseString(arr);
		 */

		/*
		 * int n=8; System.out.println(isPowerOfTwo(n));
		 */

		/*
		 * head = new Node(1); head.next = new Node(2); head.next.next = new Node(3);
		 * head.next.next.next = new Node(4); head.next.next.next.next = new Node(5);
		 * head.next.next.next.next.next = new Node(6);
		 * 
		 * printList(head); Node node = oddEvenList(head);
		 */

		/*
		 * int[] nums = {3,3,7,7,10,11,11};
		 * System.out.println(singleNonDuplicate(nums));
		 */

		/*
		 * String sentence = "Varunv";
		 * System.out.println(checkWhetherStringHasUniqueCharacters1(sentence));
		 */
		
		/*
		 * int n=3; System.out.println(numTrees(n));
		 */
		
		/*
		 * int[][] costs = {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}};
		 * System.out.println(twoCitySchedCost(costs));
		 */
		
		/*
		 * int[][] arr = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}}; print2dArray(arr);
		 * System.out.println(reconstructQueue(arr)); print2dArray(arr);
		 */
		
		/*
		 * int[][] activities = {{0,6},{3,4},{1,2},{5,8},{5,7},{8,9}};
		 * System.out.println(activitySelection(activities));
		 */
		
		int output = 70;
		int[] coins = {1,2,5,10,20,50,100,500,1000};
		System.out.println(coinChange(coins,output));
	}

	public static int numJewelsInStones(String J, String S) {
		int count = 0;
		Set<Character> obj = new HashSet<Character>();
		for (char ch : J.toCharArray()) {
			obj.add(ch);
		}
		for (char ch : S.toCharArray()) {
			if (obj.contains(ch))
				count++;
		}

		return count;
	}

	private static void deleteNode(Node node) {
		// TODO Auto-generated method stub
		node.data = node.next.data;
		node.next = node.next.next;
	}

	public static boolean canConstruct(String ransomNote, String magazine) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : magazine.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);

		for (char ch : ransomNote.toCharArray()) {
			if (map.containsKey(ch) && map.get(ch) > 0) {
				map.put(ch, map.get(ch) - 1);
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean isBadVersion(int version) {
		return true;
	}

	public static int firstBadversion(int n) {
		return firstBadIndex(1, n);
	}

	public static int firstBadIndex(int low, int high) {
		while (low < high) {
			int mid = low + (high - low) / 2;
			if (isBadVersion(mid))
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

	public static int firstUniquecharacter(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}

	public static int firstUniquecharacter1(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++)
			arr[s.charAt(i) - 'a']++;
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 'a'] == 1)
				return i;
		}
		return -1;
	}

	public static void result() {
		List<Character> list = new ArrayList<Character>();
		String s = "yyeyyyyyeyyye";
		for (char ch : s.toCharArray()) {
			list.add(ch);
		}
		String t = "leetcode";
		System.out.println(t.indexOf('e'));

	}

	public static boolean isSubsequence(String s, String t) {

		int index = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == s.charAt(index)) {
				index++;
			}
			if (index >= s.length())
				return true;
		}
		return false;
	}

	// Approach 2
	public static int searchInsert(int[] nums, int target) {

		for (int i = 0; i < nums.length; i++) {
			if (target < nums[0])
				return 0;
			else if (nums[i] >= target)
				return i;
		}
		return nums.length;
	}

	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : nums) {
			if (map.containsKey(i) && map.get(i) + 1 > nums.length / 2)
				return i;
			else {
				map.put(i, map.getOrDefault(i, 0) + 1);
			}
		}
		return -1;
	}

	public static void reverseString(char[] arr) {
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		printArray(arr);
	}

	public static boolean isPowerOfTwo(int n) {
		if (n == 0)
			return true;
		return n % 2 == 0 && (n & (-n)) == n;
	}

	public static Node oddEvenList(Node head) {
		if (head == null)
			return null;
		if (head.next == null || head.next.next == null)
			return head;
		Node odd = head;
		Node even = head.next;
		Node evenStart = even;

		while (even != null && even.next != null) {
			odd.next = even.next;
			odd = even.next;
			even.next = odd.next;
			even = odd.next;
		}
		odd.next = evenStart;
		return head;
	}

	public static int singleNonDuplicate(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;

		while (low < high) {
			mid = low + (high - low) / 2;
			if (mid % 2 == 0) {
				if (nums[mid] == nums[mid + 1]) {
					low = mid + 2;
				} else {
					high = mid - 1;
				}
			} else {
				if (nums[mid] == nums[mid - 1]) {
					low = mid + 1;
				} else {
					high = mid - 2;
				}
			}
		}

		return nums[low];
	}

	// It uses an extra space
	public static boolean checkWhetherStringHasUniqueCharacters(String sentence) {
		Set<Character> set = new HashSet<Character>();
		for (char ch : sentence.toCharArray()) {
			if (set.contains(ch))
				return false;
			set.add(ch);
		}
		return true;
	}

	// It doesn't uses any extra space
	public static boolean checkWhetherStringHasUniqueCharacters1(String sentence) {
		int[] arr = new int[26];
		int check = 0;

		for (int i = 0; i < sentence.length(); i++) {
			int charInt = sentence.charAt(i) - 'a';
			if ((check & (1 << charInt)) > 0)
				return false;
			check |= (1 << charInt);
		}
		return true;
	}

	public static TreeNode invertTree(TreeNode root) {
		Queue<TreeNode> q = new LinkedList();
		q.add(root);
		while (!q.isEmpty()) {
			TreeNode currentnode = q.poll();
			TreeNode temp = currentnode.left;
			currentnode.left = currentnode.right;
			currentnode.right = temp;
			if (currentnode.left != null)
				q.add(currentnode.left);
			if (currentnode.right != null)
				q.add(currentnode.right);
		}
		return root;
	}

	public static int numJewelsInStones1(String J, String S) {
		Set<Character> set = new HashSet<Character>();
		int count = 0;
		for (char j : J.toCharArray())
			set.add(j);
		for (char s : S.toCharArray()) {
			if (set.contains(s))
				count++;
		}
		return count;
	}
	
	public static int numTrees(int n) {
        int[] arr = new int[n+1];
        for(int i=1;i<=n;i++) {
        	arr[i]=i;
        }
        return 0;
    }
	
	public static int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs,(a,b) -> Math.abs(b[1] - b[0]) - Math.abs(a[1] - a[0]));
		int twoN = costs.length;
		int count1=0;
		int count2=0;
		int result=0;
		
		for(int i=0;i<costs.length;i++) {
			if(costs[i][0]>costs[i][1]) {
				if(count2<twoN/2) {
					result+=costs[i][1];
					count2++;
				}
				else {
					result+=costs[i][0];
				}
			}
			else {
				if(count1<twoN/2) {
					result+=costs[i][0];
					count1++;
				}
				else {
					result+=costs[i][1];
				}
			}
		}
        return result;
    }
	
	public static int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, (a,b) -> a[0] == b[0] ? a[1]-b[1] : b[0]-a[0]);
		List<int[]> list = new ArrayList<int[]>();
		for(int[] person : people) {
			list.add(person[1],person);
		}
		return list.toArray(new int[list.size()][2]);
	}
	
	public static int activitySelection(int[][] activities) {
		Arrays.parallelSort(activities,(a,b) -> a[1] - b[1]);
		int prevFinishTime = activities[0][1];
		int count=1;
		
		for(int i=1;i<activities.length;i++) {
			if(activities[i][0] >= prevFinishTime) {
				count++;
				prevFinishTime = activities[i][1];
			}
		}
		return count;
	}
	
	public static int coinChange(int[] coins,int value) {
		int count=0;
		
		while(value!=0) {
			int coin = getCoint(coins,value);
			value-=coin;
			count++;
		}
		return count;
	}
	
	private static int getCoint(int[] coins,int value) {
		for(int i=coins.length-1;i>=0;i--) {
			if(coins[i]<=value)
				return coins[i];
		}
		return 0;
		
	}
}
