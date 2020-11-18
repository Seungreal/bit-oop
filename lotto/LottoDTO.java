package lotto;

public class LottoDTO {
    private int[] lottoNumbers = new int[6];
    private int[] userNumbers = new int[6];

    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public void setLottoNumbers(int[] lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public int[] getUserNumbers() {
        return userNumbers;
    }

    public void setUserNumbers(int[] userNumbers) {
        this.userNumbers = userNumbers;
    }

}
