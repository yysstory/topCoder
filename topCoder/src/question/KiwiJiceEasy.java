package question;
public class KiwiJiceEasy {

//탑코더 1번 문제 풀이
//
	

	int[] capacities;
	int[] bottles;
	int[] fromId;
	int[] toId;

	public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

		this.capacities = capacities;
		this.bottles = bottles;
		this.fromId = fromId;
		this.toId = toId;
		
		
		for (int i = 0; i < fromId.length; i++) {

			if((bottles[fromId[i]]+bottles[toId[i]])>=capacities[toId[i]]){
				
				int transfer = (bottles[fromId[i]]+bottles[toId[i]])-capacities[toId[i]];
				bottles[fromId[i]]=transfer;
				bottles[toId[i]] = capacities[toId[i]];
				
		/*		for (int j = 0; j < bottles.length; j++) {
					System.out.print(bottles[j] + " ");
				}
				System.out.println();*/
			
			}else{
				bottles[toId[i]]=bottles[fromId[i]]+bottles[toId[i]];
				bottles[fromId[i]]=0;
				
/*				for (int j = 0; j < bottles.length; j++) {
					System.out.print(bottles[j] + " ");
				}
				System.out.println();*/
			}
		}
		
		
		return bottles;
	}

	public static void main(String[] args) {

		KiwiJiceEasy kj = new KiwiJiceEasy();
		int[] capacities = {14,35,86,58,25,62};
		int[] bottles = {6,34,27,38,9,60};
		int[] fromId = {1,2,4,5,3,3,1,0};
		int[] toId = {0,1,2,4,2,5,3,1};
		int[] result = kj.thePouring(capacities, bottles, fromId, toId);


		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
