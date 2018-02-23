#!/bin/bash
hour = 'date + %H'
case $hour in
0[1-9]|1[01] )
  echo "Good morining!"
  ;;
1[2-7] )
  echo "Good afternoon!"
  ;;
* )
  echo "Good evening!"
  ;;
esac