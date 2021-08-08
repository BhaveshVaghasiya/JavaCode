
public class MinTimeDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data = {"01:00", "05:00", "10:30","23:00"};
		MinTimeDifference mtd =new MinTimeDifference();
		System.out.println(mtd.min(data));
	}

	private int min(String[] data) {
		int minDiff = Integer.MAX_VALUE;
		boolean[] timestamp = new boolean[2000];
		for(String d: data) {
			timestamp[60 * ((d.charAt(0) - '0') * 10 + d.charAt(1) - '0') + ((d.charAt(3) - '0') * 10) + d.charAt(4) - '0'] = true;
		}
		int current =0, first=-1, pre =-1;
		while (current < timestamp.length) {
			if(timestamp[current] && first == -1) {
				pre = current;
				first = current;
			} else if(timestamp[current]) {
				if(current - pre < minDiff) {
					minDiff = current-pre;
				}
				pre = current;
			}
			current++;
		}
		return (24 * 60 - pre + first) < minDiff ? 24 * 60 - pre + first: minDiff;
		
	}

}
