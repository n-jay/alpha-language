CFLAGS= -O3  -std=c99  -I/usr/include/malloc/ -Wno-unused-result
LIBRARIES=-lm
CC?=gcc
OBJS = CopyInput.o 
all: plain check verify verify-rand

debug: CFLAGS =-DDEBUG -g -Wall -Wextra -std=c99 -I/usr/include/malloc/
debug: all

plain: $(OBJS)
	$(CC) CopyInput-wrapper.c -o CopyInput.out $(OBJS) $(CFLAGS) $(LIBRARIES)

check: $(OBJS)
	$(CC) CopyInput-wrapper.c -o CopyInput.check $(OBJS) $(CFLAGS) $(LIBRARIES) -DCHECKING

verify: $(OBJS) CopyInput_verify.o
	$(CC) CopyInput-wrapper.c -o CopyInput.verify $(OBJS) CopyInput_verify.o $(CFLAGS) $(LIBRARIES) -DVERIFY

verify-rand: $(OBJS) CopyInput_verify.o
	$(CC) CopyInput-wrapper.c -o CopyInput.verify-rand $(OBJS) CopyInput_verify.o $(CFLAGS) $(LIBRARIES) -DVERIFY -DRANDOM

CopyInput.o : CopyInput.c
	$(CC) CopyInput.c -o CopyInput.o $(CFLAGS) $(LIBRARIES) -c

CopyInput_verify.o : CopyInput_verify.c
	$(CC) CopyInput_verify.c -o CopyInput_verify.o $(CFLAGS) $(LIBRARIES) -c

clean:
	rm -f *.o CopyInput.out CopyInput.check CopyInput.verify CopyInput.verify-rand
