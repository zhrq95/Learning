#!/bin/bash
echo -e "\n Command MENU\n"
echo "D.Current data and time"
echo "U.Users currently logged in"
echo -e "W.Name of the working directory\n"
echo "Enter D,U or W:"
read answer
echo
case "$answer" in
  D | d)
    date
    ;;
  U | u)
    who
    ;;
  W | w)
    pwd
    ;;
  *)
    echo "There is no selection:$answer" 
    ;;
esac
