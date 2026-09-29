public class loop {
    public static void main(String[] args) {
    int i = 1;
    while (i<=3){
        int j = 1;
        while(j<=2){
            System.out.println(i+","+j);
            j++;
        }
        i++;
    }
    i = 1;
    do { 
        int j = 1;
        do { 
            System.out.println(i+","+j);
            j++;
        } while (j<=2);
        i++;
    }while(i<=3);
   System.out.println();

    System.out.println("for while using break");
    int k=1;
    while(k<=5){
        if(k==3)  break;
        System.out.println(k);
        k++;
    }
    System.out.println();

    System.out.println("for do while using break");
    int a=1;
    do { 
        if(a==3) break;
        System.out.println(a);
        a++;
    } while (a<=5);
    System.out.println();

    System.out.println("for while using continue");
    int b=1;
    while(b<=5){
        if(b==3){
            b++;
          continue; 
        }
        System.out.println(b);
        b++;
    }
    System.out.println();

    System.out.println("for do while using continue");
    int c=1;
    do { 
        if(c==3) {
            c++;
            continue;
        }
        System.out.println(c);
        c++;
    } while(c<=5);
    }
}
