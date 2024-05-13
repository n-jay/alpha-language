#!/bin/bash

cd "./CopyInput"
make clean
make
./CopyInput.verify-rand 500
cd ..

cd "./LUDecomposition"
make clean
make
./LUDecomposition.verify-rand 50
cd ..

cd "./PrefixScan"
make clean
make
./PrefixScan.verify-rand 500
cd ..
