# Title
## Course - Section 0003
## Authors
David Ciorra Karen Ghazal 
## Distributions of Model Accuracy

Our level of accuracy differs since there is a level of randomness in the concept. The shuffled breast cancer data causes levels of accuracy to change. 
    
The frequencies of the Euclidean distances to make it small will generate a good baseline as compared to our results. The higher the frequency of smaller distances, the more sure we can be of our model. 

## Analysis of different error types

      - False Positive? A false positive is where you receive a positive result for a test, when you should have received a negative result. 
      - False Negative?
A false negative is where a negative test result is wrong. In other words, you get a negative test result, but you should have got a positive test result. 
    
      - What makes these two measures different?
Recall is the amount of true positives divided by the number of predicted positives which equals the sum of false negatives and true positives.
Preciision equals to the fraction of true positives over the number of predicted positives which equals the sum of true positives and false negatives.
The ratio of Precision and Recall are, for the most time, similar since the total number of positives equals the predicted positives.
      - What are sensible baseline for each of these measures?
The sensible baseline would be equal to 1. This is so since If the baseline and precision ratios  gives a value near 1, it means it’s well predicted. Since the recall and the precision ratios are the same, the baseline of 1 should be also accepted.
    - how do the above results change with the **hyperparameter** *k*?
If the K gets larger, the more difficult it becomes to determine the class of the element. This is so since the program would have to evaluate much more neighbors’ classes before predicting a label. K should also be an odd value. The boundaries between classes will be less noticeable if the K ids enlarged, 
