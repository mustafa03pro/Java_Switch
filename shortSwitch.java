package com.ControlLoop;

public class shortSwitch {
	public static void main(String[] argv) 
    {
         short x = 200;
         switch( x ) {
                case 100 : System.out.println("One hundred");break ;
                case 200 : System.out.println("Two hundred");break ;
                //case 33000 : System.out.println("Thirty thousand ");break ;//error
        }
    }

}
