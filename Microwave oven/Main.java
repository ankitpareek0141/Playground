#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int items;
  float heat;
  cin>>items>>heat;
  if(items<=3){
    if(items==2)
    	heat = heat+(heat*50/100);
    if(items==3)
      heat = heat*2;
    cout<<fixed<<setprecision(2)<<heat;
  } 
  else
  	cout<<"Number of items is more";
}