using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UserLogin
{
    static class UserData
    {

        static private User [] _testUsers= new User[3];

        static public User [] TestUsers
        {
            get {
                ResetTestUserData();
                return _testUsers;
            }
            set { }
        } 


        private static void ResetTestUserData()
        {
            _testUsers[0] = new User("doandzhi", "123456", "121215079", 1);
            _testUsers[1] = new User("makaroni", "123456", "121232079", 2);
            _testUsers[2] = new User("spaghetti", "123456", "121214379", 2);
        }

        public static User IsUserPassCorrect(String username, String pass)
        {
            ResetTestUserData();
            for (int i=0; i< _testUsers.Length; i++)
            {
                if (_testUsers[i].Username.Equals(username) && _testUsers[i].Password.Equals(pass))
                {
                    return _testUsers[i];
                }
            }
            return null;
        }
    }
}
