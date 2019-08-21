@echo off
if "%1" == "h" goto begin
mshta vbscript:createobject("wscript.shell").run("""%~nx0"" h",0)(window.close)&&exit
:begin
taskkill /f /im java.exe
javac -encoding UTF-8 HeavySnow.java
java HeavySnow
exit