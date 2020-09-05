#include<iostream>
using namespace std;
int main()
{
  int x, t;
  cin>>x;
  if(x<=200)
    t = x*0.5;
  else if(x<=400)
    t = x*0.65+100;
  else if(x<=600)
    t = x*0.80+200;
  else
    t = x*1.25+425;
  cout<<"Rs."<<t;
}