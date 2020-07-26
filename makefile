without:
	gcc main.c -o main.o
	./main.o
	
bounds: 
	gcc main.c -fsanitize=bounds -o main.o
	./main.o

leak: 
	gcc main.c -fsanitize=leak -o main.o 
	./main.o
	
address:  
	gcc main.c -fsanitize=address -o main.o
	./main.o

zero: 
	gcc main.c -fsanitize=integer-divide-by-zero -o main.o	
	./main.o

clean:
	rm  main.o
