public class Reverse {
    public void rev(String s){
        char temp;
        int size=s.length();
        char[] reversed= new char[size];
        int x=s.length()-1;
        for(int i=0;i<size/2;i++){
            temp=s.charAt(i);
            reversed[x]=temp;
            temp=s.charAt(x);
            reversed[i]=temp;
            x--;
        }
        if(size%2!=0){
            temp=s.charAt(size/2);
            reversed[size/2]=temp;
        }
        System.out.println(reversed);
    }
}
