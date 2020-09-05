#include<iostream>
using namespace std;
int main()
{
  int mlg, ltr, dis;
  cin>>mlg>>ltr>>dis;
  if(ltr*mlg>=dis)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}