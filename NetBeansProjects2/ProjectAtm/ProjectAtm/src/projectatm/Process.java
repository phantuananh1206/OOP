/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectatm;


import java.util.Scanner;


public class Process extends  Data {
 
    protected  String  Pass,ID;
    protected int Dem=3 ;
    Scanner in = new Scanner(System.in);
    public void Account ()
    {   }    
    
   public void ShowAcc()
   {
       System.out.println ("Vo Van An | ID = 0000| PIN = 123456 ");
       System.out.println ("Vo Van Khang | ID = 1111| PIN = 123456 ");
   }

    
    public void Input()
    {      
        System.out.print ("Nhap ID : ");
        this.ID = in.nextLine();
        System.out.print ("Nhap PIN : ");
        this.Pass = in.nextLine();
        
    }
     public String TakeID()
     {
       return this.ID;
     }
    public boolean  CheckId()
    {
       for ( Profile DanhSach : accounts  )
       {
        if (this.ID.equals(DanhSach.getIDa()) )
        {  
           return true ;
         }
        
       }
       System.out.println (this.ID);
            return false;
    
    } 
   public boolean  CheckPIN()
    {
       for ( Profile DanhSach : accounts  )
       {
        if (this.Pass.equals(DanhSach.getPassword()) )
        {
         return true ;
        }
        
       }
        System.out.println (this.Pass);
            return false;
    
    } 

     
  
     public boolean InputAndCheck ()
     {
         Input();
       if ( CheckId () == true  && CheckPIN()== true )
            {
                System.out.println ("Đăng nhập thành công !! ") ; 
               return true;
              }
       else {   
           System.out.println ("Đăng nhập sai ID hoặc Password !! ") ; 
           }
        
       
       return InputAndCheck();
    }
     public boolean XemThongTinCaNhan (String ID)
     {
             for ( Profile DanhSach  : accounts  ) 
             {        if(ID.equals(DanhSach.getIDa()))
                  {
               DanhSach.OutProfile();
                  }
             }
        return true;
       }
     public boolean NapTienVaoTaiKhoan (String ID)
     {
          
       
        for ( Profile DanhSach  : accounts  ) 
        {         if(ID.equals(DanhSach.getIDa()))
                  {
                      System.out.println("nhập số tiền cần nạp lớn hơn 50000 VND !");
                  float Inmoney = in.nextFloat();
                  if(Inmoney >50000){
                      DanhSach.setMoney(Inmoney);  
                       System.out.println("nạp tiền thành công !!");
                  }else
                  {
                     System.out.println("nhập số tiền không hợp lệ !");
                     return false ;
                  } 
                              
                  }
        }
        return true;
     }
     public boolean DoiMaPin(String ID )
     {   String PIN ,PIN2;  
       
        for ( Profile DanhSach  : accounts  ) 
        {     if(ID.equals(DanhSach.getIDa()))
                  {
             System.out.println ("Nhap mã PIN cũ : ");
               do {    PIN = in.nextLine();
                        if(PIN.equals(DanhSach.getPassword()))
                    {
                      System.out.println ("Nhap mã PIN mới :");
                       PIN=in.nextLine() ;
                      System.out.println ("xác nhận lại mã PIN mới :");
                       PIN2=in.nextLine();
                  
                    if(PIN.equals(PIN2))
                    { 
                        
                    DanhSach.setPassword(PIN);
                        System.out.println ("Đổi Thành Công !! :"); 
                    return true;
                    }else 
                       {  
                       System.out.println ("Xác nhận mã PIN sai !! :"); 
                       return false ;
                       }
                    }else {
                   System.out.println ("Nhap Mã PIN sai yêu cầu nhập lại !!");        
                       
                   }                     
                  }while( !PIN.equals(DanhSach.getPassword()));
        }          
        }        
         return false ;
     }
     
     public String typeIDS()
     { 
         String IDS;
          IDS=in.nextLine() ; 
     return IDS;
     }
     
     
     
     public  boolean ChuyenKhoan (String ID) 
     {
     String IDS ;
      float Money =0 ;
      for ( Profile DanhSach  : accounts  ) 
      {           if(ID.equals(DanhSach.getIDa()))
                  {
                      
                      if(DanhSach.getMoney()<=50000)
                      {     
                          System.out.println ("Số tiền trong tài khoản không đủ để thực hiện yêu cầu này !! "); 
                      }else {    
             System.out.println ("Nhap ID cần chuyển  :");
                         typeIDS();
                          IDS=typeIDS();
                     
                    for (   Profile DanhSach2  : accounts  )
                    {
                      
                        if(IDS.equals(DanhSach2.getIDa()) )                    
                        {
                          System.out.println ("Nhap số tiền cần chuyển ( lớn hơn 50000đ ) :");     
                             Money = in.nextFloat();
                               if(Money<50000)
                                {
                                return false ;   
                                }
                                else
                                {
                                DanhSach2.SentMoney(Money);
                                DanhSach.InMoney(Money);
                                System.out.println ("Chuyển thành công !! ");
                                return true;
                                }
                                }
                        else    {  
                                System.out.println ("ID không tồn tại !! "); 
                                return false ;
                        }     
                      }
                    }  
                  }
      }
                 return true;
               }   
    
     public boolean RutTien (String ID)   
     {  float TMoney =0 ; 
              for (Profile DanhSach : accounts )
               {
                 if(ID.equals(DanhSach.getIDa())) 
                    {
                      if (DanhSach.getMoney()>50000)
                         { 
                           System.out.println ("Nhap số tiền rút (tối thiểu: 50,000 VND, tối đa: 20,000,000 VND và phải chia hết cho: 50,000 VND !");
                        do {
                            TMoney = in.nextFloat(); 
                           } while (  TMoney <  50000 || TMoney >= 20000000 && TMoney % 50000 == 0 );
                            DanhSach.OutMoney(TMoney);
                            System.out.println ("Rút tiền Thành Công  !!");
                            return true ;
                         }else 
                      {
                    
                      System.out.println ("Số tiền trong tài khoản không đủ để rút tiền !!");
                      return false;
                    }
                }
          
            }
              return true ;
         }
     private boolean DoiMaPin() {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private boolean NapTienVaoTaiKhoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}