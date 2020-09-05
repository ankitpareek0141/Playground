#include <iostream>
using namespace std;
int gcd(int,int,int,int);
int main() 
{
  int n1,n2,n3,ans;
  int small;
  int x;
  	cin>>n1>>n2>>n3>>ans;
  	if(n1<n2 && n1<n3)
      small=n1;
  	else if(n2<n1 && n2<n3)
      small=n2;
  	else
      small=n3;
  
  	if(gcd(n1,n2,n3,small)==ans)
    	cout<<"Answer is correct.";
   	else
      	cout<<"Answer is wrong.";
    return 0;
}

int gcd(int a, int b,int c,int small){
  int res=0;
 while(small>0){
	if(a%small==0 && b%small==0 && c%small==0){
		res=small;
  		break;
		}
 	 small--;
	}
  return res;
}