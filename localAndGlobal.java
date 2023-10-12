public class localAndGlobal{

  int a=10;

  //System.out.("i am global +"+a);
         void show()
        {
           int a=20;
            System.out.println("hi i am nikhil"+a);

        }
        void display()
        {
            a=21;
            System.out.println("hi i am private"+a);
        }
    public static void main(String []args)
    {

        //System.out.println("hi i am public");
        localAndGlobal a=new localAndGlobal();
        a.show();
        a.display();
    }
}