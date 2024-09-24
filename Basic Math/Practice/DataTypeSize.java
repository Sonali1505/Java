class DataTypeSize {
    static int dataTypeSize(String str) {
        switch (str) {
            case "Character":
                return 2; // Size of char in Java is 2 bytes
            case "Integer":
                return 4; // Size of int in Java is 4 bytes
            case "Long":
                return 8; // Size of long in Java is 8 bytes
            case "Float":
                return 4; // Size of float in Java is 4 bytes
            case "Double":
                return 8; // Size of double in Java is 8 bytes
            default:
                return -1; // For invalid data type
        }
    }
    public static void main(String[] args) {
        System.out.println(DataTypeSize.dataTypeSize("Character")); // Output: 2
        System.out.println(DataTypeSize.dataTypeSize("Integer"));   // Output: 4
        System.out.println(DataTypeSize.dataTypeSize("Long"));      // Output: 8
        System.out.println(DataTypeSize.dataTypeSize("Float"));     // Output: 4
        System.out.println(DataTypeSize.dataTypeSize("Double"));    // Output: 8
    }
}

