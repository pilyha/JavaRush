package something;

public class minimumchetireh {
        public static int min(int a, int b, int c, int d) {
        int m = min(a,b);
        int m2 = min(c,d);
        int min = 0;
        if(m<m2)
            min = m;
        else
            min = m2;
        return min;

}

        public static int min(int a, int b) {
        int m=0;
        if(a>b)
            m=b;
        else
            m=a;
        return m;

        }

        public static void main(String[] args) throws Exception {
            System.out.println(min(-20, -10));
            System.out.println(min(-40, -10, -30, 40));
            System.out.println(min(-20, -40, -30, 40));
            System.out.println(min(-20, -10, -40, 40));
            System.out.println(min(-20, -10, -30, -40));
        }
}

