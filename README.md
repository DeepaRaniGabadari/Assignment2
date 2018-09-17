# Assignment2
Assignment 2 1. Find the maximum of three numbers  2. Write a program to find the difference between sum of the squares and the square of the sums of n numbers?  3. Write a program to check whether the input alphabet is a vowel or not.  4. Develop a program that accepts the area of a square and will calculate its perimeter  5. Develop a program, that accepts a deposit amount and calculates amount of interest the deposit amount earns in an  year. The bank pays a flat 4% for deposits of up to Rs.1000, a flat 4.5% per year for deposits of up to Rs.5000, and a  flat 5% for deposits of more than Rs.5000.  6. Develop the program calculateCylinderVolume., which accepts radius of a cylinder's base disk and its height and  computes the volume of the cylinder  7. Develop the program, which accepts the gross pay and produces the amount of tax owed. For a gross pay of $240 or  less, the tax is 0%; for over $. 240 and $. 480 or less, the tax rate is 15%; and for any pay over $480, the tax rate is  28%.  8. Cogent’s tax accountants always use programs that compute income taxes even though the tax rate is a solid, neverchanging 15%. Define the program calculateTax which determines the tax on the gross pay. Define calculateNetPay  that determines the net pay of an employee from the number of hours worked. Assume an hourly rate of $12.  9. Some credit card companies pay back a small portion of the charges a customer makes over a year. A particular credit  card company's pay back policy is as follows: 1.0.25% for charges up to Rs. 500. 2.0.50% for the next Rs.1000 (that is, the portion between Rs. 500 and Rs. 1500), 3.0.75% for the next Rs.1000 (that is, the portion between Rs. 1500 and Rs. 2500), 4.1.0% for charges above Rs2500. Thus, a customer who charges Rs. 400 a year receives Rs.1.00, which is 0.25 · 1/100 · 400, and one who charges Rs1,  400 a year receives Rs. 5.75, which is 1.25 = 0.25 · 1/100 · 500 for the first Rs. 500 and 0.50 · 1/100 · 900 = 4.50 for  the next Rs. 900. Determine by hand the pay backs amount for a customer who charged Rs. 2000 and one who charged  Rs. 2600.  10. An old-style movie theater has a simple profit program. Each customer pays $5 per ticket. Every performance costs the  theater $20, plus $.50 per attendee. Develop the program calculateTotalProfit that consumes the number of attendees (of a show) and calculates how much income the show  earns. Define the program, which accepts a charge amount and computes the corresponding pay back amount.  11. Implement a method that returns the day of the week for a given day (1..31), month (1..12) and year. The day of the week of dates between March 1900 and February 2100 can be calculated as follows: 1.Calculate the total number of days from 1900/1/1 to the given date (see below, for details). 2.Divide this number by 7, the remainder is the day of the week (0 - sunday, 1 - monday, etc) To calculate the total number of days: 1.Subtract 1900 from the given year and multiply the result by 365. Add the missing leaps years by adding (year -  1900) / 4. 2.If the given year is a leap year and the month is January or February, subtract 1 from the previous result. 3.Add no of days of the given year till the given month (in case of February always add 28, because the additional day  for a leap year would have been already added).  12. Develop the program calculateHeight, which computes the height that a rocket reaches in a given amount of time. If the rocket accelerates at a constant rate g, it reaches a speed of g • t in t time units and a height of 1/2 * v * t where v is the  speed at t.  13. Develop a program that accepts an initial amount of money (called the principal), a simple annual interest rate, and a  number of months will compute the balance at the end of that time. Assume that no additional deposits or withdrawals  are made and that a month is 1/12 of a year. Total interest is the product of the principal, the annual interest rate  expressed as a decimal, and the number of years.Assignment 1  14. Write a program to automate the following loan policy.(Refer word doc file Loan selection word doc on JSECORE path); Age  category Gender Profession Personal assets Loan amount eligible 16 -25 M /F Self-Employed >25000 10000 Professional 15000 26 - 40 M SelfEmployed /  Professional > 40000 25000 F 30000 41 - 60 M / F SelfEmployed /  Professional > 50000 40000 > 60 M/F Self Employed > 25000 35000 – Age * 100 Retired 25000 – Age * 100