public class ProcessImage{
	
	public ProcessImage(){
		File file= new File(android.os.Environment.getExternalStorageDirectory(),"Your folder");
    	Bitmap bitmap = BitmapFactory.decodeFile(file.getAbsolutePath())
	}
}