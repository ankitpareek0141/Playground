#include<iostream>
using namespace std;
int main()
{
  int n, i, sum=0;
  cin>>n;
  if(n!=0){
  while(n>0){
    n = n/10;
    sum++;
  }
  cout<<sum;
  }
  else 
    cout<<1;
}