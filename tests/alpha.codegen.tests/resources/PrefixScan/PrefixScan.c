// This code was auto-generated with AlphaZ.

#include <float.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// Function Macros
#define ceild(n,d) ((int)ceil(((double)(n))/((double)(d))))
#define floord(n,d) ((int)floor(((double)(n))/((double)(d))))
#define div(a,b) (ceild((a),(b)))
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
float reduce2(long N, long ip);
float eval_Y(long i);
void PrefixScan(long _local_N, float* _local_X, float* _local_Y);

float reduce2(long N, long ip) {
	float reduceVar;
	long j;
	
	reduceVar = 0.0f;
	#define RP2(i,j) X((j))
	#define R2(i,j) reduceVar = (reduceVar) + (RP2((i),(j)))
	for (j = 0; j <= ip; j += 1) {
		R2(ip, j);
	}
	#undef RP2
	#undef R2
	return reduceVar;
}

float eval_Y(long i) {
	
	// Check the flags.
	if ((_flag_Y(i)) == ('N')) {
		_flag_Y(i) = 'I';
		Y(i) = reduce2(N,i);
		_flag_Y(i) = 'F';
	}
	else if ((_flag_Y(i)) == ('I')) {
		printf("There is a self dependence on Y at (%ld)\n",i);
		exit(-1);
	}
	
	return Y(i);
}

void PrefixScan(long _local_N, float* _local_X, float* _local_Y) {
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
#undef ceild
#undef floord
#undef div
#undef max
#undef min
#undef mallocCheck
