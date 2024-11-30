@echo off
javac Main.java
if %errorlevel% equ 0 (
    java Main < input.txt > output.txt
) else (
    echo Compilation failed!
    pause
)
