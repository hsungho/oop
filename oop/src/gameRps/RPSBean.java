package gameRps;

public class RPSBean {
  private String play,comp;

  public void setplay (String play ){
	  switch (play) {
	case "1":
		this.play = "가위";
		break;

	default:
		break;
	}
	  this.play = play;
	  
  }
public void setcomp(String comp){
	  this.comp = comp;
}
public String getplay(){
	return this.play;
}
public String getcomp(){
	return this.comp;
}



@Override
public String toString() {
	return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
	
	
}
  
}
