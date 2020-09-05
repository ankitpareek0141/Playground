#include<iostream>
using namespace std;
int main()
{
  int amount1, disc1, ship1;
  int amount2, disc2, ship2;
  int amount3, disc3, ship3;
  int total1, total2, total3;
  cin>>amount1>>disc1>>ship1;
  cin>>amount2>>disc2>>ship2;
  cin>>amount3>>disc3>>ship3;
  int d1 = disc1*amount1/100;
  total1 = amount1-d1+ship1;
  
  int d2 = disc2*amount2/100;
  total2 = amount2-d2+ship2;
  
  int d3 = disc3*amount3/100;
  total3 = amount3-d3+ship3;
  
  cout<<"In Flipkart Rs."<<total1;
  cout<<"\nIn Snapdeal Rs."<<total2;
  cout<<"\nIn Amazon Rs."<<total3;
  
  if(total1<=total2 && total1<=total3)
    cout<<"\nHe will prefer Flipkart";
  else if(total2<=total1 && total2<=total3)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
  }
  