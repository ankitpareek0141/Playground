#include<iostream>
using namespace std;
int main()
{
  int l, r;
  cin>>r>>l;
  if(r+r<=l)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}