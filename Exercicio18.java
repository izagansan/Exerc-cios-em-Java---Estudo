class Badge {

    public String print(Integer id, String name, String department) {

        String result = "";

        if (id != null) {
            result += "[" + id + "] - ";
        }
        result += name + " - ";
        if (department == null) {
            result += "OWNER";
        } else {
            result += department.toUpperCase();
        }
        return result;
    }
}
