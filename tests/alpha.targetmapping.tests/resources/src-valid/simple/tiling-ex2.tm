target tm.test.simple2D

//simple2D is a system with no dependences
//	affine simple2D [N]->{:}
//		outputs 
//			A,B : [N,N];
//		let
//			A[i,j] = 0[];
//			B[i,j] = 1[];
//	.

tile-band [a,b] {
        //[a,b] names the schedule dimensions (RHS of schedule) for later use
	//schedule for the statements reaching this band node
	//the schedule should allow rectangular tiling 
	A : [i,j]
	B : [i,j]
	//first level of tiling
	//  parallel means all tile dimensions other than the outermost is parallel (usual wave-front parallelism)
	//             (32, 8) denotes tile size
	//                     [a+b,b] specifies the skewing of the tile loops, using previously specified dimension names
	//                             primary use would be to skew the tiles for wave-front parallelization
	tile  parallel (32, 8) [a+b,b]
	//second level of tiling with 32x32 tile sizes and identity schedule  
	tile  (32, 32) [a,b] 
	//point loops
	//  visiting order of point loops is the same as the schedule given at the beginning
	//    full-tile (...) specifies loop generation options in ISL just for the full tiles
	//    here, the innermost dimension of the point loops are fully unrolled
	point full-tile(unroll(1))
}




