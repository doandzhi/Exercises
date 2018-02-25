using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserLogin
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a username:");
            String UserName = Console.ReadLine();
            
            Console.WriteLine("Enter a password:");
            String UserPass = Console.ReadLine();
            LoginValidation validation = new LoginValidation(UserName, UserPass);
            User us = null;
            if (validation.ValidateUserInput(ref us))
            {
                int caseSwitch = 1;

                switch (caseSwitch)
                {
                    case 1:
                        Console.WriteLine("Admin");
                        break;
                    case 2:
                        Console.WriteLine("Student");
                        break;
                    default:
                        Console.WriteLine("Anonymous role");
                        break;
                }
            }
            else
            {
                Console.WriteLine(validation.getErrorMessage());
            }
            
            Console.ReadLine();
        }
    }
}
