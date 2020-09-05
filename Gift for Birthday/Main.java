#include<iostream>
using namespace std;
int main()
{
  int yr;
  cin>>yr;       // ==0 || yr%100==0 || yr%400==0
  if(yr%4==0)
    cout<<yr<<" is a leap year";
  else
    cout<<yr<<" is not a leap year";
}