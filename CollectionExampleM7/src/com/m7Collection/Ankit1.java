package com.m7Collection;

public class Ankit1
{

	public static void main(String[] args)
	{
	
        String in1 = "aabbcde";
        String in2 = "wwwbbbw";
        String chlg = "t8bjun9evc";

//        System.out.println(inputStr1);
//        System.out.println(inputStr2);
        System.out.println(chlg);

        
        String enco1 = rEnco(in1);
        String enco2 = rEnco(in2);

        String fo1 = ins(enco1, chlg);
        String fo2 = ins(enco2, chlg);

        System.out.println("Input: " + in1 + "\nEncoded: " + enco1 + "\nFinal Output: " + fo1 + "\n");
        System.out.println("Input: " + in2 + "\nEncoded: " + enco2 + "\nFinal Output: " + fo2 + "\n");
    }

    public static String rEnco(String input)
    {
        if (input == null || input.isEmpty())
        {
            return "";
        }

        StringBuilder encoded = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++)
        {
            if (input.charAt(i) == input.charAt(i - 1))
            {
                count++;
            } else {
                encoded.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        encoded.append(count).append(input.charAt(input.length() - 1));
        return encoded.toString();
    }

    public static String ins(String encoded, String token)
    {
        StringBuilder finalString = new StringBuilder();
        int tokenLength = token.length();

        for (int i = 0; i < encoded.length(); i++)
        {
//        	if(token.length()<encoded.length())
//        	{
//        		continue;
//        	}
        		finalString.append(encoded.charAt(i));
        	finalString.append(token.charAt(i % tokenLength));
        }
        return finalString.toString();
    }
}