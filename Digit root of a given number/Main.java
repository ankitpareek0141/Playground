#include<iostream>  

using namespace std;  

int singleDigit(int n){  

 int r = 0, s = 0;  

 while(n > 9){  

    while(n > 0){  

       r = n % 10;  

        n = n / 10;  

        s += r;  

        }    

   n = s;  

   s = 0;  

 }  

 return n;  

}  

int main(){  

 int n;  

 cin>>n;  

 cout<<singleDigit(n);  

}