#!/bin/sh
cd jEdit.bak
echo  "Version,Number of Lines changed,Number of Bugs,Defect Density ">> ../externalmetrics.csv
for branch in jedit-4-1-final jedit-4-3 jedit-4-5-0 jedit-4-5-1 jedit-4-5-2 jedit-5-0-0 jedit-5-1-0  
do 
A=$branch
git checkout $branch

 
D=$(git whatchanged  --format=oneline | wc -l)
E=$(git log --pretty=oneline | sed -n '/^[a-z0-9]* Bug /p' | wc -l) 
echo  "$A,$D, $E" >> ../externalmetrics.csv
done