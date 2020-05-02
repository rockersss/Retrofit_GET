RETROFIT: -
•	It’s a very popular Android and Java library which makes sending and retrieving data pretty easy from a web service.
•	Provides abstraction layer over HTTP code and automatically generates all the complicated low-level networking code for us.
•	GSON convertor converts post JSON objects into post Java objects.


Implementation: - 
•	Put dependencies(Retrofit & GSON Convertor) in build.gradle(app).
•	Create a model class for that specific route from which we’ve to retrieve data.
•	Declare the required variables in above model class and if the JSON key and the variable name differ then we use GSON Annotation(@SerializedName(“JSON key”))
•	Generate Getter method of the declared variables.
•	Create Recycler View to display the retrieved data.
•	Create a Java Interface that represents the API of the web service in our app.
•	Create a method in the above interface which will return a Call object(which will convert JSON array into Java List) and name it (for eg. getPosts())
•	Annotate the above created method using @GET(“API route”)
•	Code in MainActivity.java to get data in our app: - Declare a TextView then, link it with the XML element.
•	Create a Retrofit object and call Builder class which uses Builder API to allow defining the URL end point for the HTTP operations and  finally build a new Retrofit object.
•	Define .baseURL .addConvertorFactory in the above object and then call build().
•	Create JSON placeholder API
•	Use call.enqueue(Callback Method) to execute call on the background thread as we can’t run 2 network operations on the same thread(in this case main thread) 
•	If the response is successful then we get all the entries using for loop.
•	Give Internet Permission as well.
