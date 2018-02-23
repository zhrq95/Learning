#!/bin/bash
echo “Enter the first integer:”
read first
echo “Enter the second integer:”
read second
if [“$first” -gt “$second”]
then
echo “$first is greater than $second”
elif [“$first” -lt “$second”]
then
echo “$first is less than $second”
else
echo “$first is equal to $second”
fi