#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int age;
  float time, amt;
  cin>>age>>time;
  if(age<=13){
  	if(time>10.15 || time>=13.30 || time>=18.00 || time>=22.00){ 
      amt = 2;
      cout<<"$"<<fixed<<setprecision(2)<<amt;
    }
    else{
      amt=4;
      cout<<"$"<<fixed<<setprecision(2)<<amt;
    }
  }
  else{
  	if(time>10.15 || time>=13.30 || time>=18.00 || time>=22.00){
      amt = 5;
      cout<<"$"<<fixed<<setprecision(2)<<amt;
    }
    else{
      amt = 8;
      cout<<"$"<<fixed<<setprecision(2)<<amt;
    }
  }
}