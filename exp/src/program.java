public class program
{
    public static void main(String args[])
    {
        int num = 153;
        int i, count = 0;
        // Prime Number
        if (num <= 1)
        {
            System.out.println(num + " is not Prime");
        }
        else
        {
            for(i = 1; i <= num; i++)
            {
                if(num % i == 0)
                {
                    count++;
                }
            }
            if(count == 2)
                System.out.println(num + " is Prime");
            else
                System.out.println(num + " is not Prime");

        //Skill- Based Lab –OOP(JAVA) (ECLOR2VS201) A.Y 2026-27
        // Palindrome Number
        int temp = num;
        int rev = 0;
        while(temp > 0)
        {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }
        if(rev == num)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is not Palindrome");
        // Armstrong Number
        temp = num;
        int sum = 0;
        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if(sum == num)
            System.out.println(num + " is Armstrong");
        else
           // Skill- Based Lab –OOP(JAVA) (ECLOR2VS201) A.Y 2026-27
        System.out.println(num + " is not Armstrong");
    }
}
