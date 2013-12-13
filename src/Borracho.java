package src;

public class Borracho {
	public String getBorracho(int num_cerves){
		if(num_cerves<10){
			return "No tienes que preocuparte, eres un español mas";
		}else if (num_cerves>=10 && num_cerves<20){
			return "Venga que tu puedes con alguna mas";
		}else{
			return "vete a casa ya BORRACHO!!!!";
		}
	}
}
