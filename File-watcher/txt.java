class txt implements advancedFileDetector {
    @Override
    public void txt(String fileName) {
        System.out.println("Loading txt file. Name: " + fileName);
    }

    @Override
    public void excel(String fileName) {
        // do nothing
    }
}