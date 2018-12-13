This contains all of the system tests that have been conducted on candidate 
release branch 1.2.

#1.		STARTUP

1.1 Does the calculator open when the driver is executed?

	Yes.

1.2 Does the calculator open without any errors?

	Yes.

#2.		UI PRESENCE

2.1 Is there a calculate button?

	Yes, in line with the editable text field.

2.2 Are there two text fields?

	Yes.

2.3 Are there two radio buttons? 

	Yes.

2.4 Are the radio buttons labelled?

	Yes, the left button is labelled 'Infix' and the right button is labelled 
	'Reverse Polish'.

#3.		UI FUNCTIONALITY

3.1 Does one of the text fields allow user input?

	Yes, the text field in line with the calculate button.

3.2 Does one of the text fields not allow user input?

	Yes, the text field found above the editable one.

3.3 Does selecting the left radio button disable the right?

	Yes.

3.4 Does selecting the right radio button disable the left?

	Yes.

3.5 Does clicking the calculate button output to the non-editable text field?

	Yes, outputs 'Invalid expression'.

#4.		REVERSE POLISH CALCULATION

4.1 Does the calculator output an error when there is no expression in the 
  	input text field?

	Yes, outputs 'Invalid expression'.

4.2 Does the calculator output '1.0' when '1' has been entered into the input 
		text field?
 	
	Yes.

4.3 Does the calculator output '0.1' when '0.1' has been entered into the input
		text field?

	Yes.
	
4.4 Does the calculator output an error when two numbers ('1 2') have been
		entered into the input text field?
		
	Yes, outputs 'Invalid expression.
	
4.5 Does the calculator output an error when two number an invalid operator
		('1 2 &') have been entered into the input text field?
		
	Yes, outputs 'Invalid operator '&''.
	
4.6 Does the calculator correctly calculate a simple addition expression 
		('2 5 +')?
		
	Yes, outputs '7.0'.

4.7 Does the calculator correctly calculate a simple subtraction expression 
		('5 2 -')?
		
	Yes, outputs '3.0'.
	
4.8 Does the calculator correctly calculate a simple addition expression 
		('2 5 *')?
	
	Yes, outputs '10.0'.

4.9 Does the calculator correctly calculate a simple addition expression 
		('5 2 /')?
	
	Yes, outputs '2.5'.

4.10 	Does the calculator correctly calculate a more complex expression
			('4 2 + 3 1 - *') resulting in a positive result?
			
	Yes, outputs '12.0'.

4.11 	Does the calculator correctly calculate a more complex expression
			('12 3 * 3 / 5 + 19 -') resulting in a negative result?
			
	Yes, outputs '-2.0'.

4.12 	Does the calculator correctly calculate a more complex expression
			('50 12 24 43 + / -') resulting in a non-integer result?
			
	Yes, outputs '49.820896'.

#5.		INFIX CALCULATION

5.1 Does the calculator output a suitable message when the calculate button
		is pressed?
		
	Yes, outputs 'Infix Mode - Coming Soon!'.

#6.		CLOSING
  
6.1 Does the calculator close without throwing errors?

    Yes.