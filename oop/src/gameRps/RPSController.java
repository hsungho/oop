package gameRps;

import javax.swing.JOptionPane;

public class RPSController {
	public static void main(String[] args) {
	RPSService service = new RPSServiceImpl();
		
		while (true) {
		switch (JOptionPane.showInputDialog("1계속 2종료")) {
		case "1":
			String rps = JOptionPane.showInputDialog("1가위 2 바위 3 보 ");
			if(service.checkvalidation(rps)){
			service.betPlayerValue(1);
			service.setComputerValue();
			service.whoWin();
			service.showResult();
			JOptionPane.showMessageDialog(null, service.showResult());
			
			}else{
				JOptionPane.showMessageDialog(null, "1~3까지 가능");
				continue;
				
			}
			
		}
	}	
	}

}
