package lotto;

import java.util.Random;

public class LottoController {
    public void drawLotto(LottoDTO l,int size) {
        Random random = new Random();
        LottoService service = new LottoServiceImpl();
        
        for(int i=0;i<size;i++) {
            int number = random.nextInt(45)+1;
            while(service.dupl(l.getLottoNumbers(), number))
                number = random.nextInt(45)+1;
            service.addNumbers(l.getLottoNumbers(), number);
        }
        service.sortNumbers(l.getLottoNumbers());
    }
    
    public String winCheck(LottoDTO l) {
        int[] user=l.getUserNumbers();
        int[] lotto=l.getLottoNumbers();
        int score = 0;
        
        for(int i=0;i<user.length;i++) {
            for(int j=0;j<lotto.length;j++) {
                if(user[i]==lotto[j])
                    score++;
            }
        }
        switch (score) {
        case 6:
            return "총 "+score+"개 맞추셨습니다. 1등입니다.";
        case 5:
            return "총 "+score+"개 맞추셨습니다. 2등입니다.";
        case 4:
            return "총 "+score+"개 맞추셨습니다. 3등입니다.";
        case 3:
            return "총 "+score+"개 맞추셨습니다. 4등입니다.";
        default:
            return "총 "+score+"개 맞추셨습니다. 꽝입니다.";
        }
    }
    
    public boolean selclotto(LottoDTO l,int number) {
        LottoService service = new LottoServiceImpl();
        if(service.dupl(l.getUserNumbers(), number))
            return false;
        service.addNumbers(l.getUserNumbers(), number);
        service.sortNumbers(l.getUserNumbers());
        return true;
    }
}
