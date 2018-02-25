import java.util.Scanner;

public class Validator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		boolean usernameValid = false;
		boolean mailValid= false;
		boolean egnValid= false;
		boolean fkValid= false;
		Scanner sc = new Scanner(System.in);
		//declarations to here
        
		System.out.println("Please enter username not longer than 50 characters: ");
		String username = sc.nextLine();
		UsernameValidator uv= new UsernameValidator();
		usernameValid= uv.validateUserName(username);
		System.out.println("Your username is" +usernameValid);
		//works for username
		
		System.out.println("Please enter your e-mail: ");
		String email = sc.nextLine();
		MailValidator mv = new MailValidator();
		mailValid= mv.validateMail(email);
		System.out.println("Your e-mail is" + mailValid);
       //works for mail
		
		System.out.println("Please enter egn(10 numbers) or Bulstat(9 or 13 numbers): ");
		String egn = sc.nextLine();
		EgnValidator ev = new EgnValidator();
		egnValid= ev.validateEgn(egn);
		System.out.println(egnValid);
        
		if(egnValid && egn.length()==10){
			System.out.println("Your egn: " + egn);
		}
		else if(egnValid && egn.length()==9 || egn.length()==13){
			System.out.println("Your bulstat:" + egn);
		}
		else{
			System.out.println("Your egn or bulstat is not correct");
		}
		//works for egn or bulstat
		
		System.out.println("Please enter your facility key in format (nn-nnn) : ");
		String facKey = sc.nextLine();
		FacKeyValidator fv = new FacKeyValidator();
		fkValid= fv.validateFacilityKey(facKey);
		System.out.println("Your facility key is " +fkValid);
	}
}
