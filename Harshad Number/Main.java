#include<iostream>
using namespace std;
int main()
{
  int n;
  int sum=0;
  int mod;
  cin>>n;
  int x=n;
  while(x>0){
  	mod = x%10;
    sum+=mod;
    x = x/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}