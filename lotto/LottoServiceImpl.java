package lotto;

public class LottoServiceImpl implements LottoService{

    @Override
    public int[] addNumbers(int[] list,int number) {
        
        for(int i=0;i<list.length;i++) {
            if(list[i]==0) {
                list[i]=number;
                break;
            }
        }
        return list;
    }

    @Override
    public int[] sortNumbers(int[] list) {
        for(int i=0;i<list.length;i++) {
            int min = i;
            for(int j=i+1;j<list.length;j++) {
                if(list[min]>list[j])
                    min=j;
            }
            int temp = list[min];
            list[min]=list[i];
            list[i]=temp;
        }
        return list;
    }

    @Override
    public boolean dupl(int[] list, int number) {
        for(int i=0;i<list.length;i++)
            if(list[i]==number)
                return true;
        return false;
    }
}
