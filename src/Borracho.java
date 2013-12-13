package src;

public class Borracho {
	
	public void getBorracho(int num_cerves){
		if(num_cerves<10){
			System.out.println("No tienes que preocuparte, eres un español mas");
		}else if (num_cerves>=10 && num_cerves<20){
			System.out.println("Venga que tu puedes con alguna mas");
		}else{
			System.out.println("vete a casa ya BORRACHO!!!!");
		}
	}
}
