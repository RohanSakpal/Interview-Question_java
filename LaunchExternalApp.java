class LaunchExternalApp
{
	public static void main(String[] args) throws Exception
	{
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad");
	}
}