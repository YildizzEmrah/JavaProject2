
package emrahyildiz;

public class DataBase implements DataBaseInterface  {

    public Friends first;
    public Friends last;
    public String[] arr=new String[50];
    public String[] nameList=new String[50];
     public String[] nameList1=new String[50];
     public String[] friendList1=new String[50];
     public int[] popular=new int[50];
     public int k=0;
   
    public  DataBase(){
    
    first=null;
    last=null;
    
    }
   @Override
    public Person SearchName(String tName) {
     Friends dummy2=first;
        Person dummyName=new Person(tName);
        Friends dummy=first;
  
       try {     while(!dummy.getName().equals(tName)){       
        dummy=dummy.getNext();      
       }
       if(dummy.getNext1()!=null) {
         System.out.print(dummy.getName()+ " friends are " );
        while(dummy.getNext1()!=null) {
      System.out.print(dummy.getNext1().getName() + " ");
          dummy=dummy.getNext1();
      }         
        dummyName.SetName(dummy.getName());  
         System.out.println("\n");
      }     
      else {
       System.out.println(tName +"  has no friend ");
       }
       }
       catch (Exception e) {
        int countt=0;
          for(int i=0;nameList[i]!=null;i++) {
          if(nameList[i].equals(tName)) {
          countt++;
          }
          }
          if(countt==0) {
           System.out.println(tName +" is not in Database");
          }         
          else {   
           System.out.println(tName +"  has no friend ");
          }
          }     
return dummyName;
    }

    @Override
    public void OutputList() {
   int hitCount=0;
    Friends dummy=first;
    Friends dummy2=first;
   while(dummy!=null) {
     
   arr[hitCount]=dummy.getName();
   hitCount++;
    dummy=dummy.getNext();
    }
    dummy2=first;
   dummy=first;
   while (dummy!=null) {     
     while(dummy.getNext1()!=null) {
         arr[hitCount]=dummy.getNext1().getName();
         hitCount++;
     
      dummy=dummy.getNext1();   
      }
      dummy=dummy2.getNext();
      dummy2=dummy;
  } 
   int i=0;
   while(arr[i]!=null) {
int numberName=1;
       for(int j=0;(arr[j]!=null);j++) {
       if(arr[i].equals(nameList1[j])) {      
       numberName++;
       }      
       }
       System.out.println(arr[i] +" Hitcount " + numberName);
       i++;
   }   }
    @Override
    public boolean AddPerson(Person tNewPerson) {
       
          Friends d1=new Friends();
          d1.setName(tNewPerson.GetName());
          int c=0;
          toString2();
          for(int b=0;nameList[b]!=null;b++) {
          String z=nameList[b];
          if(z.equals(d1.getName())){
          c++;     }
          else {
          }         }
       if(c==0)   {
      if(listControl()) {  // List full         
     last.setNext(d1);
     last=d1;  
      }
      else {    
        first=d1;
        last=d1;
      }
       }
      else {
            nameList1[k]=d1.getName();
           k++;     }
        return true;
    }
    @Override
    public boolean DeletePerson(String pName) {
    try {      
        if(listControl()){
        Friends dummy=first;
        int counterr=0;
        toString2();    
        while(!dummy.getName().equals(pName)) {          
         dummy=dummy.getNext();   }
        for(int s=0;friendList1[s]!=null;s++) {
        if(friendList1[s].equals(pName)) {
        counterr++; }     }    
        if(dummy.getNext1()==null) {
          if(counterr!=0) {     
       System.out.print(pName + " can’t be deleted because someone friend with  " + pName );   }     
       else {
          if(dummy!=first) {
            dummy=first;
            dummy=dummy.getNext();
            Friends cat=first;
            while(!dummy.getName().equals(pName)) {
            cat=cat.getNext();
            dummy=dummy.getNext();               } 
           Friends tiger=null;
        tiger=cat.getNext();
          dummy=cat;
          dummy.setNext(dummy.getNext().getNext());
         tiger.setNext(null);        }
          else {
          Friends newDummy=first.getNext();
          first.setNext(null);
          first=newDummy;   }      
          System.out.println(pName+" is deleted.");   }      }
       else {
            
         System.out.print(pName+" can’t be deleted " +  pName + " friend of ");
         while(dummy.getNext()!=null) {
         System.out.print(dummy.getNext1().getName() + " ");
         dummy=dummy.getNext1();       }   }  
        }  
       System.out.println(" "); }
        
     catch(Exception e) {
                System.out.println(pName + " can't be deleted because it is not in database");         } 
return true;   }

    @Override
    public boolean AddFriend(String Name1, String Name2) {
      Friends dummy2=new Friends();
        dummy2.setName(Name2);
        Friends dummy=first;      
try {        while(!dummy.getName().equals(Name1)) {        
            dummy=dummy.getNext();     
        }   
       if(dummy.getNext1()==null) {     
      dummy.setNext1(dummy2);   
     System.out.println(Name2 + " is friend of " + Name1);    
       }
       else if(dummy.getNext1().getName().equals(Name2))
     {
                System.out.println("Ne need to add");   }
       else {        
      while(dummy.getNext1()!=null) {
          dummy=dummy.getNext1();   
      }
      dummy.setNext1(dummy2);
       dummy.getNext1().setNext1(null);
       System.out.println(Name2 + " is friend of " + Name1); }
}
 catch (Exception e) {
      System.out.println(Name1 + " is not in database they can’t be friend");     
      }return true;
        
    }

    @Override
    public String toString() {  
    Friends dummy=first;
     Friends dummy2=first;
   while(dummy!=null) {  
    System.out.print(dummy.getName()+" \n");
    dummy=dummy.getNext();
  }  
   dummy2=first;
   dummy=first;
   while (dummy!=null) {      
          while(dummy.getNext1()!=null) {
    System.out.print(dummy.getNext1().getName()+" \n");   
      dummy=dummy.getNext1();          
      }
      dummy=dummy2.getNext();
      dummy2=dummy;
  } 
    return null;
    
}
    
     public boolean listControl() {
    if(first != null) {
        return true;
    } 
    else {
    return false;
    }  
     }
     
     public String toString2() {
   
    Friends dummy=first;
     Friends dummy2=first;
     int i=0;
     int a=0;
   while(dummy!=null) {
      nameList[i]=dummy.getName();
    dummy=dummy.getNext();
i++;
   }   dummy2=first;
   dummy=first;
   while (dummy!=null) {   
          while(dummy.getNext1()!=null) {
                nameList[i]=dummy.getName();
                friendList1[a]=dummy.getNext1().getName();
              dummy=dummy.getNext1();   
      a++;
     i++;     }
      dummy=dummy2.getNext();
      dummy2=dummy;
  }  
        return null;
    
}
 public String mostPopular() {
  
    toString2();
 int getCount=0;
       for(int j=0;(friendList1[j]!=null);j++) {
          for(int i=0;friendList1[i]!=null;i++) {
          if(friendList1[j].equals(friendList1[i]))
          {
          getCount++;
          }
          
          }
          popular[j]=getCount;
          getCount=0;                 
       }     
       int temp=0;
       temp = popular[0];

for (int j = 0;popular[j]!=0; j++)
{
if (popular[j] > temp)
{
temp = j;
}
}
System.out.println("Most popular person is " + friendList1[temp]+ " everyone want to add her as friend ");
          
     return null;
    
}
    }
     


