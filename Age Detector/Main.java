#include<iostream>
using namespace std;
int main()
{
  int birth, current;
  cin>>birth>>current;
  if(birth==00)
    cout<<current;
  else if(birth<=current)
    cout<<current-birth;
  else if(current==00)
    cout<<100-birth;
  else
    cout<<100-birth+current;
}