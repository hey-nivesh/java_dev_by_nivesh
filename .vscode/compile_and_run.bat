@echo off
javac recu.java
if %errorlevel% equ 0 (
    java recu < input.txt > output.txt
) else (
    echo Compilation failed!
    pause
)