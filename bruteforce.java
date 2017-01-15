package javapractice;

public class Main {
	public static void main(String args[]){
		System.out.println("It's working so far, go Java!");
		String letter[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		String Password = "eightbit";
		crackPassword(Password,letter);
	}
	
	public static void crackPassword(String password, String letter[]){
		int trys = 0;
		System.out.println("Cracking password..");
		for(String TL : letter){
			for(String TL2 : letter){
				for(String TL3 : letter){
					for(String TL4 : letter){
						for(String TL5 : letter){
							for(String TL6 : letter){
								for(String TL7 : letter){
									for(String TL8 : letter){
						String fullpass = TL+TL2+TL3+TL4+TL5+TL6+TL7+TL8;
						trys++;
						if(trys==10000000){
							System.out.println("reached  10 million trys");
						}
						else if(trys==100000000){
							System.out.println("reached 100 million trys");
						}
						if(fullpass.equals(password)){
							System.out.println("Password cracked. The password is: "  + fullpass);
							System.out.println("It took " + trys + " trys to crack this password.");
									}
								}
							}
						}
				} 	}
			}
		}		}
		
		
		
		//Prints out word.
		System.out.println();
	}

}
