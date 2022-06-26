# Logs
Logs is a library who allows you to write in a log file with 1line of code
Logs is fully native and portable

## Installation:
maven package coming soon

## Example:
```java
public static void main(String[] args) {
		public final static String DEFAULT_PATH = "C:/Users/User1/MyBigProject/logs.txt";
		Logs l = new Logs();
		l.write("[+] connection estabilished", DEFAULT_PATH);
		l.write("[+] succefully connected!", DEFAULT_PATH);

	}
```
### Output (logs.txt):
```
28/02/2022 20:13:37 [+] connection estabilished
28/02/2022 20:13:37 [+] succefully connected!
```

## Javadoc : 
there is no Javadoc linked to this project, because the number of functions is laughable.
