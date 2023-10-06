package ExcelSheetProblems;

 class OverRiding {
    void Animal(){
        System.out.println("animal");
    }
}
 class Over extends OverRiding{
     void Animal(){
         System.out.println("barks");
     }
     public static void main(String args[]){
         OverRiding o = new OverRiding();
         o.Animal();
         Over over = new Over();
         over.Animal();
         String hello= "sdf";
         String hell="hm";
         System.out.println(hello+hell);
     }
 }
