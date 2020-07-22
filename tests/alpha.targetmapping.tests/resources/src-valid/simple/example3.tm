target tm.test.simple1D

seq {
	extend ({[]->[i] : 0<=i<N} as X[i]) band {X : [i]};
	A : band {
		A[x] : [x]
	}; 
	B : band {
		B[y] : [y]
	};
	extend ({[]->[i] : 0<=i<N} as Y[i]) band {Y : [i]};
}
