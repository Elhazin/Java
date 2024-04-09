class aaa{
    public static void main(String[] args){
        System.out.println("Hello World");
        newclass obj = new newclass();
        obj.print();

    }
  public  static void print(){
        System.out.println("This is a new function");
    }
}
class newclass{
    static int a = 5000;
    public  void print(){
        byte b = 127;
        System.out.println("This is a new class and the a value is "+b );
        // System.out.println("This is a new class and the a value is "+a );
        // boolean b = true;
    }
    public static void main(String[] args){
        char arr[] = {'a','b','c','d'};
        arr[3] = 0;
        while(true){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}