class fileAdapter implements fileDetector {
    advancedFileDetector advancedfiledetector;

    public fileAdapter(String fileType) {
        if (fileType.equalsIgnoreCase("txt")) {
            advancedfiledetector = new txt();
        } else if (fileType.equalsIgnoreCase("excel")) {
            advancedfiledetector = new excel();
        }
    }

    @Override
    public void load(String fileType, String fileName) {
        if (fileType.equalsIgnoreCase("txt")) {
            advancedfiledetector.txt(fileName);
        } else if (fileType.equalsIgnoreCase("excel")) {
            advancedfiledetector.excel(fileName);
        }
    }
}