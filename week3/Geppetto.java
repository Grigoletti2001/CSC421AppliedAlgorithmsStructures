class Geppetto {
static int[] E = new int[32];
static int count;
static void gen( int k, int A ) {
if (k==0) ++count;
else {
gen( k-1, A );
if (______ (A & E[k]) == 0 _____) ;
gen( k-1, ______ A | 1<<k ______ ); 
}
}
public static void main( String[] args ) {
Scanner in = new Scanner( System.in );
int N = in.nextInt();
for (int M=in.nextInt(); M>0; --M) {
int x = in.nextInt(), y = in.nextInt();
E[x] |= 1<<y; E[y] |= 1<<x;
}
gen( N, 0 );
System.out.println( count );
}
}