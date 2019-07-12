/////This isn't complete.. refer to the https://github.com/dhirajdkv/Data-Structures/edit/master/binarytreejava.java
#include <iostream>

class Node
{
int data;
Node* left;
Node* right;
};

int AddNode(int data);
Node* root;

int main() {
  std::cout << "Hello World!\n";
}

int AddNode(int data)
{
  if(root==null)
  {
    root = new Node(data);
  }
  else
  {
     Node temp = root;
      while(temp !=NULL)
      {
        if(temp->data<data)
        {
          temp = temp->left;
        }
        else{
          temp=temp->right;
        }
      }

      n1 = new Node(data);
       if(temp->data<data)
        {
          temp->left=n1;
        }
        else{
          temp->right=n1;
        }


  }
}
