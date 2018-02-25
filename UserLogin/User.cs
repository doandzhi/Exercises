using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserLogin
{
    class User
    {
        public String Username;
        public String Password;
        public String FakNum;
        public Int32 Role;

        public User(String username, String pass, String faknum, Int32 role)
        {
            this.Username = username;
            this.Password = pass;
            this.FakNum = faknum;
            this.Role = role;
        }
    }
}
