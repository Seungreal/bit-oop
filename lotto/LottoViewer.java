package lotto;

import java.util.Arrays;
import java.util.Scanner;

public class LottoViewer {
    private static final int SIZE = 6;
    public void starLotto(Scanner scan) {
        LottoDTO lotto = new LottoDTO();
        LottoController control = new LottoController();
        
        System.out.println("로또번호 추첨기 시작");
        //사용자 번호 입력
        for(int i=0;i<SIZE;i++) {
            System.out.print("번호를 입력하세요: ");
            while(!control.selclotto(lotto,scan.nextInt())) {
                System.out.print("중복되었습니다. 번호를 입력하세요: ");
            }
        }
        control.drawLotto(lotto,SIZE);
        System.out.println("선택한 번호는 "+Arrays.toString(lotto.getUserNumbers()));
        System.out.println("당첨번호는 "+Arrays.toString(lotto.getLottoNumbers()));
        System.out.println(control.winCheck(lotto));
        
    }
}
