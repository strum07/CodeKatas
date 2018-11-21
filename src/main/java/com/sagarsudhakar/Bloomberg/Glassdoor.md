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
 
 
     
    
    
    
    