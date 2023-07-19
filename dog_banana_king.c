#include <stdio.h>

//Defining the MAX_SIZE of the array
#define MAX_SIZE 2000

int main(void)
{
	//Declaring a character array with MAX_SIZE
	char horses[MAX_SIZE];

	//Looping through the array and assigning each element the character 'H'
	for (int i = 0; i < MAX_SIZE; i++)
	{
		horses[i] = 'H';
	}

	//Looping through the array and assigning each element the character 'o', 'p', 'e'
	for (int i = 0; i < MAX_SIZE-2; i += 3)
	{
		horses[i] = 'o';
		horses[i+1] = 'p';
		horses[i+2] = 'e';
	}

	//Looping through the array and assigning each element the character ' '
	for (int i = 0; i < MAX_SIZE-4; i += 5)
	{
		horses[i] = ' ';
	}

	//Looping through the array and assigning each element the character 'f'
	for (int i = 0; i < MAX_SIZE-4; i += 5)
	{
		horses[i+3] = 'f';
		horses[i+4] = 'f';
	}

	//Printing out the array
	for (int i = 0; i < MAX_SIZE; i++)
	{
		printf("%c", horses[i]);
	}

	return 0;
}