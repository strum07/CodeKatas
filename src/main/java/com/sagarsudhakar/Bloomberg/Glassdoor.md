Accepted Offer
Positive Experience
Difficult Interview

Application

I applied through an employee referral. The process took 3+ months. I interviewed at Bloomberg L.P. (New York, NY) in May 2018.

Interview

I applied online. Two days later I got an email to schedule a phone interview.
--
Phone Interview
The interviewer was on time and quite friendly. He asked my a few questions about my interest in the company and why I thought I was a good fit. We then went through 3 fairly simple technical questions.

1. There are two streams of integers that should be captured and stored in the order they come in. Implement a way to retrieve the n most recent integers stored.

This was fairly simple to implement using a Linked List.

2. Given a binary tree, return the left-most node of each level in the tree.

I used an altered implementation of Depth-First-Search where you keep track of the current depth and stored left-most values in an array.

3. Implement a dynamic internet browser history system (keeping only 5 items up).

Here I panicked a bit and started doing an LRU cache, but managed to iron out the overkill, ending up with a custom implementation of a fixed-size Linked List.

We then concluded with questions I had for him. My questions we about the culture in the company, his team's duties and any philanthropic work he's been involved in during his time there. This interview took about 50 minutes.
--

After a very long delay, I was invited to interview on-site at their Headquarters in New York. Bear in mind that I applied for a position in London, but interviewed with the NY folks.

--
On-Site Interview
This part of the interview was split into 4 rounds. Each round had the same structure. We began with a short discussion about my interest in the company, my background and projects. Depending on the interview, we did technical or HR-related questions after that and then concluded with any questions I had. Each interview was 1 hour.

Technical Rounds (1 + 2)
1. Given a marathon route with markers that track runners' progress as they cross them, implement a system to keep track of the leaderboard.

I used an array of Linked Lists, one for each marker, as well as a HashTable to move runners around the markers. The interviewers helped make this as optimal as possible. We discussed trade-offs using Binary Search Trees instead of the lists.

FOLLOW UP: Implement a notification system that pushes a notification every time a specified runner, the three runners behind them or the three runners in front of them change their position in the leaderboard.

Okay this was pretty hard because I didn't know which part of the problem they wanted me to solve. I got stuck but I eventually figured out. Used an ArrayList of lambda expressions that pushed the notifications, triggering all of them in sequence when a runner crossed a marker. Even though they had to help me through it, they seemed pleased with my response.

2. Given a gym space on a grid, where spaces can be open, blocked or representing a gym equipment being used, we're looking to work out at the equipment on cell A, then use a yoga mat, then go to the equipment on cell B. Find the optimal place for the yoga mat.

This was a pretty weird question. I initially suggested Dynamic Programming. The interviewer said that was cool but we could solve it in a more elegant way. After a discussion about the way search algorithms work, I implemented a two-way Breadth-First-Search from both points, and returned the first point of contact. The interviewer seemed pleased with the response.

3. Implement the classic game Snake.

This was a fun one. I used a Linked List to store the snake, having O(1) operations for each of the interviewer's requirements from the start. He seemed very pleased with this answer. We had a great discussion about special cases and debugging the game to account for different use cases.

--
HR Interviews (3 + 4)

The first was a friendly session of HR questions about leadership, teamwork, cultural fit. It seemed that the interviewer was trying to make sure I was a good cultural fit. Make sure to practice behavioral questions for this round and know the company + your own stuff.

The second interview was with a Senior Manager in the Engineering department. It was more about my specific interests in teams, my career prospects with Bloomberg and the different paths I can take if I work there. This was the time to let all that industry knowledge shine.

Overall a great experience. Very well-organized, extremely friendly, knowledgeable and professional.








Find the smallest amount of changes in a string so it becomes a re-arranged version of another string


Sum two numbers, each represented in a linked list with an element per digit, and return a linked list with the sum 

A linked list represents a number. From head to tail, the number represents a power of 10 until reaching 10^0 on the number right before the tail.

he interview question was very easy but I did not prepare for theory based questions (how hashing and collision work, heaps and hashsets), don't forget those when preparing for yours.


