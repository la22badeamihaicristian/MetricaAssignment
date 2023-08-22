Calculator simplu scris în Java; suporta adunarea, scaderea, inmultirea si împartirea LOC (pentru proiectul complet, adica pentru toate 
fișierele în mod colectiv) 

Function Name             	        Start Line      	End Line        	Cyclomatic Complexity (Threshold: 10)       	Lines of Code (Threshold: 50)       	Parameter Count (Threshold: 4)

Calculator::Operations::Operations	    15	                16	                            1	                                        2	                                     0

Calculator::Operations::ToString	    18	                20	                            1	                                        3	                                     0

Calculator::Run	                        24	                26	                            1	                                        3	                                     1

Calculator::evaluateExpression	        28	                72	                            12	                                        33	                                     1

Calculator::Calculate	                74	                186	                            12	                                        77	                                     2

Calculator.java - LOC=134, numar de linii de cod=188

Cu ajutorul sonarlint am gasit urmatoarele probleme:

    - Add a private constructor to hide the implicit public one - Linia 4 de cod
    - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$' - Linia 18 de cod
    - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$' - Linia 24 de cod
    - Immediately return this expression instead of assigning it to the temporary variable "textResult" - Linia 70 de cod
    - Rename this method name to match the regular expression '^[a-z][a-zA-Z0-9]*$' - Linia 74 de cod
    - Remove this redundant jump - Linia 183 de cod



Start.java - LOC 16 numar de kinii de cod=26

Function Name             	        Start Line      	End Line        	Cyclomatic Complexity (Threshold: 10)       	Lines of Code (Threshold: 50)       	Parameter Count (Threshold: 4)

Start::main	                            5	                24	                           3                                          16	                                     1


Cu ajutorul sonarlint am gasit urmatoarele probleme:
    - Move this file to a named package - Linia 1 de cod
    - Rename this local variable to match the regular expression '^[a-z][a-zA-Z0-9]*$' - Linia 6 de cod
    - Replace this use of System.out or System.err by a logger - Linia 8 de cod
    - Replace this use of System.out or System.err by a logger - Linia 19 de cod



Fisierele Calculator.java si Start.java impreuna au 214 LOC.