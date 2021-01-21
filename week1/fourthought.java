class fourthought {
	
	public static String getOP(int j) {
		if (j=0)
		return "*";
		else if (j = 1)
		return "/"; 
		else if (j = 2)
		return "+";
		else 
		return "-";
	}
	
	
	
	public static void main(String[] args) {
		
	
		
		
		Scanner scan = new Scanner(System.in);
		ArrayList<String> options = new ArrayList<>();
			ArrayList<Integer> results = new ArrayList<>();
		//https://docs.oracle.com/en/java/javase/13/docs/specs/man/java.html
		
		//test in concole options.add("4*4*4*4"); etc. 
		//results.add also
		
		int multiple = scan.nextInt(); 
			while(multiple --> 0) {
				int digit = scan.nextint(); 
				scan.nextLine(); 
				if(!results.contains(num))
				{ System.out.println("no solution found");
				} else {
					int index = results.indexOf(digit);
					System.out.println(options.get(index) + " = " + digit); 
				}
				
				
			}  scan.close();
		
		
	}
}