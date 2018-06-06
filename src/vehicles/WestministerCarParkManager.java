package vehicles;

import java.util.Scanner;

interface CarParkManager{
	
}

 class WestministerCarParkManager implements  CarParkManager {
	 
	 public static Scanner sc=new Scanner(System.in);//getting inputs from the user
	 public static 	car[] cars =new car[2];//created cars array
	 public static 	van[] vans=new van[2];//created vans array
	 public static 	motorbike[] bike=new motorbike[2];//created motorbike array
	 public static 	dateTime[] vDateT=new dateTime[3];//created dateTime array
	 


    	
        
      //main method
      		public static void main(String[] args) {  
      			menu();
      		}
      			
      			

      		 //created a menu to guide user
      			
      			public static void menu(){
      		 System.out.println("1\t Add new Vehicle");
      		  System.out.println("2\t Delete a  Vehicle");
      		 System.out.println("3\t Print	the	currently	parked 	vehicles list	");
      		 System.out.println("4\t Print	some	statistic");
      		 System.out.println("5\t Print	the	list	of	vehicle,	which	enter	in	the	parking	in	a	specified	day:");
      		 System.out.println("6\t Display	the	parking	charges	for	each	customer");
      		 System.out.println("                          ");
      		 int selection=sc.nextInt();
      		 
      		 switch(selection){
      		 
      		 case 1: 
      			 addVehicle();
      			 break;
      		 case 2:
      			 deleteVehicle();
      
      			 break;
      		 case 3:
      			vehicleList();
      		 break;
      		 case 4:
      			StatPrint(cars, vans, bike);
      			 break;
      		 case 5:
      			 break;
      		 case 6:
      			 break;
      			 
      			 
      			 
      		 }
      	 }
      	 
        
        //add vehicle method
        public static void addVehicle(){
        	System.out.println("enter 1 to add a car"); // created a menu to select which vehicle to add
        	System.out.println("enter 2  to add a van");
        	System.out.println("enter 3 to add a  motorbike");
			System.out.println("enter 4 to get the main menu");
        	
               int addvehicle=sc.nextInt();
               switch(addvehicle){
               case 1:
            	   addCar();
            	   break;
               case 2 :
            	   addvan();
            	   break;
               case 3:
            	   addmotorbike();
            	   break;

				   case 4:
					   menu();
					   break;
        }
            
 }
        
        
        
        //add car
        public static void addCar(){
        	for(int i=0;i<cars.length;i++){
        	System.out.println("Enter the iD_plate_no");
        	int id=sc.nextInt();
        	
        	System.out.println("Enter the vehicle_brand");
        String brand=sc.next();
        
      
        	System.out.println("Enter the no of doors");
        	int door=sc.nextInt();
        	
        	System.out.println("Enter the colour of the car");
        	String colour=sc.next();
        	
        	 System.out.println("Enter the car_name");
             String name=sc.next();
        	
           
        	
        	
        	cars[i]=new car( id, brand,door,  colour,name);
        
        }
        	
        	addVehicleDateTime();
        	  menu();
        }
        	
        	
        	
        	 //add van
            public static void addvan(){
            	for(int i=0;i<vans.length;i++){
            	System.out.println("Enter the iD_plate_no");
            	int id=sc.nextInt();
            	
            	System.out.println("Enter the vehicle_brand");
            String brand=sc.next();
            
            System.out.println("Enter the vehicle_name");
            String name=sc.next();
          
            	System.out.println("Enter the cargo_length");
            	int length=sc.nextInt();
            	
            	System.out.println("Enter the cargo_width");
            	int width=sc.nextInt();
            	
            	 System.out.println("Enter the cargo_height");
            	 int height=sc.nextInt();
                
            	
            	
                 vans[i]=new van( id, brand,name,length,width,height);
                 int Totvans=i;
            }
        	
            	addVehicleDateTime();
          	  menu();
        }
            
            
            //add motorbike
            public static void addmotorbike(){
            	for(int i=0;i<bike.length;i++){
            	
            	System.out.println("Enter the iD_plate_no");
            	int id=sc.nextInt();
            	
            	System.out.println("Enter the vehicle_brand");
            String brand=sc.next();
            
            System.out.println("Enter the vehicle_name");
            String name=sc.next();
          
            	System.out.println("Enter the engine_size");
            	int engine_size=sc.nextInt();
                
            	
            	
            	bike[i]=new motorbike( id, brand,name,engine_size);
            	int TotBikes=i;
            }
            	addVehicleDateTime();
          	  menu();
        	
        }
            
            //add vehicle entering times  and dates 
            public static void addVehicleDateTime(){
            	for(int i=0;i<vDateT.length;i++){
            	System.out.println("Enter the Vehicle entered date");
            	int date=sc.nextInt();
            	
            	System.out.println("Enter the vehicle entered month");
            int month=sc.nextInt();
            
            System.out.println("Enter the vehicle entered year");
            int year=sc.nextInt();
          
            	System.out.println("Enter the vehicle entered time");
            	double time=sc.nextDouble();
                
            	
            	
            	vDateT[i]  =new dateTime( date, month,year,time);
            	
            }
            }
        //delete vehicle method
        public static void deleteVehicle(){
        	System.out.println("enter 1 to delete a car");// created a menu to guide user which vehicle to be deleted
        	System.out.println("enter 2  to delete a van");
        	System.out.println("enter 3 to delete a  motorbike");
			System.out.println("enter 4 to get the main menu");
        	
        	int  deletevehicle=sc.nextInt();
            switch( deletevehicle){
            case 1:

         	   break;
            case 2 :

				break;
            case 3:

            	
         	   break;
				case 4:
					menu();
					break;
     }

        }
        
        
        //delete car
        public static void DeleteCar(car[] cars,int id){       
        	   for ( int i = id ; i < cars.length - 1 ; i++ ) {      	  
        		   cars[ i ] =cars[ i + 1 ] ; 
        	   }
        	   menu();
        	}

        
        //delete van
        public static void DeleteVan(van[] vans,int id){          
     	   for ( int i = id ; i < vans.length - 1 ; i++ ) {     	  
     		  vans[ i ] =vans[ i + 1 ] ; 
     	   }
     	  menu();
     	}

        //deleting motorbike
      
        public static void DeletBike(motorbike[] bike,int id){
     	   for ( int i = id ; i < bike.length - 1 ; i++ ) {
     		  bike[ i ] =bike[ i + 1 ] ; 
     	   }
     	  menu();
     	}
      //print the 	currently	parked 	vehicles list	
        public static void vehicleList(){
        	System.out.println("enter 1 to get the details of a car");
        	System.out.println("enter 2  to get the details of a van");
        	System.out.println("enter 3 to get the details of a  motorbike");
			System.out.println("enter 4 to get the main menu");
        	int   detofevehicle=sc.nextInt();
            switch( detofevehicle){
            case 1:
            	 detCar();
         	   break;
            case 2 :
            	detVan();
         	   break;
            case 3:
         	   addmotorbike();
         	   break;
         	   case 4:
					menu();
					break;
     }

        }      
       
           
            //details of parked van
            public static void detVan(){
            	for(int i=0;i<vans.length;i++){
            		System.out.println("Van id:"+cars[i].getID_plate_no());
            		System.out.println("Van vehicle_brand:"+vans[i].getVehicle_brand());
            		System.out.println("Van vehicle_name:"+vans[i].getName());
            		System.out.println("Van cargo_length:"+vans[i].getCargo_length());
            		System.out.println("Van cargo_width"+vans[i].getCargo_width());
            		System.out.println("Van cargo_height"+vans[i].getCargo_height());
                	
            }
            	 menu();
            }
            //details of parked bikes
            public static void detBike(){
            	for(int i=0;i<bike.length;i++){
            		System.out.println("bike id:"+bike[i].getID_plate_no());
            		System.out.println("bike vehicle_brand:"+bike[i].getVehicle_brand());
            		System.out.println("bike vehicle_name:"+bike[i].getName());
            		System.out.println("bike engine_size"+bike[i].getEngine_size());
            	}	
            	 menu();
            }
            	
            	//details of parked cars
                public static void detCar(){
                	for(int i=0;i<cars.length;i++){
                		System.out.println("car id:"+cars[i].getNo_of_doors());
                		System.out.println("car vehicle_brand:"+cars[i].getColour());
                		
                }
                	 menu();
            }
            
            //get time Date month year
                public static void getDateTime(){
                	for(int i=0;i<vDateT.length;i++){
                		
                		System.out.println("date:"+vDateT[i].getDate());
                		System.out.println("month:"+vDateT[i].getMonth());
                		System.out.println("year:"+vDateT[i].getYear());
                		System.out.println("date:"+vDateT[i].getTime());
                }
                	 menu();
            }
                
                //statics for percentage of 
                public static void StatPrint(car[] cars,van[] vans,motorbike[] bike){
                 int tot=vans.length+cars.length+bike.length;
                 System.out.println("car "+cars.length );
                 System.out.println("total"+tot );
                 int  carsssss=cars.length;
                 double CarPercentage=carsssss/tot;
                 System.out.println("car percentage"+CarPercentage );
					menu();
                	}

                
        }
