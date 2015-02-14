#!/bin/bash

echo "Running experiments"
for reps in 10000 1000000 10000000
do
  for size in 10000 100000 10000000
  do
     echo "List Performance reps=$reps size=$size"
     sbt "run-main Performance $reps $size"
     echo "Map Performance reps=$reps size=$size"
     sbt "run-main MapPerformance $reps $size"
  done
done
