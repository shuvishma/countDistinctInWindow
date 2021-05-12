import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in) ;
		int n = sc.nextInt() ;
		int k = sc.nextInt() ;
		int[] arr = new int[n] ;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt() ;
		}
		Map<Integer, Integer> mp = new HashMap<>() ;
		for(int i=0; i<k-1; i++) {
			mp.put(arr[i], mp.getOrDefault(arr[i],0)+1) ;
		}
        //System.out.print(mp.size()+" ") ;

        for(int i=k-1, j=0; i<n; i++,j++) {
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1) ;
            System.out.print(mp.size()+" "); 
            
            int temp = mp.get(arr[j]) ;
            if(temp == 1) {
                mp.remove(arr[j]) ;
            }
            else{
                mp.put(arr[j], temp-1) ;
            }
            //i++ ;
            //j++ ;
        }
                      // Your code here
	}
}
