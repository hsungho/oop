package gameRps;

public interface RPSService {
	public void betPlayerValue(int playerValue);
	public void setComputerValue();
	public void whoWin();
	public String showResult();
	public boolean checkvalidation(String rps); // 유효성체크

}
