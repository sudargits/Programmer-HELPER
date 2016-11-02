import subprocess
import time
import smtplib
from smtplib import SMTPException
from email.MIMEMultipart import MIMEMultipart
from email.MIMEText import MIMEText

while True:
	p = subprocess.Popen("tail -n 1 nohup.out", stdout=subprocess.PIPE, shell=True)
	(output, err) 	= p.communicate()
	p_status 		= p.wait()		
	
	localtime   	= time.localtime()
	timeCheck  		= time.strftime("%a %b %d %H:%M:%S WIB %Y", localtime)

	errorMsg 		= " [WARN] PersistentConnection: pc_0 - Auth token revoked: expired_token (Auth token is expired.)"
	
	FireBaseErr		= timeCheck+errorMsg
	
	if FireBaseErr in output:		
		server = smtplib.SMTP('smtp.gmail.com', 587)
		server.starttls()
		server.login("atmaji@gits.co.id", "32februari")

		msg = """From: Atmaji Haryo Wiryawan atmaji@gits.co.id
		To: <atmaji@gits.co.id,yatnosudar@gits.co.id,bilhasry@gits.co.id>
		MIME-Version: 1.0
		Content-type: text/html
		Subject: Bluebird Bridge Report, need attention

		<h3>There is Authentication token error from BRIDGE_BIRU Firebase</h3>
		"""+output

		try:
			server.sendmail("atmaji@gits.co.id",["atmaji@gits.co.id","yatnosudar@gits.co.id","bilhasry@gts.co.id"], msg)
			print "Successfully sent email"
			server.quit()
		except SMTPException:
			print timeCheck+" Error: unable to send email"+SMTPException	
	else :		
		print "Out command : "+output
		print "---------------------"
		print "Program Out : "+FireBaseErr
		print "Conclussion : "+timeCheck+" no error found"
		print "=========================================="
	time.sleep(1) #seconds