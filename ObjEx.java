public class ObjEx {
    //int volume,breath=33,width=34,height=34;
 int  breath=4;
  int  width=2;
    int height=5;

}
class O_Ex{
    public static void main(String[]args)
    {
        ObjEx obj=new ObjEx();
       int volu=obj.width*obj.breath*obj.height;
        System.out.println("volume :"+volu);

    }
}