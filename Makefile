###############################
# # Name: Leo Gomez           #
# # CruzID: legomez           #
# # Class: CMPS-12M           #
# # Date: Oct 27, 2014        #
# # filename: Makefile        #
# # Details: builds and       #
# # cleans files for Calc.java#
# #############################
#

# Build a class and do unit tests
JAVASRC = Calc.java CalcTest.java
SOURCES = Makefile.unit ${JAVASRC}
CLASSES = Calc.class CalcTest.class
TESTCLASS = CalcTest
CLASSPATH = "junit-4.12-beta-2.jar:hamcrest-core-1.3.jar:."

all: ${CLASSES}

${CLASSES}: ${JAVASRC}
	javac -Xlint -cp ${CLASSPATH} ${JAVASRC}

clean:
	rm ${CLASSES}

test: ${CLASSES}
	java -cp ${CLASSPATH} org.junit.runner.JUnitCore ${TESTCLASS}

.PHONY: clean all test
