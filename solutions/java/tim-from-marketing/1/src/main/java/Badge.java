class Badge {
    public String print(Integer id, String name, String department) {

        if (department == null){
            return (id == null) ? String.format("%s - OWNER", name) : String.format("[%d] - %s - OWNER", id, name);
        }


        return (id == null) ? String.format("%s - %s", name, department.toUpperCase()) : String.format("[%d] - %s - %s", id, name, department.toUpperCase());
    }
}
