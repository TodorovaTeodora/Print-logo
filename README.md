
Median Score Problem

To improve your programming skills, you've decided to enroll in computer school, and you're starting out with a fascinating course on algorithms and data structures!
Your instructor's marking philosophy is that they care most about consistency, so they'll be judging your performance according to your median* mark in the course (based on all assignments and tests).
You'd like to be aware of your current standing in the course, so you're hoping to write an algorithm that can recalculate your median grade every time you enter a new mark (ie: every time you receive a graded test or assignment).
Given scores, an array of integers representing all test and assignment scores, your task is to return an array of integers where output[i] represents the median grade after all marks up to (and including) scores[i] have been entered. Your instructor is a generous marker, so they always round the median up to the nearest integer.
median* - The median of an N-element sequence is defined as follows: If N is odd, the median is the element which stands in the middle of the sequence after it is sorted. If N is even, the median is the average (mean) of the two "middle" elements of the sequence after it is sorted.

Example
•	For scores = [100, 20, 50, 70, 45] the output should be medianScores(scores) = [100, 60, 50, 60, 50].
After each score is entered, the median is recalculated as follows:
o	For [100], the median is 100 since it's the only element.
o	For [20, 100], the median is (20 + 100)/2 = 60 since there's an even number of elements.
o	For [20, 50, 100], the median is 50 (middle element).
o	For [20, 50, 70, 100], the median is (50 + 70)/2 = 60(mean of the two middle elements).
o	For [20, 45, 50, 70, 100], the median is 50 again (middle element).

Input / Output
•	[input] array.integer scores
An array of integers representing all of your test and assignment grades from the course, in chronological order.
Guaranteed constraints:
1 ≤ scores.length ≤ 5 • 104
0 ≤ scores[i] ≤ 106
•	[output] array.integer
o	An array of integers representing the median grade, rounded up (output[i] is the median of all grades up to index i in scores).
