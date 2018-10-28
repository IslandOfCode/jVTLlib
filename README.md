[![Build Status](https://travis-ci.com/IslandOfCode/jVTLlib.svg?branch=master)](https://travis-ci.com/IslandOfCode/jVTLlib)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/532347844fdb4950a714caf7950bd394)](https://www.codacy.com/app/IslandOfCode/jVTLlib?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=IslandOfCode/jVTLlib&amp;utm_campaign=Badge_Grade)


## jVTLlib
A simple VTL (Validation and Transformation Language) Interpreter in java library form. Still in development, but usable for BIRD 1.0 and 1.1 database instruction.
### Introduction
This interpreter is based on the VTL 1.1 specifics. You can found them here:  
[https://sdmx.org/?page_id=5096](https://sdmx.org/?page_id=5096)  

At this time, the 2.0 version are been released, but isn't compatible at all.

Be advise: this library is a mere _Proof of Concept_.  
**Don't use in a production environment**.


### Getting Started
Before use this library, you need to create a class that extend [IConnector](/jVTLlib/src/main/java/it/islandofcode/jvtllib/connector/IConnector.java)  

The ```IConnector``` interface let you implementes the input/output layer.  
Just remember: the **get** method need to read the external data and populate a dataset. Meanwhile the **put** method have to write a [DataSet](/jVTLlib/src/main/java/it/islandofcode/jvtllib/model/DataSet.java)
content into an external file/deb/whatever you choose.

```java
public interface IConnector {

	public DataSet get(String location, String[] keep);
	public boolean put(String location, DataSet data);

}

```

You can find a good (**but incomplete**) example within the [connector.basic](/jVTLlib/src/main/java/it/islandofcode/jvtllib/connector/basic/) package.  
Use the [MongoBasic](/jVTLlib/src/main/java/it/islandofcode/jvtllib/connector/basic/MongoBasic.java) class as example, even if is it incomplete (**put** is empty).

The **put** method is basically a foreach on the [DataPoint](/jVTLlib/src/main/java/it/islandofcode/jvtllib/model/DataPoint.java), using the [DataStructure](/jVTLlib/src/main/java/it/islandofcode/jvtllib/model/DataStructure.java) to reference.

### Use
With the connector, you have everything you need.

The following code is a complete example:

```java
public class RunLib {

	public static void main(String[] args) {
		JVTLlib lib = new JVTLlib();
		
		lib.addConnector(new MongoBasic("127.0.0.1",27017,"jVTLlib"));
		lib.addFile("src/test/resources/test.vtl");

		HashMap<String, Scalar> I = new HashMap<>();
		I.put("test", new Scalar("DonaldDuck",Scalar.SCALARTYPE.String));
		lib.addInjection(I);
		
		try {
			lib.execute();
			System.out.println("TIME: " + lib.getTimeExecution());
		} catch (ParseException | IOException e) {
			System.out.println("Exception! " + e.getMessage());
		}
	}
	
}
```

So, let's break down the code:
- First, we instantiate the library. No parameters needed.
- Then we need to add both the connector and the file with the script.  
At this time, jVTLlib doesn't have other method to get the VTL code other than read from a file.
- The HashMap part is a cool feature, who let you inject variable from outside.  
The problem is that because you can only read with the **get** istruction (who fetch a DataSet), you can't read a simple variable.  
This way the VTL script can be change at runtime by your code _before_ being parsed.  
BTW, the injection part is totally optional, but if you want to use it, you should know that you can put not only Scalar, but even DataSet.
- Last, the execution.  
Now, in the example you can see the use of ```lib.execute()```, who basically execute the code VTL in the file.  
But, is important to know that you can check the sintax of the code, using the ```lib.parseOnly()``` method (return a boolean).  
- After all, the method ```getTimeExecution()``` give you a timestamp with the time of parsing and execution combined.

### Error handling
The library exit at the first error encountered during the parsing or during the execution.

Expect some weird error.

### Result
Only the ```lib.parseOnly()``` return a value (a boolean with the result of the parsing: _true_ good code, _false_ sintax error).

The ```lib.execute()``` method return a boolean, but is fictional because will return always true.  
The actual result is the one obtained through the **put** istruction.