Create a class and functions which allow you to add and retrieve (latest first) urls.   


 It was a data structure problem like transforming a tree to the form he asked (in place)   
 
 
  Explain stack overflow.   
  
  
  calculate the best profit from an array of stock prices for a day.   
  
  
  Implement a system(class) which has two methods. One method takes a stock name and amount as the input and adds up the amount if there already exists the company's name in your storage, otherwise add a new entry. The second method takes an integer as an input and returns the number of companies with the largest stocks.
  
  
  If you have a string BLOOMBERG, what is the minimum distance of each letter from the character 'B'
  
   Given a 2d array of 1's and 0's, count the number of islands that the 1's form.   
       
       
   You have some weird language which has some alphabet, but  since the alphabet is hard, we will work with latin transcription. Given an alphabet (sequence of letter combination, each describes a letter of the original alphabet transcripted to Latin) and the list of words. We also consider all words are written correctly and it's right to pick every letter combination greedy (the longest combination is prefered). We have to sort our list in alphabet order. For example: If the alphabet is {"b", "bc", "aa", "c"} and the list is {"aab", "baa", "bcb", "bbc"}, then the sorted list will be { "bbc", "baa", "bcb", "aab"}
       
   
  Given two strings, find every occurrence of the first string in the second string   
    
    
  "what if we reach the end of a non-function without any return statement in C++?", "what is a vector, what is time complexity of push_back and why" and "what is the stack memory, can you name the difference between it and other types of memory?".
    
    
 Write a function that can prove if two strings are anagrams   
 
 
 If an array if full of numbers that are always increasing, and then switches to always decreasing, write a function that will return the index of the pivot point within the array.
 
 
     
     
 Find the smallest amount of changes in a string so it becomes a re-arranged version of another string.   
 
 Sum two numbers, each represented in a linked list with an element per digit, and return a linked list with the sum        
    
 A linked list represents a number. From head to tail, the number represents a power of 10 until reaching 10^0 on the number right before the tail.   
  
 Create a class and functions which allow you to add and retrieve (latest first) urls.   
 
  It was a data structure problem like transforming a tree to the form he asked (in place)   
  
  calculate the best profit from an array of stock prices for a day.
  
  
 Implement a system(class) which has two methods. One method takes a stock name and amount as the input and adds up the amount if there already exists the company's name in your storage, otherwise add a new entry. The second method takes an integer as an input and returns the number of companies with the largest stocks.  
  
 If you have a string BLOOMBERG, what is the minimum distance of each letter from the character 'B'.    
 
 Given a 2d array of 1's and 0's, count the number of islands that the 1's form.   
  
 Given two strings, find every occurrence of the first string in the second string     
 
  Write a function that can prove if two strings are anagrams   
  
   New York Subway Line   
   
   
    How would you implement a hash function for a particular data structure.   
    
 1. The first non-repeating character in the string
 2. Flatten a multilevel singly linked list 
 
 Write a solution to print the values of a binary tree in order.  
 
  zigzag traversal of array   
  
    given 100s of data objects with price and time info for comapny. Store so that you can query the data to get max price for company among given time range   
    
    
    Breadth First Search. 
    
 Make sure you know your data structures like linked lists and binary search trees. Also know your searching and sorting algorithms (I was asked to implement merge sort).
 
 given a list of integer, return a list of all its permutation   
  
 search in a rotated sorted array   
   
 anomaly detection for transaction data   
    
 Two sum, BFS, given a list of intervals find the overlap, design questions related to stock monitoring platforms   
     
