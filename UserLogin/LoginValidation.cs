using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserLogin
{
    class LoginValidation
    {
        private String Username;
        private String Password;
        private String ErrorMessage;

        public LoginValidation(String Username, String Password)
        {
            this.Username = Username;
            this.Password = Password;
        }

        static private UserRoles _currentUserRole;
        static public UserRoles currentUserRole 
            {
                get
                {
                    return _currentUserRole;
                }
                private set
                {
                    _currentUserRole = currentUserRole;
                }
            }

        public String getErrorMessage()
        {
            return this.ErrorMessage;
        }
        public bool ValidateUserInput(ref User u)
        {
            
            Boolean emptyUserName;
            emptyUserName = this.Username.Equals(String.Empty);
            if (emptyUserName == true)
            {
                this.ErrorMessage = "Not given a username";
                return false;
            }
            Boolean emptyPass;
            emptyPass = this.Password.Equals(String.Empty);
            if (emptyPass == true)
            {
                this.ErrorMessage = "Not given a pass";
                return false;
            }
            Boolean shortUsername, shortPass;
            shortUsername = this.Username.Length < 5;
            shortPass = this.Password.Length < 5;
            if(shortUsername || shortPass)
            {
                this.ErrorMessage = "Username and pass must be at least 5 symbols long.";
                return false;
            }
            
            User NewUs = UserData.IsUserPassCorrect(this.Username, this.Password);
            u = NewUs;
            if (NewUs != null)
            {
                u.Username = this.Username;
                u.Password = this.Password;
                currentUserRole = (UserRoles)u.Role;
                return true;
            }
            else
            {
                currentUserRole = UserRoles.ANONYMOUS;
                this.ErrorMessage = "Не е намерен такъв потребител";
            }
            
            return true;
        }
    }
}
