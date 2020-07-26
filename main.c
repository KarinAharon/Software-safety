#include <stdio.h>
#include <stdlib.h>

//address
//The function receives an array and index and input in arr[index] the value 8
//then it return if index bigger than the value in index-1 index   
int address(int *arr, int index){
arr[index] = 8;
  free(arr);

  return (index > arr[index-1]); //error -  the array is free
}

//integer-divide-by-zero
//This function recieved a number and divide it by zero
int zero(int number){
  int result =number / 0;  //error - cannot divide by zero
  return result;
}

//bounds
void bounds(int size, int num){
  int arr[size];
  arr[size+1] = num; //error -  this index not exist in arr
}

//leak
void leak(int size1, int size2){
    int *arr1 = (int*)malloc(sizeof(int) * size1);
    char *arr2 = (char*)malloc(sizeof(int) * size2);
    free(arr1);  //error - just arr1 free, arr2 not free
}

int main() {

  bounds(5,3);
  
  int *arr = (int*)malloc(sizeof(int) * 5);
  int flag = address(arr, 3);

  int r = zero(5);
  
  int s1 = 3;
  int s2 = 6;
  leak(s1, s2);
  
}
