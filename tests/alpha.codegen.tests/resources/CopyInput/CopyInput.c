// This code was auto-generated with AlphaZ.

#include <float.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function Macros
#define max(a,b) (((a)>(b))?(a):(b))
#define min(a,b) (((a)<(b))?(a):(b))
#define mallocCheck(v,s) if ((v) == NULL) { printf("Failed to allocate memory for variable: %s\n", (s)); exit(-1); }

// Global Variables
long N;
float* X;
float* Y;
char* _flag_Y;

// Memory Macros
#define X(i0) X[i0]
#define Y(i0) Y[i0]
#define _flag_Y(i0) _flag_Y[((-1 + N - i0 >= 0 && -1 + i0 >= 0) ? (i0) : 0)]

// Function Declarations
float eval_Y(long i0);
void CopyInput(long _local_N, float* _local_X, float* _local_Y);

float eval_Y(long i0) {
	
	// Check the flags.
	if ((_flag_Y(i0)) == ('N')) {
		_flag_Y(i0) = 'I';
		Y(i0) = X(i0);
		_flag_Y(i0) = 'F';
	}
	else if ((_flag_Y(i0)) == ('I')) {
		printf("There is a self dependence on Y at (%ld)\n",i0);
		exit(-1);
	}
	
	return Y(i0);
}

void CopyInput(long _local_N, float* _local_X, float* _local_Y) {
	long i0;
	
	// Copy arguments to the global variables.
	N = _local_N;
	X = _local_X;
	Y = _local_Y;
	
	// Check parameter validity.
	if (!((-1 + N) >= (0))) {
		printf("The value of the parameters are invalid.\n");
		exit(-1);
	}
	
	// Allocate memory for local storage.
	
	// Allocate and initialize flag variables.
	_flag_Y = (char*)(malloc((sizeof(char*)) * (((-1 + N >= 0) ? (N) : 0))));
	mallocCheck(_flag_Y,"_flag_Y");
	memset(_flag_Y,'N',((-1 + N >= 0) ? (N) : 0));
	
	// Evaluate all the outputs.
	#define S0(i0) eval_Y(i0)
	for (i0 = 0; i0 < N; i0 += 1) {
		S0(i0);
	}
	#undef S0
	
	// Free all allocated memory.
	free(_flag_Y);
}


// Undefine the Memory and Function Macros
#undef X
#undef Y
#undef _flag_Y
#undef max
#undef min
#undef mallocCheck
