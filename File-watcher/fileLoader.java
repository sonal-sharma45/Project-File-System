class fileLoader implements fileDetector {
    fileAdapter fileadapter;

    @Override
    public void load(String fileType, String fileName) {
       
        if (fileType.equalsIgnoreCase("txt")) {
            System.out.println("Loading txt file. Name: " + fileName);
        }
       
        else if (fileType.equalsIgnoreCase("txt") || fileType.equalsIgnoreCase("excel")) {
            fileadapter = new fileAdapter(fileType);
            fileadapter.load(fileType, fileName);
        } else {
            System.out.println("Invalid media. " + fileType + " format not supported");
        }
    }
}