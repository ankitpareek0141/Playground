#include <iostream>
using namespace std;

int main() 
{
  int n, c=1, a=1;
  float x=0.5;
  cin>>n;
  cout<<x<<" ";
  while(c<n){
    x=(float)x+a ;
  cout<<x<<" ";
    a=a*3;
    c++;
  }
    return 0;
}