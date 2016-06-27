package bank;

import java.util.ArrayList;
import java.util.List;

public class BankServiceImpl implements BankService{
	
	List<AccountBean> list;

	public BankServiceImpl() {
		list = new ArrayList<AccountBean>();
	}
	
	@Override
	public void openAccount(AccountBean acc) {
		// 11개설(은행창구개설)
		list.add(acc);
	}

	@Override
	public List<AccountBean> accountList() {
		//12 조회(전체)
		
		
		return list;
	}

	@Override
	public AccountBean findByAccountNo(String accNo) {
		//13 조회(계좌번호)
		AccountBean acc = new AccountBean();
		int i = 0;
		for (; i < list.size(); i++) {
			String temp = String.valueOf(list.get(i).getAccountNo());
			if (temp.equals(accNo)) {
				acc = list.get(i);
				break;
			}
		}
		
		/*
		 for (int i = 0; i < list.size(); i++) {
			if (accNo.equals(String.valueOf(list.get(i).getAccountNo()))) {
				result = list.get(i).toString();
				break;
			}
		}
		 * */
		return acc;
		
	}

	@Override
	public List<AccountBean> findByName(String name) {
	 AccountBean na = new AccountBean();
	 String 
		
		// 14 조회
		return null;
	}

	@Override
	public int count() {
		// 15계좌수
		return list.size();
	}

	

	@Override
	public void updateAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String deleteAccount(String accNo) {
		// TODO Auto-generated method stub
		AccountBean a = this.findByAccountNo(accNo);
		
		return "";
	}

}