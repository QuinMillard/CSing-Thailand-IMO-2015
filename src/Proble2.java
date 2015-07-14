public class Proble2 {
	public static void main(String args[]){
		//Scroll through all values of X, Y and Z
		for(int x = 0; x < 100; x++){
			for(int y = 0; y < 100; y++){
				for(int z = 0; z < 100; z++){
					
					
					//Check if the first one is a power of 2
					for(int n1 = 0; n1 < 10; n1++){
						if(x*y-z == Math.pow(2, n1)){
							
							//Check if the second one is a power of 2
							for(int n2 = 0; n2 < 10; n2++){
								if(x*z-y == Math.pow(2,  n2)){
									
									//Check if the third one is a power of 2
									for(int n3 = 0; n3 < 10; n3++){
										if(y*z-x == Math.pow(2, n2)){
											
											//Print the triple.
											System.out.println(x + " " + y + " " + z);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		
	}
}
