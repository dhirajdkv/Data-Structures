public class Main {
  int data;
  Main left, right;
  public Main(int data){
    this.data = data;
  }
  public void insert(int value){
    if(value<=data){
      if(left == null){
        left = new Main(value);
      }
      else{
        left.insert(value);
      }
    }
    else{
      if(right == null){
        right = new Main(value);
      }
      else{
        right.insert(value);
      }
    }
  }
      public void postOrder(){
    if(left!=null){
      left.postOrder();
    }
    System.out.println(data);
    if(right!=null){
      right.postOrder();
    }
  }
  public static void main(String[] args) {
    Main n1 = new Main(50);
    for(int i=10;i<100;i=i+10){
      if(i!=50){
        n1.insert(i);
      }
    }
    n1.postOrder();
  }
}
