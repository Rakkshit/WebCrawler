package edu.lfa.webcrawler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("d:/URLS.txt"));
            String link = "";
            while((link = reader.readLine())!= null)
            {
                URL url = new URL(link);
                URLConnection conn = url.openConnection();

                BufferedReader is = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = "";
                StringBuilder content = new StringBuilder();
                
                while((line = is.readLine())!= null)
                {
                    content.append(line).append("\n");
                }
                System.out.println(content.toString());
                /*String regEx = "<td class=\"pl-15\">\\n(.*?)<a class=\"job-item\" id=\"job-(.*?)\" href=\"(.*?)\" >\\n(.*?)</a>(.*?)\\n(.*?)\\n(.*?)\\n(.*?)</td>\\n(.*?)<td >\\n(.*?)n(.*?)<a href=\"(.*?)\" class=\"joblist\">(.*?)\\n(.*?)\\n(.*?)</a>\\n(.*?)<!-- Company Type -->\\n\\n(.*?)</td>\\n(.*?)\\n(.*?)<td class=\"center\" >\\n(.*?)</td>\\n(.*?)\\n(.*?)<td class=\"center\" >\\n(.*?)<span title=\"(.*?)\">(.*?)</span>\\n(.*?)</td?>";
                Pattern pattern = Pattern.compile(regEx);
                Matcher matcher = pattern.matcher(content.toString());*/
                
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
    }
}
