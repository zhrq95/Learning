#!/bin/bash
echo “Enter a file name:”
read file
if [-f $file]
then
echo “File $file exists”
fi