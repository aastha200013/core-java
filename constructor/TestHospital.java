class TestHospital{
        public static void main (String [] args){
		    System.out.println(Hospital.name);
			
			Hospital suraksha = new Hospital();
			System.out.println(suraksha.location);
			System.out.println(suraksha.noOfNurses);
			System.out.println(suraksha.noOfRooms);
			System.out.println(suraksha.noOfPatience);
			System.out.println(suraksha.ambulance);
			System.out.println(suraksha.Experiance);
			System.out.println(suraksha.isLiftWorks);
			

                        for ( byte i=0;i<suraksha.DrProfession.length;i++)
                         {
                           System.out.println(suraksha.DrProfession[i]);
                         }

			
			Hospital suraksha1 = new Hospital();
		}
	}	