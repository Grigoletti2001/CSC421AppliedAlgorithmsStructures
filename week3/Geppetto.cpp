#include <iostream>
using namespace std;

int i,n,m,a,b,cannot[20];
int dfs(int x,int sum){   
	
if(x==n)return 1;      

if(!(cannot[x]&sum))return dfs(x+1,sum|(1<<x))+dfs(x+1,sum);
 else return dfs(x+1,sum);
}

 int main(){
       cin>>n>>m;           for(i=0;i<m;i++){
                  cin>>a>>b;
                 a--;
                  b--;
                  cannot[a]|=(1<<b);
                  cannot[b]|=(1<<a);

}

 cout<<dfs(0,0)<<endl; 

 return 0;    

}