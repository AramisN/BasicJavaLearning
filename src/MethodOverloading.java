public class MethodOverloading {

    public static int thesameoverridemethod(int x,int y,int z){
        int answer = (x+y+z)/3;
        return answer;
    }

    public static int thesameoverridemethod(int x,int y){
        int answer = (x+y)/2;
        return answer;
    }
}
