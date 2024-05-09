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
float** A;
float** L;
char* _flag_L;
float** U;
char* _flag_U;

// Memory Macros
#define A(i,j) A[i][j]
#define L(i,j) L[i][j]
#define _flag_L(i,j) _flag_L[((-2 + i >= 0 && -1 + N - i >= 0 && -1 + j >= 0 && -1 + i - j >= 0) ? ((((-i + i*i) + 2 * j))/2) : (j == 0 && -2 + i >= 0 && -1 + N - i >= 0) ? (((-i + i*i))/2) : 0)]
#define U(i,j) U[i][j]
#define _flag_U(i,j) _flag_U[((-1 + i >= 0 && -1 - i + j >= 0 && -1 + N - j >= 0) ? (((((-1 + 2 * N) * i - i*i) + 2 * j))/2) : (-i + j == 0 && -1 + i >= 0 && -1 + N - i >= 0) ? ((((1 + 2 * N) * i - i*i))/2) : (i == 0 && -1 + N - j >= 0 && -1 + j >= 0) ? ((-i + j)) : 0)]

// Function Declarations
float reduce0(long N, long ip, long jp);
float eval_U(long i, long j);
float reduce1(long N, long ip, long jp);
float eval_L(long i, long j);
void LUDecomposition(long _local_N, float** _local_A, float** _local_L, float** _local_U);

float reduce0(long N, long ip, long jp) {
	float reduceVar;
	long k;
	
	reduceVar = 0.0f;
	#define RP0(i,j,k) (eval_L((i),(k))) * (eval_U((k),(j)))
	#define R0(i,j,k) reduceVar = (reduceVar) + (RP0((i),(j),(k)))
	for (k = 0; k < ip; k += 1) {
		R0(ip, jp, k);
	}
	#undef RP0
	#undef R0
	return reduceVar;
}

float eval_U(long i, long j) {
	
	// Check the flags.
	if ((_flag_U(i,j)) == ('N')) {
		_flag_U(i,j) = 'I';
		U(i,j) = (((i) == (0)) && ((-1 + N) >= (0))) ? (A(i,j)) : ((A(i,j)) - (reduce0(N,i,j)));
		_flag_U(i,j) = 'F';
	}
	else if ((_flag_U(i,j)) == ('I')) {
		printf("There is a self dependence on U at (%ld,%ld)\n",i,j);
		exit(-1);
	}
	
	return U(i,j);
}

float reduce1(long N, long ip, long jp) {
	float reduceVar;
	long k;
	
	reduceVar = 0.0f;
	#define RP1(i,j,k) (eval_L((i),(-1 + k))) * (eval_U((k),(j)))
	#define R1(i,j,k) reduceVar = (reduceVar) + (RP1((i),(j),(k)))
	for (k = 1; k <= jp; k += 1) {
		R1(ip, jp, k);
	}
	#undef RP1
	#undef R1
	return reduceVar;
}

float eval_L(long i, long j) {
	
	// Check the flags.
	if ((_flag_L(i,j)) == ('N')) {
		_flag_L(i,j) = 'I';
		L(i,j) = (((j) == (0)) && ((-1 + N) >= (0))) ? ((A(i,j)) / (eval_U((j),(j)))) : (((A(i,j)) - (reduce1(N,i,j))) / (eval_U((j),(j))));
		_flag_L(i,j) = 'F';
	}
	else if ((_flag_L(i,j)) == ('I')) {
		printf("There is a self dependence on L at (%ld,%ld)\n",i,j);
		exit(-1);
	}
	
	return L(i,j);
}

void LUDecomposition(long _local_N, float** _local_A, float** _local_L, float** _local_U) {
	long i;
	long j;
	
	// Copy arguments to the global variables.
	N = _local_N;
	A = _local_A;
	L = _local_L;
	U = _local_U;
	
	// Check parameter validity.
	if (!((-1 + N) >= (0))) {
		printf("The value of the parameters are invalid.\n");
		exit(-1);
	}
	
	// Allocate memory for local storage.
	
	// Allocate and initialize flag variables.
	_flag_L = (char*)(malloc((sizeof(char*)) * (((-2 + N >= 0) ? (((-N + N*N))/2) : 0))));
	mallocCheck(_flag_L,"_flag_L");
	memset(_flag_L,'N',((-2 + N >= 0) ? (((-N + N*N))/2) : 0));
	_flag_U = (char*)(malloc((sizeof(char*)) * (((-1 + N >= 0) ? (((N + N*N))/2) : 0))));
	mallocCheck(_flag_U,"_flag_U");
	memset(_flag_U,'N',((-1 + N >= 0) ? (((N + N*N))/2) : 0));
	
	// Evaluate all the outputs.
	#define S0(i,j) eval_L(i,j)
	for (i = 1; i < N; i += 1) {
		for (j = 0; j < i; j += 1) {
			S0(i, j);
		}
	}
	#undef S0
	#define S1(i,j) eval_U(i,j)
	for (i = 0; i < N; i += 1) {
		for (j = i; j < N; j += 1) {
			S1(i, j);
		}
	}
	#undef S1
	
	// Free all allocated memory.
	free(_flag_L);
	free(_flag_U);
}


// Undefine the Memory and Function Macros
#undef A
#undef L
#undef _flag_L
#undef U
#undef _flag_U
#undef max
#undef min
#undef mallocCheck
