@echo off
cd java
javac ExpenseLogger.java
java ExpenseLogger

cd ../python
python expense_report.py
pause