<html>
<h1>gen_logs</h1>
This is to simulate web application writing traffic details to log file.

It has shell scripts which invoke python program<br>
It is compatible with Python 2<br>
Here is the setup process on linux or mac or on cygwin.<br>
<br>
Identify directory /opt/<br>
Copy gen_logs directory to /opt - sudo mv -f gen_logs /opt<br>
Run sudo chown -R `whoami` /opt/gen_logs<br>
Update PATH in .profile or .bash_profile or create soft links for the shell programs - export PATH=$PATH:/opt/gen_logs<br>
Either restart shell or run .profile/.bash_profile script<br>
Run start_logs.sh to start generating web logs<br>
Run tail_logs.sh to preview while logs are being generated (Hit ctrl-c to come out)<br>
Run stop_logs.sh to stop generating web logs<br>
<html>