Find the intersection of lists. Repetition is allowed. Order is not considered.   


 Flatten a singly linked list with a down pointer   
 
  In a Directed Acyclic Graph print out all the paths from a source node to a target node   
  
  
   Given a string of functions, return an array of the highest level functions   
   
   
   String manipulation. What parenthesis to remove to make the string valid. "(a))" to "(a)" or "))a((" to "a"
   
   
   Giving a tuple (ord, str) of type (string, string), check whether all the characters that appear in both str and ord are in the order of ord.
   Examples:
   (abc, qaqbqc) -> True
   (abc, aaaqbbb) -> True
   (abc, caaabbbccc) -> False
   
   
   round 1
   1. Get the most trending tweet from a feed of user tweets
   2. word wrapping problem
   
   round 2
   design the k most visited URLs for chrome    
        
        
 Given an array of integers, such that their product is also a 32-bit signed integer, replace each element of the array with the product of all elements besides it
   
   
   
 problems that required hash maps to solve   
    
    
 Given a log of TV show viewings, determine what episode of each show is the most addictive, to be judged by retention rate after that particular episode.   
    
    
 First n rows of pascals triangle   
 
 Adding two numbers represented as linked lists    
 
 Given multiple fully connected sets of verts, find connected components between sets.   
 
 Binary search in a rotated array          
 
  Asked to solve the Zuma Game problem (you can see it on leetcode).   
  
  1. Given a string , sorted under 2 conditions
  1) Frequency of the letter
  2) If frequency is a tie, then sorted in alphabetical order. 
  
  I must stress -- be prepared to answer, "what interests you at Bloomberg" or "why do you want to work here" very well and many times!
  
  
 Describe one of your favorite projects that you've recently worked on.   
   
 What interests you about Bloomberg? (Be prepared to answer this many times!)   
      
 Data structures (Heaps, Trees), medium level leetcode. Live coding.   
 
 
  Data Structure problem, and 1 leetcode medium question   
  
  basic behavior questions. A linked list with next node and down node, the down node has higher priority, convert it to a normal list. 
  
   Two sum question, leetcode medium questions.   
   
   
    Validate a Binary Search Tree.   
    
     The traditional LRU problem was given. Like implement an LRU cache. Also, they asked me some ML questions.   
     
     
     Make a deep copy of a linked list with an additional random pointer.
     Remove multiple intervals from an array. 
     
      Design a system to keep URL history with access frequency.   
     
     
      subset of string   
       
       Determine if a string has balanced parenthesis.     
        Find all issues with source code (presented on printed paper).    
        
        Given two variations of for loops, pick pick which one I would use and explain why.    
        
         Write method to determine all prime numbers.   
         
         
         Matrix multiplication (3X3 to 1X3). I forgot the actual logic, but I quickly picked up the logic and wrote the program once he explained the basic logic with a simple example.
         
         
          Time and space complexity of the above functions.   
         
         
          Design an algorithm to determine whether a binary tree is valid.   
          
      Find all shortest paths from start to goal given that you have access only to distance between a node and its immediate neighbors. 
      
      
      Top k out of N (>>k).
      was part of a larger, more elaborate question
      
      
       Rotate array    
       Simple binary search question with a twist that made it a bit harder   .
       
       
       
     There were two questions, both in Leetcode. One easy, one hard
       
     Second highest number in an array   
        
     One question about creating a schedule based on the meeting timings of an employee. It was an easy question and I solved with just a little help.
        
     One question I remember was to create a function that accepts a number and returns the string representation of the number.   
         
     Second Interview: There will be a meeting at New York and San Francisco offices. We will have to fly the participants to either one of these two offices. Let's say each office can accommodate half of the participants. Our goal is to assign each participant to an office in a way that the total travel cost for the company is minimized. What is this minimal cost? SF NY A 500 700 B 200 600 C 400 500 D 600 200 Output : 1300 (A:500 + B:200 + C:400 +D: 200) 
            
     How to keep the average from a stream of values.   
    
    
    
     Linked Lists featured in the technical interview, especially doubly-linked lists.   
     
     Lists and basic algorithm questions   
      
     Find pivot element in a rotated sorted array.   
     
      Matrix grid problem similar to number of islands problem.   
      
      Questions were on arrays, dynamic programming, divide and conquer, binary tree. I… 
      
       Q: Eliminate duplicate consecutive words from a huge string   
       
       
        Design a keyboard using a data structure, keys can be arranged in anyways.   
        
         just ask how you traverse through a tree.
         
         
          How many shortest paths are there in a 4x4 grid.   
          
          
          1.merge two sorted linked list
          2.LRU problem
          
          
          
      write a function to find a word in a file.   .
      
      
      Two Sum and encode string 
      
      two sum and three sum.
      
      
      Technical question included building a program to manipulate a string.   
      
      
       Why Bloomberg?
      - Tell me about a project you enjoyed working on.   
     
      what is normalization?   
       
       
      Create a function which receives a string and returns a string with all spaces doubled, in O(1)   
     
   Mostly LeetCode Easy level questions. Topics included dynamic programming, arrays, object-oriented design, graphs/trees (nothing like Dijkstra's ), space-time trade off, being conscious of allotted space, some mathematical/statistical concepts (though they'll explain if you're unfamiliar).
   
   Space and time complexity analyses seemed to be emphasized, so know how to do those. I provided multiple answers to all the questions, so maybe that helps.   
   
   
   The coding questions was a candy crush string problem. The input is a string that contains capital letters. If there are three or more same letters in a row, you need to compress them. You need to compress until there are there are no three or more letters are next to each other.  
   
   
   No Offer
   Neutral Experience
   Average Interview
   
   Application
   
   I applied online. The process took 4+ weeks. I interviewed at Bloomberg L.P. (New York, NY).
   
   Interview
   
   1st round was a 1-hour phone interview where I was asked to solve two coding questions. Leetcode easy and medu=ium. 1st one was related to array and second related to reading files and storing values in a data structure.
   
   After that, I got an invite for an onsite interview. There were two rounds about an hour 30 minutes each. In both round, you are expected to solve coding problems. First one was related to palindrome and LRU cache. 2nd related to Binary Search Tree.
   
   After that, I was told there will be no further interviews and after few days I got a reject.Show Less
   
   Interview Questions
   
       LRU cache, BST, Palindrome  
       Answer Question
       
       
       
       
       
       
       
       
       
       
       
       
       
        Find the intersection of two lists.   Phone call : Leetcode Add two numbers + projects
                                              Onsite: projects + leetcode deep copy of a linked list 
                                              
                                              
                                              
       Next Greater Element II on LeetCode   
       
       
        2 sum problem. Find 2 numbers that add up to a given value   
        
        
        I was given a substringcalculator class and asked to add code that would read through the input and generate a specific output. The input was ASCII characters


 	#	Title	Acceptance	Difficulty	Frequency
	
	
   