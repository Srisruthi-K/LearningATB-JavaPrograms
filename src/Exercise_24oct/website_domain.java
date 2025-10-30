package Exercise_24oct;

import java.util.Locale;
import java.util.Scanner;

public class website_domain {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        if(!sc.hasNext())
        {
            System.out.println("Enter valid website");
            return;
        }
        String website = sc.next();
        sc.close();
        website=website.toLowerCase(Locale.ROOT);
        //if(website.contains(".com"&& ".net" ||))
        if(website.endsWith(".com"))
        {
            System.out.println("The website type is: Commercial website");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("The website type is: Non-profit organization");
        }
        else if (website.endsWith(".edu"))
        {
            System.out.println("The website type is: Educational institution");
        }
        else if (website.endsWith(".gov"))
        {
            System.out.println("The website type is: Government website");
        }
        else if (website.endsWith(".net"))
        {
            System.out.println("The website type is: Network-related website");
        }
        else if (website.endsWith(".info"))
        {
            System.out.println("The website type is:  Informational website");
        }
        else if (website.endsWith(".xyz"))
        {
            System.out.println("The website type is: Unknown or other types of websites");
        }
    }
    }

