class excel implements advancedFileDetector {
    @Override
    public void excel(String fileName) {
        System.out.println("Loading excel file. Name: " + fileName);
    }

    @Override
    public void txt(String fileName) {
        // do nothing
    }
}