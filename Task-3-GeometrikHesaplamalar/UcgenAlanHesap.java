public class ÜçgenAlanHesap {
    public static void main(String[] args) {
        double a=3;
        //double yazdığım için 3.0 yazmak galiba daha doğru olurdu.Bu işlem tam sayı değerini verdiği için sadece 3 yazmayı denedim hata vermeyince bu şekilde bıraktım(Çalışana dokunma)//
        double b=4;
        double c=5;
        double s=(a+b+c)/2;
        double Alan = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);

        System.out.println(s);
        System.out.println("Alan="+Alan);
    }
}
