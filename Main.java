import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter case number:");
      
    int a = sc.nextInt();
    switch (a)
      {
      case 0: System.out.println("Square");
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n; j++) 
		{
		  System.out.print ("* ");
		}
	      System.out.println ();
	    }
	  break;
	}


      case 1: System.out.println("Left-aligned triangle");
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j <= i; j++)
		{
		  System.out.print ("* ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 2: System.out.println("Right-aligned triangle");
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j <= i; j++)
		{
		  System.out.print ("*");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 3:  System.out.println("Pyramid1");
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j <= i; j++)
		{
		  System.out.print ("* ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 4: System.out.println("Pyramid2");
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		  System.out.print ("*");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 5: System.out.println("Inverted pyramid2");
	{
	  int n = 5, i, j;
	  for (i = n-1; i >=0 ; i--)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		  System.out.print ("*");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 6: System.out.println("Diamond");
	{
	  int n = 5, i, j;
	  for (i = 0; i < n ; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		  System.out.print ("*");
		}
	      System.out.println ();
	    }
	    
	  for (i = n-2; i >=0 ; i--)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		  System.out.print ("*");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 7: // Inverted Left-aligned triangle
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i; j++)
		{
		  System.out.print ("* ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 8:   // Inverted pyramid
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < i; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < n-i; j++)
		{
		  System.out.print ("* ");
		}
	      System.out.println ();
	    }
	  break;
	}

	    case 9:   // Inverted pyramid 2
	{
	  int n = 5, i, j;
	  for (i = n-1; i >=0 ; i--)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		  System.out.print ("*");
		}
	      System.out.println ();
	    }
	  break;
	}

      case 10:   // Hollow square
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n; j++)
		{
		    if(i==0||i==n-1||j==0||j==n-1)
		  System.out.print ("* ");
		  else
		  System.out.print("  ");
		}
	      System.out.println ();
	    }
	  break;
	}


      case 11:  // Hollow left-aligned triangle
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j <= i; j++)
		{
		    if(j==0||i==j||i==n-1)
		  System.out.print ("* ");
		  else
		  System.out.print("  ");
		  
		}
	      System.out.println ();
	    }
	  break;
	}
      case 12:  // Hollow right-aligned triangle
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j <= i; j++)
		{
		    if(j==i||j==0||i==n-1)
		  System.out.print ("*");
		  else
		  System.out.print(" ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 13:  // Hollow pyramid
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j <= i; j++)
		{if(i==n-1||j==0||j==i)
		  System.out.print ("* ");
		  else
		  System.out.print("  ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 14:  // Hollow pyramid2
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		    if(i==n-1||j==0||j==i*2)
		  System.out.print ("*");
		  else
		  System.out.print(" ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 15:  // Inverted hollow pyramid
	{
	  int n = 5, i, j;
	  for (i = n-1; i >=0 ; i--)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{if(i==n-1 ||j==0||j==i*2)
		  System.out.print ("*");
		  else
		  System.out.print(" ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 16:  // Hollow diamond
	{
	  int n = 5, i, j;
	  for (i = 0; i < n ; i++)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		    if(j==0||j==i*2)
		  System.out.print ("*");
		  else
		  System.out.print(" ");
		}
	      System.out.println ();
	    }
	    
	  for (i = n-2; i >=0 ; i--)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		    if(j==0||j==i*2)
		  System.out.print ("*");
		  else
		  System.out.print(" ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 17:  // Inverted hollow left-aligned triangle
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < n-i; j++)
		{
		    if(i==0 || j==0||j==n-i-1)
		  System.out.print ("* ");
		  else
		  System.out.print("  ");
		}
	      System.out.println ();
	    }
	  break;
	}
      case 18: // Inverted hollow pyramid
	{
	  int n = 5, i, j;
	  for (i = 0; i < n; i++)
	    {
	      for (j = 0; j < i; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < n-i; j++)
		{
		    if(i==0||j==0||j==n-i-1)
		  System.out.print (" *");
		  else
		  System.out.print("  ");
		}
	      System.out.println ();
	    }
	  break;
	}
	    case 19: // Inverted hollow pyramid2
	{
	  int n = 5, i, j;
	  for (i = n-1; i >=0 ; i--)
	    {
	      for (j = 0; j < n-i-1; j++)
		{
		  System.out.print (" ");
		}
	      for (j = 0; j < i*2+1; j++)
		{
		    if(j==0||j==i*2||i==n-1)
		  System.out.print ("*");
		  else
		  System.out.print(" ");
		}
	      System.out.println ();
	    }
	  break;
	}



      }
  }
}
