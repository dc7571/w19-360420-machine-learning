import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException{

double[]storePrecision=new double[1000];
for(int i=0;i<storePrecision.length;i++){

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

       			  String PATH_TO_data = args [0];
	 System.out.println(PATH_TO_data);  
      List<DataPoint> ans = DataSet.readDataSet(PATH_TO_data);
	  DataPoint dp =ans.get(32);
	  DataPoint dc =ans.get(33);
		System.out.println(dp.getLabel());
		String printableX=Arrays.toString(dp.getX());
	System.out.println(printableX);
		
		

    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset

List<DataPoint> TestSet= DataSet.getTestSet(ans, 0.2);
List<DataPoint> TrainingSet= DataSet.getTrainingSet(ans, 0.8);
    
    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)


     
    // TASK 4: write a new method in DataSet.java which takes as arguments to DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)
    
  
System.out.println(DataSet.distanceEuclid(dp,dc));
     // TASK 5: loop over the datapoints in the held out test set, and make predictions for Each
    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label
KNNClassifier classifier=new KNNClassifier(3);
DataPoint[]nearestNeighbors=classifier.getNearestNeighbors(ans,ans.get(0));

for(int j=0;j<nearestNeighbors.length;j++){
	System.out.println(nearestNeighbors[j]);
}

    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.
	
int truePositive=0;
for(int j=0;j<TestSet.size();j++){
	DataPoint cc = TestSet.get(j);
	if (classifier.predict(TrainingSet,cc).equals(cc.getLabel())){
		truePositive++;
	}
  }
storePrecision[i]=(truePositive)/TestSet.size();

  }
  }
}
