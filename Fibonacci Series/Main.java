#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int x;
  if(n==1)
    x=0;
  else if(n==2)
    x=1;
  else{
    int a=0,b=1;
    for(int i=3;i<=n;i++){
    x=a+b;
      a=b;
      b=x;
    }
  }
  cout<<"The term "<<n<<" in the fibonacci series is "<<x;
}