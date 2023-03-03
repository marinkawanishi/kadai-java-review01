
public class Review01 {

    public static void main(String[] args) {
        int genka = 1500;
        int syouhizei = tax(genka);
        int goukei = genka + syouhizei;
        System.out.println(genka + "円の商品の税込み価格は" + goukei + "円(消費税は" + syouhizei + "円)です。");
    }
    public static int tax(int genka) {
        double result = (double)genka * 0.1;
        return (int)result;
    }

}
