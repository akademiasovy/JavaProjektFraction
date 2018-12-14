public class Fraction {
    private int c;
    private int m;

    public Fraction(int a, int b){
         c=a;
         m=b;
    }

    public Fraction(){

    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public float getRealValue(){
        return (float)c/m;
    }
    public boolean isProper(){
        return c<m;
    }

    public void convertToPrimary(){
        int x=2;
        while(x<=c && x<=m){
            if(c%x==0 && m%x==0 ){
                c=c/x;
                m=m/x;
            }
            else
                x++;
        }
    }
}
