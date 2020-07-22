target tm.test.simple2D

band[a,b] {
	A[i,j] : [i,j]
	B : [i,j]
	unroll (0)
	atomic (1)
	parallel (2)
	isolate ({ : 10<=b<=20 } unroll(1))
}

