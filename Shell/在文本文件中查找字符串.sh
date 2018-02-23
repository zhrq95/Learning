#!/bin/bash
if grep “GNU” myfile > /dev/null
then
echo “\”GNU\” occurs in myfile”
else
echo “\”GNU\” does not occurs in myfile”
fi