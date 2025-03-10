public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
        int []a={1,2,3,4,5};
        String []b={"Aadsf","Bvse","Czefsd"};
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                System.out.println(a[i]);
        }
        for(int i=0;i<b.length;i++) {
            if (b[i].length() > 4)
                System.out.println(b[i]);
        }
        //Test
        System.out.println(args);
    }
}