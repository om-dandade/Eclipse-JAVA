package genral;

public class String2 {
	public static int leastMovesToConvert(String s1, String s2) {
		return lmtcHelper(s1, s2, 0, 0);
	}
	
	private static int lmtcHelper(String s1, String s2, int idx1, int idx2) {
		if(idx1 >= s1.length())return s2.length() - idx2;
		if(idx2 >= s2.length())return s1.length() - idx1;
		if(s1.charAt(idx1) == s2.charAt(idx2))return lmtcHelper(s1, s2, idx1+1, idx2+1);
		
		else {
			int delete = 1 + lmtcHelper(s1, s2, idx1, idx2+1);
			int insert = 1 + lmtcHelper(s1, s2, idx1+1, idx2);
			int replace = 1 + lmtcHelper(s1, s2, idx1+1, idx2+1);
			
			delete = Math.min(delete, insert);
			return Math.min(delete, replace);
		}
	}

	public static int longestCommonSubsequence(String s1, String s2) {
		return lcsHelper(s1, s2, 0, 0);
	}

	private static int lcsHelper(String s1, String s2, int idx1, int idx2) {
		if(idx1 >= s1.length() || idx2 >= s2.length())return 0;
		if(s1.charAt(idx1) == s2.charAt(idx2)) return 1 + lcsHelper(s1, s2, idx1+1, idx2+1);
		
		else {
			int option1 = lcsHelper(s1, s2, idx1, idx2+1);
			int option2 = lcsHelper(s1, s2, idx1+1, idx2);
			
			return Math.max(option1, option2);
		}
	}

	public static int longestPalindromSubsequencelength(String str) {
		return lpsHelper(str, 0, str.length() - 1);
	}
	
	private static int lpsHelper(String str, int left, int right) {
		if(left > right)return 0;
		if(left == right)return 1;
		if(str.charAt(left) == str.charAt(right))return 2 + lpsHelper(str, left+1, right-1);
		
		else {
			int skpingRight = lpsHelper(str, left, right-1);
			int skpingLeft = lpsHelper(str, left+1, right);
			
			return Math.max(skpingRight, skpingLeft);
		}
	}
	
	public static String longestPalindromSubsequence(String str) {
		return lpan(str, 0, str.length()-1);
	}
	
	private static String lpan(String str, int left, int right) {
		StringBuilder sb = new StringBuilder();
		if(left > right)return sb.toString();
		if(left == right) {
			sb.append(str.charAt(left));
			return sb.toString();
		}
		if(str.charAt(left) == str.charAt(right)) {
			sb.append(str.charAt(left));
			sb.append(lpan(str, left+1, right-1));
			sb.append(str.charAt(right));
			
			return sb.toString();
		}
		
		else {
			String skippingRight = lpan(str, left, right-1);
			String skippingLeft = lpan(str, left+1, right);
			
			if(skippingRight.length() > skippingLeft.length())return skippingRight;
			return skippingLeft;
		}
		
	}
}
