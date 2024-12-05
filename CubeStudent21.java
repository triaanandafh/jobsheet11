public class CubeStudent21 {
    public static int calculateArea(int p, int l){
        int area = p*l;
        return area;
    }
    public static int calculateVol(int p, int l, int t){
        int vol = p*l*t;
        return vol;
    }
    public static void main(String[] args) {
        int answer = calculateArea(5, 4);
        int answerVol = calculateVol(9, 8, 5);
        System.out.println("The total of area is " + answer);
        System.out.println("The total volume is " + answerVol);
    }
}
