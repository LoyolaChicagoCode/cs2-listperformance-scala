#!/bin/bash

echo "Running experiments"
for reps in 10000 1000000
do
  for size in 10000 15000 100000
  do
     sbt "run-main Performance $reps $size"
  done
done
