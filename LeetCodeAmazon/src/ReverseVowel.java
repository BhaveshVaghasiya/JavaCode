
public class ReverseVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data= "leetCODE";
		ReverseVowel ev =new ReverseVowel();
		System.out.println(ev.reverse(data));
	}

	private String reverse(String data) {
		char[] dataArr = data.toCharArray();
		for(int i=0, j= dataArr.length-1; i<j ;) {
			if(!isVowel(dataArr[i])) {
				i++;
			}
			if(!isVowel(dataArr[j])){
				j--;
			}
			if(isVowel(dataArr[j]) && isVowel(dataArr[i])) {
				char temp = dataArr[i];
				dataArr[i] = dataArr[j];
				dataArr[j] = temp;
				i++; j--;
			}
		}
		return new String(dataArr);
	}

	private boolean isVowel(char c) {
		char v =  Character.toLowerCase(c);
		return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
	}

}
