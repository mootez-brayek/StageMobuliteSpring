package Pi.Spring.Service;

import Pi.Spring.Entity.EmailDetails;
import Pi.Spring.Entity.fetes;

public interface IEmailService {
	 // To send a simple email
	public String sendSimpleMail(EmailDetails details);
	 // To send an email with attachment
	public String sendMailWithAttachment(EmailDetails details);
	
	 public String sendEMailByActivity(EmailDetails details,String activite);
		public fetes findByDate(int day,int month);

}
