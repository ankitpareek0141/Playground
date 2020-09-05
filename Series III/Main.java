#include <iostream>
using namespace std;

int main() 
{
       int n, c=0, a=6;
    cin>>n;
    for(int i=0;i<n;i++){
    	cout<<a<<" ";
      	c=c+5;
        a=a+c;
    }
}