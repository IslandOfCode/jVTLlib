@echo off
rem cambia il nome del file della grammatica prima di eseguire questo file!
rem questo comando genera i visitors ma NON i listener!.
rem rimuovere -no-listener al comando se si vogliono anche i listener.

java -jar C:\Users\Public\Documents\LIBRERIEJAVA\antlr-4.6-complete.jar -package it.islandofcode.jvtllib.newparser.antlr newVTL.g4 -no-listener -visitor

echo compilazione completata.
pause