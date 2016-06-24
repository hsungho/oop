package lotto;

import java.util.Arrays;

/**
 * @date : 2016. 6. 24.
 * @author : 황성호
 * @file :LottoBallServiceImpl.java
 * @story :
 * 
 */
public class LottoBallServiceImpl implements LottoBallService {

private	int[] lotto;

	@Override
	public void setLottoBall() {
		LottoBean lot = new LottoBean();
		this.lotto = new int[6];
for (int i = 0; i < lotto.length; i++) {
	 lotto[i]=0;
}
for (int i = 0; i < lotto.length; i++) {
	int num = lot.getNumber();
	boolean exist = false;
	for (int j = 0; j < lotto.length; j++) {
		if (lotto[j]==num) {
			exist = true;
			break;
		}
	}
	if (exist) {
		i--;
		continue;
	}else{
		lotto[i]=num;
	}
}
Arrays.sort(lotto);
		int i = 0;
		while (true) {
			int num = lot.getNumber(); // 0대신 식을 채우시오
			if (isDuplication(num) == true) { // 조건문을 채우시오
				continue;
			}
			this.lotto[i] = num; // 이미 중복이 되지 않는걸 알고있다
			i++;

			if (i == lotto.length) { // if문을 완성하시오

				break;
			}
		}
	}

	public boolean isDuplication(int num) {
		// 중복방지(완성)
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int[] getLottoBall() {
		return lotto;
	}

}